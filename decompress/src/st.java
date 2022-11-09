import android.util.Log;
import java.util.Collections;
import android.support.v7.widget.RecyclerView;
import java.lang.ref.WeakReference;
import android.view.View;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class st
{
    private static final List q;
    public final View a;
    public WeakReference b;
    public int c;
    public int d;
    long e;
    int f;
    int g;
    public st h;
    public st i;
    int j;
    sk k;
    boolean l;
    public int m;
    public int n;
    RecyclerView o;
    rw p;
    private int r;
    
    static {
        q = Collections.emptyList();
    }
    
    public st(final View a) {
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.f = -1;
        this.g = -1;
        this.h = null;
        this.i = null;
        this.r = 0;
        this.k = null;
        this.l = false;
        this.m = 0;
        this.n = -1;
        if (a != null) {
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }
    
    public final void A() {
        this.d(1024);
    }
    
    public final int a() {
        final RecyclerView o = this.o;
        if (o == null) {
            return -1;
        }
        return o.b(this);
    }
    
    public final int b() {
        int n;
        if ((n = this.g) == -1) {
            n = this.c;
        }
        return n;
    }
    
    public final List c() {
        if ((this.j & 0x400) == 0x0) {
            return st.q;
        }
        return st.q;
    }
    
    public final void d(final int n) {
        this.j |= n;
    }
    
    public final void e() {
        this.d = -1;
        this.g = -1;
    }
    
    final void f() {
        this.j &= 0xFFFFFBFF;
    }
    
    final void g() {
        this.j &= 0xFFFFFFDF;
    }
    
    public final void h() {
        this.j &= 0xFFFFFEFF;
    }
    
    public final void i(final int n, final boolean b) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int g;
        if ((g = this.g) == -1) {
            g = this.c;
            this.g = g;
        }
        if (b) {
            this.g = g + n;
        }
        this.c += n;
        if (this.a.getLayoutParams() != null) {
            ((sf)this.a.getLayoutParams()).e = true;
        }
    }
    
    final void j() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.r = 0;
        this.h = null;
        this.i = null;
        this.f();
        this.m = 0;
        this.n = -1;
        RecyclerView.o(this);
    }
    
    public final void k(final int n, final int n2) {
        this.j = ((n & n2) | (this.j & ~n2));
    }
    
    public final void l(final boolean b) {
        int r;
        if (b) {
            r = this.r - 1;
        }
        else {
            r = this.r + 1;
        }
        this.r = r;
        if (r < 0) {
            this.r = 0;
            final StringBuilder sb = new StringBuilder();
            sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
            sb.append(this);
            Log.e("View", sb.toString());
            return;
        }
        if (!b && r == 1) {
            this.j |= 0x10;
            return;
        }
        if (b && r == 0) {
            this.j &= 0xFFFFFFEF;
        }
    }
    
    final void m(final sk k, final boolean l) {
        this.k = k;
        this.l = l;
    }
    
    final void n() {
        this.k.k(this);
    }
    
    public final boolean o(final int n) {
        return (n & this.j) != 0x0;
    }
    
    final boolean p() {
        return this.a.getParent() != null && this.a.getParent() != this.o;
    }
    
    public final boolean q() {
        return (this.j & 0x1) != 0x0;
    }
    
    public final boolean r() {
        return (this.j & 0x4) != 0x0;
    }
    
    public final boolean s() {
        return (this.j & 0x10) == 0x0 && !ik.S(this.a);
    }
    
    public final boolean t() {
        return (this.j & 0x8) != 0x0;
    }
    
    @Override
    public final String toString() {
        String simpleName;
        if (this.getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        }
        else {
            simpleName = this.getClass().getSimpleName();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("{");
        sb.append(Integer.toHexString(this.hashCode()));
        sb.append(" position=");
        sb.append(this.c);
        sb.append(" id=");
        sb.append(this.e);
        sb.append(", oldPos=");
        sb.append(this.d);
        sb.append(", pLpos:");
        sb.append(this.g);
        final StringBuilder sb2 = new StringBuilder(sb.toString());
        if (this.u()) {
            sb2.append(" scrap ");
            String s;
            if (!this.l) {
                s = "[attachedScrap]";
            }
            else {
                s = "[changeScrap]";
            }
            sb2.append(s);
        }
        if (this.r()) {
            sb2.append(" invalid");
        }
        if (!this.q()) {
            sb2.append(" unbound");
        }
        if (this.x()) {
            sb2.append(" update");
        }
        if (this.t()) {
            sb2.append(" removed");
        }
        if (this.y()) {
            sb2.append(" ignored");
        }
        if (this.v()) {
            sb2.append(" tmpDetached");
        }
        if (!this.s()) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(" not recyclable(");
            sb3.append(this.r);
            sb3.append(")");
            sb2.append(sb3.toString());
        }
        if ((this.j & 0x200) != 0x0 || this.r()) {
            sb2.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
    
    final boolean u() {
        return this.k != null;
    }
    
    public final boolean v() {
        return (this.j & 0x100) != 0x0;
    }
    
    public final boolean w() {
        return (this.j & 0x2) != 0x0;
    }
    
    final boolean x() {
        return (this.j & 0x2) != 0x0;
    }
    
    public final boolean y() {
        return (this.j & 0x80) != 0x0;
    }
    
    final boolean z() {
        return (this.j & 0x20) != 0x0;
    }
}
