import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class lgl implements lgq
{
    public final String a;
    final /* synthetic */ lgn b;
    private final List c;
    private boolean d;
    
    public lgl(final lgn b, final String a) {
        this.b = b;
        this.a = a;
        this.c = new ArrayList(100);
        this.d = true;
    }
    
    @Override
    public final String a() {
        return this.a;
    }
    
    @Override
    public final void b(final long n, final long n2, final lgp lgp) {
        synchronized (this) {
            if (!this.d) {
                lgp.a(nns.l());
                return;
            }
            synchronized (this.b) {
                final lgm b = this.b.b;
                if (b != null) {
                    b.d.a(n, n2, this.c);
                }
                monitorexit(this.b);
                lgp.a(this.c);
                synchronized (this.b) {
                    final lgm b2 = this.b.b;
                    if (b2 != null) {
                        b2.d.b(this.c);
                    }
                }
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            final krr a = this.b.a;
            final String value = String.valueOf(this.a);
            String concat;
            if (value.length() != 0) {
                concat = "Closing session : ".concat(value);
            }
            else {
                concat = new String("Closing session : ");
            }
            a.b(concat);
            this.d = false;
            this.b.b(this);
        }
    }
}
