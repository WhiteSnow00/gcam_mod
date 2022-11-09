// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.complications;

import java.io.Serializable;
import android.content.Context;
import android.os.Parcel;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import android.os.Parcelable$Creator;

public class TimeFormatText implements TimeDependentText
{
    public static final Parcelable$Creator CREATOR;
    private static final String[][] d;
    private static final long[] e;
    public final SimpleDateFormat a;
    public final int b;
    public final TimeZone c;
    private final Date f;
    private long g;
    
    static {
        d = new String[][] { { "S", "s" }, { "m" }, { "H", "K", "h", "k", "j", "J", "C" }, { "a", "b", "B" } };
        e = new long[] { TimeUnit.SECONDS.toMillis(1L), TimeUnit.MINUTES.toMillis(1L), TimeUnit.HOURS.toMillis(1L), TimeUnit.HOURS.toMillis(12L) };
        CREATOR = (Parcelable$Creator)new uj(3);
    }
    
    public TimeFormatText(final Parcel parcel) {
        this.a = (SimpleDateFormat)parcel.readSerializable();
        this.b = parcel.readInt();
        this.c = (TimeZone)parcel.readSerializable();
        this.g = -1L;
        this.f = new Date();
    }
    
    public TimeFormatText(final String s, final int b, final TimeZone timeZone) {
        final SimpleDateFormat a = new SimpleDateFormat(s);
        this.a = a;
        this.b = b;
        this.g = -1L;
        if (timeZone != null) {
            a.setTimeZone(timeZone);
            this.c = timeZone;
        }
        else {
            this.c = a.getTimeZone();
        }
        this.f = new Date();
    }
    
    private final long c(final long time) {
        this.f.setTime(time);
        if (this.c.inDaylightTime(this.f)) {
            return this.c.getRawOffset() + (long)this.c.getDSTSavings();
        }
        return this.c.getRawOffset();
    }
    
    @Override
    public final CharSequence a(final Context context, final long n) {
        final String format = this.a.format(new Date(n));
        switch (this.b) {
            default: {
                return format;
            }
            case 3: {
                return format.toLowerCase();
            }
            case 2: {
                return format.toUpperCase();
            }
        }
    }
    
    @Override
    public final boolean b(final long n, final long n2) {
        long g;
        if ((g = this.g) == -1L) {
            final String pattern = this.a.toPattern();
            String s = "";
            int i = 0;
            int n3 = 0;
            while (i < pattern.length()) {
                if (pattern.charAt(i) == '\'') {
                    final int n4 = i + 1;
                    if (n4 < pattern.length() && pattern.charAt(n4) == '\'') {
                        i += 2;
                    }
                    else {
                        n3 ^= 0x1;
                        i = n4;
                    }
                }
                else {
                    String string = s;
                    if (n3 == 0) {
                        final String value = String.valueOf(s);
                        final char char1 = pattern.charAt(i);
                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 1);
                        sb.append(value);
                        sb.append(char1);
                        string = sb.toString();
                    }
                    ++i;
                    s = string;
                }
            }
            for (int n5 = 0; n5 < 4 && this.g == -1L; ++n5) {
                int n6 = 0;
                while (true) {
                    final String[][] d = TimeFormatText.d;
                    if (n6 >= d[n5].length) {
                        break;
                    }
                    if (s.contains(d[n5][n6])) {
                        this.g = TimeFormatText.e[n5];
                        break;
                    }
                    ++n6;
                }
            }
            if ((g = this.g) == -1L) {
                g = TimeUnit.DAYS.toMillis(1L);
                this.g = g;
            }
        }
        return (n + this.c(n)) / g == (n2 + this.c(n2)) / g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeSerializable((Serializable)this.a);
        parcel.writeInt(this.b);
        parcel.writeSerializable((Serializable)this.c);
    }
}
