import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class fgb implements lup
{
    public final int a;
    final /* synthetic */ fgc b;
    private final lup c;
    private final AtomicInteger d;
    
    public fgb(final fgc b, final lup c, final int a) {
        this.b = b;
        this.d = new AtomicInteger(0);
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void a(final oey oey) {
        ofi.w(oey, new fga(this), odx.a);
        this.c.a(oey);
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.c.b(byteBuffer, mediaCodec$BufferInfo);
        if (this.d.incrementAndGet() % 10 == 1) {
            final cxl c = this.b.c;
            final cxo a = cxr.a;
            c.c();
        }
    }
    
    @Override
    public final void close() {
        this.d.get();
        this.c.close();
    }
}
