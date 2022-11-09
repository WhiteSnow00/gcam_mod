import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class laa implements kvs
{
    public final kzl a;
    private final List b;
    private final List c;
    private kzp d;
    private krc e;
    private boolean f;
    
    public laa(final kzl a) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = a;
    }
    
    @Override
    public final kvs a() {
        monitorenter(this);
        try {
            kvs kvs;
            if (!this.f) {
                final kzp d = this.d;
                if (d != null) {
                    final kvs k = laz.k(d);
                    monitorexit(this);
                    return k;
                }
                kvs = new laa(this.a);
                this.c.add(kvs);
            }
            else {
                kvs = null;
            }
            monitorexit(this);
            return kvs;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final kvx b() {
        synchronized (this) {
            final kzp d = this.d;
            if (d == null) {
                return null;
            }
            return d.b;
        }
    }
    
    @Override
    public final ljm c() {
        synchronized (this) {
            final kzp d = this.d;
            if (d == null) {
                return null;
            }
            return d.d();
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (this.f) {
                return;
            }
            this.f = true;
            this.b.clear();
            final krc e = this.e;
            if (e != null) {
                e.close();
                this.e = null;
            }
        }
    }
    
    @Override
    public final lju d(final kwz kwz) {
        synchronized (this) {
            final kzp d = this.d;
            if (d != null && !this.f) {
                return d.e(kwz);
            }
            return null;
        }
    }
    
    @Override
    public final boolean e() {
        synchronized (this) {
            return this.f;
        }
    }
    
    @Override
    public final boolean f() {
        monitorenter(this);
        try {
            final kzp d = this.d;
            final boolean b = d != null && d.k();
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final boolean g() {
        monitorenter(this);
        try {
            final kzp d = this.d;
            final boolean b = d != null && d.l();
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final boolean h() {
        monitorenter(this);
        try {
            final kzp d = this.d;
            final boolean b = d != null && d.m();
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final kzl i() {
        return this.a;
    }
    
    @Override
    public final void j(final kwp kwp) {
        synchronized (this) {
            final kzp d = this.d;
            if (d == null) {
                this.b.add(kwp);
                return;
            }
            if (!this.f) {
                d.o(kwp);
            }
        }
    }
    
    public final void k(final kzp d) {
        monitorenter(this);
        try {
            d.getClass();
            njo.p(this.d == null, "FrameStreamResult was set twice!");
            this.d = d;
            this.e = d.b();
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                d.o((kwp)iterator.next());
            }
            this.b.clear();
            final Iterator iterator2 = this.c.iterator();
            while (iterator2.hasNext()) {
                ((laa)iterator2.next()).k(d);
            }
            this.c.clear();
            if (this.f) {
                final krc e = this.e;
                if (e != null) {
                    e.close();
                    this.e = null;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
