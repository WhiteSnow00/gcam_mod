// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

class SnapshotButton$1 extends ivr
{
    final /* synthetic */ SnapshotButton this$0;
    final /* synthetic */ ivh val$snapshotButtonAnimnator;
    
    public SnapshotButton$1(final SnapshotButton this$0, final ivh val$snapshotButtonAnimnator) {
        this.this$0 = this$0;
        this.val$snapshotButtonAnimnator = val$snapshotButtonAnimnator;
    }
    
    @Override
    public void onShutterButtonPressedStateChanged(final boolean b) {
        this.this$0.runPressedStateAnimation(b, this.val$snapshotButtonAnimnator);
    }
}
