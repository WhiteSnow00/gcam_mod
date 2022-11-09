// 
// Decompiled by Procyon v0.6.0
// 

final class ayo implements Runnable
{
    final /* synthetic */ ayr a;
    private final bhp b;
    private final /* synthetic */ int c;
    
    public ayo(final ayr a, final bhp b) {
        this.a = a;
        this.b = b;
    }
    
    public ayo(final ayr a, final bhp b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final Object a;
        switch (this.c) {
            default: {
                a = this.b.a();
                monitorenter(a);
                break;
            }
            case 0: {
                synchronized (this.b.a()) {
                    synchronized (this.a) {
                        if (this.a.a.d(this.b)) {
                            this.a.j.d();
                            final ayr a2 = this.a;
                            final bhp b = this.b;
                            try {
                                b.e(a2.j, a2.l);
                                this.a.f(this.b);
                            }
                            finally {
                                final Throwable t;
                                throw new axr(t);
                            }
                        }
                        this.a.c();
                        return;
                    }
                }
                break;
            }
        }
        try {
            synchronized (this.a) {
                if (this.a.a.d(this.b)) {
                    final ayr a3 = this.a;
                    final bhp b2 = this.b;
                    try {
                        b2.d(a3.h);
                    }
                    finally {
                        final Throwable t2;
                        throw new axr(t2);
                    }
                }
                this.a.c();
            }
        }
        finally {
            monitorexit(a);
        }
    }
}
