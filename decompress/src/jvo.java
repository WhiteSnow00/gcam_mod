import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

final class jvo implements IInterface
{
    public final IBinder a;
    
    public jvo(final IBinder a) {
        this.a = a;
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
}
