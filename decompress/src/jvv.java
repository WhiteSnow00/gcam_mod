import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.accounts.Account;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvv extends jwc
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(6);
    }
    
    public jvv(final int a, final Account b, final int c, final GoogleSignInAccount d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.u(parcel, 2, (Parcelable)this.b, n);
        jwn.n(parcel, 3, this.c);
        jwn.u(parcel, 4, (Parcelable)this.d, n);
        jwn.i(parcel, g);
    }
}
