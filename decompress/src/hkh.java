import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hkh implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public hkh(final pii a) {
        this.a = a;
    }
    
    public hkh(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static hkh a(final pii pii, final pii pii2) {
        return new hkh(pii);
    }
    
    public static hkh b(final pii pii) {
        return new hkh(pii, 1);
    }
}
