import java.util.HashSet;
import java.io.FileOutputStream;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ltj implements lum
{
    public boolean a;
    public boolean b;
    public final ofn c;
    public final Set d;
    public final Executor e;
    public final ltk f;
    private final FileOutputStream g;
    private int h;
    
    public ltj(final FileOutputStream g, final ltk f, final Executor executor) {
        this.a = false;
        this.b = false;
        this.c = ofn.f();
        this.d = new HashSet();
        this.h = 0;
        this.f = f;
        this.e = new lte(this, ofi.e(executor));
        this.g = g;
    }
    
    @Override
    public final lup a() {
        synchronized (this) {
            final lti lti = new lti(this, this.h++);
            this.e.execute(new ltb(this, lti));
            return lti;
        }
    }
    
    @Override
    public final oey b() {
        return luq.a(this.c);
    }
    
    @Override
    public final void c() {
        this.e.execute(new lta(this, 1));
    }
    
    @Override
    public final void d() {
        synchronized (this) {
            this.e.execute(new lta(this));
        }
    }
    
    public final void e() {
        if (this.a && this.d.isEmpty() && !this.b) {
            this.f.close();
            this.b = true;
            this.g.close();
            this.c.o(null);
        }
    }
}
