// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import java.util.Iterator;

class BottomBarController$1 extends BottomBarListener
{
    final /* synthetic */ BottomBarController this$0;
    
    public BottomBarController$1(final BottomBarController this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void onCameraSwitchButtonClicked() {
        final Object access$000 = this.this$0.lock;
        monitorenter(access$000);
        try {
            final Iterator iterator = this.this$0.listeners.iterator();
            while (iterator.hasNext()) {
                ((BottomBarListener)iterator.next()).onCameraSwitchButtonClicked();
            }
            monitorexit(access$000);
        }
        finally {
            monitorexit(access$000);
            while (true) {}
        }
    }
    
    @Override
    public void onCancelButtonPressed() {
        final Object access$000 = this.this$0.lock;
        monitorenter(access$000);
        try {
            final Iterator iterator = this.this$0.listeners.iterator();
            while (iterator.hasNext()) {
                ((BottomBarListener)iterator.next()).onCancelButtonPressed();
            }
            monitorexit(access$000);
        }
        finally {
            monitorexit(access$000);
            while (true) {}
        }
    }
    
    @Override
    public void onFpsSwitch(final int n) {
        final Object access$000 = this.this$0.lock;
        monitorenter(access$000);
        try {
            final Iterator iterator = this.this$0.listeners.iterator();
            while (iterator.hasNext()) {
                ((BottomBarListener)iterator.next()).onFpsSwitch(n);
            }
            monitorexit(access$000);
        }
        finally {
            monitorexit(access$000);
            while (true) {}
        }
    }
    
    @Override
    public void onPauseButtonClicked() {
        final Object access$000 = this.this$0.lock;
        monitorenter(access$000);
        try {
            final Iterator iterator = this.this$0.listeners.iterator();
            while (iterator.hasNext()) {
                ((BottomBarListener)iterator.next()).onPauseButtonClicked();
            }
            monitorexit(access$000);
        }
        finally {
            monitorexit(access$000);
            while (true) {}
        }
    }
    
    @Override
    public void onResumeButtonClicked() {
        final Object access$000 = this.this$0.lock;
        monitorenter(access$000);
        try {
            final Iterator iterator = this.this$0.listeners.iterator();
            while (iterator.hasNext()) {
                ((BottomBarListener)iterator.next()).onResumeButtonClicked();
            }
            monitorexit(access$000);
        }
        finally {
            monitorexit(access$000);
            while (true) {}
        }
    }
    
    @Override
    public void onRetakeButtonPressed() {
        final Object access$000 = this.this$0.lock;
        monitorenter(access$000);
        try {
            final Iterator iterator = this.this$0.listeners.iterator();
            while (iterator.hasNext()) {
                ((BottomBarListener)iterator.next()).onRetakeButtonPressed();
            }
            monitorexit(access$000);
        }
        finally {
            monitorexit(access$000);
            while (true) {}
        }
    }
    
    @Override
    public void onReviewPlayButtonPressed() {
        final Object access$000 = this.this$0.lock;
        monitorenter(access$000);
        try {
            final Iterator iterator = this.this$0.listeners.iterator();
            while (iterator.hasNext()) {
                ((BottomBarListener)iterator.next()).onReviewPlayButtonPressed();
            }
            monitorexit(access$000);
        }
        finally {
            monitorexit(access$000);
            while (true) {}
        }
    }
    
    @Override
    public void onShutterButtonClicked() {
        final Object access$000 = this.this$0.lock;
        monitorenter(access$000);
        try {
            final Iterator iterator = this.this$0.listeners.iterator();
            while (iterator.hasNext()) {
                ((BottomBarListener)iterator.next()).onShutterButtonClicked();
            }
            monitorexit(access$000);
        }
        finally {
            monitorexit(access$000);
            while (true) {}
        }
    }
    
    @Override
    public void onSnapshotButtonClicked() {
        final Object access$000 = this.this$0.lock;
        monitorenter(access$000);
        try {
            final Iterator iterator = this.this$0.listeners.iterator();
            while (iterator.hasNext()) {
                ((BottomBarListener)iterator.next()).onSnapshotButtonClicked();
            }
            monitorexit(access$000);
        }
        finally {
            monitorexit(access$000);
            while (true) {}
        }
    }
    
    @Override
    public void onThumbnailButtonClicked() {
        final Object access$000 = this.this$0.lock;
        monitorenter(access$000);
        try {
            final Iterator iterator = this.this$0.listeners.iterator();
            while (iterator.hasNext()) {
                ((BottomBarListener)iterator.next()).onThumbnailButtonClicked();
            }
            monitorexit(access$000);
        }
        finally {
            monitorexit(access$000);
            while (true) {}
        }
    }
}
