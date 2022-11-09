// 
// Decompiled by Procyon v0.6.0
// 

final class au implements oyb
{
    final /* synthetic */ al a;
    final /* synthetic */ av b;
    
    public au(final av b, final al a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        final an c = this.b.b.c;
        final al a = this.a;
        Object o = c.h;
        monitorenter(o);
        try {
            final am am = (am)c.h.b(a);
            monitorexit(o);
            if (am != null) {
                o = c.g;
                final int[] a2 = am.a;
                synchronized (o) {
                    final int length = a2.length;
                    int i = 0;
                    boolean b = false;
                    while (i < length) {
                        final int n = a2[i];
                        final long[] a3 = ((ak)o).a;
                        final long n2 = a3[n];
                        a3[n] = -1L + n2;
                        if (n2 == 1L) {
                            ((ak)o).d = true;
                            b = true;
                        }
                        ++i;
                    }
                    monitorexit(o);
                    if (b) {
                        c.a();
                    }
                }
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
