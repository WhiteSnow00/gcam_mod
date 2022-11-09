import java.util.concurrent.TimeUnit;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkh
{
    public final krr a;
    public final fkd b;
    public final boolean c;
    public final long d;
    public final Set e;
    public boolean f;
    public long g;
    
    public fkh(final krr krr, final fkd b, final cxl cxl) {
        this.e = new HashSet();
        this.f = false;
        this.g = 0L;
        this.a = krr.a("LongPressTrimming");
        this.b = b;
        this.c = cxl.k(cxw.v);
        this.d = TimeUnit.MICROSECONDS.convert((int)cxl.a(cxw.b).c(), TimeUnit.MILLISECONDS);
    }
    
    public final fkl a(final long n, final fkl fkl) {
        synchronized (this) {
            return new fkg(this, n, fkl);
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.f = true;
        }
    }
    
    @Deprecated
    public final boolean c() {
        synchronized (this) {
            return this.f;
        }
    }
}
