import java.util.HashMap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hha
{
    public final Context a;
    public final hxg b;
    
    public hha(final Context a, final hxg b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final hgz hgz) {
        if (hgz != null) {
            final hxg b = this.b;
            final him a = hgz.a;
            b.c.remove(a);
            b.b.remove((Object)a);
            b.d.remove(a);
        }
    }
    
    public final hgz b(final kre kre, final him him) {
        final hxg b = this.b;
        b.c.put(him, kre);
        b.b.remove((Object)him);
        final Integer n = b.d.get(him);
        final HashMap d = b.d;
        int n2;
        if (n == null) {
            n2 = 0;
        }
        else {
            n2 = n + 1;
        }
        d.put(him, n2);
        return new hgz(him);
    }
}
