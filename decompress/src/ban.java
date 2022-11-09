// 
// Decompiled by Procyon v0.6.0
// 

public final class ban
{
    private final biq a;
    private final hp b;
    
    public ban() {
        this.a = new biq(1000L);
        this.b = bjc.b(10, new bal());
    }
    
    public final String a(final awc awc) {
        Object a = this.a;
        monitorenter(a);
        try {
            Object digest = this.a.f(awc);
            monitorexit(a);
            if (digest == null) {
                a = this.b.a();
                bit.a(a);
                try {
                    awc.a(((bam)a).a);
                    digest = ((bam)a).a.digest();
                    synchronized (biv.b) {
                        final char[] b = biv.b;
                        for (int i = 0; i < digest.length; ++i) {
                            final int n = digest[i] & 0xFF;
                            final int n2 = i + i;
                            b[n2] = biv.a[n >>> 4];
                            b[n2 + 1] = biv.a[n & 0xF];
                        }
                        digest = new String(b);
                    }
                }
                finally {
                    this.b.b(a);
                }
            }
            synchronized (this.a) {
                this.a.g(awc, digest);
                return (String)digest;
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
