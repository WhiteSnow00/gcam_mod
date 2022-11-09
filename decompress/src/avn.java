import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avn
{
    public final byte[] a;
    public ByteBuffer b;
    public avm c;
    public int d;
    
    public avn() {
        this.a = new byte[256];
        this.d = 0;
    }
    
    public final int a() {
        int n;
        try {
            n = (this.b.get() & 0xFF);
        }
        catch (final Exception ex) {
            this.c.b = 1;
            n = 0;
        }
        return n;
    }
    
    public final int b() {
        return this.b.getShort();
    }
    
    public final void c() {
        final int a = this.a();
        this.d = a;
        if (a > 0) {
            int n = 0;
            try {
                while (true) {
                    final int d = this.d;
                    if (n >= d) {
                        break;
                    }
                    final int n2 = d - n;
                    this.b.get(this.a, n, n2);
                    n += n2;
                }
            }
            catch (final Exception ex) {
                this.c.b = 1;
            }
        }
    }
    
    public final void d() {
        int i;
        do {
            i = this.a();
            this.b.position(Math.min(this.b.position() + i, this.b.limit()));
        } while (i > 0);
    }
    
    public final boolean e() {
        return this.c.b != 0;
    }
    
    public final int[] f(final int n) {
        final byte[] array = new byte[n * 3];
        int[] array2;
        try {
            this.b.get(array);
            array2 = new int[256];
            int i = 0;
            int n2 = 0;
            while (i < n) {
                final int n3 = n2 + 1;
                final byte b = array[n2];
                final int n4 = n3 + 1;
                array2[i] = ((b & 0xFF) << 16 | 0xFF000000 | (array[n3] & 0xFF) << 8 | (array[n4] & 0xFF));
                n2 = n4 + 1;
                ++i;
            }
        }
        catch (final BufferUnderflowException ex) {
            array2 = null;
            this.c.b = 1;
        }
        return array2;
    }
}
