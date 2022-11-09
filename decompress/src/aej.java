import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import android.widget.AdapterView$OnItemSelectedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aej implements AdapterView$OnItemSelectedListener
{
    final /* synthetic */ DropDownPreference a;
    
    public aej(final DropDownPreference a) {
        this.a = a;
    }
    
    public final void onItemSelected(final AdapterView adapterView, final View view, int n, final long n2) {
        if (n >= 0) {
            final String string = this.a.b[n].toString();
            if (!string.equals(this.a.c)) {
                final DropDownPreference a = this.a;
                n = ((TextUtils.equals((CharSequence)a.c, (CharSequence)string) ^ true) ? 1 : 0);
                if (n != 0 || !a.d) {
                    a.c = string;
                    a.d = true;
                    if (n != 0) {
                        a.c();
                    }
                }
            }
        }
    }
    
    public final void onNothingSelected(final AdapterView adapterView) {
    }
}
