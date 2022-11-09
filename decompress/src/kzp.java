import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzp implements lea
{
    public final Set a;
    public kvx b;
    public final kzl c;
    private final List d;
    private final kyf e;
    private ljm f;
    private int g;
    private boolean h;
    private boolean i;
    
    public kzp(final kyf e, final kzl c, final Set a) {
        this.f = null;
        this.i = false;
        this.b = null;
        this.c = c;
        this.a = a;
        this.e = e;
        this.d = new ArrayList();
    }
    
    public static kzp n(final kzq kzq, final kzl kzl, final Set set) {
        final noi f = noi.F(set);
        nov.A(f.size() == kzl.c.size());
        for (final leb leb : f) {
            nov.D(kzl.c.contains(leb.d()), "%s is not present in %s", leb.d(), kzl);
        }
        final kyf kyf = (kyf)kzq.a.get();
        kyf.getClass();
        kzl.getClass();
        f.getClass();
        final kzp kzp = new kzp(kyf, kzl, f);
        final Iterator<Object> iterator2 = f.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().i(kzp);
        }
        return kzp;
    }
    
    private final boolean p() {
        return this.b != null && this.h && this.g == this.a.size();
    }
    
    private final void q(final kwp kwp) {
        if (this.b == null) {
            this.e.a(kwp, true, false, null, false, null, false, false);
            return;
        }
        this.e.a(kwp, false, false, null, this.h ^ true, null, this.g != this.a.size(), this.p() ^ true);
    }
    
    public final krc a(final boolean b) {
        if (this.a.isEmpty()) {
            return null;
        }
        if (this.a.size() == 1) {
            final leb leb = this.a.iterator().next();
            krc krc;
            if (b) {
                krc = leb.b();
            }
            else {
                krc = leb.a();
            }
            return krc;
        }
        final kjk kjk = new kjk();
        final Iterator iterator = this.a.iterator();
        boolean b2 = true;
        while (iterator.hasNext()) {
            final leb leb2 = (leb)iterator.next();
            krc krc2;
            if (b) {
                krc2 = leb2.b();
            }
            else {
                krc2 = leb2.a();
            }
            final boolean b3 = b2 &= (krc2 != null);
            if (krc2 != null) {
                kjk.c(krc2);
                b2 = b3;
            }
        }
        if (b2) {
            return kjk;
        }
        kjk.close();
        return null;
    }
    
    public final krc b() {
        return this.a(true);
    }
    
    public final leb c(final kwz kwz) {
        monitorenter(this);
        try {
            for (leb leb : this.a) {
                if (leb.d().equals(kwz)) {
                    monitorexit(this);
                    return leb;
                }
            }
            final String value = String.valueOf(kwz);
            final String value2 = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 30 + String.valueOf(value2).length());
            sb.append("Unknown stream ");
            sb.append(value);
            sb.append(" requested for ");
            sb.append(value2);
            throw new IllegalArgumentException(sb.toString());
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final ljm d() {
        synchronized (this) {
            return this.f;
        }
    }
    
    public final lju e(final kwz kwz) {
        synchronized (this) {
            synchronized (this) {
                if (this.g >= this.a.size() && !this.i) {
                    monitorexit(this);
                    return this.c(kwz).h();
                }
                return null;
            }
        }
    }
    
    public final void f() {
        monitorenter(this);
        try {
            if (!this.i && !this.p()) {
                this.i = true;
                final Iterator iterator = this.d.iterator();
                while (iterator.hasNext()) {
                    this.q((kwp)iterator.next());
                }
                this.d.clear();
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void g() {
        try (final krc a = this.a(false)) {}
    }
    
    @Override
    public final void h() {
        monitorenter(this);
        try {
            int g = this.g;
            boolean b = true;
            ++g;
            this.g = g;
            if (g > this.a.size()) {
                b = false;
            }
            nov.A(b);
            if (this.g == this.a.size()) {
                final boolean p = this.p();
                final Iterator iterator = this.d.iterator();
                while (iterator.hasNext()) {
                    this.e.a((kwp)iterator.next(), false, false, null, false, null, true, p);
                }
                if (p) {
                    this.d.clear();
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void i(final kvx b) {
        monitorenter(this);
        try {
            if (this.i) {
                monitorexit(this);
                return;
            }
            nov.A(true);
            nov.C(this.b == null, "FrameId should only be set once", new Object[0]);
            nov.C(this.f == null, "setFrameId must ALWAYS come before setMetadata.", new Object[0]);
            nov.B(true ^ this.h, "Metadata was already set for frame %s!", b);
            this.b = b;
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((leb)iterator.next()).j(b);
            }
            final boolean p = this.p();
            final Iterator iterator2 = this.d.iterator();
            while (iterator2.hasNext()) {
                this.e.a((kwp)iterator2.next(), false, true, this.b, false, null, false, p);
            }
            if (p) {
                this.d.clear();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void j(final ljm f) {
        monitorenter(this);
        try {
            if (this.i) {
                monitorexit(this);
                return;
            }
            nov.C(f == null || this.b != null, "setFrameId must ALWAYS come before setMetadata.", new Object[0]);
            nov.B(this.h ^ true, "Metadata was already set for frame %s!", this.b);
            this.h = true;
            this.f = f;
            final boolean p = this.p();
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                this.e.a((kwp)iterator.next(), false, false, null, true, this.f, false, p);
            }
            if (p) {
                this.d.clear();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean k() {
        monitorenter(this);
        try {
            final boolean b = this.p() || this.i;
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean l() {
        monitorenter(this);
        try {
            final boolean b = this.g == this.a.size() || this.k();
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean m() {
        monitorenter(this);
        try {
            final boolean b = this.h || this.k();
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void o(final kwp kwp) {
        synchronized (this) {
            final boolean p = this.p();
            if (this.i && !p) {
                this.q(kwp);
                return;
            }
            if (!p) {
                this.d.add(kwp);
            }
            final kyf e = this.e;
            final kvx b = this.b;
            e.a(kwp, false, b != null, b, this.h, this.f, this.g == this.a.size(), p);
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final kvx b = this.b;
            Object value;
            if (b == null) {
                value = null;
            }
            else {
                value = b.b;
            }
            final String value2 = String.valueOf(value);
            final StringBuilder sb = new StringBuilder(String.valueOf(value2).length() + 6);
            sb.append("Frame-");
            sb.append(value2);
            return sb.toString();
        }
    }
}
