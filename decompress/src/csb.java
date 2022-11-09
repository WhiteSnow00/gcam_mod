import android.content.Intent;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.text.SpannableString;
import android.widget.TextView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csb
{
    public static TextView a(final Context context) {
        final TextView textView = new TextView(context);
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165430);
        final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131165431);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        return textView;
    }
    
    public static TextView b(int length, final Context context, final Runnable runnable) {
        final String string = context.getResources().getString(length);
        final String string2 = context.getResources().getString(2131952159);
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(string2).length());
        sb.append(string);
        sb.append(" ");
        sb.append(string2);
        final String string3 = sb.toString();
        final SpannableString text = new SpannableString((CharSequence)string3);
        length = string3.length();
        text.setSpan((Object)new csa(runnable), length - string2.length(), string3.length(), 33);
        final TextView a = a(context);
        a.setText((CharSequence)text);
        a.setMovementMethod(LinkMovementMethod.getInstance());
        return a;
    }
    
    public static void c(final Context context, final Uri uri) {
        context.startActivity(new Intent("android.intent.action.VIEW", uri));
    }
    
    public static int d(final ctk ctk, final int n, int b, final boolean b2) {
        final int c = ctk.c;
        if (c > b && b2) {
            return 4;
        }
        if (c != 0) {
            if (c % (n + 1) == 0) {
                return 3;
            }
            return 5;
        }
        else {
            b = ctk.b;
            if (b != 0 && b % (n + 1) == 0) {
                return 3;
            }
            return 5;
        }
    }
}
