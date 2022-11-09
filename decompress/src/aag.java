import android.util.AttributeSet;
import android.widget.EdgeEffect;
import android.content.ClipData$Item;
import android.text.Editable;
import android.content.ClipData;
import android.text.Spannable;
import android.text.Selection;
import android.text.Spanned;
import android.widget.TextView;
import android.view.View;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aag
{
    public static File[] a(final Context context) {
        return context.getExternalCacheDirs();
    }
    
    public static File[] b(final Context context, final String s) {
        return context.getExternalFilesDirs((String)null);
    }
    
    public static int c(final int n, final int n2, final int n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final hw d(final View view, final hw hw) {
        if (hw.b != 2) {
            final ClipData a = hw.a;
            final int c = hw.c;
            final Editable text = ((ou)view).getText();
            final Context context = ((TextView)view).getContext();
            int i = 0;
            int n = 0;
            while (i < a.getItemCount()) {
                final ClipData$Item item = a.getItemAt(i);
                CharSequence charSequence2;
                if (c != 0) {
                    final CharSequence charSequence = charSequence2 = item.coerceToText(context);
                    if (charSequence instanceof Spanned) {
                        charSequence2 = charSequence.toString();
                    }
                }
                else {
                    charSequence2 = item.coerceToStyledText(context);
                }
                int n2 = n;
                if (charSequence2 != null) {
                    if (n == 0) {
                        final int selectionStart = Selection.getSelectionStart((CharSequence)text);
                        final int selectionEnd = Selection.getSelectionEnd((CharSequence)text);
                        final int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                        final int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                        Selection.setSelection((Spannable)text, max2);
                        text.replace(max, max2, charSequence2);
                        n2 = 1;
                    }
                    else {
                        text.insert(Selection.getSelectionEnd((CharSequence)text), (CharSequence)"\n");
                        text.insert(Selection.getSelectionEnd((CharSequence)text), charSequence2);
                        n2 = 1;
                    }
                }
                ++i;
                n = n2;
            }
            return null;
        }
        return hw;
    }
    
    public static float e(final EdgeEffect edgeEffect) {
        if (aah.b()) {
            return jp.a(edgeEffect);
        }
        return 0.0f;
    }
    
    public static float f(final EdgeEffect edgeEffect, final float n, final float n2) {
        if (aah.b()) {
            return jp.b(edgeEffect, n, n2);
        }
        edgeEffect.onPull(n, n2);
        return n;
    }
    
    public static EdgeEffect g(final Context context, final AttributeSet set) {
        if (aah.b()) {
            return jp.c(context, set);
        }
        return new EdgeEffect(context);
    }
}
