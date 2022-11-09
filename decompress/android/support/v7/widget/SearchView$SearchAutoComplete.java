// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.view.KeyEvent$DispatcherState;
import android.view.KeyEvent;
import android.graphics.Rect;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.Context;

public class SearchView$SearchAutoComplete extends on
{
    private int a;
    
    public SearchView$SearchAutoComplete(final Context context) {
        this(context, null);
    }
    
    public SearchView$SearchAutoComplete(final Context context, final AttributeSet set) {
        this(context, set, 2130968644);
    }
    
    public SearchView$SearchAutoComplete(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = this.getThreshold();
    }
    
    public final boolean enoughToFilter() {
        return this.a <= 0 || super.enoughToFilter();
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        final Configuration configuration = this.getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        int n;
        if (screenWidthDp >= 960 && screenHeightDp >= 720 && configuration.orientation == 2) {
            n = 256;
        }
        else if (screenWidthDp < 600) {
            n = 160;
        }
        else {
            n = 192;
        }
        this.setMinWidth((int)TypedValue.applyDimension(1, (float)n, displayMetrics));
    }
    
    protected final void onFocusChanged(final boolean b, final int n, final Rect rect) {
        super.onFocusChanged(b, n, rect);
        throw null;
    }
    
    public final boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
        int n2 = n;
        if (n == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final KeyEvent$DispatcherState keyDispatcherState = this.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, (Object)this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                final KeyEvent$DispatcherState keyDispatcherState2 = this.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking()) {
                    if (keyEvent.isCanceled()) {
                        n2 = 4;
                        return super.onKeyPreIme(n2, keyEvent);
                    }
                    throw null;
                }
            }
            n2 = 4;
        }
        return super.onKeyPreIme(n2, keyEvent);
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (!b) {
            return;
        }
        throw null;
    }
    
    public final void performCompletion() {
    }
    
    protected final void replaceText(final CharSequence charSequence) {
    }
    
    public final void setThreshold(final int n) {
        super.setThreshold(n);
        this.a = n;
    }
}
