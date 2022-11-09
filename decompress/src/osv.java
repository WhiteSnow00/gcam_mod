import com.google.vr.ndk.base.GvrApi;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osv
{
    private final long a;
    
    static {
        osv.class.getSimpleName();
    }
    
    public osv(final long a) {
        this.a = a;
    }
    
    public final boolean a(final osu osu) {
        return GvrApi.nativeUserPrefsIsFeatureEnabled(this.a, osu.c);
    }
}
