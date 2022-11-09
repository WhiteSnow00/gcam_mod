import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fr
{
    final ArrayList d;
    int e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    String k;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList p;
    ArrayList q;
    boolean r;
    
    public fr() {
        this.d = new ArrayList();
        this.r = false;
    }
    
    public abstract void b();
    
    public abstract void f();
    
    public abstract void g();
    
    public void h(final int n, final ei ei, final String s) {
        throw null;
    }
    
    public void j(final ei ei) {
        throw null;
    }
    
    final void k(final fq fq) {
        this.d.add(fq);
        fq.d = this.e;
        fq.e = this.f;
        fq.f = this.g;
        fq.g = this.h;
    }
    
    public final void l(final int n, final ei ei) {
        this.h(n, ei, null);
    }
    
    public final void m(final ei ei, final String s) {
        this.h(0, ei, s);
    }
    
    public final void n() {
        if (!this.j) {
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
}
