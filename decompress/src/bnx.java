import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnx
{
    public static Intent a(final boolean b, final boolean b2, final boolean b3, final long[] array) {
        Intent intent2;
        if (b2) {
            Intent intent;
            if (b) {
                intent = new Intent("com.google.android.apps.photos.mars.api.ACTION_REVIEW_SECURE");
                intent.putExtra("com.google.android.apps.photos.api.secure_mode", true);
            }
            else {
                intent = new Intent("com.google.android.apps.photos.mars.api.ACTION_REVIEW");
            }
            intent2 = intent;
            if (array.length != 0) {
                intent.putExtra("com.google.android.apps.photos.api.secure_mode_ids", array);
                intent2 = intent;
            }
        }
        else if (b) {
            final Intent intent3 = new Intent("android.provider.action.REVIEW_SECURE");
            intent3.putExtra("com.google.android.apps.photos.api.secure_mode", true);
            intent2 = intent3;
            if (array.length != 0) {
                intent3.putExtra("com.google.android.apps.photos.api.secure_mode_ids", array);
                intent2 = intent3;
            }
        }
        else {
            intent2 = new Intent("android.provider.action.REVIEW");
        }
        if (b3) {
            intent2.addFlags(268435456);
        }
        intent2.setPackage("com.google.android.apps.photos");
        intent2.addFlags(1);
        return intent2;
    }
}
