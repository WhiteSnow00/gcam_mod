// 
// Decompiled by Procyon v0.6.0
// 

final class ffl implements fkk
{
    public final him a;
    public final fgd b;
    public nqe c;
    public boolean d;
    public boolean e;
    public final boolean f;
    public boolean g;
    final /* synthetic */ ffm h;
    public ffo i;
    public ffo j;
    public ffo k;
    
    public ffl(final ffm h, final him a, final fgd b, final nqe c, final boolean f) {
        this.h = h;
        this.e = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = false;
    }
    
    @Override
    public final void a(final fjy fjy) {
        synchronized (this.h.d) {
            if (this.g) {
                return;
            }
            if (this.c.m()) {
                ffm.a.c().E(1612).x("Cancelling session %s that already ended: %s", this.a, fjy);
                return;
            }
            if (this.f) {
                ffm.a.c().E(1611).x("Cancelled a long shot for %s: %s", this.a, fjy);
            }
            this.g = true;
            this.h.g();
        }
    }
    
    @Override
    public final void b(long max, final fkp fkp) {
        synchronized (this.h.d) {
            if (this.c.m()) {
                ffm.a.c().E(1616).x("Ending session %s twice: %s", this.a, fkp);
                return;
            }
            if (this.g) {
                ffm.a.c().E(1615).x("Ending already cancelled session %s: %s", this.a, fkp);
                return;
            }
            if ((long)this.c.i() > max) {
                ffm.a.c().E(1614).z("%s: Invalid range: %d to %d, with reason: %s", this.a, this.c.i(), max, fkp);
            }
            max = Math.max(max, (long)this.c.i());
            this.c = nqe.e(this.c.i(), max);
            this.h.g();
            this.h.f();
        }
    }
}
