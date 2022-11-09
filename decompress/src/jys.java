import android.util.Base64;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jys
{
    private static final Random a;
    
    static {
        a = new Random();
    }
    
    public static String a() {
        final byte[] array = new byte[16];
        jys.a.nextBytes(array);
        return Base64.encodeToString(array, 11);
    }
}
