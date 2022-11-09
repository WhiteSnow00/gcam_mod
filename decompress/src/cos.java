import java.util.LinkedHashMap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cos
{
    public final Context a;
    public final idc b;
    public final klv c;
    public final String d;
    public final String e;
    public final nnx f;
    public final nnx g;
    public final LinkedHashMap h;
    public final kkz i;
    
    public cos(final Context a, final idc b, final kkz i, final klv c) {
        final LinkedHashMap h = new LinkedHashMap();
        this.h = h;
        this.a = a;
        this.b = b;
        this.i = i;
        this.c = c;
        h.put(jbm.f, false);
        final jbm c2 = jbm.c;
        final Boolean value = true;
        h.put(c2, value);
        h.put(jbm.n, value);
        this.g = nnx.q(jbm.f, jbk.b(jbm.f).d(a.getResources()), jbm.c, a.getString(2131952785), jbm.n, jbk.b(jbm.n).d(a.getResources()));
        this.f = nnx.q(jbm.f, jbk.b(jbm.f).c(a.getResources()), jbm.c, a.getString(2131951695), jbm.n, jbk.b(jbm.n).c(a.getResources()));
        final Integer value2 = 1;
        this.d = a.getString(2131952096, new Object[] { value2, 4 });
        this.e = a.getString(2131952096, new Object[] { value2, 8 });
    }
    
    public final void a(final jbm jbm) {
        if (this.h.containsKey(jbm)) {
            return;
        }
        final String value = String.valueOf(jbm);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 18);
        sb.append("Unsupported mode: ");
        sb.append(value);
        throw new IllegalArgumentException(sb.toString());
    }
}
