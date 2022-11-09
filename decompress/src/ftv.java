import java.io.IOException;
import android.media.MediaCodec;
import java.util.concurrent.atomic.AtomicInteger;
import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftv implements ftk
{
    private final MediaFormat a;
    private final lyp b;
    private final hdz c;
    private final lfg d;
    private frc e;
    
    public ftv(final MediaFormat a, final lyp b, final hdz c, final lfg d) {
        this.e = null;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private final void c() {
        this.a.setInteger("color-format", 2130708361);
        try {
            final MediaFormat a = this.a;
            final lyp b = this.b;
            final String string = a.getString("mime");
            string.getClass();
            this.e = new fre(new fre(new frf(new AtomicInteger(0), new fqz(MediaCodec.createEncoderByType(string), a, b, mao.a(b)))), 1);
        }
        catch (final IOException ex) {
            throw new IllegalStateException("Could not create image encoder!", ex);
        }
    }
    
    @Override
    public final frl a(final lup lup, final kra kra) {
        synchronized (this) {
            if (this.e == null) {
                this.c();
            }
            final frc e = this.e;
            e.getClass();
            frb frb;
            if (this.c.c(this.d.l())) {
                frb = fui.e;
            }
            else {
                frb = fui.d;
            }
            return new frd(e, lup, frb);
        }
    }
    
    @Override
    public final void b() {
        synchronized (this) {
            this.c();
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            try (final frc e = this.e) {}
            this.b.close();
        }
    }
}
