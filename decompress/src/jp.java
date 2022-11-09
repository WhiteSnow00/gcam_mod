import android.content.res.Configuration;
import android.view.ViewParent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.graphics.drawable.Drawable;
import android.graphics.Paint$FontMetricsInt;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EdgeEffect;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jp
{
    public jp() {
        Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
    }
    
    public static float a(final EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        }
        finally {
            return 0.0f;
        }
    }
    
    public static float b(final EdgeEffect edgeEffect, final float n, final float n2) {
        try {
            return edgeEffect.onPullDistance(n, n2);
        }
        finally {
            edgeEffect.onPull(n, n2);
            return 0.0f;
        }
    }
    
    public static EdgeEffect c(final Context context, final AttributeSet set) {
        try {
            return new EdgeEffect(context, set);
        }
        finally {
            return new EdgeEffect(context);
        }
    }
    
    public static void d(final TextView textView, final int n) {
        hh.c(n);
        final int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint$FontMetricsInt)null);
        if (n != fontMetricsInt) {
            textView.setLineSpacing((float)(n - fontMetricsInt), 1.0f);
        }
    }
    
    public static void e(final TextView textView, final Drawable drawable, final Drawable drawable2, final Drawable drawable3) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, (Drawable)null);
    }
    
    public static void f(final InputConnection inputConnection, final EditorInfo editorInfo, final View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                if (viewParent instanceof uf) {
                    editorInfo.hintText = ((uf)viewParent).a();
                    return;
                }
            }
        }
    }
    
    public static final int g(final Context context) {
        final Configuration configuration = context.getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || screenWidthDp > 600) {
            return 5;
        }
        if (screenWidthDp >= 500 || (screenWidthDp > 480 && screenHeightDp > 640)) {
            return 4;
        }
        if (screenWidthDp >= 360) {
            return 3;
        }
        return 2;
    }
    
    public static final boolean h(final Context context) {
        return context.getResources().getBoolean(2131034112);
    }
    
    public static boolean i(final int n) {
        return n == 13 || n == 14;
    }
    
    public static boolean k(final int n) {
        return n == 4 || n == 6;
    }
}
