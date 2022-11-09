import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nwb extends nwc implements Serializable
{
    private static final long serialVersionUID = 0L;
    public final byte[] a;
    
    public nwb(final byte[] array) {
        array.getClass();
        this.a = array;
    }
    
    @Override
    public final int a() {
        final int length = this.a.length;
        njo.q(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        final byte[] a = this.a;
        return (a[3] & 0xFF) << 24 | ((a[1] & 0xFF) << 8 | (a[0] & 0xFF) | (a[2] & 0xFF) << 16);
    }
    
    @Override
    public final int b() {
        return this.a.length * 8;
    }
    
    @Override
    public final boolean c(final nwc nwc) {
        if (this.a.length == nwc.d().length) {
            int n = 0;
            boolean b = true;
            while (true) {
                final byte[] a = this.a;
                if (n >= a.length) {
                    break;
                }
                b &= (a[n] == nwc.d()[n]);
                ++n;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final byte[] d() {
        return this.a;
    }
}
