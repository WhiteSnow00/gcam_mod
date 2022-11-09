import android.view.View;
import android.view.CollapsibleActionView;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nb extends FrameLayout
{
    public final CollapsibleActionView a;
    
    public nb(final View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView)view;
        this.addView(view);
    }
}
