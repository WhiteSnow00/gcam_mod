import java.util.ArrayList;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bal implements biy
{
    private final /* synthetic */ int a;
    
    public bal() {
    }
    
    public bal(final int a) {
        this.a = a;
    }
    
    public static final bam b() {
        try {
            return new bam(MessageDigest.getInstance("SHA-256"));
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
}
