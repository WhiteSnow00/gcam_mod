// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.os.IBinder;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Region$Op;
import android.text.TextUtils;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.view.ViewConfiguration;
import android.widget.TextView;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable$Callback;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.text.Layout;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.util.Property;
import android.widget.CompoundButton;

public class SwitchCompat extends CompoundButton
{
    private static final Property e;
    private static final int[] f;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private final TextPaint I;
    private ColorStateList J;
    private Layout K;
    private Layout L;
    private TransformationMethod M;
    private final ps N;
    private final Rect O;
    public CharSequence a;
    public CharSequence b;
    public float c;
    ObjectAnimator d;
    private Drawable g;
    private ColorStateList h;
    private PorterDuff$Mode i;
    private boolean j;
    private boolean k;
    private Drawable l;
    private ColorStateList m;
    private PorterDuff$Mode n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private float x;
    private float y;
    private VelocityTracker z;
    
    static {
        e = new ti(Float.class);
        f = new int[] { 16842912 };
    }
    
    public SwitchCompat(final Context context) {
        this(context, null);
    }
    
    public SwitchCompat(final Context context, final AttributeSet set) {
        this(context, set, 2130969713);
    }
    
    public SwitchCompat(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.h = null;
        this.i = null;
        this.j = false;
        this.k = false;
        this.m = null;
        this.n = null;
        this.o = false;
        this.p = false;
        this.z = VelocityTracker.obtain();
        this.O = new Rect();
        tj.d((View)this, this.getContext());
        boolean fakeBoldText = true;
        final TextPaint i = new TextPaint(1);
        this.I = i;
        i.density = this.getResources().getDisplayMetrics().density;
        final to q = to.q(context, set, lo.u, n);
        ik.E((View)this, context, lo.u, set, q.b, n, 0);
        final Drawable h = q.h(2);
        this.g = h;
        if (h != null) {
            h.setCallback((Drawable$Callback)this);
        }
        final Drawable h2 = q.h(11);
        if ((this.l = h2) != null) {
            h2.setCallback((Drawable$Callback)this);
        }
        this.a = q.l(0);
        this.b = q.l(1);
        this.u = q.o(3, true);
        this.q = q.b(8, 0);
        this.r = q.b(5, 0);
        this.s = q.b(6, 0);
        this.t = q.o(4, false);
        final ColorStateList g = q.g(9);
        if (g != null) {
            this.h = g;
            this.j = true;
        }
        final PorterDuff$Mode a = qi.a(q.c(10, -1), null);
        if (this.i != a) {
            this.i = a;
            this.k = true;
        }
        final boolean j = this.j;
        if (j || this.k) {
            final Drawable g2 = this.g;
            if (g2 != null && (j || this.k)) {
                final Drawable mutate = g2.mutate();
                this.g = mutate;
                if (this.j) {
                    mutate.setTintList(this.h);
                }
                if (this.k) {
                    this.g.setTintMode(this.i);
                }
                if (this.g.isStateful()) {
                    this.g.setState(this.getDrawableState());
                }
            }
        }
        final ColorStateList g3 = q.g(12);
        if (g3 != null) {
            this.m = g3;
            this.o = true;
        }
        final PorterDuff$Mode a2 = qi.a(q.c(13, -1), null);
        if (this.n != a2) {
            this.n = a2;
            this.p = true;
        }
        final boolean o = this.o;
        if (o || this.p) {
            final Drawable l = this.l;
            if (l != null && (o || this.p)) {
                final Drawable mutate2 = l.mutate();
                this.l = mutate2;
                if (this.o) {
                    mutate2.setTintList(this.m);
                }
                if (this.p) {
                    this.l.setTintMode(this.n);
                }
                if (this.l.isStateful()) {
                    this.l.setState(this.getDrawableState());
                }
            }
        }
        final int f = q.f(7, 0);
        if (f != 0) {
            final to k = to.j(context, f, lo.v);
            final ColorStateList g4 = k.g(3);
            if (g4 != null) {
                this.J = g4;
            }
            else {
                this.J = this.getTextColors();
            }
            final int b = k.b(0, 0);
            if (b != 0) {
                final float textSize = (float)b;
                if (textSize != i.getTextSize()) {
                    i.setTextSize(textSize);
                    this.requestLayout();
                }
            }
            final int c = k.c(1, -1);
            final int c2 = k.c(2, -1);
            Typeface typeface = null;
            switch (c) {
                default: {
                    typeface = null;
                    break;
                }
                case 3: {
                    typeface = Typeface.MONOSPACE;
                    break;
                }
                case 2: {
                    typeface = Typeface.SERIF;
                    break;
                }
                case 1: {
                    typeface = Typeface.SANS_SERIF;
                    break;
                }
            }
            float textSkewX = 0.0f;
            if (c2 > 0) {
                Typeface typeface2;
                if (typeface == null) {
                    typeface2 = Typeface.defaultFromStyle(c2);
                }
                else {
                    typeface2 = Typeface.create(typeface, c2);
                }
                this.c(typeface2);
                int style;
                if (typeface2 != null) {
                    style = typeface2.getStyle();
                }
                else {
                    style = 0;
                }
                final int n2 = ~style & c2;
                if (0x1 != (n2 & 0x1)) {
                    fakeBoldText = false;
                }
                i.setFakeBoldText(fakeBoldText);
                if ((n2 & 0x2) != 0x0) {
                    textSkewX = -0.25f;
                }
                i.setTextSkewX(textSkewX);
            }
            else {
                i.setFakeBoldText(false);
                i.setTextSkewX(0.0f);
                this.c(typeface);
            }
            if (k.o(17, false)) {
                this.M = (TransformationMethod)new ls(this.getContext());
            }
            else {
                this.M = null;
            }
            k.n();
        }
        (this.N = new ps((TextView)this)).b(set, n);
        q.n();
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.w = value.getScaledTouchSlop();
        this.A = value.getScaledMinimumFlingVelocity();
        this.refreshDrawableState();
        this.setChecked(this.isChecked());
    }
    
    private final int e() {
        float c;
        if (ue.b((View)this)) {
            c = 1.0f - this.c;
        }
        else {
            c = this.c;
        }
        return (int)(c * this.f() + 0.5f);
    }
    
    private final int f() {
        final Drawable l = this.l;
        if (l != null) {
            final Rect o = this.O;
            l.getPadding(o);
            final Drawable g = this.g;
            Rect rect;
            if (g != null) {
                rect = qi.b(g);
            }
            else {
                rect = qi.a;
            }
            return this.B - this.D - o.left - o.right - rect.left - rect.right;
        }
        return 0;
    }
    
    private final Layout g(CharSequence transformation) {
        final TransformationMethod m = this.M;
        if (m != null) {
            transformation = m.getTransformation(transformation, (View)this);
        }
        final TextPaint i = this.I;
        int n;
        if (transformation != null) {
            n = (int)Math.ceil(Layout.getDesiredWidth(transformation, i));
        }
        else {
            n = 0;
        }
        return (Layout)new StaticLayout(transformation, i, n, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }
    
    private final boolean h() {
        return this.c > 0.5f;
    }
    
    public final void a() {
        CharSequence charSequence;
        if ((charSequence = this.b) == null) {
            charSequence = this.getResources().getString(2131951625);
        }
        ik.O((View)this, charSequence);
    }
    
    public final void b() {
        CharSequence charSequence;
        if ((charSequence = this.a) == null) {
            charSequence = this.getResources().getString(2131951626);
        }
        ik.O((View)this, charSequence);
    }
    
    public final void c(final Typeface typeface) {
        if ((this.I.getTypeface() != null && !this.I.getTypeface().equals((Object)typeface)) || (this.I.getTypeface() == null && typeface != null)) {
            this.I.setTypeface(typeface);
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public final void d(final float c) {
        this.c = c;
        this.invalidate();
    }
    
    public final void draw(final Canvas canvas) {
        final Rect o = this.O;
        final int e = this.E;
        final int f = this.F;
        int g = this.G;
        final int h = this.H;
        int n = this.e() + e;
        final Drawable g2 = this.g;
        Rect rect;
        if (g2 != null) {
            rect = qi.b(g2);
        }
        else {
            rect = qi.a;
        }
        final Drawable l = this.l;
        if (l != null) {
            l.getPadding(o);
            final int n2 = n + o.left;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            Label_0229: {
                if (rect != null) {
                    n3 = e;
                    if (rect.left > o.left) {
                        n3 = e + (rect.left - o.left);
                    }
                    if (rect.top > o.top) {
                        n4 = rect.top - o.top + f;
                    }
                    else {
                        n4 = f;
                    }
                    if (rect.right > o.right) {
                        g -= rect.right - o.right;
                    }
                    if (rect.bottom > o.bottom) {
                        n5 = h - (rect.bottom - o.bottom);
                        break Label_0229;
                    }
                }
                else {
                    n4 = f;
                    n3 = e;
                }
                n5 = h;
            }
            this.l.setBounds(n3, n4, g, n5);
            n = n2;
        }
        final Drawable g3 = this.g;
        if (g3 != null) {
            g3.getPadding(o);
            final int n6 = n - o.left;
            final int n7 = n + this.D + o.right;
            this.g.setBounds(n6, f, n7, h);
            final Drawable background = this.getBackground();
            if (background != null) {
                background.setHotspotBounds(n6, f, n7, h);
            }
        }
        super.draw(canvas);
    }
    
    public final void drawableHotspotChanged(final float n, final float n2) {
        super.drawableHotspotChanged(n, n2);
        final Drawable g = this.g;
        if (g != null) {
            g.setHotspot(n, n2);
        }
        final Drawable l = this.l;
        if (l != null) {
            l.setHotspot(n, n2);
        }
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable g = this.g;
        int setState = 0;
        if (g != null && g.isStateful()) {
            setState = (g.setState(drawableState) ? 1 : 0);
        }
        final Drawable l = this.l;
        int n = setState;
        if (l != null) {
            n = setState;
            if (l.isStateful()) {
                n = (setState | (l.setState(drawableState) ? 1 : 0));
            }
        }
        if (n != 0) {
            this.invalidate();
        }
    }
    
    public final int getCompoundPaddingLeft() {
        if (!ue.b((View)this)) {
            return super.getCompoundPaddingLeft();
        }
        int n = super.getCompoundPaddingLeft() + this.B;
        if (!TextUtils.isEmpty(this.getText())) {
            n += this.s;
        }
        return n;
    }
    
    public final int getCompoundPaddingRight() {
        if (ue.b((View)this)) {
            return super.getCompoundPaddingRight();
        }
        int n = super.getCompoundPaddingRight() + this.B;
        if (!TextUtils.isEmpty(this.getText())) {
            n += this.s;
        }
        return n;
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable g = this.g;
        if (g != null) {
            g.jumpToCurrentState();
        }
        final Drawable l = this.l;
        if (l != null) {
            l.jumpToCurrentState();
        }
        final ObjectAnimator d = this.d;
        if (d != null && d.isStarted()) {
            this.d.end();
            this.d = null;
        }
    }
    
    protected final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        if (this.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, SwitchCompat.f);
        }
        return onCreateDrawableState;
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Rect o = this.O;
        final Drawable l = this.l;
        if (l != null) {
            l.getPadding(o);
        }
        else {
            o.setEmpty();
        }
        final int f = this.F;
        final int h = this.H;
        final int top = o.top;
        final int bottom = o.bottom;
        final Drawable g = this.g;
        if (l != null) {
            if (this.t && g != null) {
                final Rect b = qi.b(g);
                g.copyBounds(o);
                o.left += b.left;
                o.right -= b.right;
                final int save = canvas.save();
                canvas.clipRect(o, Region$Op.DIFFERENCE);
                l.draw(canvas);
                canvas.restoreToCount(save);
            }
            else {
                l.draw(canvas);
            }
        }
        final int save2 = canvas.save();
        if (g != null) {
            g.draw(canvas);
        }
        Layout layout;
        if (this.h()) {
            layout = this.K;
        }
        else {
            layout = this.L;
        }
        if (layout != null) {
            final int[] drawableState = this.getDrawableState();
            final ColorStateList j = this.J;
            if (j != null) {
                this.I.setColor(j.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
            int width;
            if (g != null) {
                final Rect bounds = g.getBounds();
                width = bounds.left + bounds.right;
            }
            else {
                width = this.getWidth();
            }
            canvas.translate((float)(width / 2 - layout.getWidth() / 2), (float)((f + top + (h - bottom)) / 2 - layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"android.widget.Switch");
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"android.widget.Switch");
    }
    
    protected final void onLayout(final boolean b, int h, int f, int e, int g) {
        super.onLayout(b, h, f, e, g);
        final Drawable g2 = this.g;
        h = 0;
        if (g2 != null) {
            final Rect o = this.O;
            final Drawable l = this.l;
            if (l != null) {
                l.getPadding(o);
            }
            else {
                o.setEmpty();
            }
            final Rect b2 = qi.b(this.g);
            f = Math.max(0, b2.left - o.left);
            h = Math.max(0, b2.right - o.right);
        }
        else {
            f = 0;
        }
        if (ue.b((View)this)) {
            e = this.getPaddingLeft() + f;
            g = this.B + e - f - h;
        }
        else {
            g = this.getWidth() - this.getPaddingRight() - h;
            e = g - this.B + f + h;
        }
        switch (this.getGravity() & 0x70) {
            default: {
                f = this.getPaddingTop();
                h = this.C + f;
                break;
            }
            case 80: {
                h = this.getHeight() - this.getPaddingBottom();
                f = h - this.C;
                break;
            }
            case 16: {
                f = this.getPaddingTop();
                final int height = this.getHeight();
                final int paddingBottom = this.getPaddingBottom();
                h = this.C;
                f = (f + height - paddingBottom) / 2 - h / 2;
                h += f;
                break;
            }
        }
        this.E = e;
        this.F = f;
        this.H = h;
        this.G = g;
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (this.u) {
            if (this.K == null) {
                this.K = this.g(this.a);
            }
            if (this.L == null) {
                this.L = this.g(this.b);
            }
        }
        final Rect o = this.O;
        final Drawable g = this.g;
        final int n3 = 0;
        int n4;
        int intrinsicHeight;
        if (g != null) {
            g.getPadding(o);
            n4 = this.g.getIntrinsicWidth() - o.left - o.right;
            intrinsicHeight = this.g.getIntrinsicHeight();
        }
        else {
            n4 = 0;
            intrinsicHeight = 0;
        }
        int n5;
        if (this.u) {
            final int max = Math.max(this.K.getWidth(), this.L.getWidth());
            final int q = this.q;
            n5 = max + (q + q);
        }
        else {
            n5 = 0;
        }
        this.D = Math.max(n5, n4);
        final Drawable l = this.l;
        int intrinsicHeight2;
        if (l != null) {
            l.getPadding(o);
            intrinsicHeight2 = this.l.getIntrinsicHeight();
        }
        else {
            o.setEmpty();
            intrinsicHeight2 = n3;
        }
        final int left = o.left;
        final int right = o.right;
        final Drawable g2 = this.g;
        int max2 = right;
        int max3 = left;
        if (g2 != null) {
            final Rect b = qi.b(g2);
            max3 = Math.max(left, b.left);
            max2 = Math.max(right, b.right);
        }
        final int r = this.r;
        final int d = this.D;
        final int max4 = Math.max(r, d + d + max3 + max2);
        final int max5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.B = max4;
        this.C = max5;
        super.onMeasure(n, n2);
        if (this.getMeasuredHeight() < max5) {
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), max5);
        }
    }
    
    public final void onPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence;
        if (this.isChecked()) {
            charSequence = this.a;
        }
        else {
            charSequence = this.b;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        this.z.addMovement(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        final float n = 0.0f;
        Label_0076: {
            switch (actionMasked) {
                case 2: {
                    switch (this.v) {
                        default: {
                            break Label_0076;
                        }
                        case 2: {
                            final float x = motionEvent.getX();
                            final int f = this.f();
                            final float n2 = x - this.x;
                            float n3;
                            if (f != 0) {
                                n3 = n2 / f;
                            }
                            else if (n2 > 0.0f) {
                                n3 = 1.0f;
                            }
                            else {
                                n3 = -1.0f;
                            }
                            float n4 = n3;
                            if (ue.b((View)this)) {
                                n4 = -n3;
                            }
                            final float c = this.c;
                            float n5 = n4 + c;
                            if (n5 < 0.0f) {
                                n5 = n;
                            }
                            else if (n5 > 1.0f) {
                                n5 = 1.0f;
                            }
                            if (n5 != c) {
                                this.x = x;
                                this.d(n5);
                            }
                            return true;
                        }
                        case 1: {
                            final float x2 = motionEvent.getX();
                            final float y = motionEvent.getY();
                            if (Math.abs(x2 - this.x) > this.w || Math.abs(y - this.y) > this.w) {
                                this.v = 2;
                                this.getParent().requestDisallowInterceptTouchEvent(true);
                                this.x = x2;
                                this.y = y;
                                return true;
                            }
                            break Label_0076;
                        }
                    }
                    break;
                }
                case 1:
                case 3: {
                    if (this.v == 2) {
                        this.v = 0;
                        final boolean b = motionEvent.getAction() == 1 && this.isEnabled();
                        final boolean checked = this.isChecked();
                        boolean h;
                        if (b) {
                            this.z.computeCurrentVelocity(1000);
                            final float xVelocity = this.z.getXVelocity();
                            if (Math.abs(xVelocity) > this.A) {
                                h = (ue.b((View)this) ? (xVelocity < 0.0f) : (xVelocity > 0.0f));
                            }
                            else {
                                h = this.h();
                            }
                        }
                        else {
                            h = checked;
                        }
                        if (h != checked) {
                            this.playSoundEffect(0);
                        }
                        this.setChecked(h);
                        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setAction(3);
                        super.onTouchEvent(obtain);
                        obtain.recycle();
                        super.onTouchEvent(motionEvent);
                        return true;
                    }
                    this.v = 0;
                    this.z.clear();
                    break;
                }
                case 0: {
                    final float x3 = motionEvent.getX();
                    final float y2 = motionEvent.getY();
                    if (!this.isEnabled()) {
                        break;
                    }
                    if (this.g == null) {
                        break;
                    }
                    final int e = this.e();
                    this.g.getPadding(this.O);
                    final int f2 = this.F;
                    final int w = this.w;
                    final int n6 = this.E + e - w;
                    final int d = this.D;
                    final int left = this.O.left;
                    final int right = this.O.right;
                    final int w2 = this.w;
                    final int h2 = this.H;
                    if (x3 > n6 && x3 < d + n6 + left + right + w2 && y2 > f2 - w && y2 < h2 + w2) {
                        this.v = 1;
                        this.x = x3;
                        this.y = y2;
                        break;
                    }
                    break;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public final void setChecked(final boolean checked) {
        super.setChecked(checked);
        final boolean checked2 = this.isChecked();
        if (checked2) {
            this.b();
        }
        else {
            this.a();
        }
        final IBinder windowToken = this.getWindowToken();
        final float n = 0.0f;
        float n2 = 0.0f;
        if (windowToken != null && ik.U((View)this)) {
            if (checked2) {
                n2 = 1.0f;
            }
            (this.d = ObjectAnimator.ofFloat((Object)this, SwitchCompat.e, new float[] { n2 })).setDuration(250L);
            this.d.setAutoCancel(true);
            this.d.start();
            return;
        }
        final ObjectAnimator d = this.d;
        if (d != null) {
            d.cancel();
        }
        float n3;
        if (!checked2) {
            n3 = n;
        }
        else {
            n3 = 1.0f;
        }
        this.d(n3);
    }
    
    public final void toggle() {
        this.setChecked(this.isChecked() ^ true);
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.g || drawable == this.l;
    }
}
