import android.graphics.Typeface;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gs
{
    public static Handler c() {
        return new Handler(Looper.getMainLooper());
    }
    
    public static final void d() {
        c().post((Runnable)new aas(1));
    }
    
    public abstract void a(final Typeface p0);
    
    public final void b(final Typeface typeface) {
        c().post((Runnable)new gr(this, typeface));
    }
}
