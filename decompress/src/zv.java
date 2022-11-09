import android.view.View$BaseSavedState;
import android.os.Parcelable;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Arrays;
import android.text.TextUtils;
import android.app.Activity;
import android.os.Process;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class zv
{
    public zv() {
    }
    
    public zv(final Context context, final AttributeSet set) {
    }
    
    public static int s(final Context context, final String s) {
        if (s != null) {
            return context.checkPermission(s, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }
    
    public static void t(final Activity activity, final String[] array, final int n) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (TextUtils.isEmpty((CharSequence)array[i])) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Permission request for permissions ");
                sb.append(Arrays.toString(array));
                sb.append(" must not contain null or empty values");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (activity instanceof aae) {
            final aae aae = (aae)activity;
        }
        activity.requestPermissions(array, n);
    }
    
    public static String u(final apo apo) {
        final StringBuffer sb = new StringBuffer();
        final DecimalFormat decimalFormat = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.ENGLISH));
        sb.append(decimalFormat.format(apo.a));
        if (apo.b == 0) {
            return sb.toString();
        }
        decimalFormat.applyPattern("'-'00");
        sb.append(decimalFormat.format(apo.b));
        final int c = apo.c;
        if (c != 0) {
            sb.append(decimalFormat.format(c));
            if (apo.d == 0 && apo.e == 0 && apo.f == 0 && apo.h == 0) {
                final TimeZone g = apo.g;
                if (g == null || g.getRawOffset() == 0) {
                    return sb.toString();
                }
            }
            sb.append('T');
            decimalFormat.applyPattern("00");
            sb.append(decimalFormat.format(apo.d));
            sb.append(':');
            sb.append(decimalFormat.format(apo.e));
            Label_0267: {
                int f;
                if ((f = apo.f) == 0) {
                    if (apo.h == 0) {
                        break Label_0267;
                    }
                    f = 0;
                }
                final int h = apo.h;
                decimalFormat.applyPattern(":00.#########");
                final double n = f;
                final double n2 = h;
                Double.isNaN(n2);
                final double n3 = n2 / 1.0E9;
                Double.isNaN(n);
                sb.append(decimalFormat.format(n + n3));
            }
            if (apo.g != null) {
                final int offset = apo.g.getOffset(apo.a().getTimeInMillis());
                if (offset == 0) {
                    sb.append('Z');
                }
                else {
                    final int abs = Math.abs(offset % 3600000 / 60000);
                    decimalFormat.applyPattern("+00;-00");
                    sb.append(decimalFormat.format(offset / 3600000));
                    decimalFormat.applyPattern(":00");
                    sb.append(decimalFormat.format(abs));
                }
            }
            return sb.toString();
        }
        return sb.toString();
    }
    
    public static apo v(final String s) {
        if (s != null && s.length() != 0) {
            final apo apo = new apo();
            aaf.e(s);
            final apm apm = new apm(s);
            final int n = 0;
            final boolean b = apm.b(0) == 'T' || (apm.d() >= 2 && apm.b(1) == ':') || (apm.d() >= 3 && apm.b(2) == ':');
            if (!b) {
                if (apm.b(0) == '-') {
                    apm.e();
                }
                final int c = apm.c("Invalid year in date string", 9999);
                if (apm.f() && apm.a() != '-') {
                    throw new ape("Invalid date string, after year", 5);
                }
                int n2 = c;
                if (apm.b(0) == '-') {
                    n2 = -c;
                }
                apo.a = Math.min(Math.abs(n2), 9999);
                if (!apm.f()) {
                    return apo;
                }
                apm.e();
                final int c2 = apm.c("Invalid month in date string", 12);
                if (apm.f() && apm.a() != '-') {
                    throw new ape("Invalid date string, after month", 5);
                }
                apo.c(c2);
                if (!apm.f()) {
                    return apo;
                }
                apm.e();
                final int c3 = apm.c("Invalid day in date string", 31);
                if (apm.f() && apm.a() != 'T') {
                    throw new ape("Invalid date string, after day", 5);
                }
                apo.b(c3);
                if (!apm.f()) {
                    return apo;
                }
            }
            else {
                apo.c(1);
                apo.b(1);
            }
            if (apm.a() == 'T') {
                apm.e();
            }
            else if (!b) {
                throw new ape("Invalid date string, missing 'T' after date", 5);
            }
            final int c4 = apm.c("Invalid hour in date string", 23);
            if (apm.a() != ':') {
                throw new ape("Invalid date string, after hour", 5);
            }
            apo.d = Math.min(Math.abs(c4), 23);
            apm.e();
            final int c5 = apm.c("Invalid minute in date string", 59);
            if (apm.f() && apm.a() != ':' && apm.a() != 'Z' && apm.a() != '+' && apm.a() != '-') {
                throw new ape("Invalid date string, after minute", 5);
            }
            apo.e = Math.min(Math.abs(c5), 59);
            if (apm.a() == ':') {
                apm.e();
                final int c6 = apm.c("Invalid whole seconds in date string", 59);
                if (apm.f() && apm.a() != '.' && apm.a() != 'Z' && apm.a() != '+' && apm.a() != '-') {
                    throw new ape("Invalid date string, after whole seconds", 5);
                }
                apo.f = Math.min(Math.abs(c6), 59);
                if (apm.a() == '.') {
                    apm.e();
                    final int a = apm.a;
                    int c7 = apm.c("Invalid fractional seconds in date string", 999999999);
                    if (apm.a() != 'Z' && apm.a() != '+' && apm.a() != '-') {
                        throw new ape("Invalid date string, after fractional second", 5);
                    }
                    int n3 = apm.a - a;
                    int h;
                    int i;
                    while (true) {
                        h = c7;
                        i = n3;
                        if (n3 <= 9) {
                            break;
                        }
                        c7 /= 10;
                        --n3;
                    }
                    while (i < 9) {
                        h *= 10;
                        ++i;
                    }
                    apo.h = h;
                }
            }
            int n4;
            int c8;
            int c9;
            if (apm.a() == 'Z') {
                apm.e();
                n4 = 0;
                c8 = 0;
                c9 = n;
            }
            else if (apm.f()) {
                if (apm.a() == '+') {
                    n4 = 1;
                }
                else {
                    if (apm.a() != '-') {
                        throw new ape("Time zone must begin with 'Z', '+', or '-'", 5);
                    }
                    n4 = -1;
                }
                apm.e();
                c9 = apm.c("Invalid time zone hour in date string", 23);
                if (apm.a() != ':') {
                    throw new ape("Invalid date string, after time zone hour", 5);
                }
                apm.e();
                c8 = apm.c("Invalid time zone minute in date string", 59);
            }
            else {
                n4 = 0;
                c8 = 0;
                c9 = n;
            }
            apo.g = new SimpleTimeZone((c9 * 3600000 + c8 * 60000) * n4, "");
            if (apm.f()) {
                throw new ape("Invalid date string, extra chars at end", 5);
            }
            return apo;
        }
        throw new ape("Empty convert-string", 5);
    }
    
    public void a(final zy zy) {
    }
    
    public void b() {
    }
    
    public boolean c(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        return false;
    }
    
    public boolean d(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
        throw null;
    }
    
    public boolean e(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        return false;
    }
    
    public boolean f(final View view) {
        return false;
    }
    
    public void g(final CoordinatorLayout coordinatorLayout, final View view) {
    }
    
    public boolean h(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, final int n3) {
        return false;
    }
    
    public boolean i(final View view) {
        return false;
    }
    
    public void j(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
    }
    
    public void k(final View view, final View view2, final int n, final int[] array, final int n2) {
    }
    
    public void l(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, final int n3, final int[] array) {
        array[0] += n2;
        array[1] += n3;
    }
    
    public void m(final CoordinatorLayout coordinatorLayout, final View view, final Rect rect) {
    }
    
    public void n(final View view, final Parcelable parcelable) {
    }
    
    public Parcelable o(final View view) {
        return (Parcelable)View$BaseSavedState.EMPTY_STATE;
    }
    
    public boolean p(final View view, final int n, final int n2) {
        return false;
    }
    
    public void q(final View view, final View view2, final int n) {
    }
    
    public boolean r(final View view) {
        return false;
    }
}
