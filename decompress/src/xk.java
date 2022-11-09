import android.os.HandlerThread;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xk
{
    private final Executor a = null;
    private final Executor b = null;
    private final Executor c = null;
    private final HandlerThread d = null;
    
    public xk() {
        this(null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof xk)) {
            return false;
        }
        final xk xk = (xk)o;
        final Executor a = xk.a;
        if (!plr.b(null, null)) {
            return false;
        }
        final Executor b = xk.b;
        if (!plr.b(null, null)) {
            return false;
        }
        final Executor c = xk.c;
        if (!plr.b(null, null)) {
            return false;
        }
        final HandlerThread d = xk.d;
        return plr.b(null, null);
    }
    
    @Override
    public final int hashCode() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ThreadConfig(defaultLightweightExecutor=");
        sb.append((Object)null);
        sb.append(", defaultBackgroundExecutor=");
        sb.append((Object)null);
        sb.append(", defaultCameraExecutor=");
        sb.append((Object)null);
        sb.append(", defaultCameraHandler=");
        sb.append((Object)null);
        sb.append(')');
        return sb.toString();
    }
}
