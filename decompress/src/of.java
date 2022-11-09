// 
// Decompiled by Procyon v0.6.0
// 

final class of implements ni
{
    final /* synthetic */ og a;
    
    public of(final og a) {
        this.a = a;
    }
    
    @Override
    public final void a(final mv mv, final boolean b) {
        if (mv instanceof nr) {
            mv.a().i(false);
        }
        final ni e = this.a.e;
        if (e != null) {
            e.a(mv, b);
        }
    }
    
    @Override
    public final boolean b(final mv mv) {
        final og a = this.a;
        if (mv == a.c) {
            return false;
        }
        final my k = ((nr)mv).k;
        final ni e = a.e;
        return e != null && e.b(mv);
    }
}
