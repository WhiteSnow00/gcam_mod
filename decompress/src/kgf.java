import android.os.Parcelable;
import android.os.Parcel;
import android.util.Log;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgf extends jwc
{
    public static final Parcelable$Creator CREATOR;
    final kgg a;
    final int b;
    final int c;
    final int d;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(7);
    }
    
    public kgf(final kgg a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final kfe kfe) {
        final int b = this.b;
        switch (b) {
            default: {
                final StringBuilder sb = new StringBuilder(25);
                sb.append("Unknown type: ");
                sb.append(b);
                Log.w("ChannelEventParcelable", sb.toString());
                return;
            }
            case 4: {
                kfe.e(this.a);
                return;
            }
            case 3: {
                kfe.d(this.a);
                return;
            }
            case 2: {
                kfe.c(this.a);
                return;
            }
            case 1: {
                kfe.b(this.a);
            }
        }
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        String string = null;
        switch (b) {
            default: {
                string = Integer.toString(b);
                break;
            }
            case 4: {
                string = "OUTPUT_CLOSED";
                break;
            }
            case 3: {
                string = "INPUT_CLOSED";
                break;
            }
            case 2: {
                string = "CHANNEL_CLOSED";
                break;
            }
            case 1: {
                string = "CHANNEL_OPENED";
                break;
            }
        }
        final int c = this.c;
        String string2 = null;
        switch (c) {
            default: {
                string2 = Integer.toString(c);
                break;
            }
            case 3: {
                string2 = "CLOSE_REASON_LOCAL_CLOSE";
                break;
            }
            case 2: {
                string2 = "CLOSE_REASON_REMOTE_CLOSE";
                break;
            }
            case 1: {
                string2 = "CLOSE_REASON_DISCONNECTED";
                break;
            }
            case 0: {
                string2 = "CLOSE_REASON_NORMAL";
                break;
            }
        }
        final int d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 81 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append("ChannelEventParcelable[, channel=");
        sb.append(value);
        sb.append(", type=");
        sb.append(string);
        sb.append(", closeReason=");
        sb.append(string2);
        sb.append(", appErrorCode=");
        sb.append(d);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.u(parcel, 2, (Parcelable)this.a, n);
        jwn.n(parcel, 3, this.b);
        jwn.n(parcel, 4, this.c);
        jwn.n(parcel, 5, this.d);
        jwn.i(parcel, g);
    }
}
