// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar.dagger;

import com.google.android.apps.camera.bottombar.BottomBarController;

public class BottomBarControllerModule
{
    public BottomBarController provideBottomBarController(final ixx ixx, final hyt hyt, final cxl cxl) {
        return new BottomBarController(ixx.f, hyt, niz.i(cxl));
    }
}
