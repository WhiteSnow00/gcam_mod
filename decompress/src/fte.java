import android.os.Trace;
import java.util.Locale;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import com.google.android.apps.camera.moments.MomentsUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedDeque;
import android.os.Handler;
import java.util.Set;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fte implements fun, fvc, fve
{
    private float A;
    private final boolean B;
    private final boolean C;
    private boolean D;
    private boolean E;
    public final fkd a;
    public final krr b;
    public boolean c;
    public final Deque d;
    public final Deque e;
    public final Set f;
    public int g;
    public final Handler h;
    private final fup i;
    private final fqk j;
    private final ftk k;
    private final ftk l;
    private final oui m;
    private final pii n;
    private final fuu o;
    private final fva p;
    private final cxl q;
    private final dty r;
    private final gzu s;
    private final fqx t;
    private boolean u;
    private boolean v;
    private boolean w;
    private fur x;
    private fvn y;
    private final Deque z;
    
    public fte(final fup i, final fqk j, final ftk k, final ftk l, final oui m, final pii n, final fkd a, final fuu o, final fva p15, final cxl q, final dty r, final krr krr, final Handler h, final gzu s, final fqx t) {
        this.c = false;
        this.d = new ConcurrentLinkedDeque();
        this.e = new ConcurrentLinkedDeque();
        this.v = false;
        this.w = false;
        this.f = new HashSet();
        this.g = 0;
        this.z = new ConcurrentLinkedDeque();
        this.A = 0.0f;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.a = a;
        this.o = o;
        this.p = p15;
        this.q = q;
        this.r = r;
        this.b = krr.a("MomentsMainLoop");
        this.h = h;
        this.s = s;
        final boolean k2 = q.k(cxx.w);
        final boolean b = true;
        this.B = ((k2 && q.k(cxx.x)) || (q.k(cxx.y) && q.k(cxx.z)));
        this.C = (q.k(cxx.A) && q.k(cxx.B) && b);
        q.b();
        this.u = false;
        final cxo a2 = cxr.a;
        q.c();
        this.t = t;
    }
    
    private final int s(long n, final boolean b) {
        if (b) {
            final fup i = this.i;
            n /= i.d;
            return Math.min(Math.max((int)n, i.b), i.a);
        }
        return this.i.b;
    }
    
    private final long t(final fta fta) {
        long n = this.a.a();
        long longValue;
        if (fta.d.l()) {
            longValue = (long)fta.d.i();
        }
        else {
            longValue = n;
        }
        if (fta.d.m()) {
            n = (long)fta.d.j();
        }
        return TimeUnit.MILLISECONDS.convert(n - longValue, TimeUnit.NANOSECONDS);
    }
    
    private final ftd u(final fta fta, final List list) {
        final ftd ftd = new ftd();
        for (final fsz fsz : this.e) {
            if (fta.d.n(fsz.c())) {
                if (fsz.d()) {
                    ++ftd.g;
                }
                else if (fsz.a) {
                    ++ftd.a;
                }
                else if (fsz.b.g()) {
                    ++ftd.f;
                }
                else {
                    ++ftd.h;
                }
            }
        }
        for (final fqa fqa : list) {
            if (!fta.d.k(fqa.c())) {
                ++ftd.d;
            }
            else if (this.x(fqa)) {
                ++ftd.e;
            }
            else if (this.B && !this.u && (this.E || this.D) && !MomentsUtils.c(fqa, this.A, this.s, this.z)) {
                ++ftd.c;
            }
            else if (this.C && this.u && !MomentsUtils.b(fqa, this.s, this.z)) {
                ++ftd.c;
            }
            else {
                ++ftd.b;
            }
        }
        return ftd;
    }
    
    private static niz v(final niz niz, final long n) {
        if (niz.g() && (!niz.g() || (long)niz.c() <= n)) {
            return niz;
        }
        return niz.i(n);
    }
    
    private final void w() {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            for (final fta fta : this.d) {
                if (this.f.contains(fta.a)) {
                    list.add(fta);
                }
            }
            for (int size = list.size(), i = 0; i < size; ++i) {
                final fta fta2 = (fta)list.get(i);
                final krr b = this.b;
                final String value = String.valueOf(fta2.a);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 30);
                sb.append("track ");
                sb.append(value);
                sb.append(" is not HDR+; cancelling");
                b.b(sb.toString());
                this.c(fta2);
            }
            Label_1825: {
                if (this.v || this.w) {
                    final fur x = this.x;
                    final fvn y = this.y;
                    if (x != null && y != null) {
                        final Iterator iterator2 = this.e.iterator();
                        int n = 0;
                        boolean b2 = false;
                        int n2;
                        while (true) {
                            n2 = n;
                            if (!iterator2.hasNext()) {
                                break;
                            }
                            final fsz fsz = (fsz)iterator2.next();
                            if (!fsz.a) {
                                continue;
                            }
                            if (fsz.d()) {
                                b2 = true;
                            }
                            else {
                                ++n;
                            }
                        }
                        while (this.w || ((this.i.c || !b2) && n2 < ((fut)this.m.get()).a())) {
                            final krr b3 = this.b;
                            final StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("trying to add shots; currently in flight: ");
                            sb2.append(n2);
                            b3.b(sb2.toString());
                            if (this.w) {
                                this.b.b("... but ignoring counts since this is our last chance before shutdown");
                            }
                            final List b4 = this.j.b();
                            final ArrayList list2 = new ArrayList();
                            for (final fqa fqa : b4) {
                                final Long value2 = fqa.c();
                                final nqe e = nqe.e(value2, value2);
                                for (final fta fta3 : this.d) {
                                    if (fta3.d.n(e)) {
                                        if (!fta3.f) {
                                            final Iterator iterator5 = this.e.iterator();
                                            int n3 = 0;
                                            while (iterator5.hasNext()) {
                                                final fsz fsz2 = (fsz)iterator5.next();
                                                if (fta3.d.n(fsz2.c()) && fsz2.e() && (fsz2.a || fsz2.b.g())) {
                                                    ++n3;
                                                }
                                            }
                                            final int s = this.s(this.t(fta3), fta3.f);
                                            if (this.i.c && !fta3.d.m()) {
                                                final krr b5 = this.b;
                                                final String value3 = String.valueOf(fta3.d);
                                                final StringBuilder sb3 = new StringBuilder(String.valueOf(value3).length() + 140);
                                                sb3.append("Cannot launch alternative as this shot (");
                                                sb3.append(n3);
                                                sb3.append(") requires the full range (");
                                                sb3.append(value3);
                                                sb3.append(") of shots (and we have not reached that yet). Need to wait...");
                                                b5.b(sb3.toString());
                                                continue;
                                            }
                                            if (n3 >= s) {
                                                final krr b6 = this.b;
                                                final StringBuilder sb4 = new StringBuilder(90);
                                                sb4.append("Cannot launch alternative as we have already exceeded the max (");
                                                sb4.append(n3);
                                                sb4.append(" of ");
                                                sb4.append(s);
                                                sb4.append(")");
                                                b6.b(sb4.toString());
                                                continue;
                                            }
                                        }
                                        list2.add(fqa);
                                        final krr b7 = this.b;
                                        final String value4 = String.valueOf(fqa);
                                        final StringBuilder sb5 = new StringBuilder(String.valueOf(value4).length() + 22);
                                        sb5.append("found relevant burst! ");
                                        sb5.append(value4);
                                        b7.b(sb5.toString());
                                        break;
                                    }
                                }
                            }
                            final ArrayList list3 = new ArrayList();
                            for (int size2 = list2.size(), j = 0; j < size2; ++j) {
                                final fqa fqa2 = (fqa)list2.get(j);
                                if (!this.x(fqa2)) {
                                    final krr b8 = this.b;
                                    final String value5 = String.valueOf(fqa2);
                                    final StringBuilder sb6 = new StringBuilder(String.valueOf(value5).length() + 17);
                                    sb6.append("not yet created: ");
                                    sb6.append(value5);
                                    b8.b(sb6.toString());
                                    list3.add(fqa2);
                                }
                                else {
                                    final krr b9 = this.b;
                                    final String value6 = String.valueOf(fqa2);
                                    final StringBuilder sb7 = new StringBuilder(String.valueOf(value6).length() + 38);
                                    sb7.append("burst already processing (or failed): ");
                                    sb7.append(value6);
                                    b9.b(sb7.toString());
                                }
                            }
                            Collections.sort((List<Object>)list3, bzj.g);
                            if (list3.isEmpty()) {
                                this.b.g("Ran out of alternatives to launch.");
                                break;
                            }
                            fqa fqa3 = (fqa)list3.get(0);
                            Label_1312: {
                                if (!this.u) {
                                    if (this.E || this.D) {
                                        final int size3 = list3.size();
                                        int k = 0;
                                        while (true) {
                                            while (k < size3) {
                                                final fqa fqa4 = (fqa)list3.get(k);
                                                ++k;
                                                if (MomentsUtils.c(fqa4, this.A, this.s, this.z)) {
                                                    fqa3 = fqa4;
                                                    if (fqa4 == null) {
                                                        this.b.b("We do not have any burst that has good quality and large diversity.");
                                                        break Label_1825;
                                                    }
                                                    break Label_1312;
                                                }
                                            }
                                            final fqa fqa4 = null;
                                            continue;
                                        }
                                    }
                                }
                                else if (this.C) {
                                    final int size4 = list3.size();
                                    int l = 0;
                                    while (true) {
                                        while (l < size4) {
                                            final fqa fqa5 = (fqa)list3.get(l);
                                            if ((fqa5.e().g() || fqa5.f().g()) && MomentsUtils.b(fqa5, this.s, this.z)) {
                                                fqa3 = fqa5;
                                                if (fqa5 == null) {
                                                    break Label_1825;
                                                }
                                                break Label_1312;
                                            }
                                            else {
                                                ++l;
                                            }
                                        }
                                        final fqa fqa5 = null;
                                        continue;
                                    }
                                }
                            }
                            final kvs a = x.a(fqa3.c());
                            if (a == null) {
                                if (!this.w) {
                                    this.b.h("almost launched empty burst; aborting");
                                    break;
                                }
                                final krr b10 = this.b;
                                final long c = fqa3.c();
                                final StringBuilder sb8 = new StringBuilder(59);
                                sb8.append("inserting failed shots for timestamp <");
                                sb8.append(c);
                                sb8.append(">");
                                b10.b(sb8.toString());
                                final ftc ftc = new ftc(fqa3.c(), fqa3.b(), fqa3.a());
                                ftc.a = false;
                                this.e.add(ftc);
                            }
                            else {
                                final kvx b11 = a.b();
                                b11.getClass();
                                final long a2 = b11.a;
                                final krr b12 = this.b;
                                final StringBuilder sb9 = new StringBuilder(40);
                                sb9.append("adding launch frame ");
                                sb9.append(a2);
                                b12.b(sb9.toString());
                                Label_1542: {
                                    if (!this.u) {
                                        if (!this.B) {
                                            break Label_1542;
                                        }
                                    }
                                    else if (!this.C) {
                                        break Label_1542;
                                    }
                                    this.z.add(fqa3.d());
                                }
                                final Iterator iterator6 = this.e.iterator();
                                long n4 = Long.MAX_VALUE;
                                fsz fsz3 = null;
                                while (iterator6.hasNext()) {
                                    final fsz fsz4 = (fsz)iterator6.next();
                                    long n5;
                                    if (fsz4.d()) {
                                        final long e2 = fsz4.a().e;
                                        final kvx b13 = a.b();
                                        b13.getClass();
                                        final long abs = Math.abs(e2 - b13.a);
                                        n5 = n4;
                                        if (abs < n4) {
                                            n5 = abs;
                                            fsz3 = fsz4;
                                        }
                                    }
                                    else {
                                        n5 = n4;
                                    }
                                    n4 = n5;
                                }
                                ftb a3;
                                if (fsz3 != null) {
                                    a3 = fsz3.a();
                                }
                                else {
                                    a3 = null;
                                }
                                fvd d;
                                if (a3 == null) {
                                    this.b.b("Cannot associate main session with this burst, use the default setting.");
                                    d = new fvd(this.r.a().a(), false);
                                }
                                else {
                                    d = a3.d;
                                }
                                final ftc ftc2 = new ftc(fqa3.c(), fqa3.b(), fqa3.a());
                                ftc2.d = niz.i(System.currentTimeMillis());
                                ((fut)this.m.get()).b(a, y, d, new fsy(this, ftc2));
                                this.e.add(ftc2);
                                this.b.b("starting HDR+ session.");
                                ++n2;
                            }
                        }
                    }
                    else {
                        this.b.b("not launching new shots as most recent shot buffers are not available");
                    }
                }
            }
            long a4 = this.a.a();
            final ArrayList list4 = new ArrayList();
            for (final fta fta4 : this.d) {
                final krr b14 = this.b;
                final Locale us = Locale.US;
                final Comparable m = fta4.d.i();
                String string;
                if (fta4.d.m()) {
                    string = ((Long)fta4.d.j()).toString();
                }
                else {
                    string = "UNSPEC";
                }
                b14.g(String.format(us, "Considering track for finishing, %d to: %s", m, string));
                if (!fta4.d.m()) {
                    this.b.g("... but it doesn't have an upper bound yet");
                }
                else {
                    if (fta4.e) {
                        final krr b15 = this.b;
                        final String value7 = String.valueOf(fta4.a);
                        final StringBuilder sb10 = new StringBuilder(String.valueOf(value7).length() + 46);
                        sb10.append("Ending high-res track ");
                        sb10.append(value7);
                        sb10.append(" due to imminent timeout");
                        b15.h(sb10.toString());
                        final ftd u = this.u(fta4, this.j.b());
                        final krr b16 = this.b;
                        final String value8 = String.valueOf(u);
                        final StringBuilder sb11 = new StringBuilder(String.valueOf(value8).length() + 18);
                        sb11.append("Track timing out: ");
                        sb11.append(value8);
                        b16.h(sb11.toString());
                    }
                    else {
                        if ((long)fta4.d.j() > a4 && !this.w) {
                            final krr b17 = this.b;
                            final StringBuilder sb12 = new StringBuilder(88);
                            sb12.append("... but we might still have incoming frames (... latest timestamp: ");
                            sb12.append(a4);
                            sb12.append(")");
                            b17.b(sb12.toString());
                            continue;
                        }
                        final List b18 = this.j.b();
                        this.b.b(String.format(Locale.US, "%d bursts are available for launching track %s.", b18.size(), fta4.a));
                        final ftd u2 = this.u(fta4, b18);
                        this.b.b(u2.toString());
                        if (u2.a + u2.b > 0 && u2.f < this.s(this.t(fta4), fta4.f)) {
                            this.b.b("... but we're still waiting for frames");
                            continue;
                        }
                        this.b.b("... and we found no reason why not to finish");
                    }
                    final ArrayList list5 = new ArrayList();
                    niz niz = nii.a;
                    niz niz2 = nii.a;
                    for (final fsz fsz5 : this.e) {
                        if (fta4.d.n(fsz5.c())) {
                            final krr b19 = this.b;
                            final String value9 = String.valueOf(fsz5.c());
                            final String value10 = String.valueOf(fta4.d);
                            final int length = String.valueOf(value9).length();
                            final int length2 = String.valueOf(value10).length();
                            final long n6 = a4;
                            final StringBuilder sb13 = new StringBuilder(length + 46 + length2);
                            sb13.append("adding frame from burst: ");
                            sb13.append(value9);
                            sb13.append(" to track with range ");
                            sb13.append(value10);
                            b19.b(sb13.toString());
                            if (fsz5.d()) {
                                this.b.b("... actually, skipping it since it's from a main shot");
                            }
                            else if (!fsz5.b.g()) {
                                niz = v(niz, fsz5.b().c);
                                this.b.b("... actually, skipping it since it's still in flight");
                                a4 = n6;
                            }
                            else {
                                niz2 = v(niz2, fsz5.b().c);
                                list5.add(fsz5.b());
                                a4 = n6;
                            }
                        }
                    }
                    if (niz2.g() && niz.g()) {
                        if ((long)niz.c() < (long)niz2.c()) {
                            final krr b20 = this.b;
                            final String value11 = String.valueOf(niz.c());
                            final String value12 = String.valueOf(niz2.c());
                            final StringBuilder sb14 = new StringBuilder(String.valueOf(value11).length() + 90 + String.valueOf(value12).length());
                            sb14.append("earlier moments frame might drop: frame <");
                            sb14.append(value11);
                            sb14.append("> is still in flight, while frame <");
                            sb14.append(value12);
                            sb14.append("> is finished.");
                            b20.b(sb14.toString());
                        }
                    }
                    Collections.sort((List<Object>)list5, bzj.h);
                    final ArrayList list6 = new ArrayList();
                    final ArrayList list7 = new ArrayList();
                    final ArrayList list8 = new ArrayList();
                    for (final ftc ftc3 : list5) {
                        final lju k2 = ((lgb)ftc3.b.c()).k();
                        k2.getClass();
                        list6.add(k2);
                        list7.add(new fvh(k2.d(), ftc3.g));
                        njo.p(ftc3.d.g(), "Start time not available for Moments shot");
                        njo.p(ftc3.e.g(), "End time not available for finished Moments shot");
                        final long n7 = (long)ftc3.e.c() - (long)ftc3.d.c();
                        list8.add(n7);
                        final krr b21 = this.b;
                        final StringBuilder sb15 = new StringBuilder(56);
                        sb15.append("Moments HDR+ processing time in ms: ");
                        sb15.append(n7);
                        b21.b(sb15.toString());
                    }
                    final krr b22 = this.b;
                    final String value13 = String.valueOf(fta4.a);
                    final StringBuilder sb16 = new StringBuilder(String.valueOf(value13).length() + 32);
                    sb16.append("Sending frames for encoding for ");
                    sb16.append(value13);
                    b22.b(sb16.toString());
                    for (int size5 = list6.size(), n8 = 0; n8 < size5; ++n8) {
                        final lju lju = (lju)list6.get(n8);
                        final krr b23 = this.b;
                        final long d2 = lju.d();
                        final StringBuilder sb17 = new StringBuilder(45);
                        sb17.append("sent out for encoding: <");
                        sb17.append(d2 / 1000L);
                        sb17.append(">");
                        b23.b(sb17.toString());
                    }
                    final krr b24 = this.b;
                    final int size6 = list6.size();
                    final StringBuilder sb18 = new StringBuilder(48);
                    sb18.append("Setting stream with a set of ");
                    sb18.append(size6);
                    sb18.append(" frames.");
                    b24.b(sb18.toString());
                    for (int size7 = list6.size(), n9 = 0; n9 < size7; ++n9) {
                        fta4.b.a((lju)list6.get(n9));
                    }
                    fta4.b.close();
                    fta4.c.c(nns.j(list8));
                    this.o.d(fta4.a, list7);
                    list4.add(fta4);
                }
            }
            this.d.removeAll(list4);
            final long a5 = this.a.a();
            final ArrayList list9 = new ArrayList();
        Label_3417:
            for (final fsz fsz6 : this.e) {
                if (!fsz6.a) {
                    final Iterator iterator11 = this.d.iterator();
                    while (iterator11.hasNext()) {
                        if (((fta)iterator11.next()).d.n(fsz6.c())) {
                            continue Label_3417;
                        }
                    }
                    if (fsz6.c().n(nqe.c(-2000000000L + a5))) {
                        continue;
                    }
                    list9.add(fsz6);
                }
            }
            for (int size8 = list9.size(), n10 = 0; n10 < size8; ++n10) {
                final fsz fsz7 = (fsz)list9.get(n10);
                if (fsz7.b.g()) {
                    njo.p(fsz7.e(), "We shouldn't get results for main shots");
                    final krr b25 = this.b;
                    final long c2 = fsz7.b().c;
                    final StringBuilder sb19 = new StringBuilder(55);
                    sb19.append("Disposing of YUV frame from burst: ");
                    sb19.append(c2);
                    b25.b(sb19.toString());
                    ((lgb)fsz7.b.c()).l();
                }
                else {
                    this.b.b("... nothing to close as it never completed.");
                }
            }
            this.e.removeAll(list9);
            final Iterator iterator12 = this.e.iterator();
            float n11 = Float.MAX_VALUE;
            int n12 = 0;
            ftc b26 = null;
            while (iterator12.hasNext()) {
                final fsz fsz8 = (fsz)iterator12.next();
                if (!fsz8.a && !fsz8.d()) {
                    float f = n11;
                    if (fsz8.b().f < n11) {
                        f = fsz8.b().f;
                        b26 = fsz8.b();
                    }
                    ++n12;
                    n11 = f;
                }
            }
            long n13 = this.a.a();
            final Iterator iterator13 = this.d.iterator();
            long n14 = n13;
            while (iterator13.hasNext()) {
                final fta fta5 = (fta)iterator13.next();
                long longValue;
                if (fta5.d.l()) {
                    longValue = (long)fta5.d.i();
                }
                else {
                    longValue = n14;
                }
                final long min = Math.min(n14, longValue);
                long longValue2;
                if (fta5.d.m()) {
                    longValue2 = (long)fta5.d.j();
                }
                else {
                    longValue2 = n13;
                }
                n13 = Math.max(n13, longValue2);
                n14 = min;
            }
            if (n12 >= this.s(TimeUnit.MILLISECONDS.convert(n13 - n14, TimeUnit.NANOSECONDS), true)) {
                if (b26 != null) {
                    final krr b27 = this.b;
                    final long c3 = b26.c;
                    final StringBuilder sb20 = new StringBuilder(72);
                    sb20.append("YUV cap reached. Disposing of YUV frame from burst: ");
                    sb20.append(c3);
                    b27.b(sb20.toString());
                    if (b26.b.g()) {
                        ((lgb)b26.b.c()).l();
                    }
                    else {
                        this.b.b("... nothing to close as it never completed.");
                    }
                    this.e.remove(b26);
                    this.d(b26.c);
                }
            }
            if (this.d.isEmpty() && this.e.isEmpty() && this.g == 0) {
                if (this.y != null || this.x != null) {
                    this.b.b("nothing is in flight; cleaning up last parameters & buffers");
                }
                this.y = null;
                this.x = null;
            }
            final Iterator iterator14 = this.d.iterator();
            while (iterator14.hasNext()) {
                if (!((fta)iterator14.next()).d.m() && !this.c) {
                    this.c = true;
                    final Handler h = this.h;
                    final fsn fsn = new fsn(this);
                    final fup i2 = this.i;
                    h.postDelayed((Runnable)fsn, i2.d * i2.e);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final boolean x(final fqa fqa) {
        for (final fsz fsz : this.e) {
            if (fsz.e() && fsz.b().c == fqa.c()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final fvb a(final him him, final long n, final kra kra, final boolean u, final fuz fuz, final lup lup) {
        synchronized (this) {
            final krr b = this.b;
            final StringBuilder sb = new StringBuilder(44);
            sb.append("Microvideo started at <");
            sb.append(n);
            sb.append(">");
            b.b(sb.toString());
            this.u = u;
            boolean b2 = false;
            if (u) {
                final cxl q = this.q;
                final cxo a = cxw.a;
                q.b();
                if (!this.q.k(cxw.d)) {
                    b2 = true;
                }
            }
            if (this.p.a() != 1 && !b2) {
                this.q();
                final fqx t = this.t;
                fqw fqw;
                if (this.u) {
                    fqw = fqw.b;
                }
                else {
                    fqw = fqw.a;
                }
                t.c(fqw);
                fuz.a();
                final fta fta = new fta(him, fuz, u);
                fta.d = nqe.c(TimeUnit.NANOSECONDS.convert(n, TimeUnit.MICROSECONDS));
                this.d.addLast(fta);
                ftk ftk;
                if (this.u) {
                    ftk = this.l;
                }
                else {
                    ftk = this.k;
                }
                final fqq fqq = new fqq(ftk, lup, kra);
                frl b3;
                if ((u && this.q.k(cxx.j)) || (!u && this.q.k(cxx.k))) {
                    b3 = new fqp(fqq);
                }
                else {
                    b3 = fqq;
                }
                fta.b = b3;
                this.r();
                return new fsu(this, fta);
            }
            this.b.b("... but Moments is disabled by the switcher; ignoring.");
            this.o.d(him, nns.l());
            fuz.b();
            lup.close();
            return new fvf(1);
        }
    }
    
    @Override
    public final krc b() {
        this.h.post((Runnable)new fsn(this, 2));
        return new fsl(this);
    }
    
    public final void c(final fta fta) {
        fta.b.close();
        this.o.d(fta.a, nns.l());
        this.d.remove(fta);
    }
    
    public final void d(final long n) {
        for (final had had : this.z) {
            if (had.a == n) {
                this.z.remove(had);
                break;
            }
        }
    }
    
    public final void e() {
        for (final fsz fsz : this.e) {
            String s;
            if (fsz.e()) {
                s = Long.toString(fsz.b().c);
            }
            else {
                final long e = fsz.a().e;
                final StringBuilder sb = new StringBuilder(25);
                sb.append(e);
                sb.append(" est.");
                s = sb.toString();
            }
            final krr b = this.b;
            final Locale us = Locale.US;
            String s2;
            if (!fsz.e()) {
                s2 = "MAIN  ";
            }
            else {
                s2 = "MTS   ";
            }
            final boolean g = fsz.b.g();
            String s3 = "YES";
            String s4;
            if (!g) {
                s4 = "NO ";
            }
            else {
                s4 = "YES";
            }
            if (fsz.e()) {
                fsz.b();
            }
            if (!fsz.a) {
                s3 = "NO";
            }
            b.g(String.format(us, "   session; type: %s has_image: %s cancel: %s pending: %s timestamps: %s", s2, s4, "NO ", s3, s));
        }
        for (final fta fta : this.d) {
            final krr b2 = this.b;
            final Locale us2 = Locale.US;
            final Comparable i = fta.d.i();
            String string;
            if (fta.d.m()) {
                string = ((Long)fta.d.j()).toString();
            }
            else {
                string = "UNSPEC";
            }
            b2.g(String.format(us2, "   track from: %d to: %s uri: %s", i, string, fta.a));
        }
        final Iterator iterator3 = this.f.iterator();
        while (iterator3.hasNext()) {
            this.b.g(String.format(Locale.US, "not a HDR+ shot: %s", iterator3.next()));
        }
    }
    
    @Override
    public final void f(final him him) {
        this.h.post((Runnable)new fsp(this, him));
    }
    
    @Override
    public final void g(final him him) {
        monitorenter(this);
        try {
            final krr b = this.b;
            final String value = String.valueOf(him);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 50);
            sb.append("Track ");
            sb.append(value);
            sb.append(" just about to time out; trying to finish up");
            b.b(sb.toString());
            for (fta fta : this.d) {
                if (fta.a.equals(him)) {
                    fta.e = true;
                    this.b.b("... found it");
                    this.r();
                    monitorexit(this);
                    return;
                }
            }
            this.b.b("... probably done already");
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void h() {
        synchronized (this) {
            this.w = true;
            this.r();
        }
    }
    
    @Override
    public final void i(final fur fur, final gen gen) {
        this.h.post((Runnable)new fso(this, fur, gen, 1));
    }
    
    public final void j(final fur x, final gen gen) {
        monitorenter(this);
        try {
            this.b.b("HDR+ command finished; possibly launching Moments processing");
            this.v = true;
            this.x = x;
            this.y = gen.a;
            Label_0150: {
                if (gen.b.i() != hio.o) {
                    final him h = gen.b.h();
                    for (final fsz fsz : this.e) {
                        if (fsz.d() && fsz.a().c.equals(h)) {
                            break Label_0150;
                        }
                    }
                    this.f.add(h);
                    gen.a.f.c(new fsm(this, h));
                }
            }
            this.r();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void k(final fur fur, final gen gen) {
        this.h.post((Runnable)new fso(this, fur, gen));
    }
    
    public final void l(final fur x, final gen gen) {
        synchronized (this) {
            this.x = x;
            this.y = gen.a;
            this.v = false;
            this.z.clear();
            this.r();
        }
    }
    
    @Override
    public final void m(final him him, final long n) {
        this.h.post((Runnable)new fsq(this, him, n));
    }
    
    public final void n(final him him, final long n) {
        monitorenter(this);
        try {
            for (fsz fsz : this.e) {
                if (fsz.d() && fsz.a().c.equals(him)) {
                    njo.o(fsz.a);
                    final boolean g = fsz.b.g();
                    final boolean b = true;
                    njo.o(g ^ true);
                    if (this.B && !this.u) {
                        final fqa c = this.j.c(n);
                        final boolean b2 = c.f().g() && ((hat)c.f().c()).a.length > 0;
                        this.D = (!b2 && this.q.k(cxx.y) && this.q.k(cxx.z));
                        this.E = (b2 && this.q.k(cxx.w) && this.q.k(cxx.x) && b);
                        this.z.add(c.d());
                        this.A = c.a();
                    }
                    fsz.a = false;
                    final krr b3 = this.b;
                    final String value = String.valueOf(him);
                    final String value2 = String.valueOf(him);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 28 + String.valueOf(value2).length());
                    sb.append("Incoming YUV frame ");
                    sb.append(value);
                    sb.append(" CROSS : ");
                    sb.append(value2);
                    b3.b(sb.toString());
                    this.r();
                    monitorexit(this);
                    return;
                }
            }
            this.e();
            throw new RuntimeException("Too many incoming YUV shots; we didn't start this many");
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void o(final him him, final fvd fvd) {
        this.h.post((Runnable)new fsr(this, him, fvd, this.a.a()));
    }
    
    public final void p(final him him, final fvd fvd, final long n) {
        synchronized (this) {
            final ftb ftb = new ftb(n, fvd, him);
            this.e.add(ftb);
            final krr b = this.b;
            final String value = String.valueOf(ftb);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 17);
            sb.append("adding main shot ");
            sb.append(value);
            b.b(sb.toString());
            this.r();
        }
    }
    
    public final void q() {
        if (this.q.k(cxx.m)) {
            Trace.beginSection("Moments Prewarm");
            ((ful)this.n.get()).a();
            Trace.endSection();
        }
    }
    
    public final void r() {
        synchronized (this) {
            this.e();
            this.b.b("running update");
            this.w();
            this.e();
        }
    }
}
