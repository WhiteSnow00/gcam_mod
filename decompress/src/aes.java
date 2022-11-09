import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;
import android.widget.CompoundButton$OnCheckedChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aes implements CompoundButton$OnCheckedChangeListener
{
    final /* synthetic */ SwitchPreferenceCompat a;
    
    public aes(final SwitchPreferenceCompat a) {
        this.a = a;
    }
    
    public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        this.a.e(b);
    }
}
