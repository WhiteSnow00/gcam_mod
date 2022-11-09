// 
// Decompiled by Procyon v0.6.0
// 

public final class led
{
    public int a;
    public int b;
    public boolean c;
    public final kjk d;
    private final lhk e;
    private final lhk f;
    
    public led(final lhk e, final lhk f, final kjk d) {
        this.c = false;
        this.d = d;
        this.e = e;
        this.f = f;
        this.c = d.a();
        this.a = 0;
        this.b = 0;
    }
    
    public static led f(final lhk lhk, final lhk lhk2) {
        final kjk kjk = new kjk();
        if (lhk != null) {
            kjk.c(lhk);
        }
        if (lhk2 != null) {
            kjk.c(lhk2);
        }
        if (lhk == null && lhk2 == null) {
            kjk.close();
        }
        return new led(lhk, lhk2, kjk);
    }
    
    public static led g() {
        return f(null, null);
    }
    
    public final krc a() {
        synchronized (this) {
            final boolean c = this.c;
            if (!c) {
                ++this.a;
            }
            monitorexit(this);
            this.c();
            if (c ^ true) {
                return new lec(this, 1);
            }
            return null;
        }
    }
    
    public final krc b() {
        synchronized (this) {
            final boolean c = this.c;
            if (!c) {
                ++this.b;
            }
            monitorexit(this);
            this.c();
            if (c ^ true) {
                return new lec(this);
            }
            return null;
        }
    }
    
    public final void c() {
        synchronized (this) {
            final boolean c = this.c;
            boolean b = false;
            if (!c && this.b == 0 && this.a > 0) {
                b = true;
            }
            final lhk e = this.e;
            if (e != null) {
                e.a(b);
            }
            final lhk f = this.f;
            if (f != null) {
                f.a(b);
            }
        }
    }
    
    public final boolean d() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final void e(final krc krc) {
        this.d.c(krc);
    }
}
