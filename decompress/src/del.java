import java.util.Collection;
import android.util.ArraySet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class del implements kvp
{
    private static final nsd a;
    private kst b;
    private long c;
    private final Set d;
    private int e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/device/CameraDeviceErrorBroadcaster");
    }
    
    public del() {
        this.b = kst.m;
        this.e = 1;
        this.d = (Set)new ArraySet();
    }
    
    @Override
    public final void a(final kst b, final long c) {
        monitorenter(this);
        try {
            if (this.e != 3) {
                this.e = 2;
                del.a.c().E(734).w("CameraDeviceError : %s Open duration = %s", b.b(), c);
                this.b = b;
                this.c = c;
                final noi f = noi.F(this.d);
                this.d.clear();
                monitorexit(this);
                final nrv bn = f.bN();
                while (bn.hasNext()) {
                    ((kvp)bn.next()).a(b, c);
                }
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void b() {
        monitorenter(this);
        try {
            if (this.e != 2) {
                this.e = 3;
                final noi f = noi.F(this.d);
                this.d.clear();
                monitorexit(this);
                final nrv bn = f.bN();
                while (bn.hasNext()) {
                    ((kvp)bn.next()).b();
                }
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final krc c(final kvp kvp) {
        synchronized (this) {
            final int e = this.e;
            boolean b = false;
            long c = 0L;
            kst b2 = null;
            if (e == 2) {
                b2 = this.b;
                c = this.c;
            }
            else if (e == 3) {
                b = true;
            }
            else {
                this.d.add(kvp);
            }
            monitorexit(this);
            if (b2 != null) {
                kvp.a(b2, c);
                return new kqz();
            }
            if (b) {
                kvp.b();
                return new kqz();
            }
            return new dek(this, kvp);
        }
    }
    
    public final void d(final kvp kvp) {
        synchronized (this) {
            if (this.e != 2 && this.d.contains(kvp)) {
                kvp.b();
            }
            this.d.remove(kvp);
        }
    }
}
