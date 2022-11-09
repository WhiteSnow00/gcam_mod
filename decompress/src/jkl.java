import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkl extends bje implements IInterface
{
    public jkl(final IBinder binder) {
        super(binder, "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
    }
    
    public final void e(final byte[] array) {
        final Parcel a = this.a();
        a.writeByteArray(array);
        this.A(1, a);
    }
}
