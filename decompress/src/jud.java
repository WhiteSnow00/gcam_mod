import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jud extends jtz implements jrf
{
    private boolean b;
    private ArrayList c;
    private final Status d;
    
    public jud(final DataHolder dataHolder) {
        super(dataHolder);
        this.b = false;
        this.d = new Status(dataHolder.e);
    }
    
    private final void f() {
        monitorenter(this);
        try {
            if (!this.b) {
                final DataHolder a = this.a;
                jvu.a(a);
                final int h = a.h;
                final ArrayList c = new ArrayList();
                this.c = c;
                if (h > 0) {
                    c.add(0);
                    String b = this.a.b("path", 0, this.a.a(0));
                    String s;
                    for (int i = 1; i < h; ++i, b = s) {
                        final int a2 = this.a.a(i);
                        final String b2 = this.a.b("path", i, a2);
                        if (b2 == null) {
                            final StringBuilder sb = new StringBuilder(82);
                            sb.append("Missing value for markerColumn: ");
                            sb.append("path");
                            sb.append(", at row: ");
                            sb.append(i);
                            sb.append(", for window: ");
                            sb.append(a2);
                            throw new NullPointerException(sb.toString());
                        }
                        s = b;
                        if (!b2.equals(b)) {
                            this.c.add(i);
                            s = b2;
                        }
                    }
                }
                this.b = true;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final Status a() {
        return this.d;
    }
    
    @Override
    public final int c() {
        this.f();
        return this.c.size();
    }
    
    @Override
    public final Object d(int e) {
        this.f();
        final int e2 = this.e(e);
        int n = 0;
        if (e >= 0) {
            if (e != this.c.size()) {
                if (e == this.c.size() - 1) {
                    final DataHolder a = this.a;
                    jvu.a(a);
                    n = a.h - this.c.get(e);
                }
                else {
                    n = this.c.get(e + 1) - this.c.get(e);
                }
                if (n == 1) {
                    e = this.e(e);
                    final DataHolder a2 = this.a;
                    jvu.a(a2);
                    a2.a(e);
                    n = 1;
                }
            }
        }
        return new kgk(this.a, e2, n);
    }
    
    final int e(final int n) {
        if (n >= 0 && n < this.c.size()) {
            return this.c.get(n);
        }
        final StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(n);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }
}
