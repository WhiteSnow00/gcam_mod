// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.app;

import java.lang.reflect.Constructor;
import android.view.View;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.content.Context;

public class AppCompatViewInflater
{
    public static final int[] a;
    public static final String[] b;
    private static final Class[] d;
    private static final zb e;
    public final Object[] c;
    
    static {
        d = new Class[] { Context.class, AttributeSet.class };
        a = new int[] { 16843375 };
        b = new String[] { "android.widget.", "android.view.", "android.webkit." };
        e = new zb();
    }
    
    public AppCompatViewInflater() {
        this.c = new Object[2];
    }
    
    public on a(final Context context, final AttributeSet set) {
        return new on(context, set);
    }
    
    public AppCompatButton b(final Context context, final AttributeSet set) {
        return new AppCompatButton(context, set);
    }
    
    public op c(final Context context, final AttributeSet set) {
        return new op(context, set);
    }
    
    public pa d(final Context context, final AttributeSet set) {
        return new pa(context, set);
    }
    
    public pt e(final Context context, final AttributeSet set) {
        return new pt(context, set);
    }
    
    public final View f(final Context context, final String s, String string) {
        final zb e = AppCompatViewInflater.e;
        final Constructor constructor = (Constructor)e.get(s);
        Label_0092: {
            if (constructor != null) {
                break Label_0092;
            }
            Label_0058: {
                if (string == null) {
                    break Label_0058;
                }
                try {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(s);
                    string = sb.toString();
                    while (true) {
                        while (true) {
                            final Constructor<? extends View> constructor2 = Class.forName(string, false, context.getClassLoader()).asSubclass(View.class).getConstructor((Class<?>[])AppCompatViewInflater.d);
                            e.put(s, constructor2);
                            constructor2.setAccessible(true);
                            return (View)constructor2.newInstance(this.c);
                            string = s;
                            continue;
                        }
                        final Constructor<? extends View> constructor2 = constructor;
                        continue;
                    }
                }
                catch (final Exception ex) {
                    return null;
                }
            }
        }
    }
}
