import android.media.MediaCodec$BufferInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class ffg implements mbv
{
    final /* synthetic */ ffi a;
    
    public ffg(final ffi a) {
        this.a = a;
    }
    
    @Override
    public final void a(final mbi mbi) {
    }
    
    @Override
    public final void b(final long n) {
    }
    
    @Override
    public final void c(final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.a.e.incrementAndGet();
        mediaCodec$BufferInfo.flags = 1;
        this.a.a(false);
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void e(final int n) {
    }
}
