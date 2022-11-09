// 
// Decompiled by Procyon v0.6.0
// 

final class gbd implements gab
{
    final /* synthetic */ gyb a;
    final /* synthetic */ gbf b;
    
    public gbd(final gbf b, final gyb a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final oey a() {
        final ofn f = ofn.f();
        final gbf b = this.b;
        b.a.execute(new gbe(b, this.a, f));
        return f;
    }
    
    @Override
    public final oey b() {
        this.a.a.close();
        return ofi.m(new kuw("Software jpeg saver was closed"));
    }
}
