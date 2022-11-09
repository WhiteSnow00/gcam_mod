import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import j$.util.Objects;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.util.AttributeSet;
import android.content.Context;
import android.text.TextPaint;
import android.content.res.ColorStateList;
import android.text.Layout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class ve extends View
{
    public Layout a;
    public ColorStateList b;
    public CharSequence c;
    public float d;
    public float e;
    public float f;
    public float g;
    private final TextPaint h;
    private final float i;
    private final float j;
    private int k;
    private int l;
    private float m;
    private int n;
    private int o;
    
    public ve(final Context context) {
        super(context, (AttributeSet)null, 0, 0);
        this.k = 8388659;
        this.d = 1.0f;
        this.e = 0.0f;
        this.n = Integer.MAX_VALUE;
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        final float density = displayMetrics.density;
        final float scaledDensity = displayMetrics.scaledDensity;
        this.f = 10.0f * scaledDensity;
        this.g = scaledDensity * 60.0f;
        final TextPaint h = new TextPaint(1);
        this.h = h;
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet)null, ug.a, 0, 0);
        this.c = obtainStyledAttributes.getText(4);
        this.f = obtainStyledAttributes.getDimension(10, this.f);
        this.g = obtainStyledAttributes.getDimension(9, this.g);
        this.b = obtainStyledAttributes.getColorStateList(2);
        this.n = obtainStyledAttributes.getInt(5, 2);
        if (this.b != null) {
            this.e();
        }
        h.setTextSize(this.g);
        this.d(obtainStyledAttributes.getString(8), obtainStyledAttributes.getInt(0, -1), obtainStyledAttributes.getInt(1, -1));
        this.k = obtainStyledAttributes.getInt(3, this.k);
        this.j = (float)obtainStyledAttributes.getDimensionPixelSize(6, (int)this.j);
        this.i = obtainStyledAttributes.getFloat(7, this.i);
        obtainStyledAttributes.recycle();
        if (this.c == null) {
            this.c = "";
        }
    }
    
    private final Layout f(int n, int n2, final Layout$Alignment layout$Alignment) {
        if (n2 > 0 && n > 0) {
            final int n3 = n2 - (this.getPaddingTop() + this.getPaddingBottom());
            final int n4 = n - (this.getPaddingLeft() + this.getPaddingRight());
            final float g = this.g;
            this.m = g;
            this.h.setTextSize(g);
            Object o = new StaticLayout(this.c, this.h, n4, layout$Alignment, this.d, this.e, true);
            if (((Layout)o).getLineCount() > this.n) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (((Layout)o).getLineTop(((Layout)o).getLineCount()) > n3) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            int n5;
            if (this.h.getTextSize() > this.f) {
                n5 = 1;
            }
            else {
                n5 = 0;
            }
            Label_0328: {
                Layout layout = null;
                Label_0170: {
                    int n6;
                    if (n == 0) {
                        layout = (Layout)o;
                        if (n2 == 0) {
                            break Label_0170;
                        }
                        n6 = n;
                    }
                    else {
                        n6 = n;
                    }
                    while (true) {
                        if (n6 == 0) {
                            layout = (Layout)o;
                            if (n2 == 0) {
                                break;
                            }
                        }
                        if (n5 == 0) {
                            break Label_0328;
                        }
                        final float n7 = this.m - 1.0f;
                        this.m = n7;
                        this.h.setTextSize(n7);
                        o = new StaticLayout(this.c, this.h, n4, layout$Alignment, this.d, this.e, true);
                        if (((Layout)o).getLineTop(((Layout)o).getLineCount()) > n3) {
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                        if (((Layout)o).getLineCount() > this.n) {
                            n2 = 1;
                        }
                        else {
                            n2 = 0;
                        }
                        if (this.h.getTextSize() > this.f) {
                            n5 = 1;
                            n6 = n2;
                            n2 = n;
                        }
                        else {
                            n5 = 0;
                            n6 = n2;
                            n2 = n;
                        }
                    }
                }
                o = layout;
            }
            this.o = Math.min(this.n, ((Layout)o).getLineCount());
            return (Layout)o;
        }
        return null;
    }
    
    public final void a(final int k) {
        if (this.k != k) {
            this.k = k;
            this.invalidate();
        }
    }
    
    public final void b(final int n) {
        if (this.n != n) {
            this.n = n;
            this.a = null;
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public final void c(final Typeface typeface) {
        if (!Objects.equals((Object)this.h.getTypeface(), (Object)typeface)) {
            this.h.setTypeface(typeface);
            if (this.a != null) {
                this.requestLayout();
                this.invalidate();
            }
        }
    }
    
    public final void d(final String s, int style, final int n) {
        Typeface typeface;
        if (s != null) {
            typeface = Typeface.create(s, n);
            if (typeface != null) {
                this.c(typeface);
                return;
            }
        }
        else {
            typeface = null;
        }
        switch (style) {
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
        boolean fakeBoldText = false;
        if (n > 0) {
            Typeface typeface2;
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(n);
            }
            else {
                typeface2 = Typeface.create(typeface, n);
            }
            this.c(typeface2);
            if (typeface2 != null) {
                style = typeface2.getStyle();
            }
            else {
                style = 0;
            }
            style = (~style & n);
            final TextPaint h = this.h;
            if (0x1 == (style & 0x1)) {
                fakeBoldText = true;
            }
            h.setFakeBoldText(fakeBoldText);
            final TextPaint h2 = this.h;
            if ((style & 0x2) != 0x0) {
                textSkewX = -0.25f;
            }
            h2.setTextSkewX(textSkewX);
            return;
        }
        this.h.setFakeBoldText(false);
        this.h.setTextSkewX(0.0f);
        this.c(typeface);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final ColorStateList b = this.b;
        if (b != null && b.isStateful()) {
            this.e();
        }
    }
    
    public final void e() {
        final int colorForState = this.b.getColorForState(this.getDrawableState(), 0);
        if (colorForState != this.l) {
            this.l = colorForState;
            this.invalidate();
        }
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.a != null) {
            canvas.save();
            this.h.setColor(this.l);
            this.h.drawableState = this.getDrawableState();
            final float n = (float)this.getPaddingLeft();
            final int paddingTop = this.getPaddingTop();
            final int n2 = this.getHeight() - (this.getPaddingTop() + this.getPaddingBottom());
            final int lineTop = this.a.getLineTop(this.o);
            int n3 = 0;
            switch (this.k & 0x70) {
                default: {
                    n3 = 0;
                    break;
                }
                case 80: {
                    n3 = n2 - lineTop;
                    break;
                }
                case 48: {
                    n3 = 0;
                    break;
                }
                case 16: {
                    n3 = (n2 - lineTop) / 2;
                    break;
                }
            }
            canvas.translate(n, (float)(paddingTop + n3));
            canvas.clipRect(0, 0, this.getWidth() - this.getPaddingRight(), this.a.getLineTop(this.o));
            this.a.draw(canvas);
            canvas.restore();
        }
    }
    
    protected final void onMeasure(int lineTop, int n) {
        final int mode = View$MeasureSpec.getMode(lineTop);
        final int mode2 = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(lineTop);
        final int size2 = View$MeasureSpec.getSize(n);
        if (mode == 1073741824) {
            lineTop = size;
        }
        else {
            lineTop = -1;
        }
        if (mode2 == 1073741824) {
            n = size2;
        }
        else {
            n = -1;
        }
        int n2 = lineTop;
        if (lineTop == -1) {
            this.h.setTextSize(this.g);
            n2 = (int)Math.ceil(Layout.getDesiredWidth(this.c, this.h));
            this.h.setTextSize(this.m);
        }
        int min = n2;
        if (mode == Integer.MIN_VALUE) {
            min = Math.min(n2, size);
        }
        Layout$Alignment layout$Alignment = null;
    Label_0172_Outer:
        while (true) {
        Label_0180_Outer:
            while (true) {
                while (true) {
                    switch (this.getTextAlignment()) {
                        default: {
                            layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                            break;
                        }
                        case 4: {
                            layout$Alignment = Layout$Alignment.ALIGN_CENTER;
                            break;
                        }
                        case 3: {
                            layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
                            break;
                        }
                        case 2: {
                            layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                            break;
                        }
                        case 1: {
                            switch (this.k & 0x800007) {
                                case 1: {
                                    continue Label_0172_Outer;
                                }
                                case 5:
                                case 8388613: {
                                    continue Label_0180_Outer;
                                }
                                case 3:
                                case 8388611: {}
                                default: {
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
        lineTop = n;
        if (n == -1) {
            if (mode2 == Integer.MIN_VALUE) {
                lineTop = size2;
            }
            else {
                lineTop = Integer.MAX_VALUE;
            }
        }
        final Layout a = this.a;
        if (a == null) {
            this.a = this.f(min, lineTop, layout$Alignment);
        }
        else {
            final int width = a.getWidth();
            n = this.a.getHeight();
            if (width != min || n != lineTop) {
                this.a = this.f(min, lineTop, layout$Alignment);
            }
        }
        final Layout a2 = this.a;
        if (a2 == null) {
            this.setMeasuredDimension(0, 0);
            return;
        }
        if (mode2 != 1073741824) {
            lineTop = a2.getLineTop(a2.getLineCount());
        }
        n = lineTop;
        if (mode2 == Integer.MIN_VALUE) {
            n = Math.min(lineTop, size2);
        }
        this.setMeasuredDimension(min, n);
    }
    
    public final void onRtlPropertiesChanged(final int n) {
        super.onRtlPropertiesChanged(n);
        this.a = null;
        this.requestLayout();
        this.invalidate();
    }
}
