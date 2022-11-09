// 
// Decompiled by Procyon v0.6.0
// 

final class fie implements feu
{
    volatile long a;
    final /* synthetic */ fev b;
    final /* synthetic */ niz c;
    
    public fie(final fev b, final niz c) {
        this.b = b;
        this.c = c;
        this.a = 0L;
    }
    
    @Override
    public final void a(final long n) {
        while (true) {
            final niz e = this.b.e(this.a);
            if (!e.g()) {
                break;
            }
            this.a = (long)e.c();
            ((ffs)this.c.c()).b(this.a);
        }
    }
}
