// 
// Decompiled by Procyon v0.6.0
// 

public final class ceb implements Runnable
{
    final /* synthetic */ ced a = a;
    private final /* synthetic */ int b;
    
    public ceb(final ced a) {
        this.a = a;
    }
    
    public ceb(final ced a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final ced a = this.a;
                a.a.c(a.o);
                this.a.m = true;
                return;
            }
            case 1: {
                ((igo)this.a.b.c()).h();
                return;
            }
            case 0: {
                if ((int)((kkz)this.a.g.a).d == 0) {
                    this.a.k.o(null);
                }
                final ced a2 = this.a;
                a2.a.c(a2.n);
                this.a.f.b(cic.e);
            }
        }
    }
}
