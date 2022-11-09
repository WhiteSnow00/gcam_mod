import android.widget.ListView;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qs implements View$OnTouchListener, View$OnAttachStateChangeListener
{
    private final float a;
    private final int b;
    final View c;
    public boolean d;
    private final int e;
    private Runnable f;
    private Runnable g;
    private int h;
    private final int[] i;
    
    public qs(final View c) {
        this.i = new int[2];
        (this.c = c).setLongClickable(true);
        c.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.a = (float)ViewConfiguration.get(c.getContext()).getScaledTouchSlop();
        final int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }
    
    public abstract nn a();
    
    protected boolean b() {
        throw null;
    }
    
    protected boolean c() {
        final nn a = this.a();
        if (a != null && a.u()) {
            a.k();
        }
        return true;
    }
    
    public final void d() {
        final Runnable g = this.g;
        if (g != null) {
            this.c.removeCallbacks(g);
        }
        final Runnable f = this.f;
        if (f != null) {
            this.c.removeCallbacks(f);
        }
    }
    
    public final boolean onTouch(View c, final MotionEvent motionEvent) {
        final boolean d = this.d;
        boolean d2 = false;
        Label_0533: {
            if (d) {
                final View c2 = this.c;
                final nn a = this.a();
                if (a != null) {
                    if (a.u()) {
                        final ListView ae = a.aE();
                        if (ae != null) {
                            final ql ql = (ql)ae;
                            if (ql.isShown()) {
                                final MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                                final int[] i = this.i;
                                c2.getLocationOnScreen(i);
                                obtainNoHistory.offsetLocation((float)i[0], (float)i[1]);
                                final int[] j = this.i;
                                ((View)ae).getLocationOnScreen(j);
                                obtainNoHistory.offsetLocation((float)(-j[0]), (float)(-j[1]));
                                final boolean a2 = ql.a(obtainNoHistory, this.h);
                                obtainNoHistory.recycle();
                                final int actionMasked = motionEvent.getActionMasked();
                                final boolean b = actionMasked != 1 && actionMasked != 3;
                                if (a2 && b) {
                                    d2 = true;
                                    break Label_0533;
                                }
                            }
                        }
                    }
                }
                d2 = !this.c();
            }
            else {
                c = this.c;
                boolean b2 = false;
                if (!c.isEnabled()) {
                    b2 = false;
                }
                else {
                    switch (motionEvent.getActionMasked()) {
                        default: {
                            b2 = false;
                            break;
                        }
                        case 2: {
                            final int pointerIndex = motionEvent.findPointerIndex(this.h);
                            if (pointerIndex >= 0) {
                                final float x = motionEvent.getX(pointerIndex);
                                final float y = motionEvent.getY(pointerIndex);
                                final float a3 = this.a;
                                final float n = -a3;
                                if (x >= n && y >= n && x < c.getRight() - c.getLeft() + a3 && y < c.getBottom() - c.getTop() + a3) {
                                    b2 = false;
                                    break;
                                }
                                this.d();
                                c.getParent().requestDisallowInterceptTouchEvent(true);
                                if (this.b()) {
                                    b2 = true;
                                    break;
                                }
                            }
                            b2 = false;
                            break;
                        }
                        case 1:
                        case 3: {
                            this.d();
                            b2 = false;
                            break;
                        }
                        case 0: {
                            this.h = motionEvent.getPointerId(0);
                            if (this.f == null) {
                                this.f = new qr(this, 1);
                            }
                            c.postDelayed(this.f, (long)this.b);
                            if (this.g == null) {
                                this.g = new qr(this);
                            }
                            c.postDelayed(this.g, (long)this.e);
                            b2 = false;
                            break;
                        }
                    }
                }
                d2 = b2;
                if (b2) {
                    final long uptimeMillis = SystemClock.uptimeMillis();
                    final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    this.c.onTouchEvent(obtain);
                    obtain.recycle();
                    d2 = b2;
                }
            }
        }
        this.d = d2;
        return d2 || d;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.d = false;
        this.h = -1;
        final Runnable f = this.f;
        if (f != null) {
            this.c.removeCallbacks(f);
        }
    }
}
