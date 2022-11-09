// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.videoplayer;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.net.Uri;
import android.content.BroadcastReceiver;

public class VideoPlayerActivity extends kf
{
    private final BroadcastReceiver k;
    
    public VideoPlayerActivity() {
        this.k = new jed(this);
    }
    
    private final jef m() {
        return (jef)this.c().c(2131428120);
    }
    
    private final void n(final Uri uri) {
        final Bundle bundle = new Bundle();
        bundle.putBoolean("no_seek_bar", false);
        bundle.putBoolean("auto_loop_enabled", false);
        final jef m = jef.m(bundle, uri);
        final fr i = this.c().i();
        i.l(2131428120, m);
        i.f();
    }
    
    @Override
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131624170);
        if (this.m() == null) {
            final Uri data = this.getIntent().getData();
            data.getClass();
            this.n(data);
        }
        this.registerReceiver(this.k, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }
    
    @Override
    protected final void onDestroy() {
        this.unregisterReceiver(this.k);
        super.onDestroy();
    }
    
    @Override
    protected final void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        final jef m = this.m();
        if (m != null) {
            final fr i = this.c().i();
            i.j(m);
            i.f();
        }
        final Uri data = intent.getData();
        data.getClass();
        this.n(data);
    }
}
