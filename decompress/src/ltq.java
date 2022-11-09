import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import java.io.IOException;
import android.util.Log;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ltq implements ljy
{
    private final ltk a;
    private final AtomicBoolean b;
    private final List c;
    
    public ltq(final FileOutputStream fileOutputStream, final lto ex) {
        this.b = new AtomicBoolean(false);
        this.c = new ArrayList();
        try {
            this.a = ltl.a(fileOutputStream, (lto)ex);
        }
        catch (final IOException ex) {
            Log.e("GcaMediaMuxer", "Error creating the GCA muxer", (Throwable)ex);
            try {
                fileOutputStream.close();
            }
            catch (final IOException ex2) {
                Log.e("GcaMediaMuxer", "... and close also threw", (Throwable)ex2);
            }
            throw new ltr(ex);
        }
    }
    
    @Override
    public final int a(final MediaFormat mediaFormat) {
        final List c = this.c;
        c.add(this.a.d(c.size(), mediaFormat));
        final niz c2 = lue.c(mediaFormat);
        if (c2.g()) {
            this.a.a((float)c2.c());
        }
        return this.c.size() - 1;
    }
    
    @Override
    public final void b() {
        this.g();
    }
    
    @Override
    public final void c(final float n, final float n2) {
        this.a.b(n, n2);
    }
    
    @Override
    public final void d(final int n) {
        this.a.c(n);
    }
    
    @Override
    public final void e() {
    }
    
    @Override
    public final void f() {
        this.g();
    }
    
    public final void g() {
        try {
            if (!this.b.getAndSet(true)) {
                this.a.close();
            }
        }
        catch (final IOException ex) {
            throw new ltr(ex);
        }
    }
    
    @Override
    public final void h(final int n, final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
        byteBuffer.rewind();
        allocateDirect.put(byteBuffer);
        allocateDirect.flip();
        try {
            this.a.e(this.c.get(n), allocateDirect, mediaCodec$BufferInfo);
        }
        catch (final IOException ex) {
            throw new ltr(ex);
        }
    }
    
    @Override
    public final boolean i() {
        return true;
    }
}
