import android.os.Parcel;
import android.app.PendingIntent;
import android.app.Activity;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otf extends bjf implements IInterface
{
    public final /* synthetic */ Activity a;
    public final /* synthetic */ PendingIntent b;
    public final /* synthetic */ int c;
    
    public otf() {
        super("com.google.vr.vrcore.common.api.ITransitionCallbacks");
    }
    
    public otf(final Activity a, final PendingIntent b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        super("com.google.vr.vrcore.common.api.ITransitionCallbacks");
    }
    
    public final void b() {
        this.a.runOnUiThread((Runnable)new osp(this));
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        if (n == 1) {
            this.b();
            return true;
        }
        return false;
    }
}
