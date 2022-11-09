// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.wirers;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnTouchListener;
import android.view.GestureDetector;
import android.view.View;

@Deprecated
public class PreviewOverlay extends View
{
    public GestureDetector a;
    public View$OnTouchListener b;
    public boolean c;
    public boolean d;
    public jas e;
    private final int[] f;
    
    public PreviewOverlay(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = new int[] { 0, 0 };
        this.a = null;
        this.b = null;
        this.c = true;
        this.d = true;
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.getLocationInWindow(this.f);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.c) {
            return true;
        }
        if (this.d) {
            final jas e = this.e;
            if (e != null) {
                final jgu a = e.a;
                Label_0214: {
                    int o = 0;
                    switch (motionEvent.getActionMasked()) {
                        default: {
                            break Label_0214;
                        }
                        case 6: {
                            o = a.o - 1;
                            break;
                        }
                        case 5: {
                            o = a.o + 1;
                            break;
                        }
                        case 3: {
                            a.b().g();
                            jgm jgm;
                            if (a.l) {
                                jgm = a.e;
                            }
                            else {
                                jgm = jgm.m;
                            }
                            jgm.g();
                            a.o = 0;
                            break Label_0214;
                        }
                        case 1: {
                            a.b().b();
                            a.e.b();
                            a.n = 0.0f;
                            a.m = 0.0f;
                            a.q = 1;
                            a.k = false;
                            a.l = false;
                            a.o = 0;
                            break Label_0214;
                        }
                        case 0: {
                            a.e.a(a.a(motionEvent));
                            break Label_0214;
                        }
                    }
                    a.o = o;
                }
                if (a.k) {
                    a.d.onTouchEvent(motionEvent);
                }
                else if (a.q == 1 && !a.l) {
                    a.d.onTouchEvent(motionEvent);
                    a.c.onTouchEvent(motionEvent);
                }
                else {
                    a.c.onTouchEvent(motionEvent);
                }
                return true;
            }
        }
        final GestureDetector a2 = this.a;
        if (a2 != null) {
            a2.onTouchEvent(motionEvent);
        }
        final View$OnTouchListener b = this.b;
        if (b != null) {
            b.onTouch((View)this, motionEvent);
        }
        return true;
    }
}
