// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BaseObj
{
    private boolean mDestroyed;
    private long mID;
    RenderScript mRS;
    
    public BaseObj(final long mid, final RenderScript mrs) {
        mrs.validate();
        this.mRS = mrs;
        this.mID = mid;
        this.mDestroyed = false;
    }
    
    private void helpDestroy() {
        synchronized (this) {
            final boolean mDestroyed = this.mDestroyed;
            boolean b = true;
            if (!mDestroyed) {
                this.mDestroyed = true;
            }
            else {
                b = false;
            }
            monitorexit(this);
            if (b) {
                final ReentrantReadWriteLock.ReadLock lock = this.mRS.mRWLock.readLock();
                lock.lock();
                if (this.mRS.isAlive()) {
                    this.mRS.nObjDestroy(this.mID);
                }
                lock.unlock();
                this.mRS = null;
                this.mID = 0L;
            }
        }
    }
    
    public void checkValid() {
        if (this.mID == 0L && this.getNObj() == null) {
            throw new RSIllegalArgumentException("Invalid object.");
        }
    }
    
    public void destroy() {
        if (!this.mDestroyed) {
            this.helpDestroy();
            return;
        }
        throw new RSInvalidStateException("Object already destroyed.");
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.mID == ((BaseObj)o).mID);
    }
    
    @Override
    protected void finalize() {
        this.helpDestroy();
        super.finalize();
    }
    
    public long getID(final RenderScript renderScript) {
        this.mRS.validate();
        if (this.mDestroyed) {
            throw new RSInvalidStateException("using a destroyed object.");
        }
        final long mid = this.mID;
        if (mid == 0L) {
            throw new RSRuntimeException("Internal error: Object id 0.");
        }
        if (renderScript != null && renderScript != this.mRS) {
            throw new RSInvalidStateException("using object with mismatched context.");
        }
        return mid;
    }
    
    public android.renderscript.BaseObj getNObj() {
        return null;
    }
    
    @Override
    public int hashCode() {
        final long mid = this.mID;
        return (int)(mid >> 32 ^ (0xFFFFFFFL & mid));
    }
    
    public void setID(final long mid) {
        if (this.mID == 0L) {
            this.mID = mid;
            return;
        }
        throw new RSRuntimeException("Internal Error, reset of object ID.");
    }
}
