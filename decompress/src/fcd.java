import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcd implements fev
{
    public final AtomicBoolean a;
    private final kwz b;
    private final kvw c;
    private final List d;
    private final List e;
    
    public fcd(final kwz b, final kvw c) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = new AtomicBoolean();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final long a() {
        synchronized (this) {
            final boolean value = this.a.get();
            long a = -1L;
            if (value) {
                if (this.d.isEmpty()) {
                    return -1L;
                }
                final kvx b = ((kvs)nov.d(this.d)).b();
                if (b != null) {
                    return b.a;
                }
                return -1L;
            }
            else {
                final kvs e = this.c.e();
                if (e == null) {
                    return -1L;
                }
                try {
                    final kvx b2 = e.b();
                    if (b2 != null) {
                        a = b2.a;
                    }
                    e.close();
                    return a;
                }
                finally {
                    try {
                        e.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
    }
    
    @Override
    public final lju b(final long n) {
        monitorenter(this);
        try {
            final boolean value = this.a.get();
            lju d = null;
            if (value) {
                for (kvs kvs : this.d) {
                    final kvx b = kvs.b();
                    if (b != null && b.a > n) {
                        final lju d2 = kvs.d(this.b);
                        monitorexit(this);
                        return d2;
                    }
                }
                monitorexit(this);
                return null;
            }
            final kvs d3 = this.c.d(new fca(n, 1));
            Label_0142: {
                if (d3 == null) {
                    break Label_0142;
                }
                try {
                    d = d3.d(this.b);
                    if (d3 != null) {
                        d3.close();
                    }
                    monitorexit(this);
                    return d;
                }
                finally {
                    try {
                        d3.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final lju c(final long n) {
        monitorenter(this);
        try {
            final boolean value = this.a.get();
            lju d = null;
            if (value) {
                for (kvs kvs : this.d) {
                    final kvx b = kvs.b();
                    if (b != null && b.a == n) {
                        final lju d2 = kvs.d(this.b);
                        monitorexit(this);
                        return d2;
                    }
                }
                monitorexit(this);
                return null;
            }
            final kvs d3 = this.c.d(new fca(n, 2));
            Label_0142: {
                if (d3 == null) {
                    break Label_0142;
                }
                try {
                    d = d3.d(this.b);
                    if (d3 != null) {
                        d3.close();
                    }
                    monitorexit(this);
                    return d;
                }
                finally {
                    try {
                        d3.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final lju d() {
        synchronized (this) {
            final boolean value = this.a.get();
            lju d = null;
            if (value) {
                if (this.d.isEmpty()) {
                    return null;
                }
                return ((kvs)nov.d(this.d)).d(this.b);
            }
            else {
                final kvs f = this.c.f(lms.b);
                Label_0091: {
                    if (f == null) {
                        break Label_0091;
                    }
                    try {
                        d = f.d(this.b);
                        if (f != null) {
                            f.close();
                        }
                        return d;
                    }
                    finally {
                        try {
                            f.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            t.addSuppressed(t2);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public final niz e(final long n) {
        monitorenter(this);
        try {
            if (this.a.get()) {
                final Iterator iterator = this.d.iterator();
                while (true) {
                    while (iterator.hasNext()) {
                        final kvx b = ((kvs)iterator.next()).b();
                        if (b != null) {
                            final long a = b.a;
                            if (a > n) {
                                final niz niz = niz.i(a);
                                monitorexit(this);
                                return niz;
                            }
                            continue;
                        }
                    }
                    final niz niz = nii.a;
                    continue;
                }
            }
            final kvs d = this.c.d(new fca(n));
            Label_0157: {
                if (d == null) {
                    break Label_0157;
                }
                try {
                    final kvx b2 = d.b();
                    niz niz2;
                    if (b2 != null) {
                        niz2 = niz.i(b2.a);
                        d.close();
                    }
                    else {
                        final nii nii = (nii)(niz2 = nii.a);
                        if (d != null) {
                            d.close();
                            niz2 = nii;
                        }
                    }
                    monitorexit(this);
                    return niz2;
                }
                finally {
                    if (d != null) {
                        try {
                            d.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            t.addSuppressed(t2);
                        }
                    }
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final List f(final long n) {
        monitorenter(this);
        try {
            this.a.set(true);
            final ArrayList list = new ArrayList();
            final nrw t = ((nns)this.c.i()).t();
            while (t.hasNext()) {
                final kvs kvs = t.next();
                final kvx b = kvs.b();
                if (b != null) {
                    final long a = b.a;
                    if (a > n) {
                        list.add(a);
                        this.d.add(kvs);
                        continue;
                    }
                }
                kvs.close();
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void g(final feu feu, final Executor executor) {
        synchronized (this) {
            this.e.add(feu);
            this.c.k(new fbz(this, feu, executor));
        }
    }
    
    @Override
    public final void h() {
        monitorenter(this);
        try {
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                ((kvs)iterator.next()).close();
            }
            this.d.clear();
            this.a.set(false);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void i() {
    }
}
