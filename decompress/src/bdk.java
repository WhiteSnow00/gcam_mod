import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class bdk implements bdm
{
    private final ByteBuffer a;
    
    public bdk(final ByteBuffer a) {
        (this.a = a).order(ByteOrder.BIG_ENDIAN);
    }
    
    @Override
    public final int a() {
        return this.d() << 8 | this.d();
    }
    
    @Override
    public final int b(final byte[] array, int min) {
        min = Math.min(min, this.a.remaining());
        if (min == 0) {
            return -1;
        }
        this.a.get(array, 0, min);
        return min;
    }
    
    @Override
    public final long c(final long n) {
        final int n2 = (int)Math.min(this.a.remaining(), n);
        final ByteBuffer a = this.a;
        a.position(a.position() + n2);
        return n2;
    }
    
    @Override
    public final short d() {
        if (this.a.remaining() > 0) {
            return (short)(this.a.get() & 0xFF);
        }
        throw new bdl();
    }
}
