import android.text.SpannableStringBuilder;
import android.text.Spanned;
import j$.util.Objects;
import android.view.Gravity;
import android.text.StaticLayout$Builder;
import android.graphics.Paint;
import android.text.TextUtils;
import android.graphics.Canvas;
import android.text.style.UnderlineSpan;
import android.text.style.TypefaceSpan;
import android.text.style.StyleSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.SubscriptSpan;
import android.text.style.LocaleSpan;
import android.text.style.ForegroundColorSpan;
import android.text.Layout$Alignment;
import android.text.TextUtils$TruncateAt;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uv
{
    private static final Class[] a;
    private final Rect b;
    private TextPaint c;
    private String d;
    private CharSequence e;
    private CharSequence f;
    private float g;
    private StaticLayout h;
    private int i;
    private int j;
    private final TextUtils$TruncateAt k;
    private Layout$Alignment l;
    private final Rect m;
    private final Rect n;
    private boolean o;
    private boolean p;
    private boolean q;
    
    static {
        a = new Class[] { ForegroundColorSpan.class, LocaleSpan.class, SubscriptSpan.class, SuperscriptSpan.class, StrikethroughSpan.class, StyleSpan.class, TypefaceSpan.class, UnderlineSpan.class };
    }
    
    public uv() {
        this.b = new Rect();
        this.i = 17;
        this.j = 1;
        this.k = TextUtils$TruncateAt.END;
        this.l = Layout$Alignment.ALIGN_CENTER;
        this.m = new Rect();
        this.n = new Rect();
        this.o = false;
    }
    
    public final void a(final Canvas canvas, final Rect rect) {
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        if (this.p || this.b.width() != rect.width() || this.b.height() != rect.height()) {
            final int width = rect.width();
            final int height = rect.height();
            if (this.c == null) {
                this.f(new TextPaint());
            }
            final int n = (int)(width * (1.0f - this.g + 0.0f));
            final TextPaint textPaint = new TextPaint((Paint)this.c);
            textPaint.setTextSize(Math.min((float)(height / this.j), textPaint.getTextSize()));
            final CharSequence f = this.f;
            final float n2 = (float)n;
            if (textPaint.measureText(f, 0, f.length()) > n2) {
                final TextUtils$TruncateAt k = this.k;
                int n3 = 7;
                if (k != null && k != TextUtils$TruncateAt.MARQUEE) {
                    n3 = 8;
                }
                final CharSequence subSequence = this.f.subSequence(0, Math.min(n3, this.f.length()));
                for (float n4 = textPaint.measureText(subSequence, 0, subSequence.length()); n4 > n2; n4 = textPaint.measureText(subSequence, 0, subSequence.length())) {
                    textPaint.setTextSize(textPaint.getTextSize() - 1.0f);
                }
            }
            CharSequence d = this.f;
            if (this.o) {
                final int a = ut.a;
                if (d == null) {
                    d = null;
                }
                else {
                    final StringBuilder sb = new StringBuilder(d.length());
                    final int length = d.length();
                    int i = 0;
                    boolean a2 = false;
                    while (i < length) {
                        final int codePoint = Character.codePointAt(d, i);
                        if (!ut.a(codePoint)) {
                            sb.appendCodePoint(codePoint);
                        }
                        else if (!a2) {
                            sb.appendCodePoint(32);
                        }
                        a2 = ut.a(codePoint);
                        i += Character.charCount(codePoint);
                    }
                    d = sb.toString();
                }
                this.d = (String)d;
            }
            final StaticLayout$Builder obtain = StaticLayout$Builder.obtain(d, 0, d.length(), textPaint, n);
            obtain.setBreakStrategy(1);
            obtain.setEllipsize(this.k);
            obtain.setHyphenationFrequency(2);
            obtain.setMaxLines(this.j);
            obtain.setAlignment(this.l);
            this.h = obtain.build();
            this.p = false;
            this.q = true;
        }
        if (this.q || !this.b.equals((Object)rect)) {
            this.b.set(rect);
            final boolean h = this.h();
            final float n5 = (float)this.b.width();
            float g;
            if (this.h()) {
                g = this.g;
            }
            else {
                g = 0.0f;
            }
            final int n6 = (int)(n5 * g);
            final float n7 = (float)this.b.width();
            float g2;
            if (this.h()) {
                g2 = 0.0f;
            }
            else {
                g2 = this.g;
            }
            this.m.set(this.b.left + n6, this.b.top + (int)(this.b.height() * 0.0f), this.b.right - (int)(n7 * g2), this.b.bottom - (int)(this.b.height() * 0.0f));
            Gravity.apply(this.i, this.h.getWidth(), this.h.getHeight(), this.m, this.n, (int)((h ^ true) ? 1 : 0));
            this.q = false;
        }
        canvas.save();
        canvas.translate((float)this.n.left, (float)this.n.top);
        this.h.draw(canvas);
        canvas.restore();
    }
    
    public final void b(final Layout$Alignment l) {
        if (this.l == l) {
            return;
        }
        this.l = l;
        this.p = true;
    }
    
    public final void c(final int i) {
        if (this.i == i) {
            return;
        }
        this.i = i;
        this.q = true;
    }
    
    public final void d(final boolean o) {
        if (this.o == o) {
            return;
        }
        this.o = o;
        if (!TextUtils.equals((CharSequence)this.d, this.f)) {
            this.p = true;
        }
    }
    
    public final void e(final int j) {
        if (this.j != j) {
            this.j = j;
            this.p = true;
        }
    }
    
    public final void f(final TextPaint c) {
        this.c = c;
        this.p = true;
    }
    
    public final void g(final CharSequence e) {
        if (Objects.equals((Object)this.e, (Object)e)) {
            return;
        }
        this.e = e;
        Object f = e;
        if (e instanceof Spanned) {
            f = new SpannableStringBuilder(e);
            final Object[] spans = ((SpannableStringBuilder)f).getSpans(0, e.length(), (Class)Object.class);
            final int length = spans.length;
            int i = 0;
        Label_0055:
            while (i < length) {
                final Object o = spans[i];
                final Class[] a = uv.a;
                while (true) {
                    for (int j = 0; j < 8; ++j) {
                        if (a[j].isInstance(o)) {
                            ++i;
                            continue Label_0055;
                        }
                    }
                    ((SpannableStringBuilder)f).removeSpan(o);
                    continue;
                }
            }
        }
        this.f = (CharSequence)f;
        this.p = true;
    }
    
    public final boolean h() {
        return this.h.getParagraphDirection(0) == 1;
    }
    
    public final void i(final float g) {
        if (this.g == g) {
            return;
        }
        this.g = g;
        this.p = true;
    }
}
