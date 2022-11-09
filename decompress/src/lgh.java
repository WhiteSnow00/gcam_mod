// 
// Decompiled by Procyon v0.6.0
// 

final class lgh extends ljr
{
    final /* synthetic */ lgi a;
    private boolean b;
    
    public lgh(final lgi a, final lju lju) {
        this.a = a;
        super(lju);
        this.b = false;
    }
    
    @Override
    public final void close() {
        synchronized (this.a.a) {
            final boolean b = this.b;
            boolean b2 = true;
            if (!b) {
                this.b = true;
            }
            else {
                b2 = false;
            }
            monitorexit(this.a.a);
            if (b2) {
                super.close();
                monitorenter(this.a.a);
                try {
                    final lgi a = this.a;
                    --a.b;
                }
                finally {}
            }
        }
    }
}
