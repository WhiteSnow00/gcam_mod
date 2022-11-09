import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ots extends otb
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new oti(9);
    }
    
    public ots() {
    }
    
    public ots(final Parcel parcel) {
        super(parcel);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof ots && Arrays.equals(((ots)o).a, super.a));
    }
}
