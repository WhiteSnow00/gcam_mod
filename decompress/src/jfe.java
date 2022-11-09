import android.net.Uri;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnCompletionListener;

// 
// Decompiled by Procyon v0.6.0
// 

class jfe extends jez
{
    final /* synthetic */ jff b;
    
    public jfe(final jff b) {
        this.b = b;
    }
    
    @Override
    public void bC() {
        final jff b = this.b;
        b.d.a(b.e.getDuration());
        final jff b2 = this.b;
        b2.e.seekTo(b2.i);
        final jff b3 = this.b;
        b3.d.b(b3.i);
        this.b.f.a();
    }
    
    @Override
    public final void f() {
        final jff b = this.b;
        final Uri h = b.h;
        if (h != null) {
            b.e.setVideoURI(h);
        }
        this.b.e.setOnCompletionListener((MediaPlayer$OnCompletionListener)new jfc(this));
        this.b.e.setOnPreparedListener((MediaPlayer$OnPreparedListener)new jfd(this));
    }
    
    @Override
    public void i() {
        final jff b = this.b;
        b.d.a(b.e.getDuration());
        final jff b2 = this.b;
        b2.e.seekTo(b2.i);
        final jff b3 = this.b;
        b3.d.b(b3.i);
        this.b.f.b();
    }
}
