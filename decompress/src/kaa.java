import android.os.IInterface;
import android.os.Parcel;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kaa extends Binder
{
    private final String a;
    
    public kaa(final String a) {
        this.a = a;
    }
    
    protected final boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        throw new IllegalStateException(this.a);
    }
    
    public final IInterface queryLocalInterface(final String s) {
        return null;
    }
}
