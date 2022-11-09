import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class ndh implements ie
{
    final /* synthetic */ ndm a;
    
    public ndh(final ndm a) {
        this.a = a;
    }
    
    @Override
    public final ix a(final View view, final ix ix) {
        final ndm a = this.a;
        final ndd g = a.g;
        if (g != null) {
            a.a.y.remove(g);
        }
        final ndm a2 = this.a;
        a2.g = new ndl((View)a2.b, ix);
        final ndm a3 = this.a;
        a3.a.z(a3.g);
        return ix;
    }
}
