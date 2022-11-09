import java.io.File;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class mpi
{
    public static final mph c;
    final mny d;
    final String e;
    final String f;
    final mqb g;
    public final boolean h;
    public final boolean i;
    
    static {
        c = new mph();
    }
    
    protected mpi(final mny d, final String e, final boolean i) {
        this.d = d;
        this.e = e;
        this.h = false;
        this.f = "";
        this.i = i;
        this.g = new mqb(new mpg(this, 1));
    }
    
    protected abstract oey a();
    
    protected abstract Map b();
    
    protected abstract void c();
    
    final File f() {
        return new File(this.d.e.getDir("phenotype_file", 0), String.valueOf(this.e).concat(".pb"));
    }
    
    final Object g(final String s) {
        final mqb g = this.g;
        final Map b = g.b;
        if (b == null) {
            synchronized (g.a) {
                Object b2 = g.b;
                if (b2 == null) {
                    b2 = g.c.a();
                    ((Map)b2).getClass();
                    g.b = (Map)b2;
                    g.c = null;
                }
                ((Map)b2).get(s);
                return;
            }
        }
        return b.get(s);
    }
}
