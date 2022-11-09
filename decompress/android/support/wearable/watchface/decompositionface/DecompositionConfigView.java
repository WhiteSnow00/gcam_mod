// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.watchface.decompositionface;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.widget.ImageView;

public class DecompositionConfigView extends ImageView
{
    private final GestureDetector$SimpleOnGestureListener a;
    private final GestureDetector b;
    
    public DecompositionConfigView(final Context context) {
        super(context);
        this.getContext();
        new vy();
        new xo();
        final vw a = new vw();
        this.a = a;
        this.b = new GestureDetector(this.getContext(), (GestureDetector$OnGestureListener)a);
        new Rect();
    }
    
    public DecompositionConfigView(final Context context, final AttributeSet set) {
        super(context, set);
        this.getContext();
        new vy();
        new xo();
        final vw a = new vw();
        this.a = a;
        this.b = new GestureDetector(this.getContext(), (GestureDetector$OnGestureListener)a);
        new Rect();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.b.onTouchEvent(motionEvent);
    }
}
