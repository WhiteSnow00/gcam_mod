import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;
import android.widget.SeekBar$OnSeekBarChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aep implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ SeekBarPreference a;
    
    public aep(final SeekBarPreference a) {
        this.a = a;
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            final SeekBarPreference a = this.a;
            if (a.j || !a.c) {
                a.e(seekBar);
            }
        }
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
        this.a.c = true;
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        this.a.c = false;
        final int progress = seekBar.getProgress();
        final SeekBarPreference a = this.a;
        if (progress + a.b != a.a) {
            a.e(seekBar);
        }
    }
}
