// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.graphics.drawable.ColorDrawable;

class BottomBar$1 implements jbq
{
    final /* synthetic */ BottomBar this$0;
    
    public BottomBar$1(final BottomBar this$0) {
        this.this$0 = this$0;
    }
    
    public int getColor() {
        return ((ColorDrawable)this.this$0.getBackground()).getColor();
    }
    
    @Override
    public void setColor(final int backgroundColor) {
        this.this$0.setBackgroundColor(backgroundColor);
    }
}
