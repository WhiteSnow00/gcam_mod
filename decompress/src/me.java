import android.view.ActionMode$Callback;
import android.view.WindowManager$LayoutParams;
import android.view.SearchEvent;
import java.util.List;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public class me implements Window$Callback
{
    public final Window$Callback b;
    
    public me(final Window$Callback b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }
    
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        return this.b.dispatchGenericMotionEvent(motionEvent);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.b.dispatchKeyEvent(keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        return this.b.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return this.b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return this.b.dispatchTouchEvent(motionEvent);
    }
    
    public final boolean dispatchTrackballEvent(final MotionEvent motionEvent) {
        return this.b.dispatchTrackballEvent(motionEvent);
    }
    
    public final void onActionModeFinished(final ActionMode actionMode) {
        this.b.onActionModeFinished(actionMode);
    }
    
    public final void onActionModeStarted(final ActionMode actionMode) {
        this.b.onActionModeStarted(actionMode);
    }
    
    public final void onAttachedToWindow() {
        this.b.onAttachedToWindow();
    }
    
    public void onContentChanged() {
        this.b.onContentChanged();
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        return this.b.onCreatePanelMenu(n, menu);
    }
    
    public View onCreatePanelView(final int n) {
        return this.b.onCreatePanelView(n);
    }
    
    public final void onDetachedFromWindow() {
        this.b.onDetachedFromWindow();
    }
    
    public final boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return this.b.onMenuItemSelected(n, menuItem);
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return this.b.onMenuOpened(n, menu);
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        this.b.onPanelClosed(n, menu);
    }
    
    public final void onPointerCaptureChanged(final boolean b) {
        this.b.onPointerCaptureChanged(b);
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        return this.b.onPreparePanel(n, view, menu);
    }
    
    public void onProvideKeyboardShortcuts(final List list, final Menu menu, final int n) {
        this.b.onProvideKeyboardShortcuts(list, menu, n);
    }
    
    public final boolean onSearchRequested() {
        return this.b.onSearchRequested();
    }
    
    public final boolean onSearchRequested(final SearchEvent searchEvent) {
        return this.b.onSearchRequested(searchEvent);
    }
    
    public final void onWindowAttributesChanged(final WindowManager$LayoutParams windowManager$LayoutParams) {
        this.b.onWindowAttributesChanged(windowManager$LayoutParams);
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        this.b.onWindowFocusChanged(b);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
        return this.b.onWindowStartingActionMode(actionMode$Callback);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback, final int n) {
        return this.b.onWindowStartingActionMode(actionMode$Callback, n);
    }
}
