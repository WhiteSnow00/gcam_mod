// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.watchface.decomposition;

import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.Collections;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class WatchFaceDecomposition implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final List a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private final List h;
    private final boolean i;
    private final int j;
    
    static {
        CREATOR = (Parcelable$Creator)new WatchFaceDecomposition$1();
    }
    
    public WatchFaceDecomposition(final Parcel parcel) {
        final Bundle bundle = parcel.readBundle(this.getClass().getClassLoader());
        final ArrayList parcelableArrayList = bundle.getParcelableArrayList("images");
        final ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("numbers");
        final ArrayList parcelableArrayList3 = bundle.getParcelableArrayList("color_numbers");
        final ArrayList parcelableArrayList4 = bundle.getParcelableArrayList("color_strings");
        final ArrayList parcelableArrayList5 = bundle.getParcelableArrayList("date_times");
        final ArrayList parcelableArrayList6 = bundle.getParcelableArrayList("fonts");
        final ArrayList parcelableArrayList7 = bundle.getParcelableArrayList("custom_fonts");
        final ArrayList parcelableArrayList8 = bundle.getParcelableArrayList("complications");
        List<Object> emptyList = parcelableArrayList;
        if (parcelableArrayList == null) {
            emptyList = Collections.emptyList();
        }
        this.a = emptyList;
        List<Object> emptyList2;
        if (parcelableArrayList2 == null) {
            emptyList2 = Collections.emptyList();
        }
        else {
            emptyList2 = parcelableArrayList2;
        }
        this.b = emptyList2;
        List<Object> emptyList3;
        if (parcelableArrayList3 == null) {
            emptyList3 = Collections.emptyList();
        }
        else {
            emptyList3 = parcelableArrayList3;
        }
        this.c = emptyList3;
        List<Object> emptyList4;
        if (parcelableArrayList4 == null) {
            emptyList4 = Collections.emptyList();
        }
        else {
            emptyList4 = parcelableArrayList4;
        }
        this.d = emptyList4;
        List<Object> emptyList5;
        if (parcelableArrayList5 == null) {
            emptyList5 = Collections.emptyList();
        }
        else {
            emptyList5 = parcelableArrayList5;
        }
        this.e = emptyList5;
        List<Object> emptyList6;
        if (parcelableArrayList6 == null) {
            emptyList6 = Collections.emptyList();
        }
        else {
            emptyList6 = parcelableArrayList6;
        }
        this.f = emptyList6;
        List<Object> emptyList7;
        if (parcelableArrayList7 == null) {
            emptyList7 = Collections.emptyList();
        }
        else {
            emptyList7 = parcelableArrayList7;
        }
        this.g = emptyList7;
        List<Object> emptyList8;
        if (parcelableArrayList8 == null) {
            emptyList8 = Collections.emptyList();
        }
        else {
            emptyList8 = parcelableArrayList8;
        }
        this.h = emptyList8;
        this.i = bundle.getBoolean("convert_units");
        this.j = bundle.getInt("color_format");
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("images", new ArrayList(this.a));
        bundle.putParcelableArrayList("numbers", new ArrayList(this.b));
        bundle.putParcelableArrayList("color_numbers", new ArrayList(this.c));
        bundle.putParcelableArrayList("color_strings", new ArrayList(this.d));
        bundle.putParcelableArrayList("date_times", new ArrayList(this.e));
        bundle.putParcelableArrayList("fonts", new ArrayList(this.f));
        bundle.putParcelableArrayList("custom_fonts", new ArrayList(this.g));
        bundle.putParcelableArrayList("complications", new ArrayList(this.h));
        bundle.putBoolean("convert_units", this.i);
        bundle.putInt("color_format", this.j);
        parcel.writeBundle(bundle);
    }
}
