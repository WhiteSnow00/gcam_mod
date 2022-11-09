import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.common.data.DataHolder;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class khi extends bjf implements khj
{
    public khi() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        switch (n) {
            default: {
                return false;
            }
            case 13: {
                final kht kht = (kht)bjg.a(parcel, kht.CREATOR);
                final IBinder strongBinder = parcel.readStrongBinder();
                khe khe;
                if (strongBinder == null) {
                    khe = null;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    if (queryLocalInterface instanceof khe) {
                        khe = (khe)queryLocalInterface;
                    }
                    else {
                        khe = new khe(strongBinder);
                    }
                }
                this.e(kht, khe);
                break;
            }
            case 9: {
                final kfx kfx = (kfx)bjg.a(parcel, kfx.CREATOR);
                this.h();
                break;
            }
            case 8: {
                final kgd kgd = (kgd)bjg.a(parcel, kgd.CREATOR);
                this.f();
                break;
            }
            case 7: {
                this.b((kgf)bjg.a(parcel, kgf.CREATOR));
                break;
            }
            case 6: {
                final kfy kfy = (kfy)bjg.a(parcel, kfy.CREATOR);
                this.i();
                break;
            }
            case 5: {
                parcel.createTypedArrayList(khw.CREATOR);
                this.g();
                break;
            }
            case 4: {
                final khw khw = (khw)bjg.a(parcel, khw.CREATOR);
                this.k();
                break;
            }
            case 3: {
                final khw khw2 = (khw)bjg.a(parcel, khw.CREATOR);
                this.j();
                break;
            }
            case 2: {
                this.d((kht)bjg.a(parcel, kht.CREATOR));
                break;
            }
            case 1: {
                this.c((DataHolder)bjg.a(parcel, DataHolder.CREATOR));
                break;
            }
        }
        return true;
    }
}
