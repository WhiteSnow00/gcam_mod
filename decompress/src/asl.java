// 
// Decompiled by Procyon v0.6.0
// 

final class asl implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ asn c;
    private final /* synthetic */ int d;
    
    public asl(final asn c, final int a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asl(final asn c, final int a, final String b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        switch (this.d) {
            default: {
                this.c.b.c(this.a, this.b);
                return;
            }
            case 0: {
                this.c.b.d(this.a, this.b);
            }
        }
    }
}
