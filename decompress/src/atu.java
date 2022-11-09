import java.util.Collection;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atu
{
    private static final aub a;
    protected final Map d;
    protected final List e;
    protected final List f;
    protected boolean g;
    protected int h;
    protected int i;
    protected int j;
    protected aua k;
    public int l;
    protected aua m;
    protected byte n;
    protected int o;
    protected float p;
    public int q;
    public atg r;
    public ath s;
    public ati t;
    protected atk u;
    protected boolean v;
    protected boolean w;
    protected boolean x;
    protected boolean y;
    public aua z;
    
    static {
        a = new aub("CamSet");
    }
    
    protected atu() {
        this.d = new TreeMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }
    
    protected atu(final atu atu) {
        final TreeMap d = new TreeMap();
        this.d = d;
        final ArrayList e = new ArrayList();
        this.e = e;
        final ArrayList f = new ArrayList();
        this.f = f;
        d.putAll(atu.d);
        e.addAll(atu.e);
        f.addAll(atu.f);
        this.g = atu.g;
        this.h = atu.h;
        this.i = atu.i;
        this.j = atu.j;
        final aua k = atu.k;
        final aua aua = null;
        aua i;
        if (k == null) {
            i = null;
        }
        else {
            i = new aua(k);
        }
        this.k = i;
        this.l = atu.l;
        final aua m = atu.m;
        aua j;
        if (m == null) {
            j = aua;
        }
        else {
            j = new aua(m);
        }
        this.m = j;
        this.n = atu.n;
        this.o = atu.o;
        this.p = atu.p;
        this.q = atu.q;
        this.r = atu.r;
        this.s = atu.s;
        this.t = atu.t;
        this.u = atu.u;
        this.v = atu.v;
        this.w = atu.w;
        this.x = atu.x;
        this.y = atu.y;
        this.z = atu.z;
    }
    
    public abstract atu a();
    
    public void d() {
        this.p = 1.0f;
    }
    
    public final aua e() {
        return new aua(this.m);
    }
    
    public final aua f() {
        return new aua(this.k);
    }
    
    public final List g() {
        return new ArrayList(this.f);
    }
    
    public final List h() {
        return new ArrayList(this.e);
    }
    
    public final void i(final int n) {
        if (n > 0 && n <= 100) {
            this.n = (byte)n;
            return;
        }
        auc.c(atu.a, "Ignoring JPEG quality that falls outside the expected range");
    }
    
    public final void j(final int n, final int n2) {
        int i;
        if (n > n2) {
            i = n;
        }
        else {
            i = n2;
        }
        int h = n;
        if (n > n2) {
            h = n2;
        }
        this.i = i;
        this.h = h;
        this.j = -1;
    }
    
    public final void k(final aua aua) {
        if (this.g) {
            auc.c(atu.a, "Attempt to change photo size while locked");
            return;
        }
        this.m = new aua(aua);
    }
    
    public final void l(final aua aua) {
        if (this.g) {
            auc.c(atu.a, "Attempt to change preview size while locked");
            return;
        }
        this.k = new aua(aua);
    }
}
