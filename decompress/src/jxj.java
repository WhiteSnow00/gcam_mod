import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxj extends bje implements IInterface
{
    public jxj(final IBinder binder) {
        super(binder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }
    
    public final int e() {
        final Parcel y = this.y(6, this.a());
        final int int1 = y.readInt();
        y.recycle();
        return int1;
    }
}
