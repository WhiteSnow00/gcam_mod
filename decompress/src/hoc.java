import com.google.android.apps.camera.smarts.SmartsChipView;

// 
// Decompiled by Procyon v0.6.0
// 

final class hoc implements hph
{
    final /* synthetic */ hph a;
    final /* synthetic */ hoe b;
    
    public hoc(final hoe b, final hph a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        final hoi hoi = (hoi)this.a;
        hoi.c.d.i(hoi.b);
        hoi.c.e.remove(hoi.b);
    }
    
    @Override
    public final void b(final hpg hpg) {
        if (this.b.e) {
            final hoi hoi = (hoi)this.a;
            final hpe a = hoi.a;
            final hpc b = hoi.b;
            final hoj c = hoi.c;
            final SmartsChipView a2 = c.a;
            a2.getClass();
            final hns hns = new hns(a, b, hpg, a2, c.g, c.h, c.c, c.i, ((inw)c.j.a()).b.p, hoi.c.k);
            hoi.c.d.e(hns);
            hoi.c.e.put(hoi.b, hns);
        }
    }
    
    @Override
    public final void c(final hpg hpg) {
        if (this.b.e) {
            final hoi hoi = (hoi)this.a;
            final hoz hoz = hoi.c.e.get(hoi.b);
            if (hoz != null) {
                hoi.c.f.b(new hoh(hoz, hpg));
            }
        }
    }
}
