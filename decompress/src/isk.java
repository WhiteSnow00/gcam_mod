import android.view.KeyEvent;
import android.content.DialogInterface;
import com.google.android.apps.camera.ui.preference.KeyListenerPreference;
import android.widget.Button;
import android.widget.TextView;
import android.content.DialogInterface$OnKeyListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isk implements DialogInterface$OnKeyListener
{
    final /* synthetic */ TextView a;
    final /* synthetic */ Button b;
    final /* synthetic */ Button c;
    final /* synthetic */ KeyListenerPreference d;
    
    public isk(final KeyListenerPreference d, final TextView a, final Button b, final Button c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean onKey(final DialogInterface dialogInterface, final int n, final KeyEvent keyEvent) {
        final String a = KeyListenerPreference.a(keyEvent);
        Label_0183: {
            if (!a.isEmpty()) {
                switch (n) {
                    default: {
                        final TextView a2 = this.a;
                        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
                        sb.append("New Key Bind: ");
                        sb.append(a);
                        sb.append(" (Key Code: ");
                        sb.append(n);
                        sb.append(")");
                        a2.setText((CharSequence)sb.toString());
                        if (Integer.parseInt(this.d.a) != n) {
                            this.d.a = Integer.toString(n);
                            this.d.b = a;
                        }
                        this.b.setEnabled(true);
                        break Label_0183;
                    }
                    case 4:
                    case 22:
                    case 24:
                    case 25: {
                        break;
                    }
                }
            }
            this.a.setText((CharSequence)"Error: Key is not supported by Pixel Camera");
            this.b.setEnabled(false);
        }
        this.c.setVisibility(0);
        this.a.sendAccessibilityEvent(32768);
        return true;
    }
}
