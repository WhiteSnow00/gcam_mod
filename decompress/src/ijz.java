// 
// Decompiled by Procyon v0.6.0
// 

class ijz extends ijy
{
    final /* synthetic */ ikb a;
    
    public ijz(final ikb a) {
        this.a = a;
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public final void f() {
        this.a.b.aR(true);
        final ikb a = this.a;
        a.k = a.a.r();
        this.a.a.l(false);
        this.a.c.i(false);
        this.a.j.v(false);
        this.a.d.startCountdown();
        this.a.a.v(false);
        this.a.e.L();
        this.a.f.d(false);
        this.a.g.j();
        jgu.c();
    }
    
    @Override
    public final void g() {
        this.a.b.aR(false);
        final ikb a = this.a;
        a.a.l(a.k);
        this.a.d.stopCountdown();
        final ikb a2 = this.a;
        a2.a.v(a2.k);
        this.a.e.ac();
        this.a.f.d(true);
        this.a.g.i();
        this.a.j.v(true);
        jgu.d();
        if ((boolean)((kkz)this.a.h.a).d || !(boolean)((kkz)this.a.c.a()).d) {
            this.a.c.o(false, false);
        }
        final jjb j = this.a.j;
        Label_0245: {
            if (!((jjq)j).L && !j.E()) {
                final ikb a3 = this.a;
                if (!a3.j.D((jbm)a3.i.aQ())) {
                    break Label_0245;
                }
            }
            this.a.j.h();
        }
        if (((kkz)this.a.h.a).d) {
            this.a.c.l(true);
        }
    }
}
