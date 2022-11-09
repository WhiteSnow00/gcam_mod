// 
// Decompiled by Procyon v0.6.0
// 

final class fdu implements oen
{
    final /* synthetic */ fdw a;
    final /* synthetic */ fdv b;
    final /* synthetic */ fdx c;
    
    public fdu(final fdx c, final fdw a, final fdv b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Throwable t) {
        if (this.a.o.b().isCancelled()) {
            fdx.j(this.a, t, this.b);
            this.a.k.w(t);
        }
        else {
            this.c.c(this.a, t, this.b);
            this.a.k.C(iwx.a, t);
        }
        this.c.b(this.a);
        this.a.q = nii.a;
    }
    
    @Override
    public final void b(final Object o) {
        final fgs a = this.a.d.a();
        if (a.a == 0) {
            fdx.a.b().E(1534).r("No key video frames in long shot. Shot=%s", this.a.a);
            final boolean k = this.c.l.k(cxw.v);
            final fdw a2 = this.a;
            final boolean b = a2.p && k && a2.q.g();
            if (!b) {
                final fdx c = this.c;
                final fdw a3 = this.a;
                c.c(a3, new IllegalStateException(String.format("No video frames in long shot. Shot=%s", a3.a)), this.b);
            }
            this.c.b(this.a);
            if (b) {
                String s;
                if (this.a.q.g()) {
                    this.c.v.a(((fbu)this.a.q.c()).a);
                    s = "No video frames available. Trigger backup shot.";
                }
                else {
                    a.l(fdx.a.c(), "Didn't take second shot since UI resources are missing", '\u05ff');
                    s = "No video frames available. Unable to trigger backup shot.";
                }
                this.a.k.w(new Throwable(s));
            }
            else {
                this.a.k.C(iwx.a, new IllegalStateException(String.format("No video frames in long shot. Shot=%s", this.a.a)));
            }
        }
        else {
            this.c.i(this.a, this.b, a.d - a.c);
        }
        this.a.q = nii.a;
    }
}
