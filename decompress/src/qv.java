import java.util.List;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qv implements Runnable
{
    public static final ThreadLocal a;
    static final Comparator b;
    public final ArrayList c;
    long d;
    public long e;
    private final ArrayList f;
    
    static {
        a = new ThreadLocal();
        b = new aab(1);
    }
    
    public qv() {
        this.c = new ArrayList();
        this.f = new ArrayList();
    }
    
    private static final st b(final RecyclerView recyclerView, final int n, final long n2) {
        for (int c = recyclerView.f.c(), i = 0; i < c; ++i) {
            final st f = RecyclerView.f(recyclerView.f.f(i));
            if (f.c == n && !f.r()) {
                return null;
            }
        }
        final sk c2 = recyclerView.c;
        try {
            recyclerView.H();
            final st m = c2.m(n, n2);
            if (m != null) {
                if (m.q() && !m.r()) {
                    c2.h(m.a);
                }
                else {
                    c2.d(m, false);
                }
            }
            recyclerView.J(false);
            return m;
        }
        finally {
            recyclerView.J(false);
            while (true) {}
        }
    }
    
    public final void a(final RecyclerView recyclerView, final int a, final int b) {
        if (recyclerView.q && this.d == 0L) {
            this.d = System.nanoTime();
            recyclerView.post((Runnable)this);
        }
        final qt h = recyclerView.H;
        h.a = a;
        h.b = b;
    }
    
    @Override
    public final void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (this.c.isEmpty()) {
                this.d = 0L;
            }
            else {
                final int size = this.c.size();
                long n = 0L;
                long max;
                for (int i = 0; i < size; ++i, n = max) {
                    final RecyclerView recyclerView = this.c.get(i);
                    max = n;
                    if (recyclerView.getWindowVisibility() == 0) {
                        max = Math.max(recyclerView.getDrawingTime(), n);
                    }
                }
                if (n == 0L) {
                    this.d = 0L;
                }
                else {
                    final long n2 = TimeUnit.MILLISECONDS.toNanos(n) + this.e;
                    final int size2 = this.c.size();
                    int j = 0;
                    int n3 = 0;
                    while (j < size2) {
                        final RecyclerView recyclerView2 = this.c.get(j);
                        int n4 = n3;
                        if (recyclerView2.getWindowVisibility() == 0) {
                            recyclerView2.H.c(recyclerView2, false);
                            n4 = n3 + recyclerView2.H.d;
                        }
                        ++j;
                        n3 = n4;
                    }
                    this.f.ensureCapacity(n3);
                    int k = 0;
                    int n5 = 0;
                    while (k < size2) {
                        final RecyclerView d = this.c.get(k);
                        int n6 = n5;
                        if (d.getWindowVisibility() == 0) {
                            final qt h = d.H;
                            final int b = Math.abs(h.a) + Math.abs(h.b);
                            int n7 = 0;
                            while (true) {
                                final int d2 = h.d;
                                n6 = n5;
                                if (n7 >= d2 + d2) {
                                    break;
                                }
                                qu qu;
                                if (n5 >= this.f.size()) {
                                    qu = new qu();
                                    this.f.add(qu);
                                }
                                else {
                                    qu = this.f.get(n5);
                                }
                                final int[] c = h.c;
                                final int c2 = c[n7 + 1];
                                qu.a = (c2 <= b);
                                qu.b = b;
                                qu.c = c2;
                                qu.d = d;
                                qu.e = c[n7];
                                ++n5;
                                n7 += 2;
                            }
                        }
                        ++k;
                        n5 = n6;
                    }
                    Collections.sort((List<Object>)this.f, qv.b);
                    for (int l = 0; l < this.f.size(); ++l) {
                        final qu qu2 = this.f.get(l);
                        final RecyclerView d3 = qu2.d;
                        if (d3 == null) {
                            break;
                        }
                        long n8;
                        if (!qu2.a) {
                            n8 = n2;
                        }
                        else {
                            n8 = Long.MAX_VALUE;
                        }
                        final st b2 = b(d3, qu2.e, n8);
                        if (b2 != null && b2.b != null && b2.q() && !b2.r()) {
                            final RecyclerView recyclerView3 = (RecyclerView)b2.b.get();
                            if (recyclerView3 != null) {
                                if (recyclerView3.w && recyclerView3.f.c() != 0) {
                                    recyclerView3.M();
                                }
                                final qt h2 = recyclerView3.H;
                                h2.c(recyclerView3, true);
                                if (h2.d != 0) {
                                    try {
                                        Trace.beginSection("RV Nested Prefetch");
                                        final sq m = recyclerView3.I;
                                        final rw k2 = recyclerView3.k;
                                        m.d = 1;
                                        m.e = k2.a();
                                        m.g = false;
                                        m.h = false;
                                        m.i = false;
                                        int n9 = 0;
                                        while (true) {
                                            final int d4 = h2.d;
                                            if (n9 >= d4 + d4) {
                                                break;
                                            }
                                            b(recyclerView3, h2.c[n9], n2);
                                            n9 += 2;
                                        }
                                    }
                                    finally {
                                        Trace.endSection();
                                    }
                                }
                            }
                        }
                        qu2.a = false;
                        qu2.b = 0;
                        qu2.c = 0;
                        qu2.d = null;
                        qu2.e = 0;
                    }
                    this.d = 0L;
                }
            }
            Trace.endSection();
        }
        finally {
            this.d = 0L;
            Trace.endSection();
            while (true) {}
        }
    }
}
