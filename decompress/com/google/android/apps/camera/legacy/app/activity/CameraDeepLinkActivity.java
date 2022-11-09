// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.legacy.app.activity;

import java.util.Iterator;
import java.util.Locale;
import android.content.Context;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;

public class CameraDeepLinkActivity extends Activity
{
    private static final nsd a;
    private boolean b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/legacy/app/activity/CameraDeepLinkActivity");
    }
    
    private final void a() {
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.GoogleCamera"));
        intent.setPackage("com.android.vending");
        this.startActivity(intent);
        this.b = true;
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.b = false;
        final Intent intent = new Intent((Context)this, (Class)CameraActivity.class);
        intent.setAction("android.media.action.STILL_IMAGE_CAMERA");
        intent.addFlags(268435456);
        final Uri data = this.getIntent().getData();
        if (data == null) {
            a.l(CameraDeepLinkActivity.a.c(), "Received intent to launch DeepLinkActivity with null intentUri", '\u04e4');
            this.startActivity(intent);
            this.b = true;
            return;
        }
        for (final String s : data.getQueryParameterNames()) {
            if ("mode".equalsIgnoreCase(s)) {
                final String queryParameter = data.getQueryParameter(s);
                queryParameter.getClass();
                final niz a = niq.a(jbm.class, queryParameter.toUpperCase(Locale.ROOT));
                if (!a.g() || !jbk.e((jbm)a.c())) {
                    a.k(CameraDeepLinkActivity.a.c(), "Unsupported mode '%s', perhaps you need to upgrade", queryParameter, '\u04e5');
                    this.a();
                    return;
                }
                if (!"android.media.action.STILL_IMAGE_CAMERA".equals(intent.getAction())) {
                    throw new UnsupportedOperationException("Unreachable: only still-image modes supported");
                }
                intent.putExtra("android.intent.extra.STILL_IMAGE_MODE", ((jbm)a.c()).toString());
            }
            else if ("timer".equalsIgnoreCase(s)) {
                final String queryParameter2 = data.getQueryParameter(s);
                queryParameter2.getClass();
                intent.putExtra("android.intent.extra.TIMER_DURATION_SECONDS", Integer.parseInt(queryParameter2));
            }
            else {
                if (!"use-front-camera".equalsIgnoreCase(s)) {
                    CameraDeepLinkActivity.a.c().E(1251).x("Unknown query parameter %s, with value %s", s, data.getQueryParameter(s));
                    this.a();
                    return;
                }
                final String queryParameter3 = data.getQueryParameter(s);
                queryParameter3.getClass();
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", Boolean.parseBoolean(queryParameter3));
            }
        }
        this.startActivity(intent);
        this.b = true;
    }
    
    protected final void onResume() {
        super.onResume();
        if (this.b) {
            this.finish();
        }
    }
}
