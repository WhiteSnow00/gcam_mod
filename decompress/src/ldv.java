import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ldv implements leb, krc
{
    private final kwz a;
    private final List b;
    private final led c;
    private kvx d;
    private lju e;
    private boolean f;
    private boolean g;
    
    public ldv(final kwz a, final led c) {
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.a = a;
        this.c = c;
        this.b = new ArrayList();
    }
    
    public static leb e(final kwz kwz, final led led) {
        led.getClass();
        final ldv ldv = new ldv(kwz, led);
        led.e(ldv);
        return ldv;
    }
    
    private final void f() {
        monitorenter(this);
        try {
            if (this.g) {
                monitorexit(this);
                return;
            }
            this.g = true;
            if (!this.b.isEmpty()) {
                final Iterator iterator = this.b.iterator();
                while (iterator.hasNext()) {
                    ((lea)iterator.next()).h();
                }
                this.b.clear();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final krc a() {
        return this.c.a();
    }
    
    @Override
    public final krc b() {
        return this.c.b();
    }
    
    @Override
    public final kvx c() {
        synchronized (this) {
            return this.d;
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.f();
            this.e = null;
        }
    }
    
    @Override
    public final kwz d() {
        return this.a;
    }
    
    @Override
    public final lju h() {
        synchronized (this) {
            final lju e = this.e;
            final led c = this.c;
            if (e != null) {
                final krc b = c.b();
                if (b != null) {
                    return new lee(e, b);
                }
            }
            return null;
        }
    }
    
    @Override
    public final void i(final lea lea) {
        synchronized (this) {
            if (this.g) {
                lea.h();
                return;
            }
            this.b.add(lea);
        }
    }
    
    @Override
    public final void j(final kvx d) {
        synchronized (this) {
            nov.D(this.f ^ true, "An image was already set for frame %s on %s!", d, this.a);
            this.d = d;
        }
    }
    
    @Override
    public final void k(final lju e) {
        monitorenter(this);
        Label_0027: {
            if (e == null) {
                break Label_0027;
            }
            Label_0029: {
                try {
                    final boolean b = this.d != null;
                    break Label_0029;
                }
                finally {
                    monitorexit(this);
                    while (true) {}
                    while (true) {
                        this.f();
                        Block_7: {
                            Label_0049: {
                                break Label_0049;
                                Label_0052: {
                                    final boolean f;
                                    nov.D(f ^ true, "An image was already set for frame %s on %s!", this.d, this.a);
                                }
                                this.f = true;
                                iftrue(Label_0108:)(e == null);
                                break Block_7;
                                final boolean b = true;
                                nov.A(b);
                                final boolean f = this.f;
                                iftrue(Label_0052:)(!f || e != null);
                            }
                            monitorexit(this);
                            return;
                        }
                        this.d.getClass();
                        this.c.e(e);
                        iftrue(Label_0108:)(this.c.d());
                        this.e = e;
                        continue;
                    }
                }
            }
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final kvx d = this.d;
            Object value;
            if (d == null) {
                value = null;
            }
            else {
                value = d.b;
            }
            final String value2 = String.valueOf(value);
            final StringBuilder sb = new StringBuilder(String.valueOf(value2).length() + 18);
            sb.append("ImageStreamResult-");
            sb.append(value2);
            return sb.toString();
        }
    }
}
