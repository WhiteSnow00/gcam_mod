import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kca extends bjf implements kcb
{
    public kca() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        switch (n) {
            default: {
                return false;
            }
            case 2: {
                this.c();
                break;
            }
            case 1: {
                this.b((kby)bjg.a(parcel, kby.CREATOR));
                break;
            }
        }
        return true;
    }
}
