import android.media.MediaRecorder$OnInfoListener;
import android.media.MediaRecorder$OnErrorListener;
import java.io.FileDescriptor;
import java.io.IOException;
import android.view.Surface;
import android.media.MediaRecorder;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpw implements kpz
{
    private static final AtomicInteger b;
    public final MediaRecorder a;
    private boolean c;
    private niz d;
    
    static {
        b = new AtomicInteger(0);
    }
    
    public kpw(final MediaRecorder a) {
        this.c = false;
        this.d = nii.a;
        this.a = a;
        kpw.b.getAndIncrement();
    }
    
    @Override
    public final void A(final int videoFrameRate) {
        synchronized (this) {
            if (!this.c) {
                this.a.setVideoFrameRate(videoFrameRate);
            }
        }
    }
    
    @Override
    public final void B(final int n, final int n2) {
        synchronized (this) {
            if (!this.c) {
                this.a.setVideoSize(n, n2);
            }
        }
    }
    
    @Override
    public final void C() {
        synchronized (this) {
            if (!this.c) {
                try {
                    this.a.start();
                }
                catch (final RuntimeException ex) {
                    throw new kpx(ex);
                }
            }
        }
    }
    
    @Override
    public final void D() {
        synchronized (this) {
            if (!this.c) {
                try {
                    this.a.stop();
                }
                catch (final RuntimeException ex) {
                    throw new kpx(ex);
                }
            }
        }
    }
    
    @Override
    public final void E() {
        synchronized (this) {
            if (!this.c) {
                this.a.setVideoSource(2);
            }
        }
    }
    
    @Override
    public final MediaRecorder a() {
        return this.a;
    }
    
    @Override
    public final Surface b() {
        monitorenter(this);
        try {
            Surface surface2;
            if (!this.c) {
                if (this.d.g()) {
                    final Surface surface = (Surface)this.d.c();
                    monitorexit(this);
                    return surface;
                }
                surface2 = this.a.getSurface();
            }
            else {
                surface2 = null;
            }
            monitorexit(this);
            return surface2;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void c() {
        synchronized (this) {
            if (!this.c) {
                try {
                    this.a.pause();
                }
                catch (final RuntimeException ex) {
                    throw new kpx(ex);
                }
            }
        }
    }
    
    @Override
    public final void d() {
        synchronized (this) {
            if (!this.c) {
                try {
                    this.a.prepare();
                }
                catch (final IOException ex) {
                    throw new kpx(ex);
                }
            }
        }
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            if (!this.c) {
                this.a.release();
                this.c = true;
            }
        }
    }
    
    @Override
    public final void f() {
        synchronized (this) {
            if (!this.c) {
                this.d = nii.a;
                this.a.reset();
            }
        }
    }
    
    @Override
    public final void g() {
        synchronized (this) {
            if (!this.c) {
                try {
                    this.a.resume();
                }
                catch (final RuntimeException ex) {
                    throw new kpx(ex);
                }
            }
        }
    }
    
    @Override
    public final void h(final int audioChannels) {
        synchronized (this) {
            if (!this.c) {
                this.a.setAudioChannels(audioChannels);
            }
        }
    }
    
    @Override
    public final void i(final int audioEncoder) {
        synchronized (this) {
            if (!this.c) {
                this.a.setAudioEncoder(audioEncoder);
            }
        }
    }
    
    @Override
    public final void j(final int audioEncodingBitRate) {
        synchronized (this) {
            if (!this.c) {
                this.a.setAudioEncodingBitRate(audioEncodingBitRate);
            }
        }
    }
    
    @Override
    public final void k(final int audioSamplingRate) {
        synchronized (this) {
            if (!this.c) {
                this.a.setAudioSamplingRate(audioSamplingRate);
            }
        }
    }
    
    @Override
    public final void l(final int audioSource) {
        synchronized (this) {
            if (!this.c) {
                this.a.setAudioSource(audioSource);
            }
        }
    }
    
    @Override
    public final void m(final double captureRate) {
        synchronized (this) {
            if (!this.c) {
                this.a.setCaptureRate(captureRate);
            }
        }
    }
    
    @Override
    public final void n(final Surface inputSurface) {
        synchronized (this) {
            if (!this.c) {
                this.a.setInputSurface(inputSurface);
                this.d = niz.i(inputSurface);
            }
        }
    }
    
    @Override
    public final void o(final float n, final float n2) {
        synchronized (this) {
            if (!this.c) {
                this.a.setLocation(n, n2);
            }
        }
    }
    
    @Override
    public final void p(final int maxDuration) {
        synchronized (this) {
            if (!this.c) {
                this.a.setMaxDuration(maxDuration);
            }
        }
    }
    
    @Override
    public final void q(final long maxFileSize) {
        synchronized (this) {
            if (!this.c) {
                this.a.setMaxFileSize(maxFileSize);
            }
        }
    }
    
    @Override
    public final void r(final FileDescriptor nextOutputFile) {
        if (!this.c) {
            try {
                this.a.setNextOutputFile(nextOutputFile);
            }
            catch (final IOException ex) {
                throw new kpx(ex);
            }
        }
    }
    
    @Override
    public final void s(final MediaRecorder$OnErrorListener onErrorListener) {
        synchronized (this) {
            if (!this.c) {
                this.a.setOnErrorListener(onErrorListener);
            }
        }
    }
    
    @Override
    public final void t(final MediaRecorder$OnInfoListener onInfoListener) {
        synchronized (this) {
            if (!this.c) {
                this.a.setOnInfoListener(onInfoListener);
            }
        }
    }
    
    @Override
    public final void u(final int orientationHint) {
        synchronized (this) {
            if (!this.c) {
                this.a.setOrientationHint(orientationHint);
            }
        }
    }
    
    @Override
    public final void v(final FileDescriptor outputFile) {
        synchronized (this) {
            if (!this.c) {
                this.a.setOutputFile(outputFile);
            }
        }
    }
    
    @Override
    public final void w(final String outputFile) {
        synchronized (this) {
            if (!this.c) {
                this.a.setOutputFile(outputFile);
            }
        }
    }
    
    @Override
    public final void x(final int outputFormat) {
        synchronized (this) {
            if (!this.c) {
                this.a.setOutputFormat(outputFormat);
            }
        }
    }
    
    @Override
    public final void y(final int videoEncoder) {
        synchronized (this) {
            if (!this.c) {
                this.a.setVideoEncoder(videoEncoder);
            }
        }
    }
    
    @Override
    public final void z(final int videoEncodingBitRate) {
        synchronized (this) {
            if (!this.c) {
                this.a.setVideoEncodingBitRate(videoEncodingBitRate);
            }
        }
    }
}
