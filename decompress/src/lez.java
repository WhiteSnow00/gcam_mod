import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaMuxer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lez implements ljy, ljc
{
    private final MediaMuxer a;
    
    public lez(final MediaMuxer a) {
        this.a = a;
    }
    
    @Override
    public final int a(final MediaFormat mediaFormat) {
        return this.a.addTrack(mediaFormat);
    }
    
    @Override
    public final void b() {
        this.a.release();
    }
    
    @Override
    public final void c(final float n, final float n2) {
        this.a.setLocation(n, n2);
    }
    
    @Override
    public final void d(final int orientationHint) {
        this.a.setOrientationHint(orientationHint);
    }
    
    @Override
    public final void e() {
        this.a.start();
    }
    
    @Override
    public final void f() {
        this.a.stop();
    }
    
    @Override
    public final lfa g() {
        return new lfa(this.a);
    }
    
    @Override
    public final void h(final int n, final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.a.writeSampleData(n, byteBuffer, mediaCodec$BufferInfo);
    }
    
    @Override
    public final boolean i() {
        return false;
    }
}
