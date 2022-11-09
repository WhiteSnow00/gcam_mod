// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.faceboxes;

import java.util.Iterator;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.PorterDuff$Mode;
import android.content.res.Resources;
import java.util.HashMap;
import android.content.res.Resources$Theme;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Map;
import android.graphics.Paint;

public class FaceView extends djk
{
    public gzm[] a;
    private Paint c;
    private int d;
    private final Map e;
    
    public FaceView(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = 0;
        final Resources resources = this.getResources();
        (this.c = new Paint()).setAntiAlias(true);
        this.c.setStyle(Paint$Style.FILL);
        this.c.setStrokeWidth(resources.getDimension(2131165455));
        this.c.setColor(resources.getColor(2131099837, (Resources$Theme)null));
        this.e = new HashMap();
    }
    
    private final int d() {
        final gzm[] a = this.a;
        if (a != null) {
            return a.length;
        }
        return 0;
    }
    
    public final void a() {
        this.a = null;
        this.e.clear();
        this.b();
    }
    
    public final void b() {
        final int d = this.d();
        if (d > 0 || this.d > 0) {
            this.d = this.d();
            final int n = 0;
            if (d > 0) {
                for (final gzm gzm : this.a) {
                    if (gzm != null && gzm.b >= 50) {
                        final int j = gzm.i;
                        if (j >= 0) {
                            final Map e = this.e;
                            final Integer value = j;
                            final djj djj = e.get(value);
                            if (djj == null) {
                                final djj djj2 = new djj(gzm, this.c());
                                this.e.put(value, djj2);
                                djj2.a();
                            }
                            else {
                                djj.b(gzm);
                            }
                        }
                    }
                }
            }
            this.invalidate();
            if (this.getHolder().getSurface().isValid()) {
                final Canvas lockCanvas = this.getHolder().lockCanvas();
                lockCanvas.drawColor(0, PorterDuff$Mode.CLEAR);
                if (d > 0) {
                    if (this.e.isEmpty()) {
                        final gzm[] a2 = this.a;
                        for (int length2 = a2.length, k = n; k < length2; ++k) {
                            final RectF rectF = new RectF(a2[k].a);
                            this.c().mapRect(rectF);
                            lockCanvas.drawCircle(rectF.centerX(), rectF.centerY(), 30.0f, this.c);
                        }
                    }
                    else {
                        for (final djj djj3 : this.e.values()) {
                            final Paint c = this.c;
                            final int f = djj3.f;
                            if (f > 0) {
                                c.setAlpha(f);
                                lockCanvas.drawCircle(djj3.a.a, djj3.b.a, djj3.e, c);
                            }
                        }
                    }
                }
                this.getHolder().unlockCanvasAndPost(lockCanvas);
            }
            if (d == 0) {
                this.e.clear();
            }
        }
    }
}
