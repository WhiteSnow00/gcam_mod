import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class jow extends bjf implements IInterface
{
    public jow() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }
    
    public void b(final GoogleSignInAccount googleSignInAccount, final Status status) {
        throw new UnsupportedOperationException();
    }
    
    public void c(final Status status) {
        throw new UnsupportedOperationException();
    }
    
    public void d(final Status status) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        switch (n) {
            default: {
                return false;
            }
            case 103: {
                this.d((Status)bjg.a(parcel, Status.CREATOR));
                break;
            }
            case 102: {
                this.c((Status)bjg.a(parcel, Status.CREATOR));
                break;
            }
            case 101: {
                this.b((GoogleSignInAccount)bjg.a(parcel, GoogleSignInAccount.CREATOR), (Status)bjg.a(parcel, Status.CREATOR));
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
