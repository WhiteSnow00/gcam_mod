import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgb implements bfy
{
    public static final bgb a;
    private final /* synthetic */ int b;
    
    static {
        a = new bgb();
    }
    
    public bgb() {
    }
    
    public bgb(final int b) {
        this.b = b;
    }
    
    @Override
    public final aza a(final aza aza, final awg awg) {
        switch (this.b) {
            default: {
                final ByteBuffer b = ((bfk)aza.c()).b();
                final int a = bii.a;
                final boolean readOnly = b.isReadOnly();
                bih bih = null;
                if (!readOnly && b.hasArray()) {
                    bih = new bih(b.array(), b.arrayOffset(), b.limit());
                }
                byte[] array;
                if (bih != null && bih.a == 0 && bih.b == bih.c.length) {
                    array = b.array();
                }
                else {
                    final ByteBuffer readOnlyBuffer = b.asReadOnlyBuffer();
                    array = new byte[readOnlyBuffer.limit()];
                    bii.d(readOnlyBuffer);
                    readOnlyBuffer.get(array);
                }
                return new bfa(array);
            }
            case 0: {
                return aza;
            }
        }
    }
}
