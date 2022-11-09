// 
// Decompiled by Procyon v0.6.0
// 

public final class jro extends jrk
{
    public final jtb b;
    
    public jro(final jtb b, final kej kej) {
        super(4, kej);
        this.b = b;
    }
    
    @Override
    public final boolean a(final jsm jsm) {
        return jsm.e.get(this.b) != null;
    }
    
    @Override
    public final jpu[] b(final jsm jsm) {
        final jtj jtj = jsm.e.get(this.b);
        return null;
    }
    
    public final void c(final jsm jsm) {
        final jtj jtj = jsm.e.remove(this.b);
        if (jtj != null) {
            jtj.b.a.b.a(jsm.b, this.a);
            jtj.a.a.a();
            return;
        }
        this.a.d(false);
    }
}
