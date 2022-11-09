import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mcu implements mcx
{
    private final /* synthetic */ int a;
    
    public mcu() {
    }
    
    public mcu(final int a) {
        this.a = a;
    }
    
    private static final void b(final ByteBuffer byteBuffer, final int n, final int n2) {
        byteBuffer.position(n);
        byteBuffer.limit(n + n2);
    }
    
    @Override
    public final boolean a(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2) {
        switch (this.a) {
            default: {
                if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
                    return true;
                }
                return false;
            }
            case 0: {
                return true;
            }
        }
    }
    
    @Override
    public final void copyBytes(ByteBuffer duplicate, ByteBuffer duplicate2, final int n, final int n2, final int n3) {
        switch (this.a) {
            default: {
                duplicate2.position(0);
                duplicate2.put(duplicate.array(), 0, n3);
                return;
            }
            case 0: {
                duplicate = duplicate.duplicate();
                b(duplicate, 0, n3);
                duplicate2 = duplicate2.duplicate();
                b(duplicate2, 0, n3);
                duplicate2.put(duplicate);
            }
        }
    }
    
    @Override
    public final void copyBytes2D(ByteBuffer duplicate, ByteBuffer duplicate2, int n, final int n2, int i, int n3, final int n4, final int n5) {
        final int a = this.a;
        n3 = 0;
        i = 0;
        switch (a) {
            default: {
                n = 0;
                for (i = n3; i < n2; ++i) {
                    duplicate2.position(i * n5);
                    duplicate2.put(duplicate.array(), n, n4);
                    n += n4;
                }
                return;
            }
            case 0: {
                duplicate = duplicate.duplicate();
                duplicate2 = duplicate2.duplicate();
                int n6 = 0;
                n3 = 0;
                while (i < n2) {
                    b(duplicate, n6, n);
                    b(duplicate2, n3, n);
                    duplicate2.put(duplicate);
                    n6 += n4;
                    n3 += n5;
                    ++i;
                }
            }
        }
    }
    
    @Override
    public final void copyBytes2D(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2, final int n, final int n2, int i, int j, final int n3, int k, final int n4, final int n5) {
        switch (this.a) {
            default: {
                final byte[] array = byteBuffer.array();
                final byte[] array2 = byteBuffer2.array();
                k = 0;
                j = 0;
                i = 0;
                while (k < n2) {
                    int n6 = j;
                    int n7 = i;
                    for (int l = 0; l < n; ++l) {
                        array2[n7] = array[n6];
                        n6 += n3;
                        ++n7;
                    }
                    j += n4;
                    i += n5;
                    ++k;
                }
                return;
            }
            case 0: {
                int n8;
                for (i = 0; i < n2; ++i) {
                    n8 = n4 * i;
                    k = n5 * i;
                    for (j = 0; j < n; ++j) {
                        byteBuffer2.put(k, byteBuffer.get(n8));
                        n8 += n3;
                        ++k;
                    }
                }
            }
        }
    }
    
    @Override
    public final String toString() {
        switch (this.a) {
            default: {
                return this.getClass().getSimpleName();
            }
            case 0: {
                return this.getClass().getSimpleName();
            }
        }
    }
}
