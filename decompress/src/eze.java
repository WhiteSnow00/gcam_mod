import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eze
{
    public static final Charset a;
    private static eze d;
    public final MessageDigest b;
    public final Object c;
    
    static {
        a = Charset.forName("UTF-8");
    }
    
    public eze(final MessageDigest b) {
        this.b = b;
        this.c = new Object();
    }
    
    public static eze a() {
        if (eze.d == null) {
            try {
                eze.d = new eze(MessageDigest.getInstance("SHA-1"));
            }
            catch (final NoSuchAlgorithmException ex) {
                throw new RuntimeException("Cannot initialize file name hasher", ex);
            }
        }
        return eze.d;
    }
}
