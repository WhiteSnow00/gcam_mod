import com.google.android.libraries.vision.opengl.Texture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eaj implements edr
{
    private final nns a;
    
    public eaj(final nns a) {
        this.a = a;
    }
    
    @Override
    public final void a(final float[] array, final long n) {
        final nns a = this.a;
        for (int c = ((nql)a).c, i = 0; i < c; ++i) {
            ((edr)a.get(i)).a(array, n);
        }
    }
    
    @Override
    public final void b(final int n, final int n2) {
        final nns a = this.a;
        for (int c = ((nql)a).c, i = 0; i < c; ++i) {
            ((edr)a.get(i)).b(n, n2);
        }
    }
    
    @Override
    public final void c(final Texture texture, final edq edq) {
        final nns a = this.a;
        for (int c = ((nql)a).c, i = 0; i < c; ++i) {
            ((edr)a.get(i)).c(texture, edq);
        }
    }
    
    @Override
    public final void d() {
        final nns a = this.a;
        for (int c = ((nql)a).c, i = 0; i < c; ++i) {
            ((edr)a.get(i)).d();
        }
    }
    
    @Override
    public final void e(final eap eap) {
        final nns a = this.a;
        for (int c = ((nql)a).c, i = 0; i < c; ++i) {
            ((edr)a.get(i)).e(eap);
        }
    }
}
