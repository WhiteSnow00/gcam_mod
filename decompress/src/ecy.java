import java.util.Iterator;
import android.content.res.Resources$Theme;
import java.util.Map;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecy extends cwc
{
    private static final nnx e;
    public final flo c;
    public boolean d;
    private final Resources f;
    private final bxu g;
    
    static {
        final Float value = 0.5f;
        e = nnx.r("/m/04h4w", value, "/m/06cnp", value, "/m/0brn2d", value, "/m/01bqvp", value);
    }
    
    public ecy(final Resources f, final flo c, final bxu g) {
        this.f = f;
        this.c = c;
        this.g = g;
    }
    
    @Override
    public final Map ba() {
        return ecy.e;
    }
    
    @Override
    protected final cwb c() {
        final cwa a = cwb.a();
        final hpf a2 = hpg.a();
        a2.b = this.f.getString(2131952126);
        a2.c = this.f.getDrawable(2131231559, (Resources$Theme)null);
        a2.d = new ecx(this, 1);
        a2.g = new ecx(this);
        a2.d(7000L);
        a.b = a2.a();
        return a.a();
    }
    
    @Override
    protected final boolean e(final Map map) {
        while (true) {
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                if ((float)ecy.e.getOrDefault(entry.getKey(), Float.MAX_VALUE) <= (float)entry.getValue()) {
                    final boolean b = true;
                    if (b) {
                        this.g.f(jbm.d);
                    }
                    return !this.d && b;
                }
            }
            final boolean b = false;
            continue;
        }
    }
}
