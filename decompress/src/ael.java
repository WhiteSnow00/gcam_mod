import android.view.View;
import androidx.preference.Preference;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ael implements View$OnClickListener
{
    final /* synthetic */ Preference a;
    
    public ael(final Preference a) {
        this.a = a;
    }
    
    public final void onClick(final View view) {
        this.a.a(view);
    }
}
