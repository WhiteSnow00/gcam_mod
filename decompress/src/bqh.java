import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class bqh implements ats
{
    final /* synthetic */ bqi a;
    
    public bqh(final bqi a) {
        this.a = a;
    }
    
    @Override
    public final void a(final int n) {
        a.l(bqi.a.c(), "cameraExceptionCallback.onCameraError", 'N');
        final Iterator iterator = this.a.f.iterator();
        while (iterator.hasNext()) {
            ((att)iterator.next()).a(n);
        }
    }
    
    @Override
    public final void b(final RuntimeException ex, final String s, final int n, final int n2) {
        a.l(bqi.a.c(), "cameraExceptionCallback.onCameraException", 'O');
        final Iterator iterator = this.a.f.iterator();
        while (iterator.hasNext()) {
            ((att)iterator.next()).b(ex, s, n, n2);
        }
    }
    
    @Override
    public final void c(final RuntimeException ex) {
        a.l(bqi.a.c(), "cameraExceptionCallback.onDispatchThreadException", 'P');
        final Iterator iterator = this.a.f.iterator();
        while (iterator.hasNext()) {
            ((att)iterator.next()).c(ex);
        }
    }
}
