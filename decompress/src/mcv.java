import java.util.Arrays;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class mcv implements mcx
{
    private final mcx[] a;
    
    public mcv(final mcx... a) {
        this.a = a;
    }
    
    private static void b() {
        throw new IllegalArgumentException("No MemCopier found to copy between buffers.");
    }
    
    @Override
    public final boolean a(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2) {
        final mcx[] a = this.a;
        for (int i = 0; i < 3; ++i) {
            if (a[i].a(byteBuffer, byteBuffer2)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final void copyBytes(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2, int i, final int n, final int n2) {
        final mcx[] a = this.a;
        mcx mcx;
        for (i = 0; i < 3; ++i) {
            mcx = a[i];
            if (mcx.a(byteBuffer, byteBuffer2)) {
                mcx.copyBytes(byteBuffer, byteBuffer2, 0, 0, n2);
                return;
            }
        }
        b();
    }
    
    @Override
    public final void copyBytes2D(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2, final int n, final int n2, int i, final int n3, final int n4, final int n5) {
        final mcx[] a = this.a;
        mcx mcx;
        for (i = 0; i < 3; ++i) {
            mcx = a[i];
            if (mcx.a(byteBuffer, byteBuffer2)) {
                mcx.copyBytes2D(byteBuffer, byteBuffer2, n, n2, 0, 0, n4, n5);
                return;
            }
        }
        b();
    }
    
    @Override
    public final void copyBytes2D(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2, final int n, final int n2, int i, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final mcx[] a = this.a;
        mcx mcx;
        for (i = 0; i < 3; ++i) {
            mcx = a[i];
            if (mcx.a(byteBuffer, byteBuffer2)) {
                mcx.copyBytes2D(byteBuffer, byteBuffer2, n, n2, 0, 0, n4, 1, n6, n7);
                return;
            }
        }
        b();
    }
    
    @Override
    public final String toString() {
        final String simpleName = this.getClass().getSimpleName();
        final String g = nfa.g(Arrays.asList(this.a), ",");
        final StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(g).length());
        sb.append(simpleName);
        sb.append("[");
        sb.append(g);
        sb.append("]");
        return sb.toString();
    }
}
