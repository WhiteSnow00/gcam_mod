import java.lang.ref.WeakReference;
import java.util.EnumSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flm implements flo, flr
{
    private static final nsd a;
    private static final EnumSet b;
    private WeakReference c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/modemanager/ModeManagerImpl");
        b = EnumSet.of(jbm.d, jbm.k, jbm.m, jbm.g, jbm.r, jbm.l, jbm.f, jbm.n, jbm.c);
    }
    
    public flm() {
        this.c = new WeakReference(null);
    }
    
    @Override
    public final void a(final iqg iqg) {
        synchronized (this) {
            this.c = new WeakReference((T)iqg);
        }
    }
    
    @Override
    public final boolean b(final jbm jbm) {
        njo.e(flm.b.contains(jbm), "switchToMode %s is not supported; see JavaDoc comments");
        synchronized (this) {
            final iqg iqg = (iqg)this.c.get();
            monitorexit(this);
            if (iqg == null) {
                a.k(flm.a.c(), "switchToMode has no ModeSwitchController, so NOT switching to %s", jbm, '\u06a5');
                return false;
            }
            return iqg.t(jbm);
        }
    }
}
