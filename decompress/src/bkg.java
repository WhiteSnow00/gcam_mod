import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkg extends kxc
{
    public final Set a;
    public final bkp b;
    private final Executor c;
    private boolean d;
    
    public bkg(final kjk kjk, final dtb dtb, final fxu fxu, final Executor c, final krr krr) {
        this.d = false;
        final String value = String.valueOf(fxu.l().name());
        String concat;
        if (value.length() != 0) {
            concat = "scene-ch-".concat(value);
        }
        else {
            concat = new String("scene-ch-");
        }
        final bkp b = new bkp(fxu, dtb, krr.a("gyro-scn-ch"), concat);
        this.b = b;
        this.a = new HashSet();
        this.c = c;
        kjk.c(b);
    }
    
    public final void a(final Runnable runnable) {
        synchronized (this) {
            this.a.add(runnable);
        }
    }
    
    @Override
    public final void b(final ljm ljm) {
        synchronized (this) {
            if (!this.d) {
                return;
            }
            this.c.execute(new bkf(this, ljm));
        }
    }
    
    public final void c(final Runnable runnable) {
        synchronized (this) {
            this.a.remove(runnable);
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.d = true;
            this.b.b();
        }
    }
    
    public final void e() {
        synchronized (this) {
            this.d = false;
            this.b.close();
        }
    }
}
