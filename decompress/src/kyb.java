import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyb
{
    public final Set a;
    public final List b;
    private final kzt c;
    private final Executor d;
    private final krr e;
    private final lbk f;
    
    public kyb(final krr krr, final Executor executor, final kzt c, final lbk f, final kse kse) {
        this.d = new ksk(executor, kse, "FrameBuffer");
        this.c = c;
        this.f = f;
        this.a = new HashSet();
        this.b = new ArrayList();
        this.e = krr.a("FrameBufferMap");
    }
    
    private final void e() {
        monitorenter(this);
        try {
            synchronized (this) {
                final nns j = nns.j(this.b);
                monitorexit(this);
                if (!j.isEmpty()) {
                    for (int size = j.size(), i = 0; i < size; ++i) {
                        ((Runnable)j.get(i)).run();
                    }
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final krc a(final Runnable runnable) {
        synchronized (this) {
            this.b.add(runnable);
            return new kya(this, runnable);
        }
    }
    
    public final noi b() {
        monitorenter(this);
        try {
            final nog nog = new nog();
            synchronized (this) {
                final Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    nog.g(((kxz)iterator.next()).h);
                }
                monitorexit(this);
                return nog.f();
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void c(final kxz kxz) {
        synchronized (this) {
            this.c.d(kxz);
            if (this.a.remove(kxz)) {
                this.e();
            }
        }
    }
    
    public final kxz d(final kzl kzl, int n) {
        final int e = kzl.e;
        int e2 = n;
        if (n > e) {
            e2 = n;
            if (e != -1) {
                final krr e3 = this.e;
                final String value = String.valueOf(kzl);
                final int e4 = kzl.e;
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 104);
                sb.append("Desired capacity of ");
                sb.append(n);
                sb.append(" is larger than the max capacity of ");
                sb.append(value);
                sb.append(". Restricting capacity to ");
                sb.append(e4);
                e3.h(sb.toString());
                e2 = kzl.e;
            }
        }
        monitorenter(this);
        try {
            for (final kxz kxz : this.a) {
                njo.m(leg.d(kzl, kxz.h, this.e), "Cannot attach %s because it conflicts with %s (%s)", kzl, kxz, kxz.h);
            }
            final kxz kxz2 = new kxz(this, this.d, kzl, this.f, e2);
            this.c.c(kxz2);
            this.a.add(kxz2);
            if (e2 > 0) {
                final krr e5 = this.e;
                final String value2 = String.valueOf(kxz2);
                final String value3 = String.valueOf(kzl);
                n = String.valueOf(value2).length();
                final StringBuilder sb2 = new StringBuilder(n + 42 + String.valueOf(value3).length());
                sb2.append("Created ");
                sb2.append(value2);
                sb2.append(" from ");
                sb2.append(value3);
                sb2.append(" with ");
                sb2.append(e2);
                sb2.append(" frames max");
                e5.f(sb2.toString());
            }
            else {
                final krr e6 = this.e;
                final String value4 = String.valueOf(kxz2);
                final String value5 = String.valueOf(kzl);
                n = String.valueOf(value4).length();
                final StringBuilder sb3 = new StringBuilder(n + 14 + String.valueOf(value5).length());
                sb3.append("Created ");
                sb3.append(value4);
                sb3.append(" from ");
                sb3.append(value5);
                e6.f(sb3.toString());
            }
            monitorexit(this);
            this.e();
            return kxz2;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
