import android.os.Parcel;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kew extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final boolean b;
    public final List c;
    public final int d;
    public final String e;
    public final boolean f;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(1);
    }
    
    public kew(final int a, final boolean b, final List list, final int d, final String e, final boolean f) {
        final ArrayList c = new ArrayList();
        this.c = c;
        this.a = a;
        this.b = b;
        if (list != null) {
            c.addAll(list);
        }
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.j(parcel, 3, this.b);
        jwn.x(parcel, 4, this.c);
        jwn.n(parcel, 5, this.d);
        jwn.v(parcel, 6, this.e);
        jwn.j(parcel, 7, this.f);
        jwn.i(parcel, g);
    }
}
