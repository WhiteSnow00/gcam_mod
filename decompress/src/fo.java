import java.util.Iterator;
import android.util.SparseArray;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.UUID;
import android.app.Activity;
import android.support.v4.app.Fragment$5;
import android.view.LayoutInflater;
import android.view.View$OnAttachStateChangeListener;
import android.content.res.Resources$NotFoundException;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class fo
{
    public final ex a;
    public final fp b;
    public final ei c;
    public int d;
    private boolean e;
    
    public fo(final ex a, final fp b, final ei c) {
        this.e = false;
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fo(final ex a, final fp b, final ei c, final fm fm) {
        this.e = false;
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        c.j = null;
        c.k = null;
        c.z = 0;
        c.w = false;
        c.s = false;
        final ei o = c.o;
        String m;
        if (o != null) {
            m = o.m;
        }
        else {
            m = null;
        }
        c.p = m;
        c.o = null;
        final Bundle i = fm.m;
        if (i != null) {
            c.i = i;
            return;
        }
        c.i = new Bundle();
    }
    
    public fo(final ex a, final fp b, final ClassLoader classLoader, final es es, final fm fm) {
        this.e = false;
        this.d = -1;
        this.a = a;
        this.b = b;
        final ei c = es.c(fm.a);
        final Bundle j = fm.j;
        if (j != null) {
            j.setClassLoader(classLoader);
        }
        c.K(fm.j);
        c.m = fm.b;
        c.v = fm.c;
        c.x = true;
        c.E = fm.d;
        c.F = fm.e;
        c.G = fm.f;
        c.J = fm.g;
        c.t = fm.h;
        c.I = fm.i;
        c.H = fm.k;
        c.W = h.values()[fm.l];
        final Bundle m = fm.m;
        if (m != null) {
            c.i = m;
        }
        else {
            c.i = new Bundle();
        }
        this.c = c;
        if (fi.R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(c);
            sb.toString();
        }
    }
    
    final void a() {
        final fp b = this.b;
        final ei c = this.c;
        final ViewGroup n = c.N;
        final int n2 = -1;
        int indexOfChild = 0;
        Label_0166: {
            if (n == null) {
                indexOfChild = n2;
            }
            else {
                final int index = b.a.indexOf(c);
                for (int i = index - 1; i >= 0; --i) {
                    final ei ei = b.a.get(i);
                    if (ei.N == n) {
                        final View o = ei.O;
                        if (o != null) {
                            indexOfChild = n.indexOfChild(o) + 1;
                            break Label_0166;
                        }
                    }
                }
                for (int j = index + 1; j < b.a.size(); ++j) {
                    final ei ei2 = b.a.get(j);
                    if (ei2.N == n) {
                        final View o2 = ei2.O;
                        if (o2 != null) {
                            indexOfChild = n.indexOfChild(o2);
                            break Label_0166;
                        }
                    }
                }
                indexOfChild = n2;
            }
        }
        final ei c2 = this.c;
        c2.N.addView(c2.O, indexOfChild);
    }
    
    final void b() {
        if (this.c.v) {
            return;
        }
        if (fi.R(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.c);
            sb.toString();
        }
        final ei c = this.c;
        final Bundle i = c.i;
        final LayoutInflater z = c.Z();
        final ei c2 = this.c;
        ViewGroup n = c2.N;
        if (n == null) {
            final int f = c2.F;
            if (f != 0) {
                if (f == -1) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Cannot create fragment ");
                    sb2.append(this.c);
                    sb2.append(" for a container view with no id");
                    throw new IllegalArgumentException(sb2.toString());
                }
                final ViewGroup viewGroup = (ViewGroup)c2.A.k.aB(f);
                if (viewGroup == null) {
                    final ei c3 = this.c;
                    if (!c3.x) {
                        String resourceName;
                        try {
                            resourceName = c3.t().getResources().getResourceName(this.c.F);
                        }
                        catch (final Resources$NotFoundException ex) {
                            resourceName = "unknown";
                        }
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("No view found for id 0x");
                        sb3.append(Integer.toHexString(this.c.F));
                        sb3.append(" (");
                        sb3.append(resourceName);
                        sb3.append(") for fragment ");
                        sb3.append(this.c);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    n = viewGroup;
                }
                else {
                    n = viewGroup;
                    if (!(viewGroup instanceof eq)) {
                        adc.c(this.c, viewGroup);
                        n = viewGroup;
                    }
                }
            }
            else {
                n = null;
            }
        }
        final ei c4 = this.c;
        c4.l(z, c4.N = n, c4.i);
        final View o = this.c.O;
        if (o != null) {
            o.setSaveFromParentEnabled(false);
            final ei c5 = this.c;
            c5.O.setTag(2131427616, (Object)c5);
            if (n != null) {
                this.a();
            }
            final ei c6 = this.c;
            if (c6.H) {
                c6.O.setVisibility(8);
            }
            if (ik.T(this.c.O)) {
                ik.D(this.c.O);
            }
            else {
                final View o2 = this.c.O;
                o2.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new fn(o2));
            }
            this.c.H();
            final ex a = this.a;
            final ei c7 = this.c;
            a.m(c7, c7.O, c7.i, false);
            final int visibility = this.c.O.getVisibility();
            this.c.u().l = this.c.O.getAlpha();
            final ei c8 = this.c;
            if (c8.N != null && visibility == 0) {
                final View focus = c8.O.findFocus();
                if (focus != null) {
                    this.c.L(focus);
                    if (fi.R(2)) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("requestFocus: Saved focused view ");
                        sb4.append(focus);
                        sb4.append(" for Fragment ");
                        sb4.append(this.c);
                        sb4.toString();
                    }
                }
                this.c.O.setAlpha(0.0f);
            }
        }
        this.c.h = 2;
    }
    
    final void c() {
        final ei c = this.c;
        if (c.v && c.w && !c.y) {
            if (fi.R(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.c);
                sb.toString();
            }
            final ei c2 = this.c;
            final Bundle i = c2.i;
            c2.l(c2.Z(), null, this.c.i);
            final View o = this.c.O;
            if (o != null) {
                o.setSaveFromParentEnabled(false);
                final ei c3 = this.c;
                c3.O.setTag(2131427616, (Object)c3);
                final ei c4 = this.c;
                if (c4.H) {
                    c4.O.setVisibility(8);
                }
                this.c.H();
                final ex a = this.a;
                final ei c5 = this.c;
                a.m(c5, c5.O, c5.i, false);
                this.c.h = 2;
            }
        }
    }
    
    final void d() {
        if (this.e) {
            if (fi.R(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(this.c);
                sb.toString();
            }
            return;
        }
        try {
            this.e = true;
            while (true) {
                int i = 0;
                final ei c = this.c;
                int h;
                if (c.A == null) {
                    h = c.h;
                }
                else {
                    int n = this.d;
                    final h a = h.a;
                    switch (c.W.ordinal()) {
                        default: {
                            n = Math.min(n, -1);
                            break;
                        }
                        case 4: {
                            break;
                        }
                        case 3: {
                            n = Math.min(n, 5);
                            break;
                        }
                        case 2: {
                            n = Math.min(n, 1);
                            break;
                        }
                        case 1: {
                            n = Math.min(n, 0);
                            break;
                        }
                    }
                    final ei c2 = this.c;
                    int n2 = n;
                    if (c2.v) {
                        if (c2.w) {
                            final int max = Math.max(this.d, 2);
                            final View o = this.c.O;
                            n2 = max;
                            if (o != null) {
                                n2 = max;
                                if (o.getParent() == null) {
                                    n2 = Math.min(max, 2);
                                }
                            }
                        }
                        else if (this.d < 4) {
                            n2 = Math.min(n, c2.h);
                        }
                        else {
                            n2 = Math.min(n, 1);
                        }
                    }
                    int min = n2;
                    if (!this.c.s) {
                        min = Math.min(n2, 1);
                    }
                    final ei c3 = this.c;
                    final ViewGroup n3 = c3.N;
                    int f2 = 0;
                    Label_0433: {
                        if (n3 != null) {
                            final gf b = gf.b(n3, c3.x());
                            final ge a2 = b.a(this.c);
                            int f;
                            if (a2 != null) {
                                f = a2.f;
                            }
                            else {
                                f = 0;
                            }
                            final ei c4 = this.c;
                            final ArrayList c5 = b.c;
                            while (true) {
                                while (i < c5.size()) {
                                    final ge ge = (ge)c5.get(i);
                                    if (ge.a.equals(c4) && !ge.c) {
                                        f2 = f;
                                        if (ge != null && (f == 0 || (f2 = f) == 1)) {
                                            f2 = ge.f;
                                        }
                                        break Label_0433;
                                    }
                                    else {
                                        ++i;
                                    }
                                }
                                final ge ge = null;
                                continue;
                            }
                        }
                        f2 = 0;
                    }
                    int n4;
                    if (f2 == 2) {
                        n4 = Math.min(min, 6);
                    }
                    else if (f2 == 3) {
                        n4 = Math.max(min, 3);
                    }
                    else {
                        final ei c6 = this.c;
                        n4 = min;
                        if (c6.t) {
                            if (c6.R()) {
                                n4 = Math.min(min, 1);
                            }
                            else {
                                n4 = Math.min(min, -1);
                            }
                        }
                    }
                    final ei c7 = this.c;
                    if (c7.P && c7.h < 5) {
                        n4 = Math.min(n4, 4);
                    }
                    h = n4;
                    if (fi.R(2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("computeExpectedState() of ");
                        sb2.append(n4);
                        sb2.append(" for ");
                        sb2.append(this.c);
                        sb2.toString();
                        h = n4;
                    }
                }
                final ei c8 = this.c;
                final int h2 = c8.h;
                if (h == h2) {
                    if (c8.S) {
                        if (c8.O != null) {
                            final ViewGroup n5 = c8.N;
                            if (n5 != null) {
                                final gf b2 = gf.b(n5, c8.x());
                                if (this.c.H) {
                                    if (fi.R(2)) {
                                        final StringBuilder sb3 = new StringBuilder();
                                        sb3.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
                                        sb3.append(this.c);
                                        sb3.toString();
                                    }
                                    b2.e(3, 1, this);
                                }
                                else {
                                    if (fi.R(2)) {
                                        final StringBuilder sb4 = new StringBuilder();
                                        sb4.append("SpecialEffectsController: Enqueuing show operation for fragment ");
                                        sb4.append(this.c);
                                        sb4.toString();
                                    }
                                    b2.e(2, 1, this);
                                }
                            }
                        }
                        final ei c9 = this.c;
                        final fi a3 = c9.A;
                        if (a3 != null && c9.s && fi.V(c9)) {
                            a3.p = true;
                        }
                        final ei c10 = this.c;
                        c10.S = false;
                        final boolean h3 = c10.H;
                    }
                    this.e = false;
                    return;
                }
                if (h > h2) {
                    switch (h2 + 1) {
                        default: {
                            continue;
                        }
                        case 7: {
                            if (fi.R(3)) {
                                final StringBuilder sb5 = new StringBuilder();
                                sb5.append("moveto RESUMED: ");
                                sb5.append(this.c);
                                sb5.toString();
                            }
                            final ei c11 = this.c;
                            final ef r = c11.R;
                            View m;
                            if (r == null) {
                                m = null;
                            }
                            else {
                                m = r.m;
                            }
                            Label_0896: {
                                if (m != null) {
                                    Label_0788: {
                                        if (m != c11.O) {
                                            for (ViewParent viewParent = m.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
                                                if (viewParent == this.c.O) {
                                                    break Label_0788;
                                                }
                                            }
                                            break Label_0896;
                                        }
                                    }
                                    final boolean requestFocus = m.requestFocus();
                                    if (fi.R(2)) {
                                        final StringBuilder sb6 = new StringBuilder();
                                        sb6.append("requestFocus: Restoring focused view ");
                                        sb6.append(m);
                                        sb6.append(" ");
                                        String s = "succeeded";
                                        if (!requestFocus) {
                                            s = "failed";
                                        }
                                        sb6.append(s);
                                        sb6.append(" on Fragment ");
                                        sb6.append(this.c);
                                        sb6.append(" resulting in focused view ");
                                        sb6.append(this.c.O.findFocus());
                                        sb6.toString();
                                    }
                                }
                            }
                            this.c.L(null);
                            final ei c12 = this.c;
                            c12.C.G();
                            c12.C.Z(true);
                            c12.h = 7;
                            c12.M = false;
                            c12.G();
                            if (c12.M) {
                                c12.ab.c(g.c);
                                if (c12.O != null) {
                                    c12.X.c(g.c);
                                }
                                c12.C.x();
                                this.a.i(this.c, false);
                                final ei c13 = this.c;
                                c13.i = null;
                                c13.j = null;
                                c13.k = null;
                                continue;
                            }
                            final StringBuilder sb7 = new StringBuilder();
                            sb7.append("Fragment ");
                            sb7.append(c12);
                            sb7.append(" did not call through to super.onResume()");
                            throw new gg(sb7.toString());
                        }
                        case 6: {
                            c8.h = 6;
                            continue;
                        }
                        case 5: {
                            if (fi.R(3)) {
                                final StringBuilder sb8 = new StringBuilder();
                                sb8.append("moveto STARTED: ");
                                sb8.append(this.c);
                                sb8.toString();
                            }
                            final ei c14 = this.c;
                            c14.C.G();
                            c14.C.Z(true);
                            c14.h = 5;
                            c14.M = false;
                            c14.i();
                            if (c14.M) {
                                c14.ab.c(g.b);
                                if (c14.O != null) {
                                    c14.X.c(g.b);
                                }
                                c14.C.y();
                                this.a.k(this.c, false);
                                continue;
                            }
                            final StringBuilder sb9 = new StringBuilder();
                            sb9.append("Fragment ");
                            sb9.append(c14);
                            sb9.append(" did not call through to super.onStart()");
                            throw new gg(sb9.toString());
                        }
                        case 4: {
                            if (c8.O != null) {
                                final ViewGroup n6 = c8.N;
                                if (n6 != null) {
                                    final gf b3 = gf.b(n6, c8.x());
                                    final int g = a.g(this.c.O.getVisibility());
                                    if (fi.R(2)) {
                                        final StringBuilder sb10 = new StringBuilder();
                                        sb10.append("SpecialEffectsController: Enqueuing add operation for fragment ");
                                        sb10.append(this.c);
                                        sb10.toString();
                                    }
                                    b3.e(g, 2, this);
                                }
                            }
                            this.c.h = 4;
                            continue;
                        }
                        case 3: {
                            if (fi.R(3)) {
                                final StringBuilder sb11 = new StringBuilder();
                                sb11.append("moveto ACTIVITY_CREATED: ");
                                sb11.append(this.c);
                                sb11.toString();
                            }
                            final ei c15 = this.c;
                            final Bundle j = c15.i;
                            c15.C.G();
                            c15.h = 3;
                            c15.M = false;
                            c15.M = true;
                            if (fi.R(3)) {
                                final StringBuilder sb12 = new StringBuilder();
                                sb12.append("moveto RESTORE_VIEW_STATE: ");
                                sb12.append(c15);
                                sb12.toString();
                            }
                            final View o2 = c15.O;
                            if (o2 != null) {
                                final Bundle k = c15.i;
                                final SparseArray l = c15.j;
                                if (l != null) {
                                    o2.restoreHierarchyState(l);
                                    c15.j = null;
                                }
                                if (c15.O != null) {
                                    c15.X.a.b(c15.k);
                                    c15.k = null;
                                }
                                c15.M = false;
                                c15.k(k);
                                if (!c15.M) {
                                    final StringBuilder sb13 = new StringBuilder();
                                    sb13.append("Fragment ");
                                    sb13.append(c15);
                                    sb13.append(" did not call through to super.onViewStateRestored()");
                                    throw new gg(sb13.toString());
                                }
                                if (c15.O != null) {
                                    c15.X.c(g.a);
                                }
                            }
                            c15.i = null;
                            c15.C.n();
                            final ex a4 = this.a;
                            final ei c16 = this.c;
                            a4.a(c16, c16.i, false);
                            continue;
                        }
                        case 2: {
                            this.c();
                            this.b();
                            continue;
                        }
                        case 1: {
                            if (fi.R(3)) {
                                final StringBuilder sb14 = new StringBuilder();
                                sb14.append("moveto CREATED: ");
                                sb14.append(this.c);
                                sb14.toString();
                            }
                            final ei c17 = this.c;
                            if (c17.U) {
                                c17.I(c17.i);
                                this.c.h = 1;
                                continue;
                            }
                            this.a.h(c17, c17.i, false);
                            final ei c18 = this.c;
                            final Bundle i2 = c18.i;
                            c18.C.G();
                            c18.h = 1;
                            c18.M = false;
                            c18.ab.b(new Fragment$5(c18));
                            c18.Z.b(i2);
                            c18.e(i2);
                            c18.U = true;
                            if (c18.M) {
                                c18.ab.c(g.a);
                                final ex a5 = this.a;
                                final ei c19 = this.c;
                                a5.c(c19, c19.i, false);
                                continue;
                            }
                            final StringBuilder sb15 = new StringBuilder();
                            sb15.append("Fragment ");
                            sb15.append(c18);
                            sb15.append(" did not call through to super.onCreate()");
                            throw new gg(sb15.toString());
                        }
                        case 0: {
                            if (fi.R(3)) {
                                final StringBuilder sb16 = new StringBuilder();
                                sb16.append("moveto ATTACHED: ");
                                sb16.append(this.c);
                                sb16.toString();
                            }
                            final ei c20 = this.c;
                            final ei o3 = c20.o;
                            fo fo;
                            if (o3 != null) {
                                fo = this.b.d(o3.m);
                                if (fo == null) {
                                    final StringBuilder sb17 = new StringBuilder();
                                    sb17.append("Fragment ");
                                    sb17.append(this.c);
                                    sb17.append(" declared target fragment ");
                                    sb17.append(this.c.o);
                                    sb17.append(" that does not belong to this FragmentManager!");
                                    throw new IllegalStateException(sb17.toString());
                                }
                                final ei c21 = this.c;
                                c21.p = c21.o.m;
                                c21.o = null;
                            }
                            else {
                                final String p = c20.p;
                                if (p != null) {
                                    fo = this.b.d(p);
                                    if (fo == null) {
                                        final StringBuilder sb18 = new StringBuilder();
                                        sb18.append("Fragment ");
                                        sb18.append(this.c);
                                        sb18.append(" declared target fragment ");
                                        sb18.append(this.c.p);
                                        sb18.append(" that does not belong to this FragmentManager!");
                                        throw new IllegalStateException(sb18.toString());
                                    }
                                }
                                else {
                                    fo = null;
                                }
                            }
                            if (fo != null) {
                                fo.d();
                            }
                            final ei c22 = this.c;
                            final fi a6 = c22.A;
                            c22.B = a6.j;
                            c22.D = a6.l;
                            this.a.g(c22, false);
                            final ei c23 = this.c;
                            final ArrayList aa = c23.aa;
                            for (int size = aa.size(), n7 = 0; n7 < size; ++n7) {
                                ((eh)aa.get(n7)).a();
                            }
                            c23.aa.clear();
                            c23.C.k(c23.B, c23.bE(), c23);
                            c23.h = 0;
                            c23.M = false;
                            c23.d(c23.B.c);
                            if (c23.M) {
                                final Iterator iterator = c23.A.h.iterator();
                                while (iterator.hasNext()) {
                                    ((fl)iterator.next()).c();
                                }
                                final fi c24 = c23.C;
                                c24.q = false;
                                c24.r = false;
                                c24.t.i = false;
                                c24.z(0);
                                this.a.b(this.c, false);
                                continue;
                            }
                            final StringBuilder sb19 = new StringBuilder();
                            sb19.append("Fragment ");
                            sb19.append(c23);
                            sb19.append(" did not call through to super.onAttach()");
                            throw new gg(sb19.toString());
                        }
                    }
                }
                else {
                    switch (h2 - 1) {
                        default: {
                            continue;
                        }
                        case 6: {
                            if (fi.R(3)) {
                                final StringBuilder sb20 = new StringBuilder();
                                sb20.append("movefrom RESUMED: ");
                                sb20.append(this.c);
                                sb20.toString();
                            }
                            final ei c25 = this.c;
                            c25.C.v();
                            if (c25.O != null) {
                                c25.X.c(g.d);
                            }
                            c25.ab.c(g.d);
                            c25.h = 6;
                            c25.M = false;
                            c25.F();
                            if (c25.M) {
                                this.a.f(this.c, false);
                                continue;
                            }
                            final StringBuilder sb21 = new StringBuilder();
                            sb21.append("Fragment ");
                            sb21.append(c25);
                            sb21.append(" did not call through to super.onPause()");
                            throw new gg(sb21.toString());
                        }
                        case 5: {
                            c8.h = 5;
                            continue;
                        }
                        case 4: {
                            if (fi.R(3)) {
                                final StringBuilder sb22 = new StringBuilder();
                                sb22.append("movefrom STARTED: ");
                                sb22.append(this.c);
                                sb22.toString();
                            }
                            final ei c26 = this.c;
                            c26.C.A();
                            if (c26.O != null) {
                                c26.X.c(g.e);
                            }
                            c26.ab.c(g.e);
                            c26.h = 4;
                            c26.M = false;
                            c26.j();
                            if (c26.M) {
                                this.a.l(this.c, false);
                                continue;
                            }
                            final StringBuilder sb23 = new StringBuilder();
                            sb23.append("Fragment ");
                            sb23.append(c26);
                            sb23.append(" did not call through to super.onStop()");
                            throw new gg(sb23.toString());
                        }
                        case 3: {
                            if (fi.R(3)) {
                                final StringBuilder sb24 = new StringBuilder();
                                sb24.append("movefrom ACTIVITY_CREATED: ");
                                sb24.append(this.c);
                                sb24.toString();
                            }
                            final ei c27 = this.c;
                            final boolean u = c27.u;
                            if (c27.O != null && c27.j == null) {
                                this.f();
                            }
                            final ei c28 = this.c;
                            if (c28.O != null) {
                                final ViewGroup n8 = c28.N;
                                if (n8 != null) {
                                    final gf b4 = gf.b(n8, c28.x());
                                    if (fi.R(2)) {
                                        final StringBuilder sb25 = new StringBuilder();
                                        sb25.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
                                        sb25.append(this.c);
                                        sb25.toString();
                                    }
                                    b4.e(1, 3, this);
                                }
                            }
                            this.c.h = 3;
                            continue;
                        }
                        case 2: {
                            c8.w = false;
                            c8.h = 2;
                            continue;
                        }
                        case 1: {
                            if (fi.R(3)) {
                                final StringBuilder sb26 = new StringBuilder();
                                sb26.append("movefrom CREATE_VIEW: ");
                                sb26.append(this.c);
                                sb26.toString();
                            }
                            final ei c29 = this.c;
                            final ViewGroup n9 = c29.N;
                            if (n9 != null) {
                                final View o4 = c29.O;
                                if (o4 != null) {
                                    n9.removeView(o4);
                                }
                            }
                            final ei c30 = this.c;
                            c30.C.z(1);
                            if (c30.O != null && c30.X.aD().a.a(h.c)) {
                                c30.X.c(g.f);
                            }
                            c30.h = 1;
                            c30.M = false;
                            c30.f();
                            if (c30.M) {
                                final adr a7 = adn.a(c30).a;
                                for (int b5 = a7.d.b(), n10 = 0; n10 < b5; ++n10) {
                                    ((ado)a7.d.e(n10)).i();
                                }
                                c30.y = false;
                                this.a.n(this.c, false);
                                final ei c31 = this.c;
                                c31.N = null;
                                c31.O = null;
                                c31.X = null;
                                c31.Y.g(null);
                                final ei c32 = this.c;
                                c32.w = false;
                                c32.h = 1;
                                continue;
                            }
                            final StringBuilder sb27 = new StringBuilder();
                            sb27.append("Fragment ");
                            sb27.append(c30);
                            sb27.append(" did not call through to super.onDestroyView()");
                            throw new gg(sb27.toString());
                        }
                        case 0: {
                            final boolean u2 = c8.u;
                            if (fi.R(3)) {
                                final StringBuilder sb28 = new StringBuilder();
                                sb28.append("movefrom CREATED: ");
                                sb28.append(this.c);
                                sb28.toString();
                            }
                            final ei c33 = this.c;
                            final boolean b6 = c33.t && !c33.R();
                            if (b6) {
                                final ei c34 = this.c;
                                final boolean u3 = c34.u;
                                this.b.c(c34.m, null);
                            }
                            if (!b6 && !this.b.d.d(this.c)) {
                                final String p2 = this.c.p;
                                if (p2 != null) {
                                    final ei a8 = this.b.a(p2);
                                    if (a8 != null && a8.J) {
                                        this.c.o = a8;
                                    }
                                }
                                this.c.h = 0;
                                continue;
                            }
                            final et b7 = this.c.B;
                            boolean h4;
                            if (b7 instanceof ad) {
                                h4 = this.b.d.h;
                            }
                            else {
                                h4 = (((Activity)b7.c).isChangingConfigurations() ^ true);
                            }
                            Label_3557: {
                                if (b6) {
                                    final boolean u4 = this.c.u;
                                }
                                else if (!h4) {
                                    break Label_3557;
                                }
                                final fk d = this.b.d;
                                final ei c35 = this.c;
                                if (fi.R(3)) {
                                    final StringBuilder sb29 = new StringBuilder();
                                    sb29.append("Clearing non-config state for ");
                                    sb29.append(c35);
                                    sb29.toString();
                                }
                                d.b(c35.m);
                            }
                            final ei c36 = this.c;
                            c36.C.q();
                            c36.ab.c(g.f);
                            c36.h = 0;
                            c36.M = false;
                            c36.U = false;
                            c36.E();
                            if (c36.M) {
                                this.a.d(this.c, false);
                                for (final fo fo2 : this.b.e()) {
                                    if (fo2 != null) {
                                        final ei c37 = fo2.c;
                                        if (!this.c.m.equals(c37.p)) {
                                            continue;
                                        }
                                        c37.o = this.c;
                                        c37.p = null;
                                    }
                                }
                                final ei c38 = this.c;
                                final String p3 = c38.p;
                                if (p3 != null) {
                                    c38.o = this.b.a(p3);
                                }
                                this.b.j(this);
                                continue;
                            }
                            final StringBuilder sb30 = new StringBuilder();
                            sb30.append("Fragment ");
                            sb30.append(c36);
                            sb30.append(" did not call through to super.onDestroy()");
                            throw new gg(sb30.toString());
                        }
                        case -1: {
                            if (fi.R(3)) {
                                final StringBuilder sb31 = new StringBuilder();
                                sb31.append("movefrom ATTACHED: ");
                                sb31.append(this.c);
                                sb31.toString();
                            }
                            final ei c39 = this.c;
                            c39.h = -1;
                            c39.M = false;
                            c39.g();
                            c39.T = null;
                            if (c39.M) {
                                final fi c40 = c39.C;
                                if (!c40.s) {
                                    c40.q();
                                    c39.C = new fi();
                                }
                                this.a.e(this.c, false);
                                final ei c41 = this.c;
                                c41.h = -1;
                                c41.B = null;
                                c41.D = null;
                                c41.A = null;
                                if (!c41.t || c41.R()) {
                                    if (!this.b.d.d(this.c)) {
                                        continue;
                                    }
                                }
                                if (fi.R(3)) {
                                    final StringBuilder sb32 = new StringBuilder();
                                    sb32.append("initState called for fragment: ");
                                    sb32.append(this.c);
                                    sb32.toString();
                                }
                                final ei c42 = this.c;
                                c42.C();
                                c42.V = c42.m;
                                c42.m = UUID.randomUUID().toString();
                                c42.s = false;
                                c42.t = false;
                                c42.v = false;
                                c42.w = false;
                                c42.x = false;
                                c42.z = 0;
                                c42.A = null;
                                c42.C = new fi();
                                c42.B = null;
                                c42.E = 0;
                                c42.F = 0;
                                c42.G = null;
                                c42.H = false;
                                c42.I = false;
                                continue;
                            }
                            final StringBuilder sb33 = new StringBuilder();
                            sb33.append("Fragment ");
                            sb33.append(c39);
                            sb33.append(" did not call through to super.onDetach()");
                            throw new gg(sb33.toString());
                        }
                    }
                }
            }
        }
        finally {
            this.e = false;
            while (true) {}
        }
    }
    
    final void e(final ClassLoader classLoader) {
        final Bundle i = this.c.i;
        if (i == null) {
            return;
        }
        i.setClassLoader(classLoader);
        final ei c = this.c;
        c.j = c.i.getSparseParcelableArray("android:view_state");
        final ei c2 = this.c;
        c2.k = c2.i.getBundle("android:view_registry_state");
        final ei c3 = this.c;
        c3.p = c3.i.getString("android:target_state");
        final ei c4 = this.c;
        if (c4.p != null) {
            c4.q = c4.i.getInt("android:target_req_state", 0);
        }
        final ei c5 = this.c;
        final Boolean l = c5.l;
        c5.Q = c5.i.getBoolean("android:user_visible_hint", true);
        final ei c6 = this.c;
        if (!c6.Q) {
            c6.P = true;
        }
    }
    
    final void f() {
        if (this.c.O == null) {
            return;
        }
        final SparseArray j = new SparseArray();
        this.c.O.saveHierarchyState(j);
        if (j.size() > 0) {
            this.c.j = j;
        }
        final Bundle k = new Bundle();
        this.c.X.a.c(k);
        if (!k.isEmpty()) {
            this.c.k = k;
        }
    }
}
