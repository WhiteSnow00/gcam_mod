import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfk implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ jfl a;
    
    public jfk(final jfl a) {
        this.a = a;
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (!b) {
            return;
        }
        this.a.c.d.seekTo(n);
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
        this.a.c.a();
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        this.a.c.b();
    }
}
