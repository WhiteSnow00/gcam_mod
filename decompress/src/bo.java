import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.animation.Animator;
import android.view.animation.Animation;
import android.view.ViewGroup;
import android.animation.AnimatorInflater;
import android.content.res.Resources$NotFoundException;
import android.view.animation.AnimationUtils;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bo
{
    public static StringBuilder a() {
        return new StringBuilder();
    }
    
    public static void b(final StringBuilder sb, final int n) {
        for (int i = 0; i < n; ++i) {
            sb.append("?");
            if (i < n - 1) {
                sb.append(",");
            }
        }
    }
    
    public static en c(final Context context, final ei ei, boolean equals, final boolean b) {
        final ef r = ei.R;
        final int n = 0;
        int f;
        if (r == null) {
            f = 0;
        }
        else {
            f = r.f;
        }
        int n2;
        if (b) {
            if (equals) {
                n2 = ei.q();
            }
            else {
                n2 = ei.r();
            }
        }
        else if (equals) {
            n2 = ei.o();
        }
        else {
            n2 = ei.p();
        }
        ei.J(0, 0, 0, 0);
        final ViewGroup n3 = ei.N;
        if (n3 != null && n3.getTag(2131428142) != null) {
            ei.N.setTag(2131428142, (Object)null);
        }
        final ViewGroup n4 = ei.N;
        if (n4 != null && n4.getLayoutTransition() != null) {
            return null;
        }
        if (n2 == 0) {
            if (f != 0) {
                switch (f) {
                    default: {
                        n2 = -1;
                        break;
                    }
                    case 8197: {
                        if (equals) {
                            n2 = j(context, 16842938);
                            break;
                        }
                        n2 = j(context, 16842939);
                        break;
                    }
                    case 8194: {
                        if (!equals) {
                            n2 = 2130837527;
                            break;
                        }
                        n2 = 2130837526;
                        break;
                    }
                    case 4100: {
                        if (equals) {
                            n2 = j(context, 16842936);
                            break;
                        }
                        n2 = j(context, 16842937);
                        break;
                    }
                    case 4099: {
                        if (!equals) {
                            n2 = 2130837529;
                            break;
                        }
                        n2 = 2130837528;
                        break;
                    }
                    case 4097: {
                        if (!equals) {
                            n2 = 2130837531;
                            break;
                        }
                        n2 = 2130837530;
                        break;
                    }
                }
            }
            else {
                n2 = n;
            }
        }
        if (n2 != 0) {
            equals = "anim".equals(context.getResources().getResourceTypeName(n2));
            if (equals) {
                try {
                    final Animation loadAnimation = AnimationUtils.loadAnimation(context, n2);
                    if (loadAnimation != null) {
                        return new en(loadAnimation);
                    }
                    return null;
                }
                catch (final RuntimeException ex) {}
                catch (final Resources$NotFoundException ex2) {
                    throw ex2;
                }
            }
            try {
                final Animator loadAnimator = AnimatorInflater.loadAnimator(context, n2);
                if (loadAnimator != null) {
                    return new en(loadAnimator);
                }
            }
            catch (final RuntimeException ex3) {
                if (equals) {
                    throw ex3;
                }
                final Animation loadAnimation2 = AnimationUtils.loadAnimation(context, n2);
                if (loadAnimation2 != null) {
                    return new en(loadAnimation2);
                }
            }
        }
        return null;
    }
    
    public static long e(final long n) {
        return (n + 500000L) / 1000000L * 1000000L;
    }
    
    public static boolean f(final ddm ddm, final fex fex) {
        return ddm.a() && fex.a;
    }
    
    public static void g(final ddm ddm, final cxl cxl, final fex fex) {
        if (!f(ddm, fex)) {
            final cxm a = cyf.a;
            cxl.f();
        }
    }
    
    public static final void h(final Canvas canvas, final Drawable drawable, float n, final float n2) {
        final int width = canvas.getWidth();
        canvas.save();
        final float n3 = (float)width;
        final float n4 = (n3 - n) / 2.0f;
        canvas.translate(n4, n4);
        n /= n3;
        canvas.scale(n, n);
        if (n2 > 0.0f) {
            final GradientDrawable gradientDrawable = (GradientDrawable)drawable;
            int n5;
            if ((n5 = (int)(n2 * (1.0f - n))) < 3) {
                n5 = 3;
            }
            gradientDrawable.setStroke(n5, -1);
        }
        drawable.draw(canvas);
        canvas.restore();
    }
    
    public static dnn i(final dlb dlb) {
        return new dnn(dlb);
    }
    
    private static int j(final Context context, int resourceId) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[] { resourceId });
        resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
