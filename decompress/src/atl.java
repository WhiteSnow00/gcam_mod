import java.util.Collection;
import java.util.EnumSet;
import java.util.TreeSet;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class atl
{
    public static final aub a;
    public final ArrayList b;
    public final ArrayList c;
    protected final TreeSet d;
    protected final ArrayList e;
    public final ArrayList f;
    protected final TreeSet g;
    public final EnumSet h;
    protected final EnumSet i;
    protected final EnumSet j;
    protected final EnumSet k;
    protected final EnumSet l;
    protected aua m;
    protected int n;
    protected int o;
    protected float p;
    protected int q;
    protected int r;
    protected int s;
    protected float t;
    public float u;
    protected float v;
    public final atj w;
    
    static {
        a = new aub("CamCapabs");
    }
    
    public atl(final atj w) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new TreeSet();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new TreeSet();
        this.h = EnumSet.noneOf(ati.class);
        this.i = EnumSet.noneOf(atg.class);
        this.j = EnumSet.noneOf(ath.class);
        this.k = EnumSet.noneOf(atk.class);
        this.l = EnumSet.noneOf(atf.class);
        this.w = w;
    }
    
    public atl(final atl atl) {
        final ArrayList b = new ArrayList();
        this.b = b;
        final ArrayList c = new ArrayList();
        this.c = c;
        final TreeSet d = new TreeSet();
        this.d = d;
        final ArrayList e = new ArrayList();
        this.e = e;
        final ArrayList f = new ArrayList();
        this.f = f;
        final TreeSet g = new TreeSet();
        this.g = g;
        final EnumSet<ati> none = EnumSet.noneOf(ati.class);
        this.h = none;
        final EnumSet<atg> none2 = EnumSet.noneOf(atg.class);
        this.i = none2;
        final EnumSet<ath> none3 = EnumSet.noneOf(ath.class);
        this.j = none3;
        final EnumSet<atk> none4 = EnumSet.noneOf(atk.class);
        this.k = none4;
        final EnumSet<atf> none5 = EnumSet.noneOf(atf.class);
        this.l = none5;
        b.addAll(atl.b);
        c.addAll(atl.c);
        d.addAll(atl.d);
        e.addAll(atl.e);
        f.addAll(atl.f);
        g.addAll(atl.g);
        none.addAll((Collection<?>)atl.h);
        none2.addAll((Collection<?>)atl.i);
        none3.addAll((Collection<?>)atl.j);
        none4.addAll((Collection<?>)atl.k);
        none5.addAll((Collection<?>)atl.l);
        this.m = atl.m;
        this.o = atl.o;
        this.n = atl.n;
        this.p = atl.p;
        this.q = atl.q;
        this.r = atl.r;
        this.s = atl.s;
        this.t = atl.t;
        this.u = atl.u;
        this.v = atl.v;
        this.w = atl.w;
    }
    
    public final boolean d(final atf atf) {
        return atf != null && this.l.contains(atf);
    }
    
    public final boolean e(final atg atg) {
        return atg != null && this.i.contains(atg);
    }
    
    public final boolean f(final ath ath) {
        return ath != null && this.j.contains(ath);
    }
}
