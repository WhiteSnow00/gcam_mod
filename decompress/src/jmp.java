// 
// Decompiled by Procyon v0.6.0
// 

final class jmp extends jmy
{
    final /* synthetic */ jmt a;
    
    public jmp(final jmt a, final jmf jmf) {
        this.a = a;
        super(jmf);
    }
    
    @Override
    public final void a() {
        final jmt a = this.a;
        a.c(new jms(a));
    }
}
