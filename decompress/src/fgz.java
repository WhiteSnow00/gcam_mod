import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgz implements lup
{
    public final ofn a;
    public final ofn b;
    private final lup c;
    private final int d;
    private final List e;
    private boolean f;
    private int g;
    
    public fgz(final lup c, final int d) {
        this.e = new ArrayList();
        this.a = ofn.f();
        this.b = ofn.f();
        this.f = false;
        this.g = 0;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final oey oey) {
        synchronized (this) {
            this.a.e(oey);
            final MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "application/motionphoto-highres");
            final ofn f = ofn.f();
            oey.d(new fgy(oey, f, mediaFormat), odx.a);
            this.c.a(f);
        }
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        synchronized (this) {
            if ((mediaCodec$BufferInfo.flags & 0x1) != 0x0) {
                this.e.add(this.g);
            }
            ++this.g;
            this.c.b(byteBuffer, mediaCodec$BufferInfo);
        }
    }
    
    public final void c() {
        monitorenter(this);
        try {
            if (this.b.isDone()) {
                monitorexit(this);
                return;
            }
            if (this.a.isCancelled()) {
                this.b.o(nii.a);
            }
            else if (this.f) {
                if (this.g == 0) {
                    this.b.o(nii.a);
                    monitorexit(this);
                    return;
                }
                if (!this.a.isDone()) {
                    monitorexit(this);
                    return;
                }
                try {
                    final MediaFormat mediaFormat = (MediaFormat)ofi.u(this.a);
                    final ofn b = this.b;
                    final okt m = oor.i.m();
                    final int integer = mediaFormat.getInteger("width");
                    if (m.c) {
                        m.m();
                        m.c = false;
                    }
                    final oor oor = (oor)m.b;
                    oor.a |= 0x1;
                    oor.b = integer;
                    final int integer2 = mediaFormat.getInteger("height");
                    if (m.c) {
                        m.m();
                        m.c = false;
                    }
                    final oor oor2 = (oor)m.b;
                    oor2.a |= 0x2;
                    oor2.c = integer2;
                    final String string = mediaFormat.getString("mime");
                    string.getClass();
                    if (m.c) {
                        m.m();
                        m.c = false;
                    }
                    final oor oor3 = (oor)m.b;
                    oor3.a |= 0x20;
                    oor3.g = string;
                    final List e = this.e;
                    final olf h = oor3.h;
                    if (!h.c()) {
                        oor3.h = oky.y(h);
                    }
                    ojf.e(e, oor3.h);
                    final ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    byteBuffer.getClass();
                    final ojw s = ojw.s(byteBuffer);
                    if (m.c) {
                        m.m();
                        m.c = false;
                    }
                    final oor oor4 = (oor)m.b;
                    oor4.a |= 0x8;
                    oor4.e = s;
                    final ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    byteBuffer2.getClass();
                    final ojw s2 = ojw.s(byteBuffer2);
                    if (m.c) {
                        m.m();
                        m.c = false;
                    }
                    final oor oor5 = (oor)m.b;
                    final int a = oor5.a | 0x10;
                    oor5.a = a;
                    oor5.f = s2;
                    final int d = this.d;
                    oor5.a = (a | 0x4);
                    oor5.d = d;
                    b.o(niz.i(m.h()));
                    monitorexit(this);
                    return;
                }
                catch (final ExecutionException ex) {
                    throw new IllegalStateException("Format should be done by now", ex);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.c.close();
            this.f = true;
            this.c();
        }
    }
}
