import android.os.BadParcelableException;
import android.util.Log;
import android.os.Bundle;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hj
{
    static {
        Build$VERSION.CODENAME.equals("S");
    }
    
    public static Bundle a(final Bundle bundle) {
        bundle.setClassLoader(hj.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        }
        catch (final BadParcelableException ex) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }
}
