import java.util.Iterator;
import android.animation.Animator;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

final class iqj implements jbq
{
    final /* synthetic */ iql a;
    private final /* synthetic */ int b;
    
    public iqj(final iql a) {
        this.a = a;
    }
    
    public iqj(final iql a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void setColor(final int textColor) {
        switch (this.b) {
            default: {
                final Animator n = this.a.n;
                if (n != null) {
                    n.end();
                }
                final iql a = this.a;
                a.j = textColor;
                for (final TextView textView : a.b.g()) {
                    if (textView.equals(this.a.h)) {
                        textView.setTextColor(this.a.i);
                    }
                    else {
                        textView.setTextColor(this.a.j);
                    }
                }
                return;
            }
            case 1: {
                final iql a2 = this.a;
                a2.k = textColor;
                a2.m.setTint(textColor);
                this.a.invalidate();
                return;
            }
            case 0: {
                final Animator n2 = this.a.n;
                if (n2 != null) {
                    n2.end();
                }
                final iql a3 = this.a;
                a3.i = textColor;
                final TextView h = a3.h;
                if (h != null) {
                    h.setTextColor(textColor);
                }
            }
        }
    }
}
