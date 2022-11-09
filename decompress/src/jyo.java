import com.google.android.gms.googlehelp.internal.common.TogglingData;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class jyo extends bjf implements IInterface
{
    public jyo() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }
    
    public void b(final GoogleHelp googleHelp) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        switch (n) {
            default: {
                return false;
            }
            case 19: {
                throw new UnsupportedOperationException();
            }
            case 18: {
                parcel.createByteArray();
                throw new UnsupportedOperationException();
            }
            case 17: {
                final jyg jyg = (jyg)bjg.a(parcel, jyg.CREATOR);
                throw new UnsupportedOperationException();
            }
            case 16: {
                throw new UnsupportedOperationException();
            }
            case 15: {
                parcel.createByteArray();
                throw new UnsupportedOperationException();
            }
            case 14: {
                throw new UnsupportedOperationException();
            }
            case 13: {
                parcel.createByteArray();
                throw new UnsupportedOperationException();
            }
            case 12: {
                throw new UnsupportedOperationException();
            }
            case 11: {
                throw new UnsupportedOperationException();
            }
            case 10: {
                throw new UnsupportedOperationException();
            }
            case 9: {
                parcel.readInt();
                throw new UnsupportedOperationException();
            }
            case 8: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                throw new UnsupportedOperationException();
            }
            case 5: {
                throw new UnsupportedOperationException();
            }
            case 4: {
                throw new UnsupportedOperationException();
            }
            case 3: {
                throw new UnsupportedOperationException();
            }
            case 2: {
                final TogglingData togglingData = (TogglingData)bjg.a(parcel, TogglingData.CREATOR);
                throw new UnsupportedOperationException();
            }
            case 1: {
                this.b((GoogleHelp)bjg.a(parcel, GoogleHelp.CREATOR));
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
