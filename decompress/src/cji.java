import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class cji implements lki
{
    final /* synthetic */ hio a;
    final /* synthetic */ hia b;
    final /* synthetic */ him c;
    final /* synthetic */ boolean d;
    final /* synthetic */ hip e;
    final /* synthetic */ cjj f;
    
    public cji(final cjj f, final hio a, final hia b, final him c, final boolean d, final hip e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void a() {
        a.l(cjj.a.b(), "Video publish abandoned.", '\u0211');
    }
    
    @Override
    public final void b(final Throwable t) {
        a.m(cjj.a.b(), "Video publish error.", '\u0212', t);
    }
    
    @Override
    public final void c() {
        final Uri b = this.b.a.b();
        njo.r(b.equals((Object)Uri.EMPTY) ^ true, "MediaStoreUri is empty. Insert video into MediaStore failed for %s", this.c);
        final hig a = hih.a();
        a.c(this.a);
        a.d(b);
        a.b(this.d);
        this.f.b.h(this.c, ofi.n(a.a()), this.e);
        this.f.b.g(this.c);
    }
    
    @Override
    public final void d() {
    }
}
