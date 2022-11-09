import android.content.res.TypedArray;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParserException;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afz extends afr
{
    static final PorterDuff$Mode b;
    private afx c;
    private PorterDuffColorFilter d;
    private ColorFilter e;
    private boolean f;
    private final boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;
    
    static {
        b = PorterDuff$Mode.SRC_IN;
    }
    
    public afz() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = new afx();
    }
    
    public afz(final afx c) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = c;
        this.d = this.b(c.c, c.d);
    }
    
    static int a(final int n, final float n2) {
        return (int)(Color.alpha(n) * n2) << 24 | (0xFFFFFF & n);
    }
    
    final PorterDuffColorFilter b(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        if (list != null && porterDuff$Mode != null) {
            return new PorterDuffColorFilter(list.getColorForState(this.getState(), 0), porterDuff$Mode);
        }
        return null;
    }
    
    public final boolean canApplyTheme() {
        final Drawable a = this.a;
        if (a != null) {
            a.canApplyTheme();
        }
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        final Drawable a = this.a;
        if (a != null) {
            a.draw(canvas);
            return;
        }
        this.copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        Object colorFilter;
        if ((colorFilter = this.e) == null) {
            colorFilter = this.d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.h);
        float abs = Math.abs(this.h[0]);
        float abs2 = Math.abs(this.h[4]);
        final float abs3 = Math.abs(this.h[1]);
        final float abs4 = Math.abs(this.h[3]);
        if (abs3 == 0.0f) {
            if (abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
        }
        else {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        final int width = this.j.width();
        final int height = this.j.height();
        final int min = Math.min(2048, (int)(width * abs));
        final int min2 = Math.min(2048, (int)(height * abs2));
        if (min > 0 && min2 > 0) {
            final int save = canvas.save();
            canvas.translate((float)this.j.left, (float)this.j.top);
            if (this.isAutoMirrored() && this.getLayoutDirection() == 1) {
                canvas.translate((float)this.j.width(), 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            this.j.offsetTo(0, 0);
            final afx c = this.c;
            final Bitmap f = c.f;
            if (f == null || min != f.getWidth() || min2 != c.f.getHeight()) {
                c.f = Bitmap.createBitmap(min, min2, Bitmap$Config.ARGB_8888);
                c.k = true;
            }
            if (!this.g) {
                this.c.a(min, min2);
            }
            else {
                final afx c2 = this.c;
                if (c2.k || c2.g != c2.c || c2.h != c2.d || c2.j != c2.e || c2.i != c2.b.getRootAlpha()) {
                    this.c.a(min, min2);
                    final afx c3 = this.c;
                    c3.g = c3.c;
                    c3.h = c3.d;
                    c3.i = c3.b.getRootAlpha();
                    c3.j = c3.e;
                    c3.k = false;
                }
            }
            final afx c4 = this.c;
            final Rect j = this.j;
            Paint l = null;
            Label_0576: {
                if (c4.b.getRootAlpha() >= 255) {
                    if (colorFilter == null) {
                        l = null;
                        break Label_0576;
                    }
                }
                if (c4.l == null) {
                    (c4.l = new Paint()).setFilterBitmap(true);
                }
                c4.l.setAlpha(c4.b.getRootAlpha());
                c4.l.setColorFilter((ColorFilter)colorFilter);
                l = c4.l;
            }
            canvas.drawBitmap(c4.f, (Rect)null, j, l);
            canvas.restoreToCount(save);
        }
    }
    
    public final int getAlpha() {
        final Drawable a = this.a;
        if (a != null) {
            return a.getAlpha();
        }
        return this.c.b.getRootAlpha();
    }
    
    public final int getChangingConfigurations() {
        final Drawable a = this.a;
        if (a != null) {
            return a.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }
    
    public final ColorFilter getColorFilter() {
        final Drawable a = this.a;
        if (a != null) {
            return a.getColorFilter();
        }
        return this.e;
    }
    
    public final Drawable$ConstantState getConstantState() {
        final Drawable a = this.a;
        if (a != null) {
            return new afy(a.getConstantState());
        }
        this.c.a = this.getChangingConfigurations();
        return this.c;
    }
    
    public final int getIntrinsicHeight() {
        final Drawable a = this.a;
        if (a != null) {
            return a.getIntrinsicHeight();
        }
        return (int)this.c.b.f;
    }
    
    public final int getIntrinsicWidth() {
        final Drawable a = this.a;
        if (a != null) {
            return a.getIntrinsicWidth();
        }
        return (int)this.c.b.e;
    }
    
    public final int getOpacity() {
        final Drawable a = this.a;
        if (a != null) {
            return a.getOpacity();
        }
        return -3;
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set) {
        final Drawable a = this.a;
        if (a != null) {
            a.inflate(resources, xmlPullParser, set);
            return;
        }
        this.inflate(resources, xmlPullParser, set, null);
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final Drawable a = this.a;
        if (a != null) {
            a.inflate(resources, xmlPullParser, set, resources$Theme);
            return;
        }
        final afx c = this.c;
        c.b = new afw();
        final TypedArray g = gz.g(resources, resources$Theme, set, afq.a);
        final afx c2 = this.c;
        final afw b = c2.b;
        final int f = gz.f(g, xmlPullParser, "tintMode", 6, -1);
        PorterDuff$Mode d = PorterDuff$Mode.SRC_IN;
        switch (f) {
            case 16: {
                d = PorterDuff$Mode.ADD;
                break;
            }
            case 15: {
                d = PorterDuff$Mode.SCREEN;
                break;
            }
            case 14: {
                d = PorterDuff$Mode.MULTIPLY;
                break;
            }
            case 9: {
                d = PorterDuff$Mode.SRC_ATOP;
                break;
            }
            case 5: {
                d = PorterDuff$Mode.SRC_IN;
                break;
            }
            case 3: {
                d = PorterDuff$Mode.SRC_OVER;
                break;
            }
        }
        c2.d = d;
        ColorStateList c3;
        if (gz.k(xmlPullParser, "tint")) {
            final TypedValue typedValue = new TypedValue();
            g.getValue(1, typedValue);
            if (typedValue.type == 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to resolve attribute at index 1: ");
                sb.append(typedValue);
                throw new UnsupportedOperationException(sb.toString());
            }
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                c3 = ColorStateList.valueOf(typedValue.data);
            }
            else {
                c3 = gk.c(g.getResources(), g.getResourceId(1, 0), resources$Theme);
            }
        }
        else {
            c3 = null;
        }
        if (c3 != null) {
            c2.c = c3;
        }
        boolean e = c2.e;
        if (gz.k(xmlPullParser, "autoMirrored")) {
            e = g.getBoolean(5, e);
        }
        c2.e = e;
        b.g = gz.d(g, xmlPullParser, "viewportWidth", 7, b.g);
        final float d2 = gz.d(g, xmlPullParser, "viewportHeight", 8, b.h);
        b.h = d2;
        if (b.g <= 0.0f) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(g.getPositionDescription());
            sb2.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb2.toString());
        }
        if (d2 <= 0.0f) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(g.getPositionDescription());
            sb3.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb3.toString());
        }
        b.e = g.getDimension(3, b.e);
        final float dimension = g.getDimension(2, b.f);
        b.f = dimension;
        if (b.e <= 0.0f) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(g.getPositionDescription());
            sb4.append("<vector> tag requires width > 0");
            throw new XmlPullParserException(sb4.toString());
        }
        if (dimension <= 0.0f) {
            final StringBuilder sb5 = new StringBuilder();
            sb5.append(g.getPositionDescription());
            sb5.append("<vector> tag requires height > 0");
            throw new XmlPullParserException(sb5.toString());
        }
        b.setAlpha(gz.d(g, xmlPullParser, "alpha", 4, b.getAlpha()));
        final String string = g.getString(0);
        if (string != null) {
            b.j = string;
            b.l.put(string, b);
        }
        g.recycle();
        c.a = this.getChangingConfigurations();
        c.k = true;
        final afx c4 = this.c;
        final afw b2 = c4.b;
        final ArrayDeque<afu> arrayDeque = new ArrayDeque<afu>();
        arrayDeque.push(b2.d);
        int n = xmlPullParser.getEventType();
        final int n2 = xmlPullParser.getDepth() + 1;
        int n3 = 1;
        while (n != 1 && (xmlPullParser.getDepth() >= n2 || n != 3)) {
            int n4;
            if (n == 2) {
                final String name = xmlPullParser.getName();
                final afu afu = arrayDeque.peek();
                if ("path".equals(name)) {
                    final aft aft = new aft();
                    final TypedArray g2 = gz.g(resources, resources$Theme, set, afq.c);
                    aft.a = null;
                    if (gz.k(xmlPullParser, "pathData")) {
                        final String string2 = g2.getString(0);
                        if (string2 != null) {
                            aft.n = string2;
                        }
                        final String string3 = g2.getString(2);
                        if (string3 != null) {
                            aft.m = gz.a(string3);
                        }
                        aft.d = gz.o(g2, xmlPullParser, resources$Theme, "fillColor", 1);
                        aft.f = gz.d(g2, xmlPullParser, "fillAlpha", 12, aft.f);
                        final int f2 = gz.f(g2, xmlPullParser, "strokeLineCap", 8, -1);
                        Paint$Cap j = aft.j;
                        switch (f2) {
                            case 2: {
                                j = Paint$Cap.SQUARE;
                                break;
                            }
                            case 1: {
                                j = Paint$Cap.ROUND;
                                break;
                            }
                            case 0: {
                                j = Paint$Cap.BUTT;
                                break;
                            }
                        }
                        aft.j = j;
                        final int f3 = gz.f(g2, xmlPullParser, "strokeLineJoin", 9, -1);
                        Paint$Join k = aft.k;
                        switch (f3) {
                            case 2: {
                                k = Paint$Join.BEVEL;
                                break;
                            }
                            case 1: {
                                k = Paint$Join.ROUND;
                                break;
                            }
                            case 0: {
                                k = Paint$Join.MITER;
                                break;
                            }
                        }
                        aft.k = k;
                        aft.l = gz.d(g2, xmlPullParser, "strokeMiterLimit", 10, aft.l);
                        aft.b = gz.o(g2, xmlPullParser, resources$Theme, "strokeColor", 3);
                        aft.e = gz.d(g2, xmlPullParser, "strokeAlpha", 11, aft.e);
                        aft.c = gz.d(g2, xmlPullParser, "strokeWidth", 4, aft.c);
                        aft.h = gz.d(g2, xmlPullParser, "trimPathEnd", 6, aft.h);
                        aft.i = gz.d(g2, xmlPullParser, "trimPathOffset", 7, aft.i);
                        aft.g = gz.d(g2, xmlPullParser, "trimPathStart", 5, aft.g);
                        aft.o = gz.f(g2, xmlPullParser, "fillType", 13, aft.o);
                    }
                    g2.recycle();
                    afu.b.add(aft);
                    if (aft.getPathName() != null) {
                        b2.l.put(aft.getPathName(), aft);
                    }
                    final int a2 = c4.a;
                    n4 = 0;
                }
                else if ("clip-path".equals(name)) {
                    final afs afs = new afs();
                    if (gz.k(xmlPullParser, "pathData")) {
                        final TypedArray g3 = gz.g(resources, resources$Theme, set, afq.d);
                        final String string4 = g3.getString(0);
                        if (string4 != null) {
                            afs.n = string4;
                        }
                        final String string5 = g3.getString(1);
                        if (string5 != null) {
                            afs.m = gz.a(string5);
                        }
                        afs.o = gz.f(g3, xmlPullParser, "fillType", 2, 0);
                        g3.recycle();
                    }
                    afu.b.add(afs);
                    if (afs.getPathName() != null) {
                        b2.l.put(afs.getPathName(), afs);
                    }
                    final int a3 = c4.a;
                    n4 = n3;
                }
                else if ("group".equals(name)) {
                    final afu afu2 = new afu();
                    final TypedArray g4 = gz.g(resources, resources$Theme, set, afq.b);
                    afu2.l = null;
                    afu2.c = gz.d(g4, xmlPullParser, "rotation", 5, afu2.c);
                    afu2.d = g4.getFloat(1, afu2.d);
                    afu2.e = g4.getFloat(2, afu2.e);
                    afu2.f = gz.d(g4, xmlPullParser, "scaleX", 3, afu2.f);
                    afu2.g = gz.d(g4, xmlPullParser, "scaleY", 4, afu2.g);
                    afu2.h = gz.d(g4, xmlPullParser, "translateX", 6, afu2.h);
                    afu2.i = gz.d(g4, xmlPullParser, "translateY", 7, afu2.i);
                    final String string6 = g4.getString(0);
                    if (string6 != null) {
                        afu2.m = string6;
                    }
                    afu2.o();
                    g4.recycle();
                    afu.b.add(afu2);
                    arrayDeque.push(afu2);
                    if (afu2.getGroupName() != null) {
                        b2.l.put(afu2.getGroupName(), afu2);
                    }
                    final int a4 = c4.a;
                    n4 = n3;
                }
                else {
                    n4 = n3;
                }
            }
            else {
                n4 = n3;
                if (n == 3) {
                    n4 = n3;
                    if ("group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                        n4 = n3;
                    }
                }
            }
            n = xmlPullParser.next();
            n3 = n4;
        }
        if (n3 == 0) {
            this.d = this.b(c.c, c.d);
            return;
        }
        throw new XmlPullParserException("no path defined");
    }
    
    public final void invalidateSelf() {
        final Drawable a = this.a;
        if (a != null) {
            a.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        final Drawable a = this.a;
        if (a != null) {
            return a.isAutoMirrored();
        }
        return this.c.e;
    }
    
    public final boolean isStateful() {
        final Drawable a = this.a;
        if (a != null) {
            return a.isStateful();
        }
        final boolean stateful = super.isStateful();
        boolean b = false;
        if (!stateful) {
            final afx c = this.c;
            if (c != null) {
                if (c.b()) {
                    return true;
                }
                final ColorStateList c2 = this.c.c;
                if (c2 != null) {
                    if (c2.isStateful()) {
                        return true;
                    }
                    return false;
                }
            }
            return b;
        }
        b = true;
        return b;
    }
    
    public final Drawable mutate() {
        final Drawable a = this.a;
        if (a != null) {
            a.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.c = new afx(this.c);
            this.f = true;
        }
        return this;
    }
    
    @Override
    protected final void onBoundsChange(final Rect bounds) {
        final Drawable a = this.a;
        if (a != null) {
            a.setBounds(bounds);
        }
    }
    
    protected final boolean onStateChange(final int[] state) {
        final Drawable a = this.a;
        if (a != null) {
            return a.setState(state);
        }
        final afx c = this.c;
        final ColorStateList c2 = c.c;
        boolean b = false;
        if (c2 != null) {
            final PorterDuff$Mode d = c.d;
            if (d != null) {
                this.d = this.b(c2, d);
                this.invalidateSelf();
                b = true;
            }
        }
        if (c.b()) {
            final boolean c3 = c.b.d.c(state);
            c.k |= c3;
            if (c3) {
                this.invalidateSelf();
                return true;
            }
        }
        return b;
    }
    
    public final void scheduleSelf(final Runnable runnable, final long n) {
        final Drawable a = this.a;
        if (a != null) {
            a.scheduleSelf(runnable, n);
            return;
        }
        super.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int n) {
        final Drawable a = this.a;
        if (a != null) {
            a.setAlpha(n);
            return;
        }
        if (this.c.b.getRootAlpha() != n) {
            this.c.b.setRootAlpha(n);
            this.invalidateSelf();
        }
    }
    
    public final void setAutoMirrored(final boolean b) {
        final Drawable a = this.a;
        if (a != null) {
            a.setAutoMirrored(b);
            return;
        }
        this.c.e = b;
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        final Drawable a = this.a;
        if (a != null) {
            a.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        this.invalidateSelf();
    }
    
    public final void setTint(final int tint) {
        final Drawable a = this.a;
        if (a != null) {
            a.setTint(tint);
            return;
        }
        this.setTintList(ColorStateList.valueOf(tint));
    }
    
    public final void setTintList(final ColorStateList list) {
        final Drawable a = this.a;
        if (a != null) {
            a.setTintList(list);
            return;
        }
        final afx c = this.c;
        if (c.c != list) {
            c.c = list;
            this.d = this.b(list, c.d);
            this.invalidateSelf();
        }
    }
    
    public final void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final Drawable a = this.a;
        if (a != null) {
            a.setTintMode(porterDuff$Mode);
            return;
        }
        final afx c = this.c;
        if (c.d != porterDuff$Mode) {
            c.d = porterDuff$Mode;
            this.d = this.b(c.c, porterDuff$Mode);
            this.invalidateSelf();
        }
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        final Drawable a = this.a;
        if (a != null) {
            return a.setVisible(b, b2);
        }
        return super.setVisible(b, b2);
    }
    
    public final void unscheduleSelf(final Runnable runnable) {
        final Drawable a = this.a;
        if (a != null) {
            a.unscheduleSelf(runnable);
            return;
        }
        super.unscheduleSelf(runnable);
    }
}
