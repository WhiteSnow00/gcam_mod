// 
// Decompiled by Procyon v0.6.0
// 

final class mc extends ip
{
    final /* synthetic */ md a;
    private boolean b;
    private int c;
    
    public mc(final md a) {
        this.a = a;
        this.b = false;
        this.c = 0;
    }
    
    @Override
    public final void b() {
        final int c = this.c + 1;
        this.c = c;
        if (c == this.a.a.size()) {
            final io b = this.a.b;
            if (b != null) {
                b.b();
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }
    
    @Override
    public final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        final io b = this.a.b;
        if (b != null) {
            b.c();
        }
    }
}
