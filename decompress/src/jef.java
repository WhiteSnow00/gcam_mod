import android.graphics.Rect;
import android.media.MediaPlayer$OnInfoListener;
import android.widget.TextView;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.SeekBar;
import android.widget.ImageButton;
import android.view.View$OnClickListener;
import android.view.View$OnTouchListener;
import android.widget.VideoView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Parcelable;
import android.net.Uri;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jef extends ei
{
    public jfl a;
    public niz b;
    private jff c;
    
    public jef() {
        this.b = nii.a;
    }
    
    public static jef m(final Bundle bundle, final Uri uri) {
        bundle.putParcelable("video_uri", (Parcelable)uri);
        final jef jef = new jef();
        jef.K(bundle);
        return jef;
    }
    
    @Override
    public final void F() {
        super.F();
        this.c.b();
    }
    
    @Override
    public final void G() {
        super.G();
        this.c.k();
    }
    
    @Override
    public final void h(final Bundle bundle) {
        final boolean playing = this.a.f.isPlaying();
        final int currentPosition = this.a.f.getCurrentPosition();
        bundle.putBoolean("videoplayer_playing_state", playing);
        bundle.putInt("videoplayer_position", currentPosition);
    }
    
    @Override
    public final View y(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131624171, viewGroup, false);
        this.c = new jes();
        final jej jej = new jej(new jee(this));
        final jeo jeo = new jeo();
        final boolean boolean1 = super.n.getBoolean("auto_loop_enabled", false);
        final jfl a = new jfl(this.c, jej, jeo, inflate, super.n.getBoolean("no_seek_bar", false));
        this.a = a;
        (a.f = (VideoView)a.d.findViewById(2131428124)).setOnTouchListener((View$OnTouchListener)new jfi(a));
        a.d.setOnClickListener((View$OnClickListener)new jfh(a, 2));
        a.f.setWillNotDraw(false);
        (a.h = (ImageButton)a.d.findViewById(2131428126)).setOnClickListener((View$OnClickListener)new jfh(a, 1));
        (a.g = (ImageButton)a.d.findViewById(2131428127)).setOnClickListener((View$OnClickListener)new jfh(a));
        a.l = a.d.findViewById(2131428122);
        (a.k = (SeekBar)a.d.findViewById(2131428121)).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new jfk(a));
        a.i = (TextView)a.d.findViewById(2131428123);
        a.j = (TextView)a.d.findViewById(2131428119);
        a.o = a.d.findViewById(2131428125);
        if (this.b.g()) {
            this.a.f.setOnInfoListener((MediaPlayer$OnInfoListener)this.b.c());
        }
        final Rect rect = (Rect)super.n.getParcelable("video_view_padding");
        if (rect != null) {
            this.a.d(rect);
        }
        final Uri uri = (Uri)super.n.getParcelable("video_uri");
        uri.getClass();
        final jfl a2 = this.a;
        jeo.c(a2, new jey(a2));
        jeo.f();
        jeo.g();
        final jff c = this.c;
        final jfl a3 = this.a;
        int int1;
        if (bundle == null) {
            int1 = 0;
        }
        else {
            int1 = bundle.getInt("videoplayer_position", 0);
        }
        c.j(a3, uri, jej, jeo, int1, bundle == null || bundle.getBoolean("videoplayer_playing_state", true), boolean1);
        this.c.f();
        jej.f();
        return inflate;
    }
}
