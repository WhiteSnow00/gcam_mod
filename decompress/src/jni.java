import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class jni
{
    private static volatile jmw a;
    
    static {
        jni.a = new jmw();
    }
    
    public static void a(final Object o) {
        final jnj a = jnj.a;
        final String s = "Invalid version number";
        if (a != null) {
            a.o("Invalid version number", o);
        }
        else if (jni.a != null) {
            final int a2 = jni.a.a;
            String string;
            if (o != null) {
                final String s2 = (String)o;
                final StringBuilder sb = new StringBuilder(s2.length() + 23);
                sb.append("Invalid version number:");
                sb.append(s2);
                string = sb.toString();
            }
            else {
                string = s;
            }
            Log.e((String)jnd.b.a(), string);
        }
    }
}
