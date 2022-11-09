// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.legacy.app.activity.main;

public class CameraVoiceActivity extends CameraActivity
{
    @Override
    protected final void onPause() {
        bmx.f(this.getIntent());
        super.onPause();
    }
    
    @Override
    protected final boolean p() {
        return true;
    }
}
