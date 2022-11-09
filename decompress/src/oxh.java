// 
// Decompiled by Procyon v0.6.0
// 

final class oxh implements Runnable, oxp
{
    final Runnable a;
    final oxi b;
    Thread c;
    
    public oxh(final Runnable a, final oxi b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void bX() {
        if (this.c == Thread.currentThread()) {
            final oxi b = this.b;
            if (b instanceof pgk) {
                final pgk pgk = (pgk)b;
                if (!pgk.c) {
                    pgk.c = true;
                    pgk.b.shutdown();
                }
                return;
            }
        }
        this.b.bX();
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        }
        finally {
            this.bX();
            this.c = null;
        }
    }
}
