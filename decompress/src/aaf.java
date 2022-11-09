import java.io.UnsupportedEncodingException;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class aaf
{
    public static void c(final Context context, final Intent[] array, final Bundle bundle) {
        context.startActivities(array, (Bundle)null);
    }
    
    public static void d(final String s) {
        if (s.length() != 0) {
            return;
        }
        throw new ape("Empty array name", 4);
    }
    
    public static void e(final Object o) {
        if (o == null) {
            throw new ape("Parameter must not be null", 4);
        }
        if (o instanceof String && ((String)o).length() == 0) {
            throw new ape("Parameter must not be null or empty", 4);
        }
    }
    
    public static void f(final String s) {
        if (s != null && s.length() != 0) {
            return;
        }
        throw new ape("Empty property name", 4);
    }
    
    public static void g(final String s) {
        if (s != null && s.length() != 0) {
            return;
        }
        throw new ape("Empty schema namespace URI", 4);
    }
    
    public static byte[] h(final byte b) {
        final int n = b & 0xFF;
        if (n >= 128) {
            Label_0075: {
                if (n == 129 || n == 141 || n == 143 || n == 144 || n == 157) {
                    break Label_0075;
                }
                try {
                    return new String(new byte[] { b }, "cp1252").getBytes("UTF-8");
                    return new byte[] { 32 };
                }
                catch (final UnsupportedEncodingException ex) {}
            }
        }
        return new byte[] { b };
    }
}
