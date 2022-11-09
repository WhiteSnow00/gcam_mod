import android.os.Parcelable;
import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jps extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public static final jps a;
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    
    static {
        a = new jps(0);
        CREATOR = (Parcelable$Creator)new uj(15);
    }
    
    public jps(final int n) {
        this(n, null, null);
    }
    
    public jps(final int b, final int c, final PendingIntent d, final String e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public jps(final int n, final PendingIntent pendingIntent) {
        this(n, pendingIntent, null);
    }
    
    public jps(final int n, final PendingIntent pendingIntent, final String s) {
        this(1, n, pendingIntent, s);
    }
    
    static String a(final int n) {
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder(31);
                sb.append("UNKNOWN_ERROR_CODE(");
                sb.append(n);
                sb.append(")");
                return sb.toString();
            }
            case 1500: {
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            }
            case 99: {
                return "UNFINISHED";
            }
            case 24: {
                return "API_DISABLED_FOR_CONNECTION";
            }
            case 23: {
                return "API_DISABLED";
            }
            case 22: {
                return "RESOLUTION_ACTIVITY_NOT_FOUND";
            }
            case 21: {
                return "API_VERSION_UPDATE_REQUIRED";
            }
            case 20: {
                return "RESTRICTED_PROFILE";
            }
            case 19: {
                return "SERVICE_MISSING_PERMISSION";
            }
            case 18: {
                return "SERVICE_UPDATING";
            }
            case 17: {
                return "SIGN_IN_FAILED";
            }
            case 16: {
                return "API_UNAVAILABLE";
            }
            case 15: {
                return "INTERRUPTED";
            }
            case 14: {
                return "TIMEOUT";
            }
            case 13: {
                return "CANCELED";
            }
            case 11: {
                return "LICENSE_CHECK_FAILED";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 9: {
                return "SERVICE_INVALID";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 1: {
                return "SERVICE_MISSING";
            }
            case 0: {
                return "SUCCESS";
            }
            case -1: {
                return "UNKNOWN";
            }
        }
    }
    
    public final boolean b() {
        return this.c != 0 && this.d != null;
    }
    
    public final boolean c() {
        return this.c == 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof jps)) {
            return false;
        }
        final jps jps = (jps)o;
        return this.c == jps.c && jvu.m(this.d, jps.d) && jvu.m(this.e, jps.e);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.c, this.d, this.e });
    }
    
    @Override
    public final String toString() {
        final ArrayList list = new ArrayList();
        jvu.o("statusCode", a(this.c), list);
        jvu.o("resolution", this.d, list);
        jvu.o("message", this.e, list);
        return jvu.n(list, this);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, this.b);
        jwn.n(parcel, 2, this.c);
        jwn.u(parcel, 3, (Parcelable)this.d, n);
        jwn.v(parcel, 4, this.e);
        jwn.i(parcel, g);
    }
}
