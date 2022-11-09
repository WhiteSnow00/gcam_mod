import android.content.res.Resources$Theme;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezl extends hoq
{
    public final flo a;
    private final Resources e;
    
    public ezl(final Resources e, final flo a) {
        super(mcn.l("BrellaSimpleSmartsProcessor"));
        this.e = e;
        this.a = a;
    }
    
    @Override
    protected final hop c() {
        final hpf a = hpg.a();
        a.b = this.e.getString(2131952172);
        a.c = this.e.getDrawable(2131231290, (Resources$Theme)null);
        a.d = new ezk(this);
        a.d(2000L);
        final hpg a2 = a.a();
        final hoo a3 = hop.a();
        a3.a = a2;
        a3.c(1);
        a3.d(5);
        a3.b(jbm.m);
        a3.e();
        return a3.a();
    }
}
