// 
// Decompiled by Procyon v0.6.0
// 

public final class kzh implements krc
{
    private final nnx a;
    private boolean b;
    
    public kzh(final nnx a) {
        this.b = false;
        this.a = a;
    }
    
    public final kvs a(final kzl kzl) {
        synchronized (this) {
            if (this.b) {
                return null;
            }
            final kvs kvs = (kvs)this.a.get(kzl);
            if (kvs == null) {
                return null;
            }
            return kvs.a();
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            if (this.b) {
                monitorexit(this);
                return;
            }
            this.b = true;
            final nrv bn = this.a.i().bN();
            while (bn.hasNext()) {
                ((kvs)bn.next()).close();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
