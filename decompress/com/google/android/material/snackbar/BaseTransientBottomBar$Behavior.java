// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior
{
    public BaseTransientBottomBar$Behavior() {
        new nfw(this);
    }
    
    @Override
    public final boolean c(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 1:
            case 3: {
                synchronized (nfx.a().a) {
                    monitorexit(nfx.a().a);
                    break;
                }
            }
            case 0: {
                if (coordinatorLayout.l(view, (int)motionEvent.getX(), (int)motionEvent.getY())) {
                    synchronized (nfx.a().a) {
                        monitorexit(nfx.a().a);
                    }
                    break;
                }
                break;
            }
        }
        return super.c(coordinatorLayout, view, motionEvent);
    }
    
    @Override
    public final boolean w(final View view) {
        return view instanceof nft;
    }
}
