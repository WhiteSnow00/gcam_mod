// 
// Decompiled by Procyon v0.6.0
// 

final class gmg implements Runnable
{
    final /* synthetic */ gmh a;
    private final /* synthetic */ int b;
    
    public gmg(final gmh a) {
        this.a = a;
    }
    
    public gmg(final gmh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final gmh a = this.a;
                a.b.c(a.i);
                final ofn h = this.a.h;
                if (h != null) {
                    h.o(null);
                }
                return;
            }
            case 0: {
                final gmh a2 = this.a;
                a2.b.a(a2.i);
            }
        }
    }
}
