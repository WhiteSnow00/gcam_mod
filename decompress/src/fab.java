import android.content.res.Resources$Theme;
import java.util.concurrent.Executor;
import android.content.res.Resources;
import java.util.Date;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fab implements hpc
{
    hpg a;
    public final flo b;
    public final hkc c;
    public hph d;
    public Date e;
    public boolean f;
    private final Resources g;
    private final irr h;
    private krc i;
    
    public fab(final Resources g, final flo b, final hkc c, final irr h) {
        this.e = null;
        this.g = g;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    
    @Override
    public final void a() {
        this.h.c(null, null);
        final krc i = this.i;
        i.getClass();
        i.close();
        this.i = null;
        this.c();
        this.d = null;
    }
    
    @Override
    public final void b(final hph d) {
        this.d = d;
        final hpf a = hpg.a();
        a.b = this.g.getString(2131952172);
        a.c = this.g.getDrawable(2131231290, (Resources$Theme)null);
        a.d = new faa(this, 1);
        a.g = new faa(this);
        this.a = a.a();
        this.h.c(new ezz(this, 1), odx.a);
        this.i = this.c.a(hjq.j).a(new ezz(this), odx.a);
    }
    
    public final void c() {
        final hph d = this.d;
        if (d != null) {
            d.a();
        }
    }
    
    @Override
    public final void t() {
        this.e = null;
        this.c();
    }
    
    @Override
    public final void u() {
        this.e = new Date();
    }
}
