import android.widget.TextView;
import android.view.View;
import android.content.res.Resources$Theme;
import android.util.TypedValue;
import android.graphics.Typeface;
import com.google.android.apps.camera.zoomui.ZoomUi;
import java.util.Iterator;
import android.animation.TimeInterpolator;
import java.util.Map;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.concurrent.atomic.AtomicReference;
import android.animation.ValueAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jin
{
    public final klj a;
    public final klv b;
    public final klv c;
    public final klv d;
    public final ValueAnimator e;
    public final AtomicReference f;
    public boolean g;
    public kmt h;
    private final cse i;
    private final liz j;
    private final ValueAnimator$AnimatorUpdateListener k;
    private final Map l;
    private final Map m;
    private final Map n;
    private final Map o;
    private final Map p;
    private final Map q;
    private final Map r;
    private final Map s;
    private final Map t;
    private final Map u;
    private final Map v;
    private final Map w;
    private final Map x;
    private final Map y;
    private final Map z;
    
    public jin(final klj a, final klv b, final klv c, final klv d, final cse i, final liz j) {
        final jim k = new jim(this);
        this.k = (ValueAnimator$AnimatorUpdateListener)k;
        this.f = new AtomicReference((V)jiq.b);
        this.g = false;
        this.h = kmt.a;
        final jio a2 = jio.a;
        final Float value = 0.615f;
        final jio b2 = jio.b;
        final Float value2 = 1.0f;
        final jio c2 = jio.c;
        final Float value3 = 2.0f;
        this.l = nnx.q(a2, value, b2, value2, c2, value3);
        final jio a3 = jio.a;
        final Float value4 = 0.670443f;
        this.m = nnx.r(a3, value4, jio.b, value2, jio.c, value3, jio.d, 4.3f);
        this.n = nnx.p(jio.b, value2, jio.c, value3);
        this.o = nnx.q(jio.a, value4, jio.b, value2, jio.c, value3);
        final jio b3 = jio.b;
        final Float value5 = 1.5f;
        this.p = nnx.p(b3, value5, jio.c, value3);
        this.q = nnx.p(jio.b, value3, jio.c, 2.6f);
        this.r = nnx.p(jio.b, value2, jio.c, value3);
        this.s = nnx.p(jio.b, value2, jio.c, value3);
        this.t = nnx.p(jio.b, value3, jio.c, 5.0f);
        this.u = nnx.p(jio.b, value, jio.c, 1.23f);
        this.v = nnx.p(jio.b, value4, jio.c, 1.34f);
        final jio b4 = jio.b;
        final jio c3 = jio.c;
        final Float value6 = 1.4f;
        this.w = nnx.p(b4, value2, c3, value6);
        this.x = nnx.p(jio.b, value2, jio.c, 1.2f);
        this.y = nnx.p(jio.b, value2, jio.c, value5);
        this.z = nnx.p(jio.b, value2, jio.c, value6);
        this.a = a;
        this.b = b;
        this.i = i;
        this.j = j;
        this.c = c;
        this.d = d;
        final ValueAnimator e = new ValueAnimator();
        (this.e = e).addUpdateListener((ValueAnimator$AnimatorUpdateListener)k);
        e.setDuration(500L);
        e.setInterpolator((TimeInterpolator)new adh());
    }
    
    private final boolean k() {
        return this.h.k == 60;
    }
    
    public final float a(int n) {
        float n2 = 1.0f;
        if (n >= 4) {
            return 1.0f;
        }
        if (((nqq)this.g((jbm)this.a.aQ())).c == 3) {
            int n3 = n;
            if ((float)((kkz)this.c).d >= 1.0f) {
                n3 = n + 1;
            }
            Float e;
            if (this.e(jio.values()[n3], (jbm)this.a.aQ()) <= (float)((kkz)this.d).d) {
                e = this.e(jio.values()[n3], (jbm)this.a.aQ());
            }
            else {
                e = (Float)((kkz)this.d).d;
            }
            n2 = e;
        }
        else if (((nqq)this.g((jbm)this.a.aQ())).c == 4) {
            Float e2;
            if (this.e(jio.values()[n], (jbm)this.a.aQ()) <= (float)((kkz)this.d).d) {
                e2 = this.e(jio.values()[n], (jbm)this.a.aQ());
            }
            else {
                e2 = (Float)((kkz)this.d).d;
            }
            n2 = e2;
        }
        else if (n < 2) {
            ++n;
            Float e3;
            if (this.e(jio.values()[n], (jbm)this.a.aQ()) <= (float)((kkz)this.d).d) {
                e3 = this.e(jio.values()[n], (jbm)this.a.aQ());
            }
            else {
                e3 = (Float)((kkz)this.d).d;
            }
            n2 = e3;
        }
        return Math.max((float)((kkz)this.c).d, n2);
    }
    
    public final float b() {
        if (this.j.j) {
            return 4.0f;
        }
        return (float)((kkz)this.d).d;
    }
    
    public final float c(float n, float floatValue) {
        final jbm a = jbm.a;
        final jiq a2 = jiq.a;
        final jio a3 = jio.a;
        while (true) {
            switch (this.f.get().ordinal()) {
                default: {
                    break Label_0089;
                }
                case 1: {
                    if (floatValue < 1.0f) {
                        break Label_0089;
                    }
                }
                case 3: {
                    break;
                }
                case 2: {
                    floatValue = this.e(jio.c, jbm.g);
                    break;
                }
                case 0: {
                    final double n2 = Math.round(n * 10.0f);
                    Double.isNaN(n2);
                    return (float)(n2 / 10.0);
                }
            }
            n /= floatValue;
            continue;
        }
    }
    
    public final jio d(final float n) {
        final Map g = this.g((jbm)this.a.aQ());
        final float c = this.c(n, (float)((kkz)this.c).d);
        for (final Map.Entry<jio, V> entry : ((nnx)g).s()) {
            final jbm a = jbm.a;
            final jiq a2 = jiq.a;
            final jio a3 = jio.a;
            switch (entry.getKey().ordinal()) {
                default: {
                    continue;
                }
                case 3: {
                    if (c >= this.c(4.0f, (float)((kkz)this.c).d) || c == this.c((float)((kkz)this.d).d, (float)((kkz)this.c).d)) {
                        return jio.d;
                    }
                    continue;
                }
                case 2: {
                    if (c >= this.c(this.e(jio.c, (jbm)this.a.aQ()), (float)((kkz)this.c).d) && this.j(n) && c < this.c((float)((kkz)this.d).d, (float)((kkz)this.c).d)) {
                        return jio.c;
                    }
                    continue;
                }
                case 1: {
                    if (c >= this.c(this.e(jio.b, (jbm)this.a.aQ()), (float)((kkz)this.c).d) && (this.e(jio.c, (jbm)this.a.aQ()) == 0.0f || c < this.c(this.e(jio.c, (jbm)this.a.aQ()), (float)((kkz)this.c).d)) && c < this.c((float)((kkz)this.d).d, (float)((kkz)this.c).d)) {
                        return jio.b;
                    }
                    continue;
                }
                case 0: {
                    if (c < this.c(this.e(jio.b, (jbm)this.a.aQ()), (float)((kkz)this.c).d)) {
                        return jio.a;
                    }
                    continue;
                }
            }
        }
        return jio.b;
    }
    
    public final Float e(final jio jio, final jbm jbm) {
        final boolean equals = this.i.e().equals(lfu.a);
        final float n = 0.0f;
        final float n2 = 0.0f;
        final float n3 = 0.0f;
        final float n4 = 0.0f;
        final float n5 = 0.0f;
        final float n6 = 0.0f;
        final float n7 = 0.0f;
        final float n8 = 0.0f;
        final float n9 = 0.0f;
        final float n10 = 0.0f;
        final float n11 = 0.0f;
        final float n12 = 0.0f;
        final float n13 = 0.0f;
        final float n14 = 0.0f;
        final float n15 = 0.0f;
        float floatValue = 0.0f;
        if (equals) {
            if (this.j.d()) {
                if (this.y.containsKey(jio)) {
                    floatValue = this.y.get(jio);
                }
                return floatValue;
            }
            final liz j = this.j;
            if (j.j || j.i) {
                float floatValue2 = n3;
                if (this.z.containsKey(jio)) {
                    floatValue2 = this.z.get(jio);
                }
                return floatValue2;
            }
            final jbm a = jbm.a;
            final jiq a2 = jiq.a;
            final jio a3 = jio.a;
            switch (jbm.ordinal()) {
                default: {
                    float floatValue3 = n2;
                    if (this.w.containsKey(jio)) {
                        floatValue3 = this.w.get(jio);
                    }
                    return floatValue3;
                }
                case 6: {
                    float floatValue4 = n;
                    if (this.x.containsKey(jio)) {
                        floatValue4 = this.x.get(jio);
                    }
                    return floatValue4;
                }
            }
        }
        else {
            Map map = null;
            Label_0381: {
                if (!this.j.g()) {
                    final liz i = this.j;
                    if (!i.h && !i.h()) {
                        if (!this.j.k) {
                            map = this.n;
                            break Label_0381;
                        }
                    }
                }
                if (this.j.j) {
                    map = this.m;
                }
                else {
                    map = this.l;
                }
            }
            final jbm a4 = jbm.a;
            final jiq a5 = jiq.a;
            final jio a6 = jio.a;
            switch (jbm.ordinal()) {
                default: {
                    float floatValue5 = n15;
                    if (map.containsKey(jio)) {
                        floatValue5 = map.get(jio);
                    }
                    return floatValue5;
                }
                case 12: {
                    if ((float)((kkz)this.c).d >= 1.0f) {
                        float floatValue6 = n4;
                        if (this.n.containsKey(jio)) {
                            floatValue6 = this.n.get(jio);
                        }
                        return floatValue6;
                    }
                    float floatValue7 = n5;
                    if (map.containsKey(jio)) {
                        floatValue7 = map.get(jio);
                    }
                    return floatValue7;
                }
                case 6: {
                    if (this.j.f()) {
                        float floatValue8 = n6;
                        if (this.q.containsKey(jio)) {
                            floatValue8 = this.q.get(jio);
                        }
                        return floatValue8;
                    }
                    float floatValue9 = n7;
                    if (this.p.containsKey(jio)) {
                        floatValue9 = this.p.get(jio);
                    }
                    return floatValue9;
                }
                case 5: {
                    float floatValue10 = n8;
                    if (this.r.containsKey(jio)) {
                        floatValue10 = this.r.get(jio);
                    }
                    return floatValue10;
                }
                case 2: {
                    if (this.f.get().equals(jiq.a)) {
                        float floatValue11 = n9;
                        if (this.t.containsKey(jio)) {
                            floatValue11 = this.t.get(jio);
                        }
                        return floatValue11;
                    }
                    if (this.f.get().equals(jiq.d)) {
                        final liz k = this.j;
                        if (!k.j && !k.i) {
                            float floatValue12 = n10;
                            if (this.u.containsKey(jio)) {
                                floatValue12 = this.u.get(jio);
                            }
                            return floatValue12;
                        }
                        float floatValue13 = n11;
                        if (this.v.containsKey(jio)) {
                            floatValue13 = this.v.get(jio);
                        }
                        return floatValue13;
                    }
                    else {
                        if (this.g && this.k()) {
                            float floatValue14 = n12;
                            if (this.s.containsKey(jio)) {
                                floatValue14 = this.s.get(jio);
                            }
                            return floatValue14;
                        }
                        if (!this.g && this.j.j) {
                            float floatValue15 = n13;
                            if (this.o.containsKey(jio)) {
                                floatValue15 = this.o.get(jio);
                            }
                            return floatValue15;
                        }
                        float floatValue16 = n14;
                        if (map.containsKey(jio)) {
                            floatValue16 = map.get(jio);
                        }
                        return floatValue16;
                    }
                    break;
                }
            }
        }
    }
    
    public final String f(final boolean b, final float n, final boolean b2) {
        String s = String.format("%.01f", this.c(n, (float)((kkz)this.c).d));
        String s2;
        if (!b2) {
            s2 = "";
        }
        else {
            s2 = "\u00d7";
        }
        if (this.c(n, (float)((kkz)this.c).d) < 1.0f) {
            final char[] array = new char[s.length() - 1];
            s.getChars(1, s.length(), array, 0);
            s = String.copyValueOf(array);
        }
        else if (this.c(n, (float)((kkz)this.c).d) >= this.b()) {
            s = String.valueOf(Math.round(Math.floor(this.c(n, (float)((kkz)this.c).d))));
        }
        else {
            final double n2 = this.c(n, (float)((kkz)this.c).d);
            final double floor = Math.floor(n2);
            Double.isNaN(n2);
            if ((n2 - floor) * 10.0 < 1.0) {
                s = String.valueOf(Math.round(Math.floor(n2)));
            }
        }
        String s3;
        if (b) {
            final String value = String.valueOf(s);
            if (value.length() != 0) {
                s3 = s2.concat(value);
            }
            else {
                s3 = new String(s2);
            }
        }
        else {
            final String value2 = String.valueOf(s);
            if (s2.length() != 0) {
                s3 = value2.concat(s2);
            }
            else {
                s3 = new String(value2);
            }
        }
        return s3;
    }
    
    public final Map g(final jbm jbm) {
        if (this.i.e().equals(lfu.a)) {
            if (this.j.d()) {
                return this.y;
            }
            final liz j = this.j;
            if (j.j || j.i) {
                return this.z;
            }
            final jbm a = jbm.a;
            final jiq a2 = jiq.a;
            final jio a3 = jio.a;
            switch (jbm.ordinal()) {
                default: {
                    return this.w;
                }
                case 6: {
                    return this.x;
                }
            }
        }
        else {
            Map map = null;
            Label_0176: {
                if (!this.j.g()) {
                    final liz i = this.j;
                    if (!i.h && !i.h()) {
                        if (!this.j.k) {
                            map = this.n;
                            break Label_0176;
                        }
                    }
                }
                if (this.j.j) {
                    map = this.m;
                }
                else {
                    map = this.l;
                }
            }
            final jbm a4 = jbm.a;
            final jiq a5 = jiq.a;
            final jio a6 = jio.a;
            switch (jbm.ordinal()) {
                default: {
                    return map;
                }
                case 12: {
                    if ((float)((kkz)this.c).d >= 1.0f) {
                        return this.n;
                    }
                    return map;
                }
                case 6: {
                    if (this.j.f()) {
                        return this.q;
                    }
                    return this.p;
                }
                case 5: {
                    return this.r;
                }
                case 2: {
                    if (this.f.get().equals(jiq.a)) {
                        return this.t;
                    }
                    if (this.f.get().equals(jiq.d)) {
                        final liz k = this.j;
                        if (!k.j && !k.i) {
                            return this.u;
                        }
                        return this.v;
                    }
                    else {
                        if (this.g && this.k()) {
                            return this.s;
                        }
                        if (!this.g && this.j.j) {
                            return this.o;
                        }
                        return map;
                    }
                    break;
                }
            }
        }
    }
    
    public final void h(final ZoomUi zoomUi, final jio jio) {
        final Map g = this.g((jbm)this.a.aQ());
        final boolean b = zoomUi.getResources().getConfiguration().getLayoutDirection() == 1;
        for (final Map.Entry entry : ((nnx)g).s()) {
            final boolean b2 = entry.getKey() == jio;
            Label_0430: {
                if (b2) {
                    Typeface typeface = Typeface.create("google-sans-text-medium", 0);
                    final TypedValue typedValue = new TypedValue();
                    zoomUi.getResources().getValue(2131166449, typedValue, true);
                    final float float1 = typedValue.getFloat();
                    int color;
                    float float2;
                    int c;
                    if (!zoomUi.d) {
                        color = zoomUi.getResources().getColor(2131101502, (Resources$Theme)null);
                        typeface = Typeface.create("google-sans-medium_compat", 0);
                        final int n = color;
                        float2 = float1;
                        c = n;
                    }
                    else {
                        final int c2 = neu.c((View)zoomUi, 2130968865);
                        c = neu.c((View)zoomUi, 2130968871);
                        zoomUi.getResources().getValue(2131166451, typedValue, true);
                        float2 = typedValue.getFloat();
                        color = c2;
                    }
                    final jio a = jio.a;
                    final jcb a2 = jcb.a;
                    TextView textView = null;
                    Label_0420: {
                        TextView textView2 = null;
                        Label_0404: {
                            TextView textView3 = null;
                            switch (jio.ordinal()) {
                                default: {
                                    break Label_0430;
                                }
                                case 3: {
                                    ZoomUi.u(zoomUi.k(), color, float2, typeface);
                                    ZoomUi.u(zoomUi.l(), c, float1, typeface);
                                    ZoomUi.u(zoomUi.m(), c, float1, typeface);
                                    textView = zoomUi.j();
                                    break Label_0420;
                                }
                                case 2: {
                                    ZoomUi.u(zoomUi.j(), color, float2, typeface);
                                    ZoomUi.u(zoomUi.l(), c, float1, typeface);
                                    textView2 = zoomUi.m();
                                    break Label_0404;
                                }
                                case 1: {
                                    ZoomUi.u(zoomUi.m(), color, float2, typeface);
                                    textView3 = zoomUi.l();
                                    break;
                                }
                                case 0: {
                                    ZoomUi.u(zoomUi.l(), color, float2, typeface);
                                    textView3 = zoomUi.m();
                                    break;
                                }
                            }
                            ZoomUi.u(textView3, c, float1, typeface);
                            textView2 = zoomUi.j();
                        }
                        ZoomUi.u(textView2, c, float1, typeface);
                        textView = zoomUi.k();
                    }
                    ZoomUi.u(textView, c, float1, typeface);
                }
            }
            if (entry.getKey() == jio.a) {
                zoomUi.l().setText((CharSequence)this.f(b, Math.max((float)((kkz)this.c).d, (float)entry.getValue()), b2));
            }
            else if (entry.getKey() == jio.b) {
                zoomUi.m().setText((CharSequence)this.f(b, (float)entry.getValue(), b2));
            }
            else if (entry.getKey() == jio.c) {
                if ((float)entry.getValue() > (float)((kkz)this.d).d) {
                    zoomUi.j().setText((CharSequence)this.f(b, (float)((kkz)this.d).d, b2));
                }
                else {
                    zoomUi.j().setText((CharSequence)this.f(b, (float)entry.getValue(), b2));
                }
            }
            else {
                if (entry.getKey() != jio.d) {
                    continue;
                }
                if ((float)entry.getValue() > (float)((kkz)this.d).d) {
                    zoomUi.k().setText((CharSequence)this.f(b, (float)((kkz)this.d).d, b2));
                }
                else {
                    zoomUi.k().setText((CharSequence)this.f(b, (float)entry.getValue(), b2));
                }
            }
        }
    }
    
    public final boolean i(final float n) {
        final Map g = this.g((jbm)this.a.aQ());
        final double n2 = Math.round(this.c(n, (float)((kkz)this.c).d) * 10.0f);
        Double.isNaN(n2);
        final float n3 = (float)(n2 / 10.0);
        final double n4 = Math.round(n * 10.0f);
        Double.isNaN(n4);
        if (!g.containsValue((float)(n4 / 10.0))) {
            final Iterator<Object> iterator = ((nnx)g).s().iterator();
            while (iterator.hasNext()) {
                final double n5 = Math.round(this.c(iterator.next().getValue(), (float)((kkz)this.c).d) * 10.0f);
                Double.isNaN(n5);
                if (n3 == (float)(n5 / 10.0)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final boolean j(final float n) {
        return this.e(jio.d, (jbm)this.a.aQ()) == 0.0f || this.c(n, (float)((kkz)this.c).d) < this.c(4.0f, (float)((kkz)this.c).d);
    }
}
