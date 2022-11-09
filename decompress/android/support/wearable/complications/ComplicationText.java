// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.complications;

import android.text.TextUtils;
import android.content.Context;
import java.util.TimeZone;
import android.os.Bundle;
import j$.util.DesugarTimeZone;
import java.util.concurrent.TimeUnit;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ComplicationText implements Parcelable, TimeDependentText
{
    public static final Parcelable$Creator CREATOR;
    private final CharSequence a;
    private final TimeDependentText b;
    private final CharSequence[] c;
    private long d;
    private CharSequence e;
    
    static {
        CREATOR = (Parcelable$Creator)new uj();
    }
    
    public ComplicationText(final Parcel parcel) {
        this.c = new CharSequence[] { "", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9" };
        final Bundle bundle = parcel.readBundle(this.getClass().getClassLoader());
        this.a = bundle.getCharSequence("surrounding_string");
        final boolean containsKey = bundle.containsKey("difference_style");
        TimeZone timeZone = null;
        if (containsKey && bundle.containsKey("difference_period_start") && bundle.containsKey("difference_period_end")) {
            final long long1 = bundle.getLong("difference_period_start");
            final long long2 = bundle.getLong("difference_period_end");
            final int int1 = bundle.getInt("difference_style");
            final boolean boolean1 = bundle.getBoolean("show_now_text", true);
            final String string = bundle.getString("minimum_unit");
            TimeUnit value;
            if (string == null) {
                value = null;
            }
            else {
                try {
                    value = TimeUnit.valueOf(string);
                }
                catch (final IllegalArgumentException ex) {
                    value = null;
                }
            }
            this.b = new TimeDifferenceText(long1, long2, int1, boolean1, value);
        }
        else if (bundle.containsKey("format_format_string") && bundle.containsKey("format_style")) {
            if (bundle.containsKey("format_time_zone")) {
                timeZone = DesugarTimeZone.getTimeZone(bundle.getString("format_time_zone"));
            }
            this.b = new TimeFormatText(bundle.getString("format_format_string"), bundle.getInt("format_style"), timeZone);
        }
        else {
            this.b = null;
        }
        this.c();
    }
    
    public ComplicationText(final CharSequence a) {
        this.c = new CharSequence[] { "", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9" };
        this.a = a;
        this.b = null;
        this.c();
    }
    
    private final void c() {
        if (this.a == null && this.b == null) {
            throw new IllegalStateException("One of mSurroundingText and mTimeDependentText must be non-null");
        }
    }
    
    public final CharSequence a(final Context context, final long d) {
        final TimeDependentText b = this.b;
        if (b == null) {
            return this.a;
        }
        CharSequence e;
        if (this.e != null && b.b(this.d, d)) {
            e = this.e;
        }
        else {
            e = this.b.a(context, d);
            this.d = d;
            this.e = e;
        }
        final CharSequence a = this.a;
        if (a == null) {
            return e;
        }
        final CharSequence[] c = this.c;
        c[0] = e;
        return TextUtils.expandTemplate(a, c);
    }
    
    public final boolean b(final long n, final long n2) {
        final TimeDependentText b = this.b;
        return b == null || b.b(n, n2);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putCharSequence("surrounding_string", this.a);
        final TimeDependentText b = this.b;
        if (b instanceof TimeDifferenceText) {
            final TimeDifferenceText timeDifferenceText = (TimeDifferenceText)b;
            bundle.putLong("difference_period_start", timeDifferenceText.a);
            bundle.putLong("difference_period_end", timeDifferenceText.b);
            bundle.putInt("difference_style", timeDifferenceText.c);
            bundle.putBoolean("show_now_text", timeDifferenceText.d);
            final TimeUnit e = timeDifferenceText.e;
            if (e != null) {
                bundle.putString("minimum_unit", e.name());
            }
        }
        else if (b instanceof TimeFormatText) {
            final TimeFormatText timeFormatText = (TimeFormatText)b;
            bundle.putString("format_format_string", timeFormatText.a.toPattern());
            bundle.putInt("format_style", timeFormatText.b);
            final TimeZone c = timeFormatText.c;
            if (c != null) {
                bundle.putString("format_time_zone", c.getID());
            }
        }
        parcel.writeBundle(bundle);
    }
}
