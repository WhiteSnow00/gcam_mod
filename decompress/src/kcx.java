import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcx extends bjf implements IInterface
{
    private final kej a;
    
    public kcx() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }
    
    public kcx(final kej a) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = a;
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        switch (n) {
            default: {
                return false;
            }
            case 16: {
                jvh.c((Status)bjg.a(parcel, Status.CREATOR), parcel.readLong(), this.a);
                break;
            }
            case 15: {
                jvh.b((Status)bjg.a(parcel, Status.CREATOR), this.a);
                break;
            }
            case 14: {
                jvh.b((Status)bjg.a(parcel, Status.CREATOR), this.a);
                break;
            }
            case 13: {
                jvh.c((Status)bjg.a(parcel, Status.CREATOR), bjg.a(parcel, kcp.CREATOR), this.a);
                break;
            }
            case 12: {
                jvh.b((Status)bjg.a(parcel, Status.CREATOR), this.a);
                break;
            }
            case 11: {
                jvh.c((Status)bjg.a(parcel, Status.CREATOR), parcel.readLong(), this.a);
                break;
            }
            case 10: {
                jvh.c((Status)bjg.a(parcel, Status.CREATOR), bjg.a(parcel, kcj.CREATOR), this.a);
                break;
            }
            case 9: {
                jvh.c((Status)bjg.a(parcel, Status.CREATOR), bjg.a(parcel, kcn.CREATOR), this.a);
                break;
            }
            case 8: {
                jvh.b((Status)bjg.a(parcel, Status.CREATOR), this.a);
                break;
            }
            case 7: {
                jvh.c((Status)bjg.a(parcel, Status.CREATOR), bjg.a(parcel, kck.CREATOR), this.a);
                break;
            }
            case 6: {
                jvh.c((Status)bjg.a(parcel, Status.CREATOR), bjg.a(parcel, kcl.CREATOR), this.a);
                break;
            }
            case 5: {
                jvh.b((Status)bjg.a(parcel, Status.CREATOR), this.a);
                break;
            }
            case 4: {
                jvh.c((Status)bjg.a(parcel, Status.CREATOR), bjg.a(parcel, kcj.CREATOR), this.a);
                break;
            }
            case 3: {
                jvh.b((Status)bjg.a(parcel, Status.CREATOR), this.a);
                break;
            }
            case 2: {
                jvh.b((Status)bjg.a(parcel, Status.CREATOR), this.a);
                break;
            }
            case 1: {
                jvh.b((Status)bjg.a(parcel, Status.CREATOR), this.a);
                break;
            }
        }
        return true;
    }
}
