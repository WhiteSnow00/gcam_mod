import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

final class jhw implements hrk
{
    final /* synthetic */ jhx a;
    
    public jhw(final jhx a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        if (!TextUtils.isEmpty((CharSequence)this.a.t)) {
            final jhx a = this.a;
            a.c(a.t);
            this.a.t = null;
        }
    }
    
    @Override
    public final void c() {
        synchronized (this.a.n) {
            final jhx a = this.a;
            a.t = a.s;
            monitorexit(this.a.n);
            this.a.b();
        }
    }
}
