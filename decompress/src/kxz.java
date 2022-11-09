import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Deque;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxz implements kvw
{
    public final Executor a;
    public final Deque b;
    public final Deque c;
    public final Deque d;
    public final List e;
    public final List f;
    public boolean g;
    public final kzl h;
    private final int i;
    private final kyb j;
    private final lbk k;
    private int l;
    private final Collection m;
    private kvu n;
    
    public kxz(final kyb j, final Executor a, final kzl h, final lbk k, final int n) {
        this.g = false;
        this.j = j;
        this.a = a;
        this.h = h;
        this.k = k;
        this.l = w(h, n);
        synchronized (lbi.class) {
            final int b = lbi.b;
            lbi.b = b + 1;
            monitorexit(lbi.class);
            this.i = b;
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.b = new ArrayDeque(n);
            this.c = new ArrayDeque(n);
            final ArrayDeque d = new ArrayDeque(n);
            this.m = Collections.unmodifiableCollection((Collection<?>)d);
            this.d = d;
            k.a.d.a(new Object[0]);
        }
    }
    
    private final lbe u() {
        final kvu n = this.n;
        Object a = null;
        if (n != null && !this.d.isEmpty()) {
            a = this.n.a(this.m);
            nov.C(this.d.contains(a), "Trim filter returned frame not in buffer", new Object[0]);
        }
        if (!this.d.isEmpty() && a == null) {
            return this.d.peekFirst();
        }
        return (lbe)a;
    }
    
    private final boolean v(final lbe lbe) {
        if (lbe != null) {
            nov.C(this.d.remove(lbe), "Cannot remove missing frameReference!", new Object[0]);
            lbe.c();
            this.c.addLast(lbe);
            return true;
        }
        return false;
    }
    
    private static int w(final kzl kzl, final int n) {
        final int e = kzl.e;
        if (e == -1) {
            return n;
        }
        return Math.min(e, n);
    }
    
    @Override
    public final int a() {
        synchronized (this) {
            return this.l;
        }
    }
    
    @Override
    public final int b() {
        synchronized (this) {
            return this.d.size();
        }
    }
    
    @Override
    public final kvs c() {
        synchronized (this) {
            if (this.g || this.d.isEmpty()) {
                return null;
            }
            final lbe lbe = this.d.peekFirst();
            if (lbe == null) {
                return null;
            }
            return lbe.a();
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            if (this.g) {
                monitorexit(this);
                return;
            }
            this.g = true;
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                ((lbe)iterator.next()).c();
            }
            this.d.clear();
            this.c.clear();
            this.b.clear();
            monitorexit(this);
            this.j.c(this);
            this.k.a.e.a(new Object[0]);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final kvs d(final njc njc) {
        monitorenter(this);
        try {
            if (!this.g && !this.d.isEmpty()) {
                for (lbe lbe : this.d) {
                    if (njc.a(lbe)) {
                        final kvs a = lbe.a();
                        monitorexit(this);
                        return a;
                    }
                }
                monitorexit(this);
                return null;
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final kvs e() {
        synchronized (this) {
            if (this.g || this.d.isEmpty()) {
                return null;
            }
            final lbe lbe = this.d.peekLast();
            if (lbe == null) {
                return null;
            }
            return lbe.a();
        }
    }
    
    @Override
    public final kvs f(final njc njc) {
        monitorenter(this);
        try {
            if (!this.g && !this.d.isEmpty()) {
                for (lbe lbe : new kxx(this.d)) {
                    if (njc.a(lbe)) {
                        final kvs a = lbe.a();
                        monitorexit(this);
                        return a;
                    }
                }
                monitorexit(this);
                return null;
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final kvs g() {
        synchronized (this) {
            if (this.g || this.d.isEmpty()) {
                return null;
            }
            final lbe lbe = this.d.peekFirst();
            if (lbe == null) {
                return null;
            }
            final kvs a = lbe.a();
            this.v(lbe);
            return a;
        }
    }
    
    @Override
    public final kvs h() {
        synchronized (this) {
            if (this.g || this.d.isEmpty()) {
                return null;
            }
            final lbe lbe = this.d.peekLast();
            if (lbe == null) {
                return null;
            }
            final kvs a = lbe.a();
            this.v(lbe);
            return a;
        }
    }
    
    @Override
    public final List i() {
        monitorenter(this);
        try {
            if (!this.g && !this.d.isEmpty()) {
                final nnn f = nns.f(this.d.size());
                final Iterator iterator = this.d.iterator();
                while (iterator.hasNext()) {
                    final kvs a = ((lbe)iterator.next()).a();
                    if (a != null) {
                        f.g(a);
                    }
                }
                final nns f2 = f.f();
                monitorexit(this);
                return f2;
            }
            final nns l = nns.l();
            monitorexit(this);
            return l;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final List j() {
        monitorenter(this);
        try {
            if (!this.g && !this.d.isEmpty()) {
                final nnn f = nns.f(this.d.size());
                for (final lbe lbe : this.d) {
                    final kvs a = lbe.a();
                    if (a != null) {
                        f.g(a);
                    }
                    this.c.addLast(lbe);
                    lbe.c();
                }
                this.d.clear();
                final nns f2 = f.f();
                monitorexit(this);
                return f2;
            }
            final nns l = nns.l();
            monitorexit(this);
            return l;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void k(final kvv kvv) {
        if (kvv instanceof kvt) {
            synchronized (this.f) {
                this.f.add(kvv);
                return;
            }
        }
        synchronized (this.e) {
            this.e.add(kvv);
        }
    }
    
    @Override
    public final void l(final kvv kvv) {
        if (kvv instanceof kvt) {
            synchronized (this.f) {
                this.f.remove(kvv);
                return;
            }
        }
        synchronized (this.e) {
            this.e.remove(kvv);
        }
    }
    
    @Override
    public final void m(int w) {
        synchronized (this) {
            final int l = this.l;
            w = w(this.h, w);
            this.l = w;
            if (w < l) {
                this.s();
            }
        }
    }
    
    @Override
    public final void n(final kvu n) {
        synchronized (this) {
            this.n = n;
        }
    }
    
    @Override
    public final boolean o(final kvx kvx) {
        monitorenter(this);
        try {
            if (!this.g && !this.d.isEmpty()) {
                while (true) {
                    for (lbe lbe : this.d) {
                        if (nqb.E(lbe.b(), kvx)) {
                            final lbe lbe2 = lbe;
                            final boolean v = this.v(lbe2);
                            monitorexit(this);
                            return v;
                        }
                    }
                    final lbe lbe2 = null;
                    continue;
                }
            }
            monitorexit(this);
            return false;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final boolean p() {
        monitorenter(this);
        try {
            if (!this.g && !this.d.isEmpty()) {
                for (final lbe lbe : this.d) {
                    this.c.addLast(lbe);
                    lbe.c();
                }
                this.d.clear();
                monitorexit(this);
                return true;
            }
            monitorexit(this);
            return false;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final long r() {
        synchronized (this) {
            return this.h.f * this.d.size();
        }
    }
    
    public final void s() {
        while (!this.b.isEmpty() && this.b.size() > this.l) {
            if (!this.c.isEmpty()) {
                final lbe lbe = this.c.removeFirst();
                this.b.remove(lbe);
                lbe.c();
            }
            else {
                final lbe u = this.u();
                this.d.remove(u);
                this.b.remove(u);
                if (u == null) {
                    continue;
                }
                u.c();
            }
        }
    }
    
    public final boolean t() {
        synchronized (this) {
            return this.v(this.u());
        }
    }
    
    @Override
    public final String toString() {
        final int i = this.i;
        final StringBuilder sb = new StringBuilder(23);
        sb.append("FrameBuffer-");
        sb.append(i);
        return sb.toString();
    }
}
