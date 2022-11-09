import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.content.Context;
import java.util.Iterator;
import android.view.View;
import android.support.constraint.Guideline;
import android.view.ViewGroup$LayoutParams;
import java.util.Collection;
import java.util.HashSet;
import android.support.constraint.ConstraintLayout;
import android.content.res.TypedArray;
import java.util.HashMap;
import android.util.SparseIntArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ct
{
    private static final int[] a;
    private static final SparseIntArray b;
    private final HashMap c;
    
    static {
        a = new int[] { 0, 4, 8 };
        final SparseIntArray sparseIntArray = b = new SparseIntArray();
        final int[] a2 = cu.a;
        sparseIntArray.append(84, 25);
        sparseIntArray.append(85, 26);
        sparseIntArray.append(87, 29);
        sparseIntArray.append(88, 30);
        sparseIntArray.append(94, 36);
        sparseIntArray.append(93, 35);
        sparseIntArray.append(66, 4);
        sparseIntArray.append(65, 3);
        sparseIntArray.append(61, 1);
        sparseIntArray.append(102, 6);
        sparseIntArray.append(103, 7);
        sparseIntArray.append(73, 17);
        sparseIntArray.append(74, 18);
        sparseIntArray.append(75, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(89, 32);
        sparseIntArray.append(90, 33);
        sparseIntArray.append(72, 10);
        sparseIntArray.append(71, 9);
        sparseIntArray.append(107, 13);
        sparseIntArray.append(110, 16);
        sparseIntArray.append(108, 14);
        sparseIntArray.append(105, 11);
        sparseIntArray.append(109, 15);
        sparseIntArray.append(106, 12);
        sparseIntArray.append(97, 40);
        sparseIntArray.append(82, 39);
        sparseIntArray.append(81, 41);
        sparseIntArray.append(96, 42);
        sparseIntArray.append(80, 20);
        sparseIntArray.append(95, 37);
        sparseIntArray.append(70, 5);
        sparseIntArray.append(83, 60);
        sparseIntArray.append(92, 60);
        sparseIntArray.append(86, 60);
        sparseIntArray.append(64, 60);
        sparseIntArray.append(60, 60);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(25, 31);
        sparseIntArray.append(26, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(15, 43);
        sparseIntArray.append(28, 44);
        sparseIntArray.append(23, 45);
        sparseIntArray.append(24, 46);
        sparseIntArray.append(20, 47);
        sparseIntArray.append(21, 48);
        sparseIntArray.append(16, 49);
        sparseIntArray.append(17, 50);
        sparseIntArray.append(18, 51);
        sparseIntArray.append(19, 52);
        sparseIntArray.append(27, 53);
        sparseIntArray.append(98, 54);
        sparseIntArray.append(76, 55);
        sparseIntArray.append(99, 56);
        sparseIntArray.append(77, 57);
        sparseIntArray.append(100, 58);
        sparseIntArray.append(78, 59);
        sparseIntArray.append(1, 38);
    }
    
    public ct() {
        this.c = new HashMap();
    }
    
    private static int i(final TypedArray typedArray, final int n, int resourceId) {
        resourceId = typedArray.getResourceId(n, resourceId);
        if (resourceId == -1) {
            return typedArray.getInt(n, -1);
        }
        return resourceId;
    }
    
    private static final String j(final int n) {
        switch (n) {
            default: {
                return "end";
            }
            case 6: {
                return "start";
            }
            case 5: {
                return "baseline";
            }
            case 4: {
                return "bottom";
            }
            case 3: {
                return "top";
            }
        }
    }
    
    public final cs a(final int n) {
        final HashMap c = this.c;
        final Integer value = n;
        if (!c.containsKey(value)) {
            this.c.put(value, new cs());
        }
        return (cs)this.c.get(value);
    }
    
    public final void b(final ConstraintLayout constraintLayout) {
        this.c(constraintLayout);
        constraintLayout.c = null;
    }
    
    public final void c(final ConstraintLayout constraintLayout) {
        final int childCount = constraintLayout.getChildCount();
        final HashSet set = new HashSet(this.c.keySet());
        for (int i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final int id = child.getId();
            final HashMap c = this.c;
            final Integer value = id;
            if (c.containsKey(value)) {
                set.remove(value);
                final cs cs = this.c.get(value);
                final cr layoutParams = (cr)child.getLayoutParams();
                cs.a(layoutParams);
                child.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                child.setVisibility(cs.G);
                child.setAlpha(cs.R);
                child.setRotationX(cs.U);
                child.setRotationY(cs.V);
                child.setScaleX(cs.W);
                child.setScaleY(cs.X);
                child.setPivotX(cs.Y);
                child.setPivotY(cs.Z);
                child.setTranslationX(cs.aa);
                child.setTranslationY(cs.ab);
                child.setTranslationZ(cs.ac);
                if (cs.S) {
                    child.setElevation(cs.T);
                }
            }
        }
        for (final Integer n : set) {
            final cs cs2 = this.c.get(n);
            if (cs2.a) {
                final Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId((int)n);
                final cr bz = constraintLayout.bz();
                cs2.a(bz);
                constraintLayout.addView((View)guideline, (ViewGroup$LayoutParams)bz);
            }
        }
    }
    
    public final void d(final ConstraintLayout constraintLayout) {
        final int childCount = constraintLayout.getChildCount();
        this.c.clear();
        for (int i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final cr cr = (cr)child.getLayoutParams();
            final int id = child.getId();
            final HashMap c = this.c;
            final Integer value = id;
            if (!c.containsKey(value)) {
                this.c.put(value, new cs());
            }
            final cs cs = this.c.get(value);
            cs.d = id;
            cs.h = cr.d;
            cs.i = cr.e;
            cs.j = cr.f;
            cs.k = cr.g;
            cs.l = cr.h;
            cs.m = cr.i;
            cs.n = cr.j;
            cs.o = cr.k;
            cs.p = cr.l;
            cs.q = cr.m;
            cs.r = cr.n;
            cs.s = cr.o;
            cs.t = cr.p;
            cs.u = cr.w;
            cs.v = cr.x;
            cs.w = cr.y;
            cs.x = cr.K;
            cs.y = cr.L;
            cs.z = cr.M;
            cs.g = cr.c;
            cs.e = cr.a;
            cs.f = cr.b;
            cs.b = cr.width;
            cs.c = cr.height;
            cs.A = cr.leftMargin;
            cs.B = cr.rightMargin;
            cs.C = cr.topMargin;
            cs.D = cr.bottomMargin;
            cs.N = cr.B;
            cs.O = cr.A;
            cs.Q = cr.D;
            cs.P = cr.C;
            cs.ad = cr.E;
            cs.ae = cr.F;
            cs.af = cr.I;
            cs.ag = cr.J;
            cs.ah = cr.G;
            cs.ai = cr.H;
            cs.E = cr.getMarginEnd();
            cs.F = cr.getMarginStart();
            cs.G = child.getVisibility();
            cs.R = child.getAlpha();
            cs.U = child.getRotationX();
            cs.V = child.getRotationY();
            cs.W = child.getScaleX();
            cs.X = child.getScaleY();
            cs.Y = child.getPivotX();
            cs.Z = child.getPivotY();
            cs.aa = child.getTranslationX();
            cs.ab = child.getTranslationY();
            cs.ac = child.getTranslationZ();
            if (cs.S) {
                cs.T = child.getElevation();
            }
        }
    }
    
    public final void e(final int n, final int n2, final int m, final int n3, final int n4) {
        final HashMap c = this.c;
        final Integer value = n;
        if (!c.containsKey(value)) {
            this.c.put(value, new cs());
        }
        final cs cs = this.c.get(value);
        switch (n2) {
            default: {
                if (n3 == 7) {
                    cs.t = m;
                    cs.s = -1;
                }
                else {
                    if (n3 != 6) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("right to ");
                        sb.append(j(n3));
                        sb.append(" undefined");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    cs.s = m;
                    cs.t = -1;
                }
                cs.E = n4;
                return;
            }
            case 6: {
                if (n3 == 6) {
                    cs.r = m;
                    cs.q = -1;
                }
                else {
                    if (n3 != 7) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("right to ");
                        sb2.append(j(n3));
                        sb2.append(" undefined");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    cs.q = m;
                    cs.r = -1;
                }
                cs.F = n4;
                return;
            }
            case 5: {
                if (n3 == 5) {
                    cs.p = m;
                    cs.o = -1;
                    cs.n = -1;
                    cs.l = -1;
                    cs.m = -1;
                    return;
                }
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("right to ");
                sb3.append(j(n3));
                sb3.append(" undefined");
                throw new IllegalArgumentException(sb3.toString());
            }
            case 4: {
                if (n3 == 4) {
                    cs.o = m;
                    cs.n = -1;
                    cs.p = -1;
                }
                else {
                    if (n3 != 3) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("right to ");
                        sb4.append(j(n3));
                        sb4.append(" undefined");
                        throw new IllegalArgumentException(sb4.toString());
                    }
                    cs.n = m;
                    cs.o = -1;
                    cs.p = -1;
                }
                cs.D = n4;
                return;
            }
            case 3: {
                if (n3 == 3) {
                    cs.l = m;
                    cs.m = -1;
                }
                else {
                    if (n3 != 4) {
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("right to ");
                        sb5.append(j(n3));
                        sb5.append(" undefined");
                        throw new IllegalArgumentException(sb5.toString());
                    }
                    cs.m = m;
                    cs.l = -1;
                }
                cs.p = -1;
                cs.C = n4;
            }
        }
    }
    
    public final void f(final int n, final int c) {
        this.a(n).c = c;
    }
    
    public final void g(final int n, final int b) {
        this.a(n).b = b;
    }
    
    public final void h(final Context context, int i) {
        final XmlResourceParser xml = context.getResources().getXml(i);
        try {
            String name;
            AttributeSet attributeSet;
            cs cs;
            TypedArray obtainStyledAttributes;
            int indexCount;
            int index;
            SparseIntArray b;
            StringBuilder sb;
            StringBuilder sb2;
            for (i = ((XmlPullParser)xml).getEventType(); i != 1; i = ((XmlPullParser)xml).next()) {
                switch (i) {
                    case 2: {
                        name = ((XmlPullParser)xml).getName();
                        attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
                        cs = new cs();
                        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cu.b);
                        for (indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                            index = obtainStyledAttributes.getIndex(i);
                            b = ct.b;
                            switch (b.get(index)) {
                                default: {
                                    sb = new StringBuilder();
                                    sb.append("Unknown attribute 0x");
                                    sb.append(Integer.toHexString(index));
                                    sb.append("   ");
                                    sb.append(b.get(index));
                                    Log.w("ConstraintSet", sb.toString());
                                    break;
                                }
                                case 60: {
                                    sb2 = new StringBuilder();
                                    sb2.append("unused attribute 0x");
                                    sb2.append(Integer.toHexString(index));
                                    sb2.append("   ");
                                    sb2.append(b.get(index));
                                    Log.w("ConstraintSet", sb2.toString());
                                    break;
                                }
                                case 53: {
                                    cs.ac = obtainStyledAttributes.getFloat(index, cs.ac);
                                    break;
                                }
                                case 52: {
                                    cs.ab = obtainStyledAttributes.getFloat(index, cs.ab);
                                    break;
                                }
                                case 51: {
                                    cs.aa = obtainStyledAttributes.getFloat(index, cs.aa);
                                    break;
                                }
                                case 50: {
                                    cs.Z = obtainStyledAttributes.getFloat(index, cs.Z);
                                    break;
                                }
                                case 49: {
                                    cs.Y = obtainStyledAttributes.getFloat(index, cs.Y);
                                    break;
                                }
                                case 48: {
                                    cs.X = obtainStyledAttributes.getFloat(index, cs.X);
                                    break;
                                }
                                case 47: {
                                    cs.W = obtainStyledAttributes.getFloat(index, cs.W);
                                    break;
                                }
                                case 46: {
                                    cs.V = obtainStyledAttributes.getFloat(index, cs.V);
                                    break;
                                }
                                case 45: {
                                    cs.U = obtainStyledAttributes.getFloat(index, cs.U);
                                    break;
                                }
                                case 44: {
                                    cs.S = true;
                                    cs.T = obtainStyledAttributes.getFloat(index, cs.T);
                                    break;
                                }
                                case 43: {
                                    cs.R = obtainStyledAttributes.getFloat(index, cs.R);
                                    break;
                                }
                                case 42: {
                                    cs.Q = obtainStyledAttributes.getInt(index, cs.Q);
                                    break;
                                }
                                case 41: {
                                    cs.P = obtainStyledAttributes.getInt(index, cs.P);
                                    break;
                                }
                                case 40: {
                                    cs.N = obtainStyledAttributes.getFloat(index, cs.N);
                                    break;
                                }
                                case 39: {
                                    cs.O = obtainStyledAttributes.getFloat(index, cs.O);
                                    break;
                                }
                                case 38: {
                                    cs.d = obtainStyledAttributes.getResourceId(index, cs.d);
                                    break;
                                }
                                case 37: {
                                    cs.v = obtainStyledAttributes.getFloat(index, cs.v);
                                    break;
                                }
                                case 36: {
                                    cs.l = i(obtainStyledAttributes, index, cs.l);
                                    break;
                                }
                                case 35: {
                                    cs.m = i(obtainStyledAttributes, index, cs.m);
                                    break;
                                }
                                case 34: {
                                    cs.C = obtainStyledAttributes.getDimensionPixelSize(index, cs.C);
                                    break;
                                }
                                case 33: {
                                    cs.r = i(obtainStyledAttributes, index, cs.r);
                                    break;
                                }
                                case 32: {
                                    cs.q = i(obtainStyledAttributes, index, cs.q);
                                    break;
                                }
                                case 31: {
                                    cs.F = obtainStyledAttributes.getDimensionPixelSize(index, cs.F);
                                    break;
                                }
                                case 30: {
                                    cs.k = i(obtainStyledAttributes, index, cs.k);
                                    break;
                                }
                                case 29: {
                                    cs.j = i(obtainStyledAttributes, index, cs.j);
                                    break;
                                }
                                case 28: {
                                    cs.B = obtainStyledAttributes.getDimensionPixelSize(index, cs.B);
                                    break;
                                }
                                case 27: {
                                    cs.z = obtainStyledAttributes.getInt(index, cs.z);
                                    break;
                                }
                                case 26: {
                                    cs.i = i(obtainStyledAttributes, index, cs.i);
                                    break;
                                }
                                case 25: {
                                    cs.h = i(obtainStyledAttributes, index, cs.h);
                                    break;
                                }
                                case 24: {
                                    cs.A = obtainStyledAttributes.getDimensionPixelSize(index, cs.A);
                                    break;
                                }
                                case 23: {
                                    cs.b = obtainStyledAttributes.getLayoutDimension(index, cs.b);
                                    break;
                                }
                                case 22: {
                                    cs.G = obtainStyledAttributes.getInt(index, cs.G);
                                    cs.G = ct.a[cs.G];
                                    break;
                                }
                                case 21: {
                                    cs.c = obtainStyledAttributes.getLayoutDimension(index, cs.c);
                                    break;
                                }
                                case 20: {
                                    cs.u = obtainStyledAttributes.getFloat(index, cs.u);
                                    break;
                                }
                                case 19: {
                                    cs.g = obtainStyledAttributes.getFloat(index, cs.g);
                                    break;
                                }
                                case 18: {
                                    cs.f = obtainStyledAttributes.getDimensionPixelOffset(index, cs.f);
                                    break;
                                }
                                case 17: {
                                    cs.e = obtainStyledAttributes.getDimensionPixelOffset(index, cs.e);
                                    break;
                                }
                                case 16: {
                                    cs.I = obtainStyledAttributes.getDimensionPixelSize(index, cs.I);
                                    break;
                                }
                                case 15: {
                                    cs.M = obtainStyledAttributes.getDimensionPixelSize(index, cs.M);
                                    break;
                                }
                                case 14: {
                                    cs.J = obtainStyledAttributes.getDimensionPixelSize(index, cs.J);
                                    break;
                                }
                                case 13: {
                                    cs.H = obtainStyledAttributes.getDimensionPixelSize(index, cs.H);
                                    break;
                                }
                                case 12: {
                                    cs.L = obtainStyledAttributes.getDimensionPixelSize(index, cs.L);
                                    break;
                                }
                                case 11: {
                                    cs.K = obtainStyledAttributes.getDimensionPixelSize(index, cs.K);
                                    break;
                                }
                                case 10: {
                                    cs.s = i(obtainStyledAttributes, index, cs.s);
                                    break;
                                }
                                case 9: {
                                    cs.n = i(obtainStyledAttributes, index, cs.t);
                                    break;
                                }
                                case 8: {
                                    cs.E = obtainStyledAttributes.getDimensionPixelSize(index, cs.E);
                                    break;
                                }
                                case 7: {
                                    cs.y = obtainStyledAttributes.getDimensionPixelOffset(index, cs.y);
                                    break;
                                }
                                case 6: {
                                    cs.x = obtainStyledAttributes.getDimensionPixelOffset(index, cs.x);
                                    break;
                                }
                                case 5: {
                                    cs.w = obtainStyledAttributes.getString(index);
                                    break;
                                }
                                case 4: {
                                    cs.n = i(obtainStyledAttributes, index, cs.n);
                                    break;
                                }
                                case 3: {
                                    cs.o = i(obtainStyledAttributes, index, cs.o);
                                    break;
                                }
                                case 2: {
                                    cs.D = obtainStyledAttributes.getDimensionPixelSize(index, cs.D);
                                    break;
                                }
                                case 1: {
                                    cs.p = i(obtainStyledAttributes, index, cs.p);
                                    break;
                                }
                            }
                        }
                        obtainStyledAttributes.recycle();
                        if (name.equalsIgnoreCase("Guideline")) {
                            cs.a = true;
                        }
                        this.c.put(cs.d, cs);
                        break;
                    }
                    case 0: {
                        ((XmlPullParser)xml).getName();
                        break;
                    }
                }
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        catch (final XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
    }
}
