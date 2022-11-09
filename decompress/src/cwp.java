import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwp
{
    public niz a;
    private final long b;
    private final long c;
    private final niz d;
    private final List e;
    private final List f;
    private final int g;
    
    public cwp(final int g, final long b, final long c, final niz d) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.a = nii.a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    final void a(final nze nze) {
        synchronized (this) {
            this.f.add(nze);
        }
    }
    
    final void b(final long n) {
        synchronized (this) {
            this.e.add(n - this.c);
        }
    }
    
    final nzf c(long c) {
        monitorenter(this);
        try {
            final okt m = nzf.j.m();
            final int g = this.g;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nzf nzf = (nzf)m.b;
            nzf.b = g - 1;
            final int a = nzf.a | 0x1;
            nzf.a = a;
            final long c2 = this.c;
            final long b = this.b;
            nzf.a = (a | 0x2);
            nzf.c = c2 - b;
            final List e = this.e;
            final oli e2 = nzf.e;
            if (!e2.c()) {
                nzf.e = oky.A(e2);
            }
            ojf.e(e, nzf.e);
            final long c3 = this.c;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nzf nzf2 = (nzf)m.b;
            final int a2 = nzf2.a | 0x10;
            nzf2.a = a2;
            nzf2.g = c - c3;
            nzf2.h = 2;
            nzf2.a = (a2 | 0x20);
            if (this.d.g()) {
                final okt i = nxy.e.m();
                final float b2 = ((fja)this.d.c()).b;
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final nxy nxy = (nxy)i.b;
                nxy.a |= 0x2;
                nxy.c = b2;
                final float c4 = ((fja)this.d.c()).c;
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final nxy nxy2 = (nxy)i.b;
                nxy2.a |= 0x1;
                nxy2.b = c4;
                final float d = (float)((fja)this.d.c()).a;
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final nxy nxy3 = (nxy)i.b;
                nxy3.a |= 0x4;
                nxy3.d = d;
                final nxy f = (nxy)i.h();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzf nzf3 = (nzf)m.b;
                f.getClass();
                nzf3.f = f;
                nzf3.a |= 0x8;
            }
            if (this.a.g()) {
                final long longValue = (long)this.a.c();
                c = this.c;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzf nzf4 = (nzf)m.b;
                nzf4.a |= 0x4;
                nzf4.d = longValue - c;
            }
            if (!this.f.isEmpty()) {
                final List f2 = this.f;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzf nzf5 = (nzf)m.b;
                final olf j = nzf5.i;
                if (!j.c()) {
                    nzf5.i = oky.y(j);
                }
                final Iterator iterator = f2.iterator();
                while (iterator.hasNext()) {
                    nzf5.i.g(((nze)iterator.next()).d);
                }
            }
            final nzf nzf6 = (nzf)m.h();
            nzf6.e.size();
            this.f.size();
            monitorexit(this);
            return nzf6;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
