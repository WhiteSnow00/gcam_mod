import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.preference.SeekBarPreference;
import android.view.View$OnKeyListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeq implements View$OnKeyListener
{
    final /* synthetic */ SeekBarPreference a;
    
    public aeq(final SeekBarPreference a) {
        this.a = a;
    }
    
    public final boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (!this.a.d && (n == 21 || n == 22)) {
            return false;
        }
        if (n != 23 && n != 66) {
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
        return false;
    }
}
