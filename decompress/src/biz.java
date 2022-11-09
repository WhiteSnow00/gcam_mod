// 
// Decompiled by Procyon v0.6.0
// 

final class biz implements hp
{
    private final biy a;
    private final bjb b;
    private final hp c;
    
    public biz(final hp c, final biy a, final bjb b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object a() {
        Object o = this.c.a();
        if (o == null) {
            o = this.a.a();
        }
        if (o instanceof bja) {
            ((bja)o).aK().a = false;
        }
        return o;
    }
    
    @Override
    public final boolean b(final Object o) {
        if (o instanceof bja) {
            ((bja)o).aK().a = true;
        }
        this.b.a(o);
        return this.c.b(o);
    }
}
