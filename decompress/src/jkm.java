import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jkm extends bjf implements jkn
{
    public jkm() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback");
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        if (n == 1) {
            this.b(parcel.createByteArray(), (jkp)bjg.a(parcel, jkp.CREATOR));
            return true;
        }
        return false;
    }
}
