import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nwi extends nwa implements Serializable
{
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;
    
    public nwi() {
        final MessageDigest b = b("SHA-256");
        this.a = b;
        this.b = b.getDigestLength();
        this.d = "Hashing.sha256()";
        this.c = c(b);
    }
    
    public nwi(final String s, final int b) {
        this.d = "Hashing.sha256()";
        final MessageDigest b2 = b(s);
        this.a = b2;
        final int digestLength = b2.getDigestLength();
        boolean b3 = false;
        if (b >= 4 && b <= digestLength) {
            b3 = true;
        }
        njo.j(b3, "bytes (%s) must be >= 4 and < %s", b, digestLength);
        this.b = b;
        this.c = c(b2);
    }
    
    private static MessageDigest b(final String s) {
        try {
            return MessageDigest.getInstance(s);
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    private static boolean c(final MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        }
        catch (final CloneNotSupportedException ex) {
            return false;
        }
    }
    
    @Override
    public final och a() {
        if (this.c) {
            try {
                return new nwg((MessageDigest)this.a.clone(), this.b);
            }
            catch (final CloneNotSupportedException ex) {}
        }
        return new nwg(b(this.a.getAlgorithm()), this.b);
    }
    
    @Override
    public final String toString() {
        return this.d;
    }
    
    Object writeReplace() {
        return new nwh(this.a.getAlgorithm(), this.b);
    }
}
