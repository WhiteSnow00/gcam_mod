import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iem implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ iep a;
    final /* synthetic */ ieo b;
    
    public iem(final ieo b, final iep a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (seekBar instanceof ieg) {
            final ieg ieg = (ieg)seekBar;
            final idb c = ieg.c(n);
            ieg.invalidate();
            this.b.e(n);
            if (b) {
                jdj.e((View)seekBar);
            }
            final iep a = this.a;
            if (a != null) {
                a.b(c);
            }
        }
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
    }
}
