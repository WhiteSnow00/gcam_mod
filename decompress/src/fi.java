import android.app.Activity;
import android.content.res.Configuration;
import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import java.io.Writer;
import android.os.Parcelable;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.animation.Animator;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.animation.Animator$AnimatorListener;
import java.util.List;
import java.util.Collection;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fi
{
    private wn A;
    private wn B;
    private boolean C;
    private ArrayList D;
    private ArrayList E;
    private ArrayList F;
    private final Runnable G;
    private final fw H;
    public final fp a;
    ArrayList b;
    public final ev c;
    public wh d;
    public final wf e;
    public final AtomicInteger f;
    public final ex g;
    public final CopyOnWriteArrayList h;
    int i;
    public et j;
    public ep k;
    public ei l;
    ei m;
    public wn n;
    ArrayDeque o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public fk t;
    private final ArrayList u;
    private boolean v;
    private ArrayList w;
    private final Map x;
    private final Map y;
    private final es z;
    
    public fi() {
        this.u = new ArrayList();
        this.a = new fp();
        this.c = new ev(this);
        this.e = new wf(this);
        this.f = new AtomicInteger();
        this.x = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.y = DesugarCollections.synchronizedMap((Map)new HashMap());
        DesugarCollections.synchronizedMap((Map)new HashMap());
        this.g = new ex(this);
        this.h = new CopyOnWriteArrayList();
        this.i = -1;
        this.z = new ez(this);
        this.H = new fw();
        this.o = new ArrayDeque();
        this.G = new fa(this);
    }
    
    public static boolean R(final int n) {
        return Log.isLoggable("FragmentManager", n);
    }
    
    public static final boolean V(final ei ei) {
        final boolean l = ei.L;
        final fp a = ei.C.a;
        final ArrayList list = new ArrayList();
        for (final fo fo : a.b.values()) {
            if (fo != null) {
                list.add(fo.c);
            }
            else {
                list.add(null);
            }
        }
        final Iterator iterator2 = list.iterator();
        int n = 0;
        while (iterator2.hasNext()) {
            final ei ei2 = (ei)iterator2.next();
            int v = n;
            if (ei2 != null) {
                v = (V(ei2) ? 1 : 0);
            }
            if ((n = v) != 0) {
                return true;
            }
        }
        return false;
    }
    
    static final boolean W(final ei ei) {
        final boolean b = true;
        if (ei == null) {
            return true;
        }
        boolean b2 = b;
        if (ei.A != null) {
            b2 = b;
            if (!W(ei.D)) {
                b2 = false;
            }
        }
        return b2;
    }
    
    static final void Y(final ei ei) {
        if (R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(ei);
            sb.toString();
        }
        if (ei.H) {
            ei.H = false;
            ei.S ^= true;
        }
    }
    
    private final ViewGroup ab(final ei ei) {
        final ViewGroup n = ei.N;
        if (n != null) {
            return n;
        }
        if (ei.F <= 0) {
            return null;
        }
        if (this.k.aC()) {
            final View ab = this.k.aB(ei.F);
            if (ab instanceof ViewGroup) {
                return (ViewGroup)ab;
            }
        }
        return null;
    }
    
    private final Set ac() {
        final HashSet set = new HashSet();
        final Iterator iterator = this.a.e().iterator();
        while (iterator.hasNext()) {
            final ViewGroup n = ((fo)iterator.next()).c.N;
            if (n != null) {
                this.aa();
                set.add(gf.g(n));
            }
        }
        return set;
    }
    
    private final void ad() {
        if (!this.T()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    
    private final void ae() {
        this.v = false;
        this.E.clear();
        this.D.clear();
    }
    
    private final void af() {
        if (this.C) {
            this.C = false;
            this.al();
        }
    }
    
    private final void ag() {
        final Iterator iterator = this.ac().iterator();
        while (iterator.hasNext()) {
            ((gf)iterator.next()).c();
        }
    }
    
    private final void ah(final boolean b) {
        if (this.v) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.j == null) {
            if (this.s) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        else {
            if (Looper.myLooper() != this.j.d.getLooper()) {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
            if (!b) {
                this.ad();
            }
            if (this.D == null) {
                this.D = new ArrayList();
                this.E = new ArrayList();
            }
        }
    }
    
    private final void ai(final ArrayList list, final ArrayList list2, int i, final int n) {
        final boolean r = list.get(i).r;
        final ArrayList f = this.F;
        if (f == null) {
            this.F = new ArrayList();
        }
        else {
            f.clear();
        }
        this.F.addAll(this.a.f());
        ei ei = this.m;
        int j = i;
        int n2 = 0;
        while (j < n) {
            final dk dk = list.get(j);
            ei ei2;
            if (!(boolean)list2.get(j)) {
                final ArrayList f2 = this.F;
                int n3 = 0;
                while (true) {
                    ei2 = ei;
                    if (n3 >= dk.d.size()) {
                        break;
                    }
                    final fq fq = dk.d.get(n3);
                    switch (fq.a) {
                        case 8: {
                            dk.d.add(n3, new fq(9, ei, null));
                            fq.c = true;
                            ++n3;
                            ei = fq.b;
                            break;
                        }
                        case 3:
                        case 6: {
                            f2.remove(fq.b);
                            final ei b = fq.b;
                            if (b == ei) {
                                dk.d.add(n3, new fq(9, b));
                                ++n3;
                                ei = null;
                                break;
                            }
                            break;
                        }
                        case 2: {
                            final ei b2 = fq.b;
                            final int f3 = b2.F;
                            int k = f2.size() - 1;
                            boolean b3 = false;
                            while (k >= 0) {
                                final ei ei3 = f2.get(k);
                                if (ei3.F == f3) {
                                    if (ei3 == b2) {
                                        b3 = true;
                                    }
                                    else {
                                        if (ei3 == ei) {
                                            dk.d.add(n3, new fq(9, ei3, null));
                                            ++n3;
                                            ei = null;
                                        }
                                        final fq fq2 = new fq(3, ei3, null);
                                        fq2.d = fq.d;
                                        fq2.f = fq.f;
                                        fq2.e = fq.e;
                                        fq2.g = fq.g;
                                        dk.d.add(n3, fq2);
                                        f2.remove(ei3);
                                        ++n3;
                                    }
                                }
                                --k;
                            }
                            if (b3) {
                                dk.d.remove(n3);
                                --n3;
                                break;
                            }
                            fq.a = 1;
                            fq.c = true;
                            f2.add(b2);
                            break;
                        }
                        case 1:
                        case 7: {
                            f2.add(fq.b);
                            break;
                        }
                    }
                    ++n3;
                }
            }
            else {
                final ArrayList f4 = this.F;
                int n4 = dk.d.size() - 1;
                while (true) {
                    ei2 = ei;
                    if (n4 < 0) {
                        break;
                    }
                    final fq fq3 = dk.d.get(n4);
                    switch (fq3.a) {
                        case 10: {
                            fq3.i = fq3.h;
                            break;
                        }
                        case 9: {
                            ei = fq3.b;
                            break;
                        }
                        case 8: {
                            ei = null;
                            break;
                        }
                        case 3:
                        case 6: {
                            f4.add(fq3.b);
                            break;
                        }
                        case 1:
                        case 7: {
                            f4.remove(fq3.b);
                            break;
                        }
                    }
                    --n4;
                }
            }
            int n5;
            if (n2 == 0 && !dk.j) {
                n5 = 0;
            }
            else {
                n5 = 1;
            }
            ++j;
            ei = ei2;
            n2 = n5;
        }
        this.F.clear();
        if (!r && this.i > 0) {
            for (int l = i; l < n; ++l) {
                final ArrayList d = list.get(l).d;
                for (int size = d.size(), n6 = 0; n6 < size; ++n6) {
                    final ei b4 = ((fq)d.get(n6)).b;
                    if (b4 != null && b4.A != null) {
                        this.a.i(this.h(b4));
                    }
                }
            }
        }
        for (int n7 = i; n7 < n; ++n7) {
            final dk dk2 = list.get(n7);
            if (list2.get(n7)) {
                dk2.a(-1);
                for (int n8 = dk2.d.size() - 1; n8 >= 0; --n8) {
                    final fq fq4 = dk2.d.get(n8);
                    final ei b5 = fq4.b;
                    if (b5 != null) {
                        b5.u = false;
                        b5.N(true);
                        int n9 = 0;
                        switch (dk2.i) {
                            default: {
                                n9 = 0;
                                break;
                            }
                            case 8197: {
                                n9 = 4100;
                                break;
                            }
                            case 8194: {
                                n9 = 4097;
                                break;
                            }
                            case 4100: {
                                n9 = 8197;
                                break;
                            }
                            case 4099: {
                                n9 = 4099;
                                break;
                            }
                            case 4097: {
                                n9 = 8194;
                                break;
                            }
                        }
                        b5.M(n9);
                        b5.O(dk2.q, dk2.p);
                    }
                    switch (fq4.a) {
                        default: {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Unknown cmd: ");
                            sb.append(fq4.a);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        case 10: {
                            dk2.a.K(b5, fq4.h);
                            break;
                        }
                        case 9: {
                            dk2.a.L(b5);
                            break;
                        }
                        case 8: {
                            dk2.a.L(null);
                            break;
                        }
                        case 7: {
                            b5.J(fq4.d, fq4.e, fq4.f, fq4.g);
                            dk2.a.J(b5, true);
                            dk2.a.m(b5);
                            break;
                        }
                        case 6: {
                            b5.J(fq4.d, fq4.e, fq4.f, fq4.g);
                            dk2.a.l(b5);
                            break;
                        }
                        case 5: {
                            b5.J(fq4.d, fq4.e, fq4.f, fq4.g);
                            dk2.a.J(b5, true);
                            dk2.a.E(b5);
                            break;
                        }
                        case 4: {
                            b5.J(fq4.d, fq4.e, fq4.f, fq4.g);
                            final fi a = dk2.a;
                            Y(b5);
                            break;
                        }
                        case 3: {
                            b5.J(fq4.d, fq4.e, fq4.f, fq4.g);
                            dk2.a.g(b5);
                            break;
                        }
                        case 1: {
                            b5.J(fq4.d, fq4.e, fq4.f, fq4.g);
                            dk2.a.J(b5, true);
                            dk2.a.H(b5);
                            break;
                        }
                    }
                }
            }
            else {
                dk2.a(1);
                for (int size2 = dk2.d.size(), n10 = 0; n10 < size2; ++n10) {
                    final fq fq5 = dk2.d.get(n10);
                    final ei b6 = fq5.b;
                    if (b6 != null) {
                        b6.N(b6.u = false);
                        b6.M(dk2.i);
                        b6.O(dk2.p, dk2.q);
                    }
                    switch (fq5.a) {
                        default: {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unknown cmd: ");
                            sb2.append(fq5.a);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        case 10: {
                            dk2.a.K(b6, fq5.i);
                            break;
                        }
                        case 9: {
                            dk2.a.L(null);
                            break;
                        }
                        case 8: {
                            dk2.a.L(b6);
                            break;
                        }
                        case 7: {
                            b6.J(fq5.d, fq5.e, fq5.f, fq5.g);
                            dk2.a.J(b6, false);
                            dk2.a.l(b6);
                            break;
                        }
                        case 6: {
                            b6.J(fq5.d, fq5.e, fq5.f, fq5.g);
                            dk2.a.m(b6);
                            break;
                        }
                        case 5: {
                            b6.J(fq5.d, fq5.e, fq5.f, fq5.g);
                            dk2.a.J(b6, false);
                            final fi a2 = dk2.a;
                            Y(b6);
                            break;
                        }
                        case 4: {
                            b6.J(fq5.d, fq5.e, fq5.f, fq5.g);
                            dk2.a.E(b6);
                            break;
                        }
                        case 3: {
                            b6.J(fq5.d, fq5.e, fq5.f, fq5.g);
                            dk2.a.H(b6);
                            break;
                        }
                        case 1: {
                            b6.J(fq5.d, fq5.e, fq5.f, fq5.g);
                            dk2.a.J(b6, false);
                            dk2.a.g(b6);
                            break;
                        }
                    }
                }
            }
        }
        final boolean booleanValue = list2.get(n - 1);
        for (int n11 = i; n11 < n; ++n11) {
            final dk dk3 = list.get(n11);
            if (booleanValue) {
                for (int n12 = dk3.d.size() - 1; n12 >= 0; --n12) {
                    final ei b7 = dk3.d.get(n12).b;
                    if (b7 != null) {
                        this.h(b7).d();
                    }
                }
            }
            else {
                final ArrayList d2 = dk3.d;
                for (int size3 = d2.size(), n13 = 0; n13 < size3; ++n13) {
                    final ei b8 = ((fq)d2.get(n13)).b;
                    if (b8 != null) {
                        this.h(b8).d();
                    }
                }
            }
        }
        this.F(this.i, true);
        final HashSet set = new HashSet();
        for (int n14 = i; n14 < n; ++n14) {
            final ArrayList d3 = list.get(n14).d;
            for (int size4 = d3.size(), n15 = 0; n15 < size4; ++n15) {
                final ei b9 = ((fq)d3.get(n15)).b;
                if (b9 != null) {
                    final ViewGroup n16 = b9.N;
                    if (n16 != null) {
                        set.add(gf.b(n16, this));
                    }
                }
            }
        }
        Object o = set.iterator();
        while (((Iterator)o).hasNext()) {
            final gf gf = (gf)((Iterator)o).next();
            gf.d = booleanValue;
            Object o2 = gf.b;
            synchronized (o2) {
                gf.d();
                for (int n17 = gf.b.size() - 1; n17 >= 0; --n17) {
                    final ge ge = gf.b.get(n17);
                    final int h = a.h(ge.a.O);
                    if (ge.e == 2 && h != 2) {
                        final ef r2 = ge.a.R;
                        break;
                    }
                }
                monitorexit(o2);
                if (!ik.T((View)gf.a)) {
                    gf.c();
                    gf.d = false;
                    continue;
                }
                synchronized (gf.b) {
                    if (!gf.b.isEmpty()) {
                        o2 = new ArrayList(gf.c);
                        gf.c.clear();
                        o2 = ((ArrayList)o2).iterator();
                        while (((Iterator)o2).hasNext()) {
                            final ge ge2 = (ge)((Iterator)o2).next();
                            if (R(2)) {
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("SpecialEffectsController: Cancelling operation ");
                                sb3.append(ge2);
                                sb3.toString();
                            }
                            ge2.d();
                            if (!ge2.d) {
                                gf.c.add(ge2);
                            }
                        }
                        gf.d();
                        final ArrayList list3 = new ArrayList(gf.b);
                        gf.b.clear();
                        gf.c.addAll(list3);
                        o2 = list3.iterator();
                        while (((Iterator)o2).hasNext()) {
                            ((ge)((Iterator)o2).next()).b();
                        }
                        final boolean d4 = gf.d;
                        final Iterator iterator = list3.iterator();
                        Object o3 = null;
                        o2 = null;
                        while (iterator.hasNext()) {
                            final ge ge3 = (ge)iterator.next();
                            final int h2 = a.h(ge3.a.O);
                            final int e = ge3.e;
                            if (e == 0) {
                                throw null;
                            }
                            switch (e - 1) {
                                case 1: {
                                    if (h2 == 2) {
                                        continue;
                                    }
                                    o3 = ge3;
                                    continue;
                                }
                                case 0:
                                case 2:
                                case 3: {
                                    if (h2 == 2 && o2 == null) {
                                        o2 = ge3;
                                        continue;
                                    }
                                    continue;
                                }
                            }
                        }
                        final ArrayList list4 = new ArrayList();
                        final ArrayList list5 = new ArrayList();
                        final ArrayList list6 = new ArrayList(list3);
                        for (final ge ge4 : list3) {
                            final aan aan = new aan();
                            ge4.e(aan);
                            list4.add(new du(ge4, aan, d4));
                            final aan aan2 = new aan();
                            ge4.e(aan2);
                            list5.add(new dw(ge4, aan2, d4, d4 ? (ge4 == o2) : (ge4 == o3)));
                            ge4.c(new do(list6, ge4));
                        }
                        o2 = o;
                        final HashMap hashMap = new HashMap();
                        o = list5.iterator();
                        while (((Iterator)o).hasNext()) {
                            final dw dw = (dw)((Iterator)o).next();
                            if (!dw.c()) {
                                dw.a(dw.c);
                                dw.a(dw.d);
                            }
                        }
                        final Iterator iterator3 = list5.iterator();
                        while (iterator3.hasNext()) {
                            o = iterator3.next();
                            hashMap.put(((dv)o).a, false);
                            ((dv)o).b();
                        }
                        final boolean containsValue = hashMap.containsValue(true);
                        final ViewGroup a3 = gf.a;
                        final Context context = a3.getContext();
                        final ArrayList<Object> list7 = (ArrayList<Object>)new ArrayList<du>();
                        o = list4.iterator();
                        boolean b10 = false;
                        while (((Iterator)o).hasNext()) {
                            final du du = (du)((Iterator)o).next();
                            if (du.c()) {
                                du.b();
                            }
                            else {
                                final en a4 = du.a(context);
                                if (a4 == null) {
                                    du.b();
                                }
                                else {
                                    final Animator b11 = a4.b;
                                    if (b11 == null) {
                                        list7.add(du);
                                    }
                                    else {
                                        final ge a5 = du.a;
                                        final ei a6 = a5.a;
                                        if (Boolean.TRUE.equals(hashMap.get(a5))) {
                                            if (R(2)) {
                                                final StringBuilder sb4 = new StringBuilder();
                                                sb4.append("Ignoring Animator set on ");
                                                sb4.append(a6);
                                                sb4.append(" as this Fragment was involved in a Transition.");
                                                sb4.toString();
                                            }
                                            du.b();
                                        }
                                        else {
                                            final boolean b12 = a5.e == 3;
                                            if (b12) {
                                                list6.remove(a5);
                                            }
                                            final View o4 = a6.O;
                                            a3.startViewTransition(o4);
                                            b11.addListener((Animator$AnimatorListener)new dp(a3, o4, b12, a5, du));
                                            b11.setTarget((Object)o4);
                                            b11.start();
                                            du.b.a(new dq(b11));
                                            b10 = true;
                                        }
                                    }
                                }
                            }
                        }
                        for (int size5 = list7.size(), n18 = 0; n18 < size5; ++n18) {
                            o = list7.get(n18);
                            final ge a7 = ((dv)o).a;
                            final ei a8 = a7.a;
                            if (containsValue) {
                                if (R(2)) {
                                    final StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Ignoring Animation set on ");
                                    sb5.append(a8);
                                    sb5.append(" as Animations cannot run alongside Transitions.");
                                    sb5.toString();
                                }
                                ((dv)o).b();
                            }
                            else if (b10) {
                                if (R(2)) {
                                    final StringBuilder sb6 = new StringBuilder();
                                    sb6.append("Ignoring Animation set on ");
                                    sb6.append(a8);
                                    sb6.append(" as Animations cannot run alongside Animators.");
                                    sb6.toString();
                                }
                                ((dv)o).b();
                            }
                            else {
                                final View o5 = a8.O;
                                final en a9 = ((du)o).a(context);
                                hh.d(a9);
                                final Animation a10 = a9.a;
                                hh.d(a10);
                                if (a7.e != 1) {
                                    o5.startAnimation(a10);
                                    ((dv)o).b();
                                }
                                else {
                                    a3.startViewTransition(o5);
                                    final eo eo = new eo(a10, a3, o5);
                                    ((Animation)eo).setAnimationListener((Animation$AnimationListener)new ds(a3, o5, (du)o));
                                    o5.startAnimation((Animation)eo);
                                }
                                ((dv)o).b.a(new dt(o5, a3, (du)o));
                            }
                        }
                        for (int size6 = list6.size(), n19 = 0; n19 < size6; ++n19) {
                            gf.f((ge)list6.get(n19));
                        }
                        list6.clear();
                        gf.d = false;
                        o = o2;
                    }
                }
            }
            break;
        }
        while (i < n) {
            final dk dk4 = list.get(i);
            if (list2.get(i)) {
                if (dk4.c >= 0) {
                    dk4.c = -1;
                }
            }
            ++i;
        }
    }
    
    private final void aj(final ArrayList list, final ArrayList list2) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == list2.size()) {
            final int size = list.size();
            int i = 0;
            int n = 0;
            while (i < size) {
                if (!((dk)list.get(i)).r) {
                    if (n != i) {
                        this.ai(list, list2, n, i);
                    }
                    int n2;
                    n = (n2 = i + 1);
                    if (list2.get(i)) {
                        while ((n = n2) < size) {
                            n = n2;
                            if (!(boolean)list2.get(n2)) {
                                break;
                            }
                            n = n2;
                            if (((dk)list.get(n2)).r) {
                                break;
                            }
                            ++n2;
                        }
                    }
                    this.ai(list, list2, i, n);
                    i = n - 1;
                }
                ++i;
            }
            if (n != size) {
                this.ai(list, list2, n, size);
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }
    
    private final void ak(final ei ei) {
        final ViewGroup ab = this.ab(ei);
        if (ab != null && ei.o() + ei.p() + ei.q() + ei.r() > 0) {
            if (ab.getTag(2131428142) == null) {
                ab.setTag(2131428142, (Object)ei);
            }
            ((ei)ab.getTag(2131428142)).N(ei.P());
        }
    }
    
    private final void al() {
        for (final fo fo : this.a.e()) {
            final ei c = fo.c;
            if (c.P) {
                if (this.v) {
                    this.C = true;
                }
                else {
                    c.P = false;
                    fo.d();
                }
            }
        }
    }
    
    static ei e(final View view) {
        final Object tag = view.getTag(2131427616);
        if (tag instanceof ei) {
            return (ei)tag;
        }
        return null;
    }
    
    final void A() {
        this.r = true;
        this.t.i = true;
        this.z(4);
    }
    
    public final void B(final String s, FileDescriptor u, final PrintWriter printWriter, final String[] array) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("    ");
        final String string = sb.toString();
        final fp a = this.a;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append("    ");
        final String string2 = sb2.toString();
        if (!a.b.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Active Fragments:");
            for (final fo fo : a.b.values()) {
                printWriter.print(s);
                if (fo != null) {
                    final ei c = fo.c;
                    printWriter.println(c);
                    c.B(string2, u, printWriter, array);
                }
                else {
                    printWriter.println("null");
                }
            }
        }
        final int size = a.a.size();
        final int n = 0;
        if (size > 0) {
            printWriter.print(s);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; ++i) {
                final ei ei = a.a.get(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(ei.toString());
            }
        }
        final ArrayList w = this.w;
        if (w != null) {
            final int size2 = w.size();
            if (size2 > 0) {
                printWriter.print(s);
                printWriter.println("Fragments Created Menus:");
                for (int j = 0; j < size2; ++j) {
                    final ei ei2 = this.w.get(j);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(j);
                    printWriter.print(": ");
                    printWriter.println(ei2.toString());
                }
            }
        }
        final ArrayList b = this.b;
        if (b != null) {
            final int size3 = b.size();
            if (size3 > 0) {
                printWriter.print(s);
                printWriter.println("Back Stack:");
                for (int k = 0; k < size3; ++k) {
                    final dk dk = this.b.get(k);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(k);
                    printWriter.print(": ");
                    printWriter.println(dk.toString());
                    dk.c(string, printWriter);
                }
            }
        }
        printWriter.print(s);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Back Stack Index: ");
        sb3.append(this.f.get());
        printWriter.println(sb3.toString());
        u = (FileDescriptor)this.u;
        monitorenter(u);
        try {
            final int size4 = this.u.size();
            if (size4 > 0) {
                printWriter.print(s);
                printWriter.println("Pending Actions:");
                for (int l = n; l < size4; ++l) {
                    final fg fg = this.u.get(l);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(l);
                    printWriter.print(": ");
                    printWriter.println(fg);
                }
            }
            monitorexit(u);
            printWriter.print(s);
            printWriter.println("FragmentManager misc state:");
            printWriter.print(s);
            printWriter.print("  mHost=");
            printWriter.println(this.j);
            printWriter.print(s);
            printWriter.print("  mContainer=");
            printWriter.println(this.k);
            if (this.l != null) {
                printWriter.print(s);
                printWriter.print("  mParent=");
                printWriter.println(this.l);
            }
            printWriter.print(s);
            printWriter.print("  mCurState=");
            printWriter.print(this.i);
            printWriter.print(" mStateSaved=");
            printWriter.print(this.q);
            printWriter.print(" mStopped=");
            printWriter.print(this.r);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.s);
            if (this.p) {
                printWriter.print(s);
                printWriter.print("  mNeedMenuInvalidate=");
                printWriter.println(this.p);
            }
        }
        finally {
            monitorexit(u);
            while (true) {}
        }
    }
    
    final void C(final fg fg, final boolean b) {
        if (!b) {
            if (this.j == null) {
                if (this.s) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            else {
                this.ad();
            }
        }
        synchronized (this.u) {
            if (this.j == null) {
                if (b) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            else {
                this.u.add(fg);
                synchronized (this.u) {
                    if (this.u.size() == 1) {
                        this.j.d.removeCallbacks(this.G);
                        this.j.d.post(this.G);
                        this.M();
                    }
                }
            }
        }
    }
    
    final void D(final fg fg, final boolean b) {
        if (b && (this.j == null || this.s)) {
            return;
        }
        this.ah(b);
        fg.e(this.D, this.E);
        this.v = true;
        try {
            this.aj(this.D, this.E);
            this.ae();
            this.M();
            this.af();
            this.a.h();
        }
        finally {
            this.ae();
        }
    }
    
    final void E(final ei ei) {
        if (R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(ei);
            sb.toString();
        }
        if (!ei.H) {
            ei.H = true;
            ei.S ^= true;
            this.ak(ei);
        }
    }
    
    final void F(int i, final boolean b) {
        if (this.j == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!b && i == this.i) {
            return;
        }
        this.i = i;
        final fp a = this.a;
        final ArrayList a2 = a.a;
        int size;
        fo fo;
        for (size = a2.size(), i = 0; i < size; ++i) {
            fo = a.b.get(((ei)a2.get(i)).m);
            if (fo != null) {
                fo.d();
            }
        }
        for (final fo fo2 : a.b.values()) {
            if (fo2 != null) {
                fo2.d();
                final ei c = fo2.c;
                if (!c.t || c.R()) {
                    continue;
                }
                final boolean u = c.u;
                a.j(fo2);
            }
        }
        this.al();
        if (this.p) {
            final et j = this.j;
            if (j != null && this.i == 7) {
                ((el)j).a.f();
                this.p = false;
            }
        }
    }
    
    final void G() {
        if (this.j == null) {
            return;
        }
        this.q = false;
        this.r = false;
        this.t.i = false;
        for (final ei ei : this.a.f()) {
            if (ei != null) {
                ei.C.G();
            }
        }
    }
    
    final void H(final ei ei) {
        if (R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(ei);
            sb.append(" nesting=");
            sb.append(ei.z);
            sb.toString();
        }
        final boolean r = ei.R();
        if (ei.I && !(r ^ true)) {
            return;
        }
        this.a.k(ei);
        if (V(ei)) {
            this.p = true;
        }
        ei.t = true;
        this.ak(ei);
    }
    
    final void I(final Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        final fj fj = (fj)parcelable;
        final ArrayList a = fj.a;
        if (a == null) {
            return;
        }
        final fp a2 = this.a;
        a2.c.clear();
        final int size = a.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final fm fm = (fm)a.get(i);
            a2.c.put(fm.b, fm);
        }
        this.a.b.clear();
        final ArrayList b = fj.b;
        for (int size2 = b.size(), j = 0; j < size2; ++j) {
            final fm c = this.a.c((String)b.get(j), null);
            if (c != null) {
                final ei ei = this.t.d.get(c.b);
                fo fo;
                if (ei != null) {
                    if (R(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(ei);
                        sb.toString();
                    }
                    fo = new fo(this.g, this.a, ei, c);
                }
                else {
                    fo = new fo(this.g, this.a, this.j.c.getClassLoader(), this.f(), c);
                }
                final ei c2 = fo.c;
                c2.A = this;
                if (R(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(c2.m);
                    sb2.append("): ");
                    sb2.append(c2);
                    sb2.toString();
                }
                fo.e(this.j.c.getClassLoader());
                this.a.i(fo);
                fo.d = this.i;
            }
        }
        for (final ei ei2 : new ArrayList(this.t.d.values())) {
            if (!this.a.l(ei2.m)) {
                if (R(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(ei2);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(fj.b);
                    sb3.toString();
                }
                this.t.c(ei2);
                ei2.A = this;
                final fo fo2 = new fo(this.g, this.a, ei2);
                fo2.d = 1;
                fo2.d();
                ei2.t = true;
                fo2.d();
            }
        }
        final fp a3 = this.a;
        final ArrayList c3 = fj.c;
        a3.a.clear();
        if (c3 != null) {
            for (final String s : c3) {
                final ei a4 = a3.a(s);
                if (a4 == null) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("No instantiated fragment for (");
                    sb4.append(s);
                    sb4.append(")");
                    throw new IllegalStateException(sb4.toString());
                }
                if (R(2)) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("restoreSaveState: added (");
                    sb5.append(s);
                    sb5.append("): ");
                    sb5.append(a4);
                    sb5.toString();
                }
                a3.g(a4);
            }
        }
        final dl[] d = fj.d;
        if (d != null) {
            this.b = new ArrayList(d.length);
            int n2 = 0;
            while (true) {
                final dl[] d2 = fj.d;
                if (n2 >= d2.length) {
                    break;
                }
                final dl dl = d2[n2];
                final dk dk = new dk(this);
                int k = 0;
                int n3 = 0;
                while (k < dl.a.length) {
                    final fq fq = new fq();
                    final int n4 = k + 1;
                    fq.a = dl.a[k];
                    if (R(2)) {
                        final StringBuilder sb6 = new StringBuilder();
                        sb6.append("Instantiate ");
                        sb6.append(dk);
                        sb6.append(" op #");
                        sb6.append(n3);
                        sb6.append(" base fragment #");
                        sb6.append(dl.a[n4]);
                        sb6.toString();
                    }
                    fq.h = h.values()[dl.c[n3]];
                    fq.i = h.values()[dl.d[n3]];
                    final int[] a5 = dl.a;
                    final int n5 = n4 + 1;
                    fq.c = (a5[n4] != 0);
                    final int n6 = n5 + 1;
                    final int n7 = a5[n5];
                    fq.d = n7;
                    final int n8 = n6 + 1;
                    final int n9 = a5[n6];
                    fq.e = n9;
                    final int n10 = n8 + 1;
                    final int n11 = a5[n8];
                    fq.f = n11;
                    final int n12 = a5[n10];
                    fq.g = n12;
                    dk.e = n7;
                    dk.f = n9;
                    dk.g = n11;
                    dk.h = n12;
                    dk.k(fq);
                    ++n3;
                    k = n10 + 1;
                }
                dk.i = dl.e;
                dk.k = dl.f;
                dk.j = true;
                dk.l = dl.h;
                dk.m = dl.i;
                dk.n = dl.j;
                dk.o = dl.k;
                dk.p = dl.l;
                dk.q = dl.m;
                dk.r = dl.n;
                dk.c = dl.g;
                for (int l = 0; l < dl.b.size(); ++l) {
                    final String s2 = dl.b.get(l);
                    if (s2 != null) {
                        dk.d.get(l).b = this.b(s2);
                    }
                }
                dk.a(1);
                if (R(2)) {
                    final StringBuilder sb7 = new StringBuilder();
                    sb7.append("restoreAllState: back stack #");
                    sb7.append(n2);
                    sb7.append(" (index ");
                    sb7.append(dk.c);
                    sb7.append("): ");
                    sb7.append(dk);
                    sb7.toString();
                    final PrintWriter printWriter = new PrintWriter(new fv());
                    dk.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.b.add(dk);
                ++n2;
            }
        }
        else {
            this.b = null;
        }
        this.f.set(fj.e);
        final String f = fj.f;
        if (f != null) {
            this.u(this.m = this.b(f));
        }
        final ArrayList g = fj.g;
        if (g != null) {
            for (int n13 = 0; n13 < g.size(); ++n13) {
                this.x.put(g.get(n13), fj.h.get(n13));
            }
        }
        final ArrayList m = fj.i;
        if (m != null) {
            for (int n14 = n; n14 < m.size(); ++n14) {
                final Bundle bundle = fj.j.get(n14);
                bundle.setClassLoader(this.j.c.getClassLoader());
                this.y.put(m.get(n14), bundle);
            }
        }
        this.o = new ArrayDeque(fj.k);
    }
    
    final void J(final ei ei, final boolean b) {
        final ViewGroup ab = this.ab(ei);
        if (ab != null && ab instanceof eq) {
            ((eq)ab).a = (b ^ true);
        }
    }
    
    final void K(final ei ei, final h w) {
        if (ei.equals(this.b(ei.m)) && (ei.B == null || ei.A == this)) {
            ei.W = w;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(ei);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }
    
    final void L(final ei m) {
        if (m != null && (!m.equals(this.b(m.m)) || (m.B != null && m.A != this))) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(m);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        final ei i = this.m;
        this.m = m;
        this.u(i);
        this.u(this.m);
    }
    
    public final void M() {
        Object o = this.u;
        synchronized (o) {
            final boolean empty = this.u.isEmpty();
            boolean a = true;
            if (!empty) {
                this.e.a = true;
                return;
            }
            monitorexit(o);
            o = this.e;
            final ArrayList b = this.b;
            if (b == null || b.size() <= 0 || !this.S(this.l)) {
                a = false;
            }
            ((wf)o).a = a;
        }
    }
    
    final boolean N(final MenuItem menuItem) {
        if (this.i <= 0) {
            return false;
        }
        for (final ei ei : this.a.f()) {
            if (ei != null && !ei.H && ei.C.N(menuItem)) {
                return true;
            }
        }
        return false;
    }
    
    final boolean O(final Menu menu, final MenuInflater menuInflater) {
        final int i = this.i;
        int j = 0;
        if (i <= 0) {
            return false;
        }
        final Iterator iterator = this.a.f().iterator();
        ArrayList<ei> w = null;
        boolean b = false;
        while (iterator.hasNext()) {
            final ei ei = (ei)iterator.next();
            if (ei != null && W(ei) && !ei.H && ei.C.O(menu, menuInflater)) {
                if (w == null) {
                    w = new ArrayList<ei>();
                }
                w.add(ei);
                b = true;
            }
        }
        if (this.w != null) {
            while (j < this.w.size()) {
                final ei ei2 = this.w.get(j);
                if (w != null) {
                    w.contains(ei2);
                }
                ++j;
            }
        }
        this.w = w;
        return b;
    }
    
    final boolean P(final MenuItem menuItem) {
        if (this.i <= 0) {
            return false;
        }
        for (final ei ei : this.a.f()) {
            if (ei != null && !ei.H && ei.C.P(menuItem)) {
                return true;
            }
        }
        return false;
    }
    
    final boolean Q(final Menu menu) {
        final int i = this.i;
        boolean b = false;
        if (i <= 0) {
            return false;
        }
        for (final ei ei : this.a.f()) {
            if (ei != null && W(ei) && !ei.H && ei.C.Q(menu)) {
                b = true;
            }
        }
        return b;
    }
    
    final boolean S(final ei ei) {
        if (ei == null) {
            return true;
        }
        final fi a = ei.A;
        return ei.equals(a.m) && this.S(a.l);
    }
    
    public final boolean T() {
        return this.q || this.r;
    }
    
    public final boolean U() {
        this.Z(false);
        boolean x = true;
        this.ah(true);
        final ei m = this.m;
        if (m == null || !m.w().U()) {
            x = this.X(this.D, this.E, -1, 0);
            if (x) {
                this.v = true;
                try {
                    this.aj(this.D, this.E);
                }
                finally {
                    this.ae();
                }
            }
            this.M();
            this.af();
            this.a.h();
        }
        return x;
    }
    
    final boolean X(final ArrayList list, final ArrayList list2, int n, int i) {
        final ArrayList b = this.b;
        Label_0181: {
            if (b != null) {
                if (b.isEmpty()) {
                    n = -1;
                    break Label_0181;
                }
                if (n < 0) {
                    if (i != 0) {
                        n = 0;
                        break Label_0181;
                    }
                    n = this.b.size() - 1;
                    break Label_0181;
                }
                else {
                    int j;
                    for (j = this.b.size() - 1; j >= 0 && n != ((dk)this.b.get(j)).c; --j) {}
                    if (j < 0) {
                        n = j;
                        break Label_0181;
                    }
                    if (i != 0) {
                        while (j > 0) {
                            i = j - 1;
                            if (n != this.b.get(i).c) {
                                break;
                            }
                            j = i;
                        }
                        n = j;
                        break Label_0181;
                    }
                    if (j != this.b.size() - 1) {
                        n = j + 1;
                        break Label_0181;
                    }
                }
            }
            n = -1;
        }
        if (n < 0) {
            return false;
        }
        for (i = this.b.size() - 1; i >= n; --i) {
            list.add(this.b.remove(i));
            list2.add(true);
        }
        return true;
    }
    
    public final void Z(final boolean b) {
        this.ah(b);
        while (true) {
            final ArrayList d = this.D;
            final ArrayList e = this.E;
            final ArrayList u = this.u;
            monitorenter(u);
            try {
                Label_0156: {
                    if (this.u.isEmpty()) {
                        monitorexit(u);
                        break Label_0156;
                    }
                    try {
                        final int size = this.u.size();
                        int i = 0;
                        boolean b2 = false;
                        while (i < size) {
                            b2 |= this.u.get(i).e(d, e);
                            ++i;
                        }
                        this.u.clear();
                        this.j.d.removeCallbacks(this.G);
                        monitorexit(u);
                        if (b2) {
                            this.v = true;
                            try {
                                this.aj(this.D, this.E);
                                continue;
                            }
                            finally {
                                this.ae();
                            }
                        }
                        this.M();
                        this.af();
                        this.a.h();
                    }
                    finally {
                        this.u.clear();
                        this.j.d.removeCallbacks(this.G);
                    }
                }
            }
            finally {
                monitorexit(u);
                while (true) {}
            }
        }
    }
    
    final Parcelable a() {
        for (gf gf : this.ac()) {}
        this.ag();
        this.Z(true);
        this.q = true;
        this.t.i = true;
        final fp a = this.a;
        final ArrayList b = new ArrayList<String>(a.b.size());
        final Iterator iterator2 = a.b.values().iterator();
        int i;
        dl[] d;
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            i = 0;
            d = null;
            final Bundle bundle = null;
            if (!hasNext) {
                break;
            }
            final fo fo = (fo)iterator2.next();
            if (fo == null) {
                continue;
            }
            final ei c = fo.c;
            final fm fm = new fm(c);
            final ei c2 = fo.c;
            if (c2.h >= 0 && fm.m == null) {
                Bundle bundle2 = new Bundle();
                final ei c3 = fo.c;
                c3.h(bundle2);
                c3.Z.c(bundle2);
                final Parcelable a2 = c3.C.a();
                if (a2 != null) {
                    bundle2.putParcelable("android:support:fragments", a2);
                }
                fo.a.j(fo.c, bundle2, false);
                if (bundle2.isEmpty()) {
                    bundle2 = bundle;
                }
                if (fo.c.O != null) {
                    fo.f();
                }
                Bundle bundle3 = bundle2;
                if (fo.c.j != null) {
                    if ((bundle3 = bundle2) == null) {
                        bundle3 = new Bundle();
                    }
                    bundle3.putSparseParcelableArray("android:view_state", fo.c.j);
                }
                Bundle bundle4 = bundle3;
                if (fo.c.k != null) {
                    if ((bundle4 = bundle3) == null) {
                        bundle4 = new Bundle();
                    }
                    bundle4.putBundle("android:view_registry_state", fo.c.k);
                }
                Bundle m = bundle4;
                if (!fo.c.Q) {
                    if ((m = bundle4) == null) {
                        m = new Bundle();
                    }
                    m.putBoolean("android:user_visible_hint", fo.c.Q);
                }
                fm.m = m;
                if (fo.c.p != null) {
                    if (fm.m == null) {
                        fm.m = new Bundle();
                    }
                    fm.m.putString("android:target_state", fo.c.p);
                    final int q = fo.c.q;
                    if (q != 0) {
                        fm.m.putInt("android:target_req_state", q);
                    }
                }
            }
            else {
                fm.m = c2.i;
            }
            fo.b.c(fo.c.m, fm);
            b.add(c.m);
            if (!R(2)) {
                continue;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Saved state of ");
            sb.append(c);
            sb.append(": ");
            sb.append(c.i);
            sb.toString();
        }
        final ArrayList a3 = new ArrayList(this.a.c.values());
        if (a3.isEmpty()) {
            return null;
        }
        final fp a4 = this.a;
        Object o = a4.a;
        monitorenter(o);
        try {
            ArrayList c4;
            if (a4.a.isEmpty()) {
                monitorexit(o);
                c4 = null;
            }
            else {
                c4 = new ArrayList(a4.a.size());
                for (final ei ei : a4.a) {
                    c4.add(ei.m);
                    if (R(2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("saveAllState: adding fragment (");
                        sb2.append(ei.m);
                        sb2.append("): ");
                        sb2.append(ei);
                        sb2.toString();
                    }
                }
                monitorexit(o);
            }
            o = this.b;
            if (o != null) {
                final int size = ((ArrayList)o).size();
                if (size > 0) {
                    d = new dl[size];
                    while (i < size) {
                        d[i] = new dl(this.b.get(i));
                        if (R(2)) {
                            o = new StringBuilder();
                            ((StringBuilder)o).append("saveAllState: adding back stack #");
                            ((StringBuilder)o).append(i);
                            ((StringBuilder)o).append(": ");
                            ((StringBuilder)o).append(this.b.get(i));
                            ((StringBuilder)o).toString();
                        }
                        ++i;
                    }
                }
            }
            o = new fj();
            ((fj)o).a = a3;
            ((fj)o).b = b;
            ((fj)o).c = c4;
            ((fj)o).d = d;
            ((fj)o).e = this.f.get();
            final ei j = this.m;
            if (j != null) {
                ((fj)o).f = j.m;
            }
            ((fj)o).g.addAll(this.x.keySet());
            ((fj)o).h.addAll(this.x.values());
            ((fj)o).i.addAll(this.y.keySet());
            ((fj)o).j.addAll(this.y.values());
            ((fj)o).k = new ArrayList(this.o);
            return (Parcelable)o;
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    final fw aa() {
        final ei l = this.l;
        if (l != null) {
            return l.A.aa();
        }
        return this.H;
    }
    
    final ei b(final String s) {
        return this.a.a(s);
    }
    
    public final ei c(final int n) {
        final fp a = this.a;
        for (int i = a.a.size() - 1; i >= 0; --i) {
            final ei c = a.a.get(i);
            if (c != null && c.E == n) {
                return c;
            }
        }
        for (final fo fo : a.b.values()) {
            if (fo != null) {
                final ei c = fo.c;
                if (c.E == n) {
                    return c;
                }
                continue;
            }
        }
        return null;
    }
    
    public final ei d(final String s) {
        final fp a = this.a;
        for (int i = a.a.size() - 1; i >= 0; --i) {
            final ei ei = a.a.get(i);
            if (ei != null && s.equals(ei.G)) {
                return ei;
            }
        }
        for (final fo fo : a.b.values()) {
            if (fo != null) {
                final ei c = fo.c;
                if (s.equals(c.G)) {
                    return c;
                }
                continue;
            }
        }
        return null;
    }
    
    public final es f() {
        final ei l = this.l;
        if (l != null) {
            return l.A.f();
        }
        return this.z;
    }
    
    final fo g(final ei ei) {
        final String v = ei.V;
        if (v != null) {
            adc.a(ei, v);
        }
        if (R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(ei);
            sb.toString();
        }
        final fo h = this.h(ei);
        ei.A = this;
        this.a.i(h);
        if (!ei.I) {
            this.a.g(ei);
            ei.t = false;
            if (ei.O == null) {
                ei.S = false;
            }
            if (V(ei)) {
                this.p = true;
            }
        }
        return h;
    }
    
    final fo h(final ei ei) {
        final fo d = this.a.d(ei.m);
        if (d != null) {
            return d;
        }
        final fo fo = new fo(this.g, this.a, ei);
        fo.e(this.j.c.getClassLoader());
        fo.d = this.i;
        return fo;
    }
    
    public final fr i() {
        return new dk(this);
    }
    
    public final void j(final fl fl) {
        this.h.add(fl);
    }
    
    final void k(et j, final ep k, final ei l) {
        if (this.j == null) {
            this.j = j;
            this.k = k;
            if ((this.l = l) != null) {
                this.j(new fb());
            }
            else if (j instanceof fl) {
                this.j((fl)j);
            }
            if (this.l != null) {
                this.M();
            }
            if (j instanceof wi) {
                final wh h = ((el)j).a.h;
                this.d = h;
                Object o;
                if (l != null) {
                    o = l;
                }
                else {
                    o = j;
                }
                final wf e = this.e;
                final i ad = ((k)o).aD();
                if (ad.a != h.a) {
                    e.a(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(h, ad, e));
                }
            }
            if (l != null) {
                final fk t = l.A.t;
                fk t2 = t.e.get(l.m);
                if (t2 == null) {
                    t2 = new fk(t.g);
                    t.e.put(l.m, t2);
                }
                this.t = t2;
            }
            else if (j instanceof ad) {
                this.t = (fk)a.a(fk.class, fk.c, ((ad)j).bg());
            }
            else {
                this.t = new fk(false);
            }
            this.t.i = this.T();
            this.a.d = this.t;
            j = this.j;
            if (j instanceof aex && l == null) {
                final aev a = ((aex)j).A();
                a.b("android:support:fragments", new ey(this));
                final Bundle a2 = a.a("android:support:fragments");
                if (a2 != null) {
                    this.I(a2.getParcelable("android:support:fragments"));
                }
            }
            j = this.j;
            if (j instanceof wq) {
                final wp i = ((el)j).a.i;
                String string;
                if (l != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(l.m);
                    sb.append(":");
                    string = sb.toString();
                }
                else {
                    string = "";
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("FragmentManager:");
                sb2.append(string);
                final String string2 = sb2.toString();
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append("StartActivityForResult");
                this.n = i.a(sb3.toString(), new wv(), new fc(this, 1));
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string2);
                sb4.append("StartIntentSenderForResult");
                this.A = i.a(sb4.toString(), new fe(), new fc(this));
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string2);
                sb5.append("RequestPermissions");
                this.B = i.a(sb5.toString(), new wu(), new fd(this));
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }
    
    final void l(final ei ei) {
        if (R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(ei);
            sb.toString();
        }
        if (ei.I) {
            ei.I = false;
            if (!ei.s) {
                this.a.g(ei);
                if (R(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(ei);
                    sb2.toString();
                }
                if (V(ei)) {
                    this.p = true;
                }
            }
        }
    }
    
    final void m(final ei ei) {
        if (R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(ei);
            sb.toString();
        }
        if (!ei.I) {
            ei.I = true;
            if (ei.s) {
                if (R(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(ei);
                    sb2.toString();
                }
                this.a.k(ei);
                if (V(ei)) {
                    this.p = true;
                }
                this.ak(ei);
            }
        }
    }
    
    final void n() {
        this.q = false;
        this.r = false;
        this.t.i = false;
        this.z(4);
    }
    
    final void o(final Configuration configuration) {
        for (final ei ei : this.a.f()) {
            if (ei != null) {
                ei.onConfigurationChanged(configuration);
                ei.C.o(configuration);
            }
        }
    }
    
    final void p() {
        this.q = false;
        this.r = false;
        this.t.i = false;
        this.z(1);
    }
    
    final void q() {
        this.Z(this.s = true);
        this.ag();
        final et j = this.j;
        boolean h;
        if (j instanceof ad) {
            h = this.a.d.h;
        }
        else {
            h = (true ^ ((Activity)j.c).isChangingConfigurations());
        }
        if (h) {
            final Iterator iterator = this.x.values().iterator();
            while (iterator.hasNext()) {
                final Iterator iterator2 = ((dn)iterator.next()).a.iterator();
                while (iterator2.hasNext()) {
                    this.a.d.b((String)iterator2.next());
                }
            }
        }
        this.z(-1);
        this.j = null;
        this.k = null;
        this.l = null;
        if (this.d != null) {
            final Iterator iterator3 = this.e.b.iterator();
            while (iterator3.hasNext()) {
                ((vz)iterator3.next()).b();
            }
            this.d = null;
        }
        final wn n = this.n;
        if (n != null) {
            n.a();
            this.A.a();
            this.B.a();
        }
    }
    
    final void r() {
        for (final ei ei : this.a.f()) {
            if (ei != null) {
                ei.onLowMemory();
                ei.C.r();
            }
        }
    }
    
    final void s(final boolean b) {
        for (final ei ei : this.a.f()) {
            if (ei != null) {
                ei.C.s(b);
            }
        }
    }
    
    final void t(final Menu menu) {
        if (this.i <= 0) {
            return;
        }
        for (final ei ei : this.a.f()) {
            if (ei != null && !ei.H) {
                ei.C.t(menu);
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        final ei l = this.l;
        if (l != null) {
            sb.append(l.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.l)));
            sb.append("}");
        }
        else {
            final et j = this.j;
            if (j != null) {
                sb.append(j.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.j)));
                sb.append("}");
            }
            else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }
    
    public final void u(final ei ei) {
        if (ei != null && ei.equals(this.b(ei.m))) {
            final boolean s = ei.A.S(ei);
            final Boolean r = ei.r;
            if (r == null || r != s) {
                ei.r = s;
                final fi c = ei.C;
                c.M();
                c.u(c.m);
            }
        }
    }
    
    final void v() {
        this.z(5);
    }
    
    final void w(final boolean b) {
        for (final ei ei : this.a.f()) {
            if (ei != null) {
                ei.C.w(b);
            }
        }
    }
    
    final void x() {
        this.q = false;
        this.r = false;
        this.t.i = false;
        this.z(7);
    }
    
    final void y() {
        this.q = false;
        this.r = false;
        this.t.i = false;
        this.z(5);
    }
    
    public final void z(final int d) {
        try {
            this.v = true;
            for (final fo fo : this.a.b.values()) {
                if (fo != null) {
                    fo.d = d;
                }
            }
            this.F(d, false);
            final Iterator iterator2 = this.ac().iterator();
            while (iterator2.hasNext()) {
                ((gf)iterator2.next()).c();
            }
            this.v = false;
            this.Z(true);
        }
        finally {
            this.v = false;
            while (true) {}
        }
    }
}
