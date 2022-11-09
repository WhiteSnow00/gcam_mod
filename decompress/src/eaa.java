import android.system.ErrnoException;
import android.system.Os;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eaa
{
    private static final nsd b;
    public final String a;
    
    static {
        b = nsd.g("com/google/android/apps/camera/hexagon/HexagonLibPathInitializer");
    }
    
    public eaa(final Context context) {
        kjm.a();
        final String dataDir = context.getApplicationInfo().dataDir;
        try {
            Os.setenv("ADSP_LIBRARY_PATH", String.valueOf(dataDir).concat(";/dsp"), true);
        }
        catch (final ErrnoException ex) {
            a.k(eaa.b.c(), "Failed to set ADSP_LIBRARY_PATH: %s", ex, '\u0424');
        }
        this.a = dataDir;
    }
}
