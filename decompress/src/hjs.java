import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hjs implements oun
{
    private final pii a;
    private final pii b;
    
    public hjs(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final hjr a() {
        return new hjr((SharedPreferences)this.a.get(), (hkc)this.b.get());
    }
}
