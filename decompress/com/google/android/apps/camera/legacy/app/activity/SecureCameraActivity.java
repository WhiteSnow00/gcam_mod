// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.legacy.app.activity;

import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

public class SecureCameraActivity extends CameraActivity
{
    @Override
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (!this.isVoiceInteractionRoot()) {
            bmx.f(this.getIntent());
        }
    }
}
