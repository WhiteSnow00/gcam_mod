import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nwg extends nvz
{
    public final MessageDigest b;
    public final int c;
    public boolean d;
    
    public nwg(final MessageDigest b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final byte[] array) {
        this.b();
        this.b.update(array, 0, 2);
    }
    
    public final void b() {
        njo.p(this.d ^ true, "Cannot re-use a Hasher after calling hash() on it");
    }
}
