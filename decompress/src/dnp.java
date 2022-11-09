// 
// Decompiled by Procyon v0.6.0
// 

public final class dnp implements dli
{
    public final Object a;
    private final long[] b;
    private int c;
    private int d;
    
    public dnp(final int n) {
        this.a = new Object();
        this.b = new long[n];
        this.c = 0;
        this.d = 0;
    }
    
    private final int j(final long n) {
        final Object a = this.a;
        monitorenter(a);
        try {
            int n2 = this.e() - 1;
            int i = 0;
            while (i <= n2) {
                final int n3 = i + n2 >>> 1;
                final long n4 = this.b[this.f(n3)];
                if (n4 < n) {
                    i = n3 + 1;
                }
                else {
                    if (n4 <= n) {
                        monitorexit(a);
                        return n3;
                    }
                    n2 = n3 - 1;
                }
            }
            monitorexit(a);
            return i;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final dll a(final long n) {
        return new dno(this, n);
    }
    
    public final int b(final long n) {
        synchronized (this.a) {
            boolean b = false;
            Label_0079: {
                if (!this.i()) {
                    synchronized (this.a) {
                        njo.p(this.i() ^ true, "Attempting to get latest timestamp on empty buffer!");
                        final long h = this.h(this.e() - 1);
                        monitorexit(this.a);
                        b = (n > h);
                        break Label_0079;
                    }
                }
                b = true;
            }
            njo.e(b, "Attempting to insert earlier timestamp into buffer!");
            final int c = this.c;
            final long[] b2 = this.b;
            this.c = (c + 1) % b2.length;
            b2[c] = n;
            ++this.d;
            return c;
        }
    }
    
    public final int c(final long n) {
        synchronized (this.a) {
            if (!this.i()) {
                final int j = this.j(n);
                if (j >= 0 && j < this.e() && this.h(j) == n) {
                    return j;
                }
                if (j != 0) {
                    monitorexit(this.a);
                    return j - 1;
                }
            }
            return -1;
        }
    }
    
    public final int d(final long n) {
        synchronized (this.a) {
            final boolean i = this.i();
            final int n2 = -1;
            if (!i) {
                int j = this.j(n);
                if (j < 0 || j >= this.e()) {
                    j = n2;
                }
                return j;
            }
            return -1;
        }
    }
    
    public final int e() {
        synchronized (this.a) {
            return Math.min(this.d, this.b.length);
        }
    }
    
    public final int f(final int n) {
        synchronized (this.a) {
            int c;
            if (this.i()) {
                c = -1;
            }
            else if (this.d >= this.b.length) {
                c = this.c;
            }
            else {
                c = 0;
            }
            monitorexit(this.a);
            return (c + n) % this.e();
        }
    }
    
    public final int g(final long n) {
        synchronized (this.a) {
            final int j = this.j(n);
            int n2;
            if (j >= 0 && j < this.e()) {
                n2 = j;
                if (this.h(j) != n) {
                    n2 = -1;
                }
            }
            else {
                n2 = -1;
            }
            monitorexit(this.a);
            if (n2 >= 0) {
                return this.f(n2);
            }
            return -1;
        }
    }
    
    public final long h(final int n) {
        final Object a = this.a;
        monitorenter(a);
        Label_0034: {
            if (n < 0) {
                break Label_0034;
            }
            try {
                if (n < this.e()) {
                    return this.b[this.f(n)];
                }
                final StringBuilder sb = new StringBuilder(46);
                sb.append("Attempting to access illegal index ");
                sb.append(n);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            finally {
                monitorexit(a);
            }
        }
    }
    
    public final boolean i() {
        synchronized (this.a) {
            return this.d == 0;
        }
    }
}
