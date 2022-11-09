// 
// Decompiled by Procyon v0.6.0
// 

public final class df extends dd
{
    public float af;
    public int ag;
    public int ah;
    public int ai;
    private dc aj;
    
    public df() {
        this.af = -1.0f;
        this.ag = -1;
        this.ah = -1;
        this.aj = this.j;
        this.ai = 0;
        this.q.clear();
        this.q.add(this.aj);
    }
    
    public final void A(final int ai) {
        if (this.ai == ai) {
            return;
        }
        this.ai = ai;
        this.q.clear();
        if (this.ai == 1) {
            this.aj = this.i;
        }
        else {
            this.aj = this.j;
        }
        this.q.add(this.aj);
    }
    
    @Override
    public final dc u(final int n) {
        switch (n - 1) {
            case 2:
            case 4: {
                if (this.ai == 0) {
                    return this.aj;
                }
                break;
            }
            case 1:
            case 3: {
                if (this.ai == 1) {
                    return this.aj;
                }
                break;
            }
        }
        return null;
    }
    
    @Override
    public final void y(final cz cz) {
        final dd r = super.r;
        if (r == null) {
            return;
        }
        dc dc = r.u(2);
        dc dc2 = r.u(4);
        if (this.ai == 0) {
            dc = r.u(3);
            dc2 = r.u(5);
        }
        if (this.ag != -1) {
            cz.g(cz.c(cz, cz.e(this.aj), cz.e(dc), this.ag, false));
            return;
        }
        if (this.ah != -1) {
            cz.g(cz.c(cz, cz.e(this.aj), cz.e(dc2), -this.ah, false));
            return;
        }
        if (this.af != -1.0f) {
            final db e = cz.e(this.aj);
            final db e2 = cz.e(dc);
            final db e3 = cz.e(dc2);
            final float af = this.af;
            final cw a = cz.a();
            a.d.f(e, -1.0f);
            a.d.f(e2, 1.0f - af);
            a.d.f(e3, af);
            cz.g(a);
        }
    }
    
    @Override
    public final void z() {
        if (super.r == null) {
            return;
        }
        final int p = cz.p(this.aj);
        if (this.ai == 1) {
            super.w = p;
            super.x = 0;
            this.k(super.r.d());
            this.q(0);
            return;
        }
        super.w = 0;
        super.x = p;
        this.q(super.r.h());
        this.k(0);
    }
}
