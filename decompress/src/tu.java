import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tu implements Parcelable$ClassLoaderCreator
{
    private final /* synthetic */ int a;
    
    public tu() {
    }
    
    public tu(final int a) {
        this.a = a;
    }
    
    public static final abm a(final Parcel parcel, final ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return abm.c;
        }
        throw new IllegalStateException("superState must be null");
    }
    
    public static final ahb b(final Parcel parcel, final ClassLoader classLoader) {
        return new ahb(parcel, classLoader);
    }
}
