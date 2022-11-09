// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.brella.examplestore.beholder;

import android.content.Context;

public class BeholderExampleStoreService extends byi
{
    public bzi a;
    
    @Override
    protected final bye a(final Context context, final bza bza, final byx byx) {
        return this.b(context).a(bza, byx);
    }
    
    protected final bzi b(final Context context) {
        synchronized (this) {
            if (this.a == null) {
                ((bxz)((egp)context.getApplicationContext()).c(bxz.class)).d(this);
            }
            return this.a;
        }
    }
}
