import java.nio.ByteOrder;
import java.util.Arrays;
import java.nio.ByteBuffer;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

final class bfg
{
    private final Queue a;
    
    public bfg() {
        this.a = biv.h(0);
    }
    
    final avn a(final ByteBuffer byteBuffer) {
        synchronized (this) {
            avn avn;
            if ((avn = this.a.poll()) == null) {
                avn = new avn();
            }
            avn.b = null;
            Arrays.fill(avn.a, (byte)0);
            avn.c = new avm();
            avn.d = 0;
            (avn.b = byteBuffer.asReadOnlyBuffer()).position(0);
            avn.b.order(ByteOrder.LITTLE_ENDIAN);
            return avn;
        }
    }
    
    final void b(final avn avn) {
        synchronized (this) {
            avn.b = null;
            avn.c = null;
            this.a.offer(avn);
        }
    }
}
