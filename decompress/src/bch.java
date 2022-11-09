import android.content.res.Resources$NotFoundException;
import android.util.Log;
import android.net.Uri;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bch implements bbw
{
    private final bbw a;
    private final Resources b;
    
    public bch(final Resources b, final bbw a) {
        this.b = b;
        this.a = a;
    }
    
    private final Uri c(final Integer n) {
        try {
            final String resourcePackageName = this.b.getResourcePackageName((int)n);
            final String resourceTypeName = this.b.getResourceTypeName((int)n);
            final String resourceEntryName = this.b.getResourceEntryName((int)n);
            final StringBuilder sb = new StringBuilder(String.valueOf(resourcePackageName).length() + 21 + String.valueOf(resourceTypeName).length() + String.valueOf(resourceEntryName).length());
            sb.append("android.resource://");
            sb.append(resourcePackageName);
            sb.append('/');
            sb.append(resourceTypeName);
            sb.append('/');
            sb.append(resourceEntryName);
            return Uri.parse(sb.toString());
        }
        catch (final Resources$NotFoundException ex) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                final String value = String.valueOf(n);
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 30);
                sb2.append("Received invalid resource id: ");
                sb2.append(value);
                Log.w("ResourceLoader", sb2.toString(), (Throwable)ex);
            }
            return null;
        }
    }
}
