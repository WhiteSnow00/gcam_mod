import java.util.HashSet;
import android.text.TextUtils;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmv
{
    public final jmf a;
    public volatile Boolean b;
    private String c;
    private Set d;
    
    protected jmv(final jmf a) {
        this.a = a;
    }
    
    public static final long b() {
        return (long)jnd.e.a();
    }
    
    public static final long c() {
        return (long)jnd.d.a();
    }
    
    public static final int d() {
        return (int)jnd.h.a();
    }
    
    public static final int e() {
        return (int)jnd.g.a();
    }
    
    public static final String f() {
        return (String)jnd.j.a();
    }
    
    public static final String g() {
        return (String)jnd.k.a();
    }
    
    public static final String h() {
        return (String)jnd.i.a();
    }
    
    public static final boolean i() {
        return (boolean)jnd.a.a();
    }
    
    public final Set a() {
        final String c = (String)jnd.s.a();
        if (this.d != null) {
            final String c2 = this.c;
            if (c2 != null && c2.equals(c)) {
                return this.d;
            }
        }
        final String[] split = TextUtils.split(c, ",");
        final HashSet d = new HashSet();
        for (final String s : split) {
            try {
                d.add(Integer.parseInt(s));
            }
            catch (final NumberFormatException ex) {}
        }
        this.c = c;
        this.d = d;
        return this.d;
    }
}
