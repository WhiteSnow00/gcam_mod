import libcore.io.Memory;
import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

final class onp extends onr
{
    public onp(final Unsafe unsafe) {
        super(unsafe);
    }
    
    @Override
    public final byte a(final long n) {
        return Memory.peekByte((int)n);
    }
    
    @Override
    public final double b(final Object o, final long n) {
        return Double.longBitsToDouble(this.l(o, n));
    }
    
    @Override
    public final float c(final Object o, final long n) {
        return Float.intBitsToFloat(this.k(o, n));
    }
    
    @Override
    public final void d(final long n, final byte[] array, final long n2, final long n3) {
        Memory.peekByteArray((int)n, array, (int)n2, (int)n3);
    }
    
    @Override
    public final void e(final Object o, final long n, final boolean b) {
        if (ons.d) {
            ons.o(o, n, (byte)(b ? 1 : 0));
            return;
        }
        ons.p(o, n, (byte)(b ? 1 : 0));
    }
    
    @Override
    public final void f(final Object o, final long n, final byte b) {
        if (ons.d) {
            ons.o(o, n, b);
            return;
        }
        ons.p(o, n, b);
    }
    
    @Override
    public final void g(final Object o, final long n, final double n2) {
        this.p(o, n, Double.doubleToLongBits(n2));
    }
    
    @Override
    public final void h(final Object o, final long n, final float n2) {
        this.o(o, n, Float.floatToIntBits(n2));
    }
    
    @Override
    public final boolean i(final Object o, final long n) {
        if (ons.d) {
            return ons.x(o, n);
        }
        return ons.y(o, n);
    }
}
