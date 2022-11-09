import android.app.Activity;
import android.os.Parcelable;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import android.app.PendingIntent;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.accounts.Account;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.feedback.ErrorReport;
import java.util.ArrayList;
import android.content.Intent;
import android.content.Context;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bny
{
    private static final Uri b;
    private static final Uri c;
    private static final Uri d;
    
    static {
        b = Uri.parse("https://support.google.com/nexus/topic/6012822");
        c = Uri.parse("http://www.google.com/policies/privacy/");
        d = Uri.parse("http://www.google.com/policies/terms/");
    }
    
    public static final Intent a(final String s, final Context context) {
        final GoogleHelp googleHelp = new GoogleHelp(15, s, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false);
        googleHelp.q = bny.b;
        googleHelp.a(0, context.getResources().getString(2131952550), new Intent("android.intent.action.VIEW", bny.c));
        googleHelp.a(1, context.getResources().getString(2131952360), new Intent(context, (Class)LicenseMenuActivity.class));
        googleHelp.a(2, context.getResources().getString(2131952704), new Intent("android.intent.action.VIEW", bny.d));
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", (Parcelable)googleHelp);
    }
    
    public static final void b(final String s, final Context context, final Activity activity) {
        new jyd(activity).a(a(s, context));
    }
}
