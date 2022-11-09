import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agk extends abm
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public Parcelable b;
    public ClassLoader e;
    
    static {
        CREATOR = (Parcelable$Creator)new tu(4);
    }
    
    public agk(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        ClassLoader classLoader2 = classLoader;
        if (classLoader == null) {
            classLoader2 = this.getClass().getClassLoader();
        }
        this.a = parcel.readInt();
        this.b = parcel.readParcelable(classLoader2);
        this.e = classLoader2;
    }
    
    public agk(final Parcelable parcelable) {
        super(parcelable);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, n);
    }
}
