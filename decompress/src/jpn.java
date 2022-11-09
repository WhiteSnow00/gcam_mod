import com.google.android.gms.common.data.DataHolder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class jpn extends bjf implements IInterface
{
    public jpn() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }
    
    public void b(final Status status) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        switch (n) {
            default: {
                return false;
            }
            case 8: {
                final Status status = (Status)bjg.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            }
            case 7: {
                final DataHolder dataHolder = (DataHolder)bjg.a(parcel, DataHolder.CREATOR);
                throw new UnsupportedOperationException();
            }
            case 6: {
                final Status status2 = (Status)bjg.a(parcel, Status.CREATOR);
                final jpi[] array = (jpi[])parcel.createTypedArray(jpi.CREATOR);
                throw new UnsupportedOperationException();
            }
            case 5: {
                final Status status3 = (Status)bjg.a(parcel, Status.CREATOR);
                parcel.readLong();
                throw new UnsupportedOperationException();
            }
            case 4: {
                final Status status4 = (Status)bjg.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            }
            case 3: {
                final Status status5 = (Status)bjg.a(parcel, Status.CREATOR);
                parcel.readLong();
                throw new UnsupportedOperationException();
            }
            case 2: {
                final Status status6 = (Status)bjg.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            }
            case 1: {
                this.b((Status)bjg.a(parcel, Status.CREATOR));
                return true;
            }
        }
    }
}
