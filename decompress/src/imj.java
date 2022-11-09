import android.provider.Settings$Secure;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imj
{
    private final Context a;
    
    public imj(final Context a) {
        this.a = a;
    }
    
    public final boolean a() {
        return Settings$Secure.getInt(this.a.getContentResolver(), "camera_double_twist_to_flip_enabled", 1) == 1;
    }
}
