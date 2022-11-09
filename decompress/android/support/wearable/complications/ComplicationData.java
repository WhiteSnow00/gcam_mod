// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.complications;

import android.os.BadParcelableException;
import android.graphics.drawable.Icon;
import android.app.PendingIntent;
import android.util.Log;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ComplicationData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final String[][] a;
    private static final String[][] d;
    public final int b;
    public final Bundle c;
    
    static {
        a = new String[][] { null, new String[0], new String[0], { "SHORT_TEXT" }, { "LONG_TEXT" }, { "VALUE", "MIN_VALUE", "MAX_VALUE" }, { "ICON" }, { "SMALL_IMAGE", "IMAGE_STYLE" }, { "LARGE_IMAGE" }, new String[0], new String[0] };
        d = new String[][] { null, new String[0], new String[0], { "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION" }, { "LONG_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "SMALL_IMAGE", "SMALL_IMAGE_BURN_IN_PROTECTION", "IMAGE_STYLE", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION" }, { "SHORT_TEXT", "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION" }, { "TAP_ACTION", "ICON_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION" }, { "TAP_ACTION", "SMALL_IMAGE_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION" }, { "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION" }, { "SHORT_TEXT", "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION" }, new String[0] };
        CREATOR = (Parcelable$Creator)new uj(1);
    }
    
    public ComplicationData(final Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readBundle(this.getClass().getClassLoader());
    }
    
    public ComplicationData(final uh uh) {
        this.b = uh.a;
        this.c = uh.b;
    }
    
    public static void j(final String s, final int n) {
        if (!m(n)) {
            final StringBuilder sb = new StringBuilder(38);
            sb.append("Type ");
            sb.append(n);
            sb.append(" can not be recognized");
            throw new IllegalStateException(sb.toString());
        }
        if (l(s, n)) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder(s.length() + 44);
        sb2.append("Field ");
        sb2.append(s);
        sb2.append(" is not supported for type ");
        sb2.append(n);
        throw new IllegalStateException(sb2.toString());
    }
    
    public static void k(final String s, final int n) {
        if (!m(n)) {
            final StringBuilder sb = new StringBuilder(38);
            sb.append("Type ");
            sb.append(n);
            sb.append(" can not be recognized");
            Log.w("ComplicationData", sb.toString());
            return;
        }
        l(s, n);
    }
    
    private static boolean l(final String s, int i) {
        final String[] array = ComplicationData.a[i];
        for (int length = array.length, j = 0; j < length; ++j) {
            if (array[j].equals(s)) {
                return true;
            }
        }
        final String[] array2 = ComplicationData.d[i];
        int length2;
        for (length2 = array2.length, i = 0; i < length2; ++i) {
            if (array2[i].equals(s)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean m(final int n) {
        return n > 0 && n <= 11;
    }
    
    public final int a() {
        k("IMAGE_STYLE", this.b);
        return this.c.getInt("IMAGE_STYLE");
    }
    
    public final PendingIntent b() {
        k("TAP_ACTION", this.b);
        return (PendingIntent)this.e("TAP_ACTION");
    }
    
    public final Icon c() {
        k("ICON", this.b);
        return (Icon)this.e("ICON");
    }
    
    public final Icon d() {
        k("SMALL_IMAGE", this.b);
        return (Icon)this.e("SMALL_IMAGE");
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final Parcelable e(final String s) {
        try {
            return this.c.getParcelable(s);
        }
        catch (final BadParcelableException ex) {
            Log.w("ComplicationData", "Could not unparcel ComplicationData. Provider apps must exclude wearable support complication classes from proguard.", (Throwable)ex);
            return null;
        }
    }
    
    public final ComplicationText f() {
        k("LONG_TEXT", this.b);
        return (ComplicationText)this.e("LONG_TEXT");
    }
    
    public final ComplicationText g() {
        k("LONG_TITLE", this.b);
        return (ComplicationText)this.e("LONG_TITLE");
    }
    
    public final ComplicationText h() {
        k("SHORT_TEXT", this.b);
        return (ComplicationText)this.e("SHORT_TEXT");
    }
    
    public final ComplicationText i() {
        k("SHORT_TITLE", this.b);
        return (ComplicationText)this.e("SHORT_TITLE");
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 45);
        sb.append("ComplicationData{mType=");
        sb.append(b);
        sb.append(", mFields=");
        sb.append(value);
        sb.append('}');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.b);
        parcel.writeBundle(this.c);
    }
}
