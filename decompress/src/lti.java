import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class lti implements lup
{
    public final int a;
    public niz b;
    final /* synthetic */ ltj c;
    
    public lti(final ltj c, final int a) {
        this.c = c;
        this.b = nii.a;
        this.a = a;
    }
    
    @Override
    public final void a(final oey oey) {
        oey.d(new ltg(this, oey), this.c.e);
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.c.e.execute(new lth(this, byteBuffer, mediaCodec$BufferInfo));
    }
    
    @Override
    public final void close() {
        this.c.e.execute(new ltf(this));
    }
}
