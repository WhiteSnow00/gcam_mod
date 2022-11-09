import com.google.android.gms.common.api.Status;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jsu extends bjf implements jsv
{
    public jsu() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        if (n == 1) {
            this.b((Status)bjg.a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
