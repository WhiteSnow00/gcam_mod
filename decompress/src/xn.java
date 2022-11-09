import android.text.TextUtils;
import androidx.window.extensions.ExtensionProvider;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xn
{
    public xn() {
    }
    
    public xn(final aih aih) {
        aih.getClass();
    }
    
    public static final int a(final Context context, final String s) {
        return context.checkSelfPermission("android.permission.CAMERA");
    }
    
    public static final aid b() {
        final aid aid = null;
        aid d;
        try {
            final String apiVersion = ExtensionProvider.getApiVersion();
            d = aid;
            if (!TextUtils.isEmpty((CharSequence)apiVersion)) {
                final aid a = aid.a;
                d = xo.d(apiVersion);
            }
        }
        catch (final UnsupportedOperationException ex) {
            d = aid;
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            d = aid;
        }
        return d;
    }
}
