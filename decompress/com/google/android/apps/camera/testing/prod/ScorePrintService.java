// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.testing.prod;

import android.content.Intent;
import android.app.IntentService;

public class ScorePrintService extends IntentService
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/testing/prod/ScorePrintService");
    }
    
    public ScorePrintService() {
        super("CAM_ScorePrintService");
    }
    
    protected final void onHandleIntent(final Intent intent) {
        if (intent == null) {
            a.l(ScorePrintService.a.c(), "No intent is given.", '\u0a18');
            return;
        }
        final hzr hzr = (hzr)((hzp)this.getApplication()).e(new nrr()).a.get();
        if (hzr == null) {
            a.l(ScorePrintService.a.c(), "The service isn't enabled.", '\u0a17');
            return;
        }
        hzr.a(intent);
    }
}
