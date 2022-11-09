// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.zoomui;

import java.text.DecimalFormat;
import java.math.BigDecimal;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.SeekBar;
import java.util.concurrent.atomic.AtomicReference;
import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicBoolean;
import android.widget.TextView;

public class ZoomKnob extends TextView
{
    private static final nsd k;
    public final AtomicBoolean a;
    public final Resources b;
    public final int c;
    public final int d;
    public final AtomicReference e;
    public int f;
    public float g;
    public boolean h;
    public SeekBar i;
    public liz j;
    private final int l;
    
    static {
        k = nsd.g("com/google/android/apps/camera/zoomui/ZoomKnob");
    }
    
    public ZoomKnob(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new AtomicBoolean(false);
        this.e = new AtomicReference((V)jiq.b);
        final Resources resources = context.getResources();
        this.b = resources;
        this.l = resources.getDimensionPixelSize(2131166445);
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131166422);
        this.d = dimensionPixelSize;
        this.c = (dimensionPixelSize - this.getResources().getDimensionPixelSize(2131166419)) / 2;
    }
    
    public final void a(final boolean b) {
        this.a.set(b);
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)this.getLayoutParams();
        final int dimensionPixelSize = this.b.getDimensionPixelSize(2131166421);
        final int dimensionPixelSize2 = this.b.getDimensionPixelSize(2131166419);
        int f = this.f;
        final int n = dimensionPixelSize2 / 2;
        if (b) {
            f += dimensionPixelSize + n;
        }
        layoutParams.bottomMargin = f;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public final void b(final boolean b) {
        if (b) {
            this.i.getThumb().mutate().setAlpha(255);
            return;
        }
        this.i.getThumb().mutate().setAlpha(0);
    }
    
    public final void c(final int n, float n2, final float n3, final float n4) {
        final int l = this.l;
        final float g = this.g;
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)this.getLayoutParams();
        layoutParams.leftMargin = (int)((int)(l * g) / 2 * (float)(n - 50000) / 50000.0f);
        layoutParams.rightMargin = 0;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        final jiq a = jiq.a;
        float n5 = 0.0f;
        switch (this.e.get().ordinal()) {
            default: {
                final String value = String.valueOf(this.e.get());
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 39);
                sb.append("Not a supported normalization setting: ");
                sb.append(value);
                throw new IllegalArgumentException(sb.toString());
            }
            case 3: {
                n5 = n2 / n3;
                break;
            }
            case 2: {
                n5 = n2 / n4;
                break;
            }
            case 1: {
                if (n3 < 1.0f)
                n5 = n2 / n3;
                break;
            }
            case 0: {
                n5 = n2;
                break;
            }
        }
        if (!Float.isNaN(n5) && !Float.isInfinite(n5) && n5 > 0.0f) {
            n2 = n5;
        }
        else {
            final nsd k = ZoomKnob.k;
            a.k(k.c(), "Invalid zoom value: %g", n5, '\u0bd7');
            k.c().E(3032).y("Zoom ratio: %g, Min zoom: %g, BaseZoom: %g", n2, n3, n4);
        }
        final double n6 = Math.round(n2 * 10.0f);
        Double.isNaN(n6);
        n2 = (float)(n6 / 10.0);
        final double doubleValue = new BigDecimal(n2).setScale(2, 4).doubleValue();
        String text = String.valueOf(new DecimalFormat("0.0").format(doubleValue)).concat("\u00d7");
        final liz j = this.j;
        if (j != null && j.j && n2 >= 4.0f) {
            text = String.valueOf(new DecimalFormat("0").format(Math.floor(doubleValue))).concat("\u00d7");
        }
        this.setText((CharSequence)text);
    }
}
