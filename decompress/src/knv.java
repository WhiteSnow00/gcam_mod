import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import java.io.FileDescriptor;
import android.media.MediaFormat;
import java.util.concurrent.ExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knv implements koa
{
    private final oey a;
    
    public knv(final oey a) {
        this.a = a;
    }
    
    private final koa p() {
        koa koa = null;
        try {
            koa = this.a.get();
            return koa;
        }
        catch (final InterruptedException koa) {}
        catch (final ExecutionException ex) {}
        throw new IllegalStateException("MuxerProcessor isn't available", (Throwable)koa);
    }
    
    @Override
    public final niz a(final MediaFormat mediaFormat) {
        return this.p().a(mediaFormat);
    }
    
    @Override
    public final void b(final MediaFormat mediaFormat) {
        this.p().b(mediaFormat);
    }
    
    @Override
    public final void c(final kob kob) {
        this.p().c(kob);
    }
    
    @Override
    public final void close() {
        this.p().close();
    }
    
    @Override
    public final void d(final long n) {
        this.p().d(n);
    }
    
    @Override
    public final void e(final MediaFormat mediaFormat) {
        this.p().e(mediaFormat);
    }
    
    @Override
    public final void f() {
        this.p().f();
    }
    
    @Override
    public final void g(final kob kob) {
        this.p().g(kob);
    }
    
    @Override
    public final void h(final FileDescriptor fileDescriptor) {
        this.p().h(fileDescriptor);
    }
    
    @Override
    public final void i() {
        this.p().i();
    }
    
    @Override
    public final void j(final long n) {
        this.p().j(n);
    }
    
    @Override
    public final void k() {
        this.p().k();
    }
    
    @Override
    public final void l(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.p().l(byteBuffer, mediaCodec$BufferInfo);
    }
    
    @Override
    public final void m(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo, final int n) {
        this.p().m(byteBuffer, mediaCodec$BufferInfo, n);
    }
    
    @Override
    public final void n(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.p().n(byteBuffer, mediaCodec$BufferInfo);
    }
    
    @Override
    public final boolean o() {
        return this.a.isDone() && this.p().o();
    }
}
