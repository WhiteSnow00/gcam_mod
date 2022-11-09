import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import android.widget.TextView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class doy
{
    public final Context a;
    public final Resources b;
    public final FocusIndicatorRingView c;
    public final TextView d;
    public final FocusIndicatorView e;
    
    public doy(final Context a, final FocusIndicatorView e) {
        this.a = a;
        this.e = e;
        this.b = a.getResources();
        this.c = (FocusIndicatorRingView)e.findViewById(2131427613);
        this.d = (TextView)e.findViewById(2131427612);
    }
}
