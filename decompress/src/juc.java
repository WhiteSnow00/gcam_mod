import java.util.Arrays;
import com.google.android.gms.common.data.DataHolder;

// 
// Decompiled by Procyon v0.6.0
// 

public class juc implements kfg
{
    protected final DataHolder a;
    protected int b;
    public int c;
    
    public juc(final DataHolder a, final int b) {
        jvu.a(a);
        this.a = a;
        boolean b2 = false;
        if (b >= 0 && b < a.h) {
            b2 = true;
        }
        jvu.f(b2);
        this.b = b;
        this.c = a.a(b);
    }
    
    protected final String a(final String s) {
        return this.a.b(s, this.b, this.c);
    }
    
    protected final int b() {
        final DataHolder a = this.a;
        final int b = this.b;
        final int c = this.c;
        a.c("event_type", b);
        return a.d[c].getInt(b, a.c.getInt("event_type"));
    }
    
    @Override
    public final String c() {
        return this.a("asset_key");
    }
    
    @Override
    public final String d() {
        return this.a("asset_id");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof juc) {
            final juc juc = (juc)o;
            if (jvu.m(juc.b, this.b) && jvu.m(juc.c, this.c) && juc.a == this.a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c, this.a });
    }
}
