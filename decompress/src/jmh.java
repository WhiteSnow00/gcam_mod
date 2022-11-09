// 
// Decompiled by Procyon v0.6.0
// 

final class jmh extends jmy
{
    final /* synthetic */ jml a;
    
    public jmh(final jml a, final jmf jmf) {
        this.a = a;
        super(jmf);
    }
    
    @Override
    public final void a() {
        final jml a = this.a;
        jlw.a();
        if (!a.D()) {
            return;
        }
        a.q("Inactivity, disconnecting from device AnalyticsService");
        a.b();
    }
}
