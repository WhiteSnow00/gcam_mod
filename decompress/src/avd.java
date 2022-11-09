import java.io.File;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avd
{
    public final ave a;
    public final boolean[] b;
    final /* synthetic */ avg c;
    private boolean d;
    
    public avd(final avg c, final ave a) {
        this.c = c;
        this.a = a;
        boolean[] b;
        if (a.e) {
            b = null;
        }
        else {
            b = new boolean[c.b];
        }
        this.b = b;
    }
    
    public final void a() {
        this.c.b(this, false);
    }
    
    public final void b() {
        if (!this.d) {
            try {
                this.a();
            }
            catch (final IOException ex) {}
        }
    }
    
    public final void c() {
        this.c.b(this, true);
        this.d = true;
    }
    
    public final File d() {
        synchronized (this.c) {
            final ave a = this.a;
            if (a.f == this) {
                if (!a.e) {
                    this.b[0] = true;
                }
                final File d = a.d();
                this.c.a.mkdirs();
                return d;
            }
            throw new IllegalStateException();
        }
    }
}
