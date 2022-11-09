import java.util.List;
import com.google.googlex.gcam.BurstSpec;

// 
// Decompiled by Procyon v0.6.0
// 

public class gtn
{
    final nnn a;
    public final gen b;
    public final ofn c;
    final ofn d;
    public final ljm e;
    public final BurstSpec f;
    List g;
    boolean h;
    public int i;
    public final dtx j;
    
    public gtn(final gen b, final dtx j, final BurstSpec f, final ljm e) {
        this.a = nns.e();
        this.c = ofn.f();
        this.d = ofn.f();
        this.i = 0;
        this.b = b;
        this.j = j;
        this.f = f;
        this.e = e;
    }
    
    public final List a() {
        final List g = this.g;
        if (g != null && this.i == ((nql)g).c) {
            return g;
        }
        return this.g = this.a.f();
    }
    
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.c.cancel(true);
        this.d();
    }
    
    public void c(final kvs kvs) {
        this.a.g(kvs);
        ++this.i;
    }
    
    public final void d() {
        final nrw t = ((nns)this.a()).t();
        while (t.hasNext()) {
            ((kvs)t.next()).close();
        }
    }
}
