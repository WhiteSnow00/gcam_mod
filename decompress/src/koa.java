import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import java.io.FileDescriptor;
import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public interface koa extends krc
{
    niz a(final MediaFormat p0);
    
    void b(final MediaFormat p0);
    
    void c(final kob p0);
    
    void d(final long p0);
    
    void e(final MediaFormat p0);
    
    void f();
    
    void g(final kob p0);
    
    void h(final FileDescriptor p0);
    
    void i();
    
    void j(final long p0);
    
    void k();
    
    void l(final ByteBuffer p0, final MediaCodec$BufferInfo p1);
    
    void m(final ByteBuffer p0, final MediaCodec$BufferInfo p1, final int p2);
    
    void n(final ByteBuffer p0, final MediaCodec$BufferInfo p1);
    
    boolean o();
}
