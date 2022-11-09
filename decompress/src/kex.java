import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class kex extends bjf implements IInterface
{
    public kex() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }
    
    public void b(final Status status, final kew kew) {
        throw new IllegalStateException("Not implemented.");
    }
    
    public void c(final Status status) {
        throw new IllegalStateException("Not implemented.");
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        switch (n) {
            default: {
                return false;
            }
            case 9: {
                final Status status = (Status)bjg.a(parcel, Status.CREATOR);
                final kep kep = (kep)bjg.a(parcel, kep.CREATOR);
                throw new IllegalStateException("Not implemented");
            }
            case 8: {
                final Status status2 = (Status)bjg.a(parcel, Status.CREATOR);
                bjg.f(parcel);
                final kep kep2 = (kep)bjg.a(parcel, kep.CREATOR);
                throw new IllegalStateException("Not implemented.");
            }
            case 7: {
                final Status status3 = (Status)bjg.a(parcel, Status.CREATOR);
                throw new IllegalStateException("Not implemented.");
            }
            case 6: {
                final Status status4 = (Status)bjg.a(parcel, Status.CREATOR);
                parcel.createStringArrayList();
                throw new IllegalStateException("Not implemented.");
            }
            case 5: {
                this.c((Status)bjg.a(parcel, Status.CREATOR));
                break;
            }
            case 4: {
                final Status status5 = (Status)bjg.a(parcel, Status.CREATOR);
                throw new IllegalStateException("Not implemented.");
            }
            case 3: {
                final Status status6 = (Status)bjg.a(parcel, Status.CREATOR);
                throw new IllegalStateException("Not implemented.");
            }
            case 2: {
                this.b((Status)bjg.a(parcel, Status.CREATOR), (kew)bjg.a(parcel, kew.CREATOR));
                break;
            }
        }
        return true;
    }
}
