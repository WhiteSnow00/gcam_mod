import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngw extends bje implements IInterface
{
    public ngw(final IBinder binder) {
        super(binder, "com.google.android.systemui.elmyra.IElmyraService");
    }
    
    public final void e(final IBinder binder, final IBinder binder2) {
        final Parcel a = this.a();
        a.writeStrongBinder(binder);
        a.writeStrongBinder(binder2);
        this.A(1, a);
    }
}
