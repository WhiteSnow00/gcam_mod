// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar.dagger;

import com.google.android.apps.camera.bottombar.BottomBarController;

public final class BottomBarControllerModule_ProvideBottomBarControllerFactory implements oun
{
    private final pii cameraUiProvider;
    private final pii gcaConfigProvider;
    private final BottomBarControllerModule module;
    private final pii sysUiFlagApplierProvider;
    
    public BottomBarControllerModule_ProvideBottomBarControllerFactory(final BottomBarControllerModule module, final pii cameraUiProvider, final pii sysUiFlagApplierProvider, final pii gcaConfigProvider) {
        this.module = module;
        this.cameraUiProvider = cameraUiProvider;
        this.sysUiFlagApplierProvider = sysUiFlagApplierProvider;
        this.gcaConfigProvider = gcaConfigProvider;
    }
    
    public static BottomBarControllerModule_ProvideBottomBarControllerFactory create(final BottomBarControllerModule bottomBarControllerModule, final pii pii, final pii pii2, final pii pii3) {
        return new BottomBarControllerModule_ProvideBottomBarControllerFactory(bottomBarControllerModule, pii, pii2, pii3);
    }
    
    public static BottomBarController provideBottomBarController(final BottomBarControllerModule bottomBarControllerModule, final ixx ixx, final hyt hyt, final cxl cxl) {
        final BottomBarController provideBottomBarController = bottomBarControllerModule.provideBottomBarController(ixx, hyt, cxl);
        pqf.k(provideBottomBarController);
        return provideBottomBarController;
    }
    
    @Override
    public BottomBarController get() {
        return provideBottomBarController(this.module, (ixx)this.cameraUiProvider.get(), (hyt)this.sysUiFlagApplierProvider.get(), (cxl)this.gcaConfigProvider.get());
    }
}
