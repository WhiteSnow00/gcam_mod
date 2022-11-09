import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jyg extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public GoogleHelp a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(14);
    }
    
    public jyg(final GoogleHelp a, final String b, final String c, final int d, final String e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ul.c(this, parcel, n);
    }
}
