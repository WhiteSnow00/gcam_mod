// 
// Decompiled by Procyon v0.6.0
// 

public final class cdk implements Runnable
{
    final /* synthetic */ cdm a = a;
    private final /* synthetic */ int b;
    
    public cdk(final cdm a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final cdm a;
        final Object i;
        switch (this.b) {
            default: {
                a = this.a;
                i = a.i;
                monitorenter(i);
                break;
            }
            case 0: {
                synchronized (this.a.i) {
                    final cdm a2 = this.a;
                    a2.d.c(a2.g);
                    final ofn h = this.a.h;
                    if (h != null) {
                        h.o(null);
                    }
                    return;
                }
                break;
            }
        }
        try {
            if ((int)((kkz)a.e.b).d != 0) {
                return;
            }
            a.d.a(a.g);
        }
        finally {
            monitorexit(i);
        }
    }
}
