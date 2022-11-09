import android.net.Uri$Builder;
import android.text.TextUtils;
import android.content.Intent;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvg
{
    private static final Uri a;
    
    static {
        (a = Uri.parse("https://plus.google.com/")).buildUpon().appendPath("circles").appendPath("find").build();
    }
    
    public static Intent a(final String s) {
        final Intent intent = new Intent("android.intent.action.VIEW");
        final Uri$Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty((CharSequence)s)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", s);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }
    
    public static Intent b() {
        final Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String)null);
        final Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
}
