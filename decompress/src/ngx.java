import android.os.Parcel;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngx extends bjf implements IInterface
{
    final /* synthetic */ dfb a;
    
    public ngx() {
        super("com.google.android.systemui.elmyra.IElmyraServiceGestureListener");
    }
    
    public ngx(final dfb a) {
        this.a = a;
        super("com.google.android.systemui.elmyra.IElmyraServiceGestureListener");
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        switch (n) {
            default: {
                return false;
            }
            case 2: {
                synchronized (this.a.c) {
                    monitorexit(this.a.c);
                    break;
                }
            }
            case 1: {
                parcel.readFloat();
                parcel.readInt();
                monitorenter(this.a.c);
                break;
            }
        }
        try {
            return true;
        }
        finally {
            monitorexit(this.a.c);
        }
    }
}
