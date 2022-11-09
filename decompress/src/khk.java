import android.os.Parcel;
import android.os.Parcelable;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khk extends bje implements IInterface
{
    public khk(final IBinder binder) {
        super(binder, "com.google.android.gms.wearable.internal.IWearableService");
    }
    
    public final void e(final khg khg, final kfv kfv) {
        final Parcel a = this.a();
        bjg.e(a, (IInterface)khg);
        bjg.c(a, (Parcelable)kfv);
        this.z(16, a);
    }
}
