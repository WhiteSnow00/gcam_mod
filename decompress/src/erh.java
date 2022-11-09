import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import android.view.View;
import android.content.Context;
import android.preference.Preference;

// 
// Decompiled by Procyon v0.6.0
// 

final class erh extends Preference
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    
    public erh(final Context context, final int a, final int b) {
        this.a = a;
        this.b = b;
        super(context);
    }
    
    protected final void onBindView(final View view) {
        super.onBindView(view);
        if (!CameraSettingsActivity.p) {
            if (this.a == this.b) {
                view.setBackgroundResource(2131231608);
                return;
            }
            view.setBackgroundResource(2131231611);
        }
    }
}
