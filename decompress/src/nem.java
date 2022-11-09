import android.util.TypedValue;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nem
{
    private static final int[] a;
    private static final int[] b;
    
    static {
        a = new int[] { 2130968882 };
        b = new int[] { 2130968896 };
    }
    
    public static TypedArray a(final Context context, final AttributeSet set, final int[] array, final int n, final int n2, final int... array2) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, nel.b, n, n2);
        final boolean b = true;
        final boolean boolean1 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (boolean1) {
            final TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(2130969215, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                b(context, nem.b, "Theme.MaterialComponents");
            }
        }
        b(context, nem.a, "Theme.AppCompat");
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, nel.b, n, n2);
        if (!obtainStyledAttributes2.getBoolean(2, false)) {
            obtainStyledAttributes2.recycle();
        }
        else {
            int n3 = 0;
            Label_0216: {
                if (array2.length == 0) {
                    if (obtainStyledAttributes2.getResourceId(0, -1) != -1) {
                        n3 = (b ? 1 : 0);
                    }
                    else {
                        n3 = 0;
                    }
                }
                else {
                    final TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(set, array, n, n2);
                    for (int i = 0; i <= 0; ++i) {
                        if (obtainStyledAttributes3.getResourceId(array2[i], -1) == -1) {
                            obtainStyledAttributes3.recycle();
                            n3 = 0;
                            break Label_0216;
                        }
                    }
                    obtainStyledAttributes3.recycle();
                    n3 = (b ? 1 : 0);
                }
            }
            obtainStyledAttributes2.recycle();
            if (n3 == 0) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        }
        return context.obtainStyledAttributes(set, array, n, n2);
    }
    
    private static void b(final Context context, final int[] array, final String s) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(array);
        for (int i = 0; i <= 0; ++i) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                final StringBuilder sb = new StringBuilder(s.length() + 77);
                sb.append("The style on this component requires your app theme to be ");
                sb.append(s);
                sb.append(" (or a descendant).");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        obtainStyledAttributes.recycle();
    }
}
