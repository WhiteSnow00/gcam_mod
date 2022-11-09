import android.widget.VideoView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jey
{
    public final jfg a;
    public final VideoView b;
    public final Runnable c;
    public boolean d;
    
    public jey(final jfg a) {
        a.getClass();
        this.a = a;
        final VideoView f = ((jfl)a).f;
        f.getClass();
        this.b = f;
        this.d = false;
        this.c = new jex(this);
    }
}
