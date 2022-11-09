import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import android.view.View;
import android.content.Context;
import android.preference.PreferenceCategory;

// 
// Decompiled by Procyon v0.6.0
// 

final class erg extends PreferenceCategory
{
    public erg(final Context context) {
        super(context);
    }
    
    protected final void onBindView(final View view) {
        super.onBindView(view);
        if (!CameraSettingsActivity.p) {
            view.setBackgroundResource(2131231614);
            view.findViewById(2131427559).setVisibility(4);
        }
    }
}
