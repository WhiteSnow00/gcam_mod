import android.os.SystemClock;
import android.os.Handler$Callback;
import android.os.Looper;
import java.util.ArrayList;
import android.os.Handler;
import android.graphics.Bitmap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bfr
{
    public final avk a;
    public final List b;
    final auz c;
    public boolean d;
    public bfo e;
    public boolean f;
    public bfo g;
    public Bitmap h;
    public bfo i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final azk n;
    private boolean o;
    private auw p;
    
    public bfr(final auf auf, final avk a, final int n, final int n2, final awk awk, final Bitmap bitmap) {
        final azk a2 = auf.a;
        final auz c = auf.c(auf.a());
        final auw b = auf.c(auf.a()).b().b(bho.c(ayg.a).I().H().t(n, n2));
        this.b = new ArrayList();
        this.c = c;
        final Handler m = new Handler(Looper.getMainLooper(), (Handler$Callback)new bfq(this));
        this.n = a2;
        this.m = m;
        this.p = b;
        this.a = a;
        this.e(awk, bitmap);
    }
    
    final int a() {
        return ((avo)this.a).f.c;
    }
    
    public final void b() {
        if (!this.d || this.o) {
            return;
        }
        final bfo i = this.i;
        if (i != null) {
            this.i = null;
            this.c(i);
            return;
        }
        this.o = true;
        final avo avo = (avo)this.a;
        final avm f = avo.f;
        final int c = f.c;
        int j = 0;
        if (c > 0) {
            final int e = avo.e;
            if (e >= 0) {
                if (e < c) {
                    j = ((avl)f.e.get(e)).i;
                }
                else {
                    j = -1;
                }
            }
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        this.a.b();
        this.g = new bfo(this.m, ((avo)this.a).e, uptimeMillis + j);
        this.p.b(new bho().x(new bif(Math.random()))).e(this.a).k(this.g);
    }
    
    final void c(final bfo bfo) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, (Object)bfo).sendToTarget();
            return;
        }
        if (this.d) {
            if (bfo.b != null) {
                this.d();
                final bfo e = this.e;
                this.e = bfo;
                for (int i = this.b.size() - 1; i >= 0; --i) {
                    ((bfp)this.b.get(i)).c();
                }
                if (e != null) {
                    this.m.obtainMessage(2, (Object)e).sendToTarget();
                }
            }
            this.b();
            return;
        }
        this.i = bfo;
    }
    
    public final void d() {
        final Bitmap h = this.h;
        if (h != null) {
            this.n.d(h);
            this.h = null;
        }
    }
    
    final void e(final awk awk, final Bitmap h) {
        bit.a(awk);
        bit.a(h);
        this.h = h;
        this.p = this.p.b(new bho().y(awk));
        this.j = biv.a(h);
        this.k = h.getWidth();
        this.l = h.getHeight();
    }
    
    public final void f() {
        this.d = false;
    }
}
