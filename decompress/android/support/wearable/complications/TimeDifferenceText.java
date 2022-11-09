// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.complications;

import java.util.Locale;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import java.util.concurrent.TimeUnit;
import android.os.Parcelable$Creator;

public class TimeDifferenceText implements TimeDependentText
{
    public static final Parcelable$Creator CREATOR;
    public final long a;
    public final long b;
    public final int c;
    public final boolean d;
    public final TimeUnit e;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(2);
    }
    
    public TimeDifferenceText(final long a, final long b, final int c, final boolean d, final TimeUnit e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public TimeDifferenceText(final Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = (parcel.readByte() != 0);
        final int int1 = parcel.readInt();
        TimeUnit e;
        if (int1 == -1) {
            e = null;
        }
        else {
            e = TimeUnit.values()[int1];
        }
        this.e = e;
    }
    
    private static int c(final long n) {
        return f(n, TimeUnit.DAYS);
    }
    
    private static int d(final long n) {
        return f(n, TimeUnit.HOURS);
    }
    
    private static int e(final long n) {
        return f(n, TimeUnit.MINUTES);
    }
    
    private static int f(long n, final TimeUnit timeUnit) {
        n /= timeUnit.toMillis(1L);
        final int n2 = uk.a[timeUnit.ordinal()];
        int n3 = 60;
        switch (n2) {
            default: {
                final String value = String.valueOf(timeUnit);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 20);
                sb.append("Unit not supported: ");
                sb.append(value);
                throw new IllegalArgumentException(sb.toString());
            }
            case 3: {
                return (int)(n % n3);
            }
            case 5: {
                n3 = Integer.MAX_VALUE;
                return (int)(n % n3);
            }
            case 4: {
                n3 = 24;
                return (int)(n % n3);
            }
            case 2: {
                n3 = n3;
                return (int)(n % n3);
            }
            case 1: {
                n3 = 1000;
                return (int)(n % n3);
            }
        }
    }
    
    private static long g(final long n, final long n2) {
        return n / n2 + ((n % n2 != 0L) ? 1 : 0);
    }
    
    private final long h(long n) {
        final long a = this.a;
        if (n < a) {
            n = a - n;
        }
        else {
            final long b = this.b;
            if (n > b) {
                return n - b;
            }
            n = 0L;
        }
        return n;
    }
    
    private static long i(final long n, final TimeUnit timeUnit) {
        final long millis = timeUnit.toMillis(1L);
        return g(n, millis) * millis;
    }
    
    private static String j(final int n, final Resources resources) {
        return resources.getQuantityString(2131820552, n, new Object[] { n });
    }
    
    private final String k(long i, final Resources resources) {
        final long j = i(i, TimeUnit.HOURS);
        if (p(this.e, TimeUnit.DAYS) || c(j) >= 10) {
            return j(c(i(i, TimeUnit.DAYS)), resources);
        }
        i = i(i, TimeUnit.MINUTES);
        if (c(i) > 0) {
            final int d = d(j);
            if (d > 0) {
                return resources.getString(2131952718, new Object[] { j(c(j), resources), l(d, resources) });
            }
            return j(c(j), resources);
        }
        else {
            if (p(this.e, TimeUnit.HOURS)) {
                return l(d(j), resources);
            }
            final int d2 = d(i);
            final int e = e(i);
            if (d2 <= 0) {
                return m(e(i), resources);
            }
            if (e > 0) {
                return resources.getString(2131952719, new Object[] { l(d2, resources), m(e, resources) });
            }
            return l(d2, resources);
        }
    }
    
    private static String l(final int n, final Resources resources) {
        return resources.getQuantityString(2131820553, n, new Object[] { n });
    }
    
    private static String m(final int n, final Resources resources) {
        return resources.getQuantityString(2131820554, n, new Object[] { n });
    }
    
    private final String n(long i, final Resources resources) {
        final long j = i(i, TimeUnit.HOURS);
        if (p(this.e, TimeUnit.DAYS) || c(j) > 0) {
            return j(c(i(i, TimeUnit.DAYS)), resources);
        }
        i = i(i, TimeUnit.MINUTES);
        if (!p(this.e, TimeUnit.HOURS) && d(i) <= 0) {
            return m(e(i), resources);
        }
        return l(d(j), resources);
    }
    
    private final String o(long i, final Resources resources) {
        final long j = i(i, TimeUnit.HOURS);
        if (p(this.e, TimeUnit.DAYS) || c(j) > 0) {
            final int c = c(i(i, TimeUnit.DAYS));
            return resources.getQuantityString(2131820555, c, new Object[] { c });
        }
        i = i(i, TimeUnit.MINUTES);
        if (!p(this.e, TimeUnit.HOURS) && d(i) <= 0) {
            final int e = e(i);
            return resources.getQuantityString(2131820557, e, new Object[] { e });
        }
        final int d = d(j);
        return resources.getQuantityString(2131820556, d, new Object[] { d });
    }
    
    private static boolean p(final TimeUnit timeUnit, final TimeUnit timeUnit2) {
        return timeUnit != null && timeUnit.toMillis(1L) >= timeUnit2.toMillis(1L);
    }
    
    @Override
    public final CharSequence a(final Context context, long i) {
        final Resources resources = context.getResources();
        final long h = this.h(i);
        if (h == 0L && this.d) {
            return resources.getString(2131952717);
        }
        switch (this.c) {
            default: {
                return this.n(h, resources);
            }
            case 5: {
                final String o = this.o(h, resources);
                if (o.length() <= 7) {
                    return o;
                }
                return this.n(h, resources);
            }
            case 4: {
                return this.o(h, resources);
            }
            case 3: {
                final String k = this.k(h, resources);
                if (k.length() <= 7) {
                    return k;
                }
                return this.n(h, resources);
            }
            case 2: {
                return this.n(h, resources);
            }
            case 1: {
                String s;
                if (p(this.e, TimeUnit.DAYS)) {
                    s = j(c(i(h, TimeUnit.DAYS)), resources);
                }
                else {
                    i = i(h, TimeUnit.MINUTES);
                    if (!p(this.e, TimeUnit.HOURS) && c(i) <= 0) {
                        final long j = i(h, TimeUnit.SECONDS);
                        if (!p(this.e, TimeUnit.MINUTES) && d(j) <= 0) {
                            s = String.format(Locale.US, "%02d:%02d", e(j), f(j, TimeUnit.SECONDS));
                        }
                        else {
                            s = String.format(Locale.US, "%d:%02d", d(i), e(i));
                        }
                    }
                    else {
                        s = this.k(h, resources);
                    }
                }
                return s;
            }
        }
    }
    
    @Override
    public final boolean b(final long n, final long n2) {
        long n3 = 0L;
        switch (this.c) {
            default: {
                n3 = TimeUnit.MINUTES.toMillis(1L);
                break;
            }
            case 1: {
                n3 = TimeUnit.SECONDS.toMillis(1L);
                break;
            }
        }
        final TimeUnit e = this.e;
        if (e != null) {
            n3 = Math.max(n3, e.toMillis(1L));
        }
        return g(this.h(n), n3) == g(this.h(n2), n3);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, int ordinal) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeByte((byte)(byte)(this.d ? 1 : 0));
        final TimeUnit e = this.e;
        if (e == null) {
            ordinal = -1;
        }
        else {
            ordinal = e.ordinal();
        }
        parcel.writeInt(ordinal);
    }
}
