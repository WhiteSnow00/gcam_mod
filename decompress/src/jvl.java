import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jvl extends bjf implements jvm
{
    private int a;
    
    public jvl() {
        super("com.google.android.gms.common.internal.ICertData");
    }
    
    protected jvl(final byte[] array) {
        super("com.google.android.gms.common.internal.ICertData");
        jvu.b(array.length == 25);
        this.a = Arrays.hashCode(array);
    }
    
    public static byte[] e(final String s) {
        try {
            return s.getBytes("ISO-8859-1");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final int c() {
        return this.a;
    }
    
    @Override
    public final jwx d() {
        return jww.b(this.w());
    }
    
    public final boolean equals(final Object o) {
        if (o != null) {
            if (o instanceof jvm) {
                try {
                    final jvm jvm = (jvm)o;
                    return jvm.c() == this.a && Arrays.equals(this.w(), (byte[])jww.c(jvm.d()));
                }
                catch (final RemoteException ex) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
                    return false;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return this.a;
    }
    
    public abstract byte[] w();
    
    @Override
    protected final boolean x(int a, final Parcel parcel, final Parcel parcel2) {
        switch (a) {
            default: {
                return false;
            }
            case 2: {
                a = this.a;
                parcel2.writeNoException();
                parcel2.writeInt(a);
                break;
            }
            case 1: {
                final jwx d = this.d();
                parcel2.writeNoException();
                bjg.e(parcel2, (IInterface)d);
                break;
            }
        }
        return true;
    }
}
