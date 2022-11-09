import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fnt implements Runnable
{
    final /* synthetic */ fol a;
    private final /* synthetic */ int b;
    
    public fnt(final fol a) {
        this.a = a;
    }
    
    public fnt(final fol a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final kc j = this.a.J;
                if (j != null) {
                    j.dismiss();
                }
                final kc k = this.a.K;
                if (k != null) {
                    k.dismiss();
                }
                return;
            }
            case 4: {
                this.a.B.a();
                return;
            }
            case 3: {
                this.a.B.c();
                return;
            }
            case 2: {
                final ndv ndv = new ndv(this.a.t.s());
                ndv.o(2131951909, (DialogInterface$OnClickListener)new fnu(this, null));
                ndv.l(2131951905, (DialogInterface$OnClickListener)new fnv());
                ndv.j(2131952418);
                ndv.i(true);
                (this.a.K = ndv.b()).show();
                return;
            }
            case 1: {
                final fol a = this.a;
                if (!a.l) {
                    a.B.by();
                }
                return;
            }
            case 0: {
                final ndv ndv2 = new ndv(this.a.t.s());
                ndv2.o(2131951909, (DialogInterface$OnClickListener)new fns(this));
                ndv2.l(2131951905, (DialogInterface$OnClickListener)new fnv(1));
                if (this.a.E.aQ() == jbm.e) {
                    ndv2.j(2131951828);
                }
                else {
                    ndv2.j(2131951827);
                }
                ndv2.i(true);
                (this.a.J = ndv2.b()).show();
            }
        }
    }
}
