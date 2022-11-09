// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.theme;

import com.google.android.material.button.MaterialButton;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;

public class MaterialComponentsViewInflater extends AppCompatViewInflater
{
    @Override
    public final on a(final Context context, final AttributeSet set) {
        return new ngq(context, set);
    }
    
    @Override
    public final AppCompatButton b(final Context context, final AttributeSet set) {
        return new MaterialButton(context, set);
    }
    
    @Override
    public final op c(final Context context, final AttributeSet set) {
        return new nds(context, set);
    }
    
    @Override
    public final pa d(final Context context, final AttributeSet set) {
        return new nes(context, set);
    }
    
    @Override
    public final pt e(final Context context, final AttributeSet set) {
        return new ngt(context, set);
    }
}
