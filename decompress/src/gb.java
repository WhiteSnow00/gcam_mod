// 
// Decompiled by Procyon v0.6.0
// 

final class gb implements Runnable
{
    final /* synthetic */ gc a;
    final /* synthetic */ gf b;
    private final /* synthetic */ int c;
    
    public gb(final gf b, final gc a) {
        this.b = b;
        this.a = a;
    }
    
    public gb(final gf b, final gc a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                if (this.b.b.contains(this.a)) {
                    final gc a = this.a;
                    a.i(a.e, a.a.O);
                }
                return;
            }
            case 0: {
                this.b.b.remove(this.a);
                this.b.c.remove(this.a);
            }
        }
    }
}
