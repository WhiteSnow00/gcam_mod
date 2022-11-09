import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfw
{
    private final AtomicInteger a;
    
    public hfw() {
        this.a = new AtomicInteger(0);
    }
    
    final boolean a() {
        return this.a.get() == 3;
    }
    
    final boolean b() {
        return this.a.get() == 2;
    }
    
    final boolean c() {
        return this.a.get() == 1;
    }
    
    final void d(final int... array) {
        int i = 0;
        boolean b = false;
        while (i < 2) {
            final int n = array[i];
            final int value = this.a.get();
            if (n == 0) {
                throw null;
            }
            b |= (true ^ value != n - 1);
            ++i;
        }
        final int value2 = this.a.get();
        final StringBuilder sb = new StringBuilder(34);
        sb.append("Invalid session state: ");
        sb.append(value2);
        njo.p(b, sb.toString());
    }
    
    final void e(final int n) {
        this.a.set(n - 1);
    }
    
    final void f(final int n, final int n2) {
        if (this.a.getAndSet(n2 - 1) == n - 1) {
            return;
        }
        throw new IllegalStateException();
    }
}
