import java.util.Iterator;
import android.content.res.Resources$Theme;
import java.util.Map;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iby extends cwc
{
    private static final nnx e;
    public final flo c;
    public boolean d;
    private final Resources f;
    
    static {
        e = nnx.o("/m/01b2w5", 0.5f);
    }
    
    public iby(final Resources f, final flo c) {
        this.f = f;
        this.c = c;
    }
    
    @Override
    public final Map ba() {
        return iby.e;
    }
    
    @Override
    protected final cwb c() {
        final cwa a = cwb.a();
        final hpf a2 = hpg.a();
        a2.b = this.f.getString(2131952722);
        a2.c = this.f.getDrawable(2131231469, (Resources$Theme)null);
        a2.d = new ibx(this, 1);
        a2.g = new ibx(this);
        a2.d(7000L);
        a.b = a2.a();
        return a.a();
    }
    
    @Override
    protected final boolean e(final Map map) {
        if (this.d) {
            return false;
        }
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            if ((float)iby.e.getOrDefault(entry.getKey(), Float.MAX_VALUE) <= (float)entry.getValue()) {
                return true;
            }
        }
        return false;
    }
}
