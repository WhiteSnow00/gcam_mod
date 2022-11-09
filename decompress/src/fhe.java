import android.media.MediaCodec$BufferInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class fhe implements mbv
{
    final /* synthetic */ ffy a;
    final /* synthetic */ fhf b;
    
    public fhe(final fhf b, final ffy a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final mbi mbi) {
        final fhf b = this.b;
        b.d.post((Runnable)new fhd(b, 5));
    }
    
    @Override
    public final void b(final long n) {
        final boolean a = ffb.a;
        final boolean a2 = ffb.a;
    }
    
    @Override
    public final void c(final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        if (this.b.k.compareAndSet(0L, mediaCodec$BufferInfo.presentationTimeUs)) {
            final long presentationTimeUs = mediaCodec$BufferInfo.presentationTimeUs;
        }
        if ((mediaCodec$BufferInfo.flags & 0x1) != 0x0) {
            this.b.l.set(this.b.m.getAndSet(0));
        }
        else {
            this.b.m.incrementAndGet();
        }
        if (((ffm)this.a).a(mediaCodec$BufferInfo.presentationTimeUs).d()) {
            mediaCodec$BufferInfo.flags |= Integer.MIN_VALUE;
        }
        this.b.h.incrementAndGet();
        this.b.i.incrementAndGet();
        this.b.j.set(mediaCodec$BufferInfo.presentationTimeUs);
        this.b.b.b(mediaCodec$BufferInfo);
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void e(final int n) {
    }
}
