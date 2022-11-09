import java.util.Iterator;
import android.util.Pair;
import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ltm implements ltk
{
    private final lty a;
    private final ltu b;
    
    public ltm(final lty a, final ltu b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final float n) {
        synchronized (this) {
            this.b.c = niz.i(n);
        }
    }
    
    @Override
    public final void b(final float n, final float n2) {
        synchronized (this) {
            this.b.b = niz.i(new ltv(n, n2));
        }
    }
    
    @Override
    public final void c(final int a) {
        synchronized (this) {
            this.b.a = a;
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.a.close();
        }
    }
    
    @Override
    public final ltx d(final int n, final MediaFormat mediaFormat) {
        synchronized (this) {
            final lty a = this.a;
            final ltx ltx = new ltx(a, mediaFormat, n);
            a.a.add(ltx);
            Collections.sort((List<Object>)a.a, bzj.s);
            return ltx;
        }
    }
    
    @Override
    public final void e(final ltx ltx, final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        monitorenter(this);
        try {
            njo.o(ltx instanceof ltx);
            if ((mediaCodec$BufferInfo.flags & 0x1) > 0) {
                ltx.g = true;
            }
            if (ltx.g || !lue.e(ltx.a)) {
                if (mediaCodec$BufferInfo.size != 0) {
                    ltx.f.addLast(Pair.create((Object)mediaCodec$BufferInfo, (Object)byteBuffer));
                    final lty h = ltx.h;
                    for (final ltx ltx2 : h.a) {
                        if (ltx2.f.size() > 2 && ((MediaCodec$BufferInfo)((Pair)ltx2.f.peekLast()).first).presentationTimeUs - ((MediaCodec$BufferInfo)((Pair)ltx2.f.peekFirst()).first).presentationTimeUs > 1000000L) {
                            h.a(ltx2);
                        }
                    }
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
