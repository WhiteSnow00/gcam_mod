import java.util.List;
import android.hardware.HardwareBuffer;
import android.graphics.Rect;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

final class fqn implements lju
{
    public final kvs a;
    final /* synthetic */ fqo b;
    private final fvn c;
    private final fvd d;
    private final kre e;
    private lju f;
    
    public fqn(final fqo b, kvs e, final fvn c, final fvd d) {
        this.b = b;
        this.f = null;
        this.a = e;
        this.c = c;
        this.d = d;
        e = (kvs)b.b.a(e).e();
        try {
            e.getClass();
            this.e = kre.h(((lju)e).c(), ((lju)e).b());
            if (e != null) {
                e.close();
            }
        }
        finally {
            if (e != null) {
                try {
                    e.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)b).addSuppressed(t);
                }
            }
        }
    }
    
    private final lju k() {
        synchronized (this) {
            final ofn f = ofn.f();
            if (this.f == null) {
                this.b.a.b(this.a, this.c, this.d, new fqm(this, f));
                this.f = (lju)ofi.v(f);
            }
            return this.f;
        }
    }
    
    @Override
    public final int a() {
        return 35;
    }
    
    @Override
    public final int b() {
        return this.e.b;
    }
    
    @Override
    public final int c() {
        return this.e.a;
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.a.close();
            try (final lju f = this.f) {}
        }
    }
    
    @Override
    public final long d() {
        final kvx b = this.a.b();
        b.getClass();
        return b.a;
    }
    
    @Override
    public final Rect e() {
        final kre e = this.e;
        return new Rect(0, 0, e.a, e.b);
    }
    
    @Override
    public final HardwareBuffer f() {
        final lju k = this.k();
        if (k != null) {
            return k.f();
        }
        return null;
    }
    
    @Override
    public final lfa g() {
        return lfa.a();
    }
    
    @Override
    public final List h() {
        List list;
        if (this.k() != null) {
            list = this.k().h();
        }
        else {
            list = nns.l();
        }
        return list;
    }
    
    @Override
    public final void i(final Rect rect) {
        throw new UnsupportedOperationException("Cannot set crop rect in this implementation!");
    }
}
