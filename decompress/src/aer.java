import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;
import android.widget.CompoundButton$OnCheckedChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aer implements CompoundButton$OnCheckedChangeListener
{
    final /* synthetic */ SwitchPreference a;
    
    public aer(final SwitchPreference a) {
        this.a = a;
    }
    
    public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        this.a.e(b);
    }
}
