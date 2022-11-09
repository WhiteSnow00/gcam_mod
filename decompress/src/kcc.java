import android.os.Parcel;
import android.os.Parcelable;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcc extends bje implements IInterface
{
    public kcc(final IBinder binder) {
        super(binder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }
    
    public final void e(final kch kch) {
        final Parcel a = this.a();
        bjg.c(a, (Parcelable)kch);
        this.z(59, a);
    }
}
