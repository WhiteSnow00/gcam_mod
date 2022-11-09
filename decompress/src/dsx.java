import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsx extends kxc
{
    public static final nsd a;
    public final int b;
    public final Set c;
    private final Executor d;
    private final Set e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/gyro/OisListener");
    }
    
    public dsx(final Integer n, final Executor d, final Set e, final Set c) {
        this.b = n;
        this.d = d;
        this.e = e;
        this.c = c;
    }
    
    @Override
    public final void b(final ljm ljm) {
        this.d.execute(new dsv(this, ljm));
    }
    
    public final void d(final long n, final float n2, final float n3) {
        final Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((dsw)iterator.next()).a(n, n2, n3);
        }
    }
}
