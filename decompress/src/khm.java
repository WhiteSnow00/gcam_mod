import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class khm extends kih
{
    private final WeakReference a;
    private final WeakReference b;
    
    public khm(final Map map, final Object o, final jrt jrt) {
        super(jrt);
        this.a = new WeakReference((T)map);
        this.b = new WeakReference((T)o);
    }
    
    @Override
    public final void e(final Status status) {
        final Map map = (Map)this.a.get();
        final Object value = this.b.get();
        if (status.g == 4002 && map != null && value != null) {
            synchronized (map) {
                final kio kio = map.remove(value);
                if (kio != null) {
                    kio.l();
                }
            }
        }
        this.f(status);
    }
}
