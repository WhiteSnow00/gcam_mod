import android.view.View;
import android.view.ViewGroup;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ieu
{
    public Duration a;
    public ViewGroup b;
    public View c;
    public String d;
    public String e;
    public Runnable f;
    public Runnable g;
    public boolean h;
    public gjj i;
    public efm j;
    public eyt k;
    public int l;
    
    public ieu() {
        this.c = null;
        this.f = aas.n;
        this.g = aas.o;
        this.h = false;
        this.l = 1;
    }
    
    public final iev a() {
        this.j.getClass();
        final boolean h = this.h;
        if (h && this.c == null) {
            this.i.getClass();
            this.k.getClass();
        }
        else if (this.c != null) {
            this.b.getClass();
        }
        else {
            this.e.getClass();
            this.d.getClass();
            this.b.getClass();
            this.a.getClass();
        }
        final iev iev = new iev(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.l, h, this.i, this.k);
        iev.f = new iet(this, iev);
        return iev;
    }
}
