import android.util.Pair;
import java.lang.reflect.Array;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnw
{
    public static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/activity/util/CaptureDataSerializer");
    }
    
    public static String a(final Object o) {
        if (o == null) {
            return "<null>";
        }
        if (o.getClass().isArray()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int length = Array.getLength(o), i = 0; i < length; ++i) {
                sb.append(a(Array.get(o, i)));
                if (i != length - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return sb.toString();
        }
        if (o instanceof Pair) {
            final Pair pair = (Pair)o;
            final String a = a(pair.first);
            final String a2 = a(pair.second);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 9 + String.valueOf(a2).length());
            sb2.append("Pair: ");
            sb2.append(a);
            sb2.append(" / ");
            sb2.append(a2);
            return sb2.toString();
        }
        return o.toString();
    }
}
