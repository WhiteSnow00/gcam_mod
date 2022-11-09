import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgm implements lum
{
    public static final nsd a;
    public final lum b;
    public final Set c;
    public final AtomicInteger d;
    public final Object e;
    public boolean f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/encoder/SanitizerMuxer");
    }
    
    public fgm(final lum b) {
        this.c = new HashSet();
        this.d = new AtomicInteger(0);
        this.e = new Object();
        this.f = false;
        this.b = b;
    }
    
    @Override
    public final lup a() {
        njo.o(this.f ^ true);
        synchronized (this.e) {
            final fgl fgl = new fgl(this, this.b.a());
            this.c.add(fgl);
            this.d.getAndIncrement();
            return fgl;
        }
    }
    
    @Override
    public final oey b() {
        return this.b.b();
    }
    
    @Override
    public final void c() {
        this.b.c();
    }
    
    @Override
    public final void d() {
        this.b.d();
        this.f = true;
    }
}
