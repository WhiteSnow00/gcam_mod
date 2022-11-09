import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class kdh extends bjf implements IInterface
{
    public kdh() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }
    
    public void c(final kdm kdm) {
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        switch (n) {
            default: {
                return false;
            }
            case 9: {
                final kdj kdj = (kdj)bjg.a(parcel, kdj.CREATOR);
                break;
            }
            case 8: {
                this.c((kdm)bjg.a(parcel, kdm.CREATOR));
                break;
            }
            case 7: {
                final Status status = (Status)bjg.a(parcel, Status.CREATOR);
                final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)bjg.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            }
            case 6: {
                final Status status2 = (Status)bjg.a(parcel, Status.CREATOR);
                break;
            }
            case 4: {
                final Status status3 = (Status)bjg.a(parcel, Status.CREATOR);
                break;
            }
            case 3: {
                final jps jps = (jps)bjg.a(parcel, jps.CREATOR);
                final kdg kdg = (kdg)bjg.a(parcel, kdg.CREATOR);
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
