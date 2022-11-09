import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class jmy
{
    private static volatile Handler a;
    public final jmf b;
    public final Runnable c;
    public volatile long d;
    
    public jmy(final jmf b) {
        this.b = b;
        this.c = new jmx(this);
    }
    
    public abstract void a();
    
    public final Handler b() {
        if (jmy.a != null) {
            return jmy.a;
        }
        synchronized (jmy.class) {
            if (jmy.a == null) {
                jmy.a = new kax(this.b.a.getMainLooper());
            }
            return jmy.a;
        }
    }
    
    public final void c() {
        this.d = 0L;
        this.b().removeCallbacks(this.c);
    }
    
    public final void d(final long n) {
        this.c();
        if (n >= 0L) {
            this.d = System.currentTimeMillis();
            if (!this.b().postDelayed(this.c, n)) {
                this.b.d().o("Failed to schedule delayed post. time", n);
            }
        }
    }
    
    public final boolean e() {
        return this.d != 0L;
    }
}
