// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.coach;

import j$.util.function.BooleanSupplier;
import android.graphics.Paint;
import android.util.Pair;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class CameraCoachHudView extends View
{
    public float a;
    public niz b;
    public niz c;
    public niz d;
    public volatile boolean e;
    
    public CameraCoachHudView(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = nii.a;
        this.c = nii.a;
        this.d = nii.a;
        this.e = true;
    }
    
    public final float a() {
        return (float)kra.c(this.getDisplay()).e;
    }
    
    protected final void onDraw(final Canvas canvas) {
        if (this.b.g()) {
            final cvp cvp = (cvp)this.b.c();
            if (cvp.l) {
                final float n = cvp.j.getWidth() / 2.0f;
                final float n2 = cvp.j.getHeight() / 2.0f;
                final float n3 = (float)Math.toDegrees(cvp.n);
                final float abs = Math.abs(n3);
                final float n4 = -(cvp.j.a - cvp.j.a());
                final float o = cvp.o;
                final float n5 = cvp.n;
                final double abs2 = Math.abs(Math.toDegrees(o));
                final double abs3 = Math.abs(Math.toDegrees(n5));
                cvo cvo;
                if (abs2 < 0.5) {
                    if (abs3 < 0.5) {
                        cvo = cvp.f;
                    }
                    else {
                        cvo = cvp.e;
                    }
                }
                else if (abs3 < 0.5) {
                    cvo = cvp.h;
                }
                else {
                    cvo = cvp.g;
                }
                canvas.rotate(n4, n, n2);
                if (cvp.m) {
                    final float n6 = n - cvp.c - cvp.b;
                    canvas.drawLine(n6 - cvp.a, n2, n6, n2, cvo.a);
                    final float n7 = cvp.b + (cvp.c + n);
                    canvas.drawLine(n7, n2, n7 + cvp.a, n2, cvo.a);
                }
                if (Math.abs(n3) < 0.5) {
                    final float c = cvp.c;
                    canvas.drawLine(n - c, n2, n + c, n2, cvo.a);
                }
                else {
                    canvas.rotate(-n3, n, n2);
                    final float c2 = cvp.c;
                    canvas.drawLine(n - c2, n2, n + c2, n2, cvo.a);
                }
                canvas.drawText(String.format("%3.0f°", abs), n, n2 - cvp.d, cvo.b);
                final int u = jvu.u((float)Math.toDegrees(cvp.o));
                final float c3 = cvp.c;
                final float n8 = n2 - u;
                canvas.drawLine(n - c3, n8, n + c3, n8, cvp.i);
                if (Math.abs(n3) < 0.5) {
                    if (!cvp.s) {
                        if (cvp.k.getAsBoolean()) {
                            jdj.b(cvp.j.getContext());
                        }
                        cvp.s = true;
                    }
                }
                else {
                    cvp.s = false;
                }
                if (Math.abs(n3) < 0.5 && Math.abs(Math.toDegrees(cvp.o)) < 0.5) {
                    if (!cvp.r) {
                        if (cvp.k.getAsBoolean()) {
                            jdj.b(cvp.j.getContext());
                        }
                        cvp.r = true;
                    }
                }
                else {
                    cvp.r = false;
                }
            }
        }
        if (this.c.g()) {
            final cwl cwl = (cwl)this.c.c();
            if (cwl.h) {
                final float n9 = cwl.a.getWidth() / 2.0f;
                final float n10 = cwl.a.getHeight() / 2.0f;
                final float n11 = (float)Math.toDegrees(cwl.i);
                final float n12 = (float)Math.toDegrees(cwl.j);
                cwl.a.setRotation(0.0f);
                if (Math.abs(n11) < 0.5 && Math.abs(n12) < 0.5) {
                    cwl.a(n9, n10, cwl.d, cwl.f, canvas);
                    cwl.a(n9, n10, cwl.e, cwl.f, canvas);
                    if (!cwl.m) {
                        if (cwl.g.getAsBoolean()) {
                            jdj.b(cwl.a.getContext());
                        }
                        cwl.m = true;
                    }
                }
                else {
                    cwl.a(n9, n10, cwl.b, cwl.c, canvas);
                    final int n13 = (int)cwl.a.a();
                    Pair pair;
                    if (n13 == 270) {
                        pair = new Pair((Object)(n12 * 4.0f), (Object)(n11 * 4.0f));
                    }
                    else if (n13 == 90) {
                        pair = new Pair((Object)(-n12 * 4.0f), (Object)(-n11 * 4.0f));
                    }
                    else {
                        pair = new Pair((Object)(-n11 * 4.0f), (Object)(n12 * 4.0f));
                    }
                    cwl.a(n9 - (float)pair.first, n10 - (float)pair.second, cwl.e, cwl.f, canvas);
                    cwl.m = false;
                }
            }
        }
        if (this.d.g()) {
            final cuz cuz = (cuz)this.d.c();
            if (cuz.h) {
                final float n14 = cuz.d.getWidth() / 2.0f;
                final float n15 = cuz.d.getHeight() / 2.0f;
                final float n16 = (float)Math.toDegrees(cuz.i);
                final float n17 = (float)Math.toDegrees(cuz.j);
                cuz.d.setRotation(0.0f);
                canvas.drawCircle(n14, n15, cuz.c, cuz.e);
                final int n18 = (int)cuz.d.a();
                Pair pair2;
                if (n18 == 270) {
                    pair2 = new Pair((Object)(n17 * cuz.m), (Object)(n16 * cuz.m));
                }
                else if (n18 == 90) {
                    pair2 = new Pair((Object)(-n17 * cuz.m), (Object)(-n16 * cuz.m));
                }
                else {
                    pair2 = new Pair((Object)(-n16 * cuz.m), (Object)(n17 * cuz.m));
                }
                final float n19 = n14 - (float)pair2.first;
                final float n20 = n15 - (float)pair2.second;
                final Paint e = cuz.e;
                canvas.drawCircle(n19, n20, cuz.b, cuz.f);
                canvas.drawLine(n19 - cuz.a / 2.0f, n20, n19, n20, e);
                canvas.drawLine(n19 + cuz.a / 2.0f, n20, n19 + cuz.b, n20, e);
                canvas.drawLine(n19, n20 - cuz.a / 2.0f, n19, n20 - cuz.b, e);
                canvas.drawLine(n19, n20 + cuz.a / 2.0f, n19, n20 + cuz.b, e);
            }
        }
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        final cug cug = new cug(this);
        this.b = niz.i(new cvp(this, (BooleanSupplier)cug));
        this.c = niz.i(new cwl(this, (BooleanSupplier)cug));
        this.d = niz.i(new cuz(this));
    }
}
