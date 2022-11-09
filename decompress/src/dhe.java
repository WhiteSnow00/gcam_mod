import com.google.android.apps.camera.evcomp.EvCompView;

// 
// Decompiled by Procyon v0.6.0
// 

class dhe extends dgz
{
    final /* synthetic */ dhf a;
    
    public dhe(final dhf a) {
        this.a = a;
    }
    
    @Override
    public void b(final dgl dgl) {
        final EvCompView a = this.a.a;
        String s;
        if (((dgj)((kkz)a.b).d).equals(dgj.a)) {
            s = a.getContext().getResources().getString(2131951953, new Object[] { EvCompView.d(a.i) });
        }
        else if (dgl.equals(dgl.a)) {
            s = a.getContext().getResources().getString(2131951767, new Object[] { EvCompView.d(a.i) });
        }
        else {
            if (!dgl.equals(dgl.b)) {
                return;
            }
            s = a.getContext().getResources().getString(2131952629, new Object[] { EvCompView.d(a.j) });
        }
        a.announceForAccessibility((CharSequence)s);
    }
    
    @Override
    public final void d(final float n, final dgl dgl) {
        this.a.j.aR(false);
        this.a.l(n, dgl);
    }
    
    @Override
    public final void f() {
        this.a.c.aR(true);
    }
    
    @Override
    public final void g() {
        this.a.c.aR(false);
    }
}
