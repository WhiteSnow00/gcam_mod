import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import android.widget.CompoundButton$OnCheckedChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aei implements CompoundButton$OnCheckedChangeListener
{
    final /* synthetic */ CheckBoxPreference a;
    
    public aei(final CheckBoxPreference a) {
        this.a = a;
    }
    
    public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        this.a.e(b);
    }
}
