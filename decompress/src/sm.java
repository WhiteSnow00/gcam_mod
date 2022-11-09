import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sm extends abm
{
    public static final Parcelable$Creator CREATOR;
    public Parcelable a;
    
    static {
        CREATOR = (Parcelable$Creator)new tu(1);
    }
    
    public sm(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        ClassLoader classLoader2 = classLoader;
        if (classLoader == null) {
            classLoader2 = se.class.getClassLoader();
        }
        this.a = parcel.readParcelable(classLoader2);
    }
    
    public sm(final Parcelable parcelable) {
        super(parcelable);
    }
    
    @Override
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeParcelable(this.a, 0);
    }
}
