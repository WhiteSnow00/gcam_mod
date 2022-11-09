// 
// Decompiled by Procyon v0.6.0
// 

final class lds implements Runnable
{
    final /* synthetic */ ldt a;
    private final /* synthetic */ int b;
    
    public lds(final ldt a) {
        this.a = a;
    }
    
    public lds(final ldt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                this.a.a();
                return;
            }
            case 0: {
                final ldt a = this.a;
                int n = 0;
                while (true) {
                    final leb leb = a.j.poll();
                    if (leb == null) {
                        break;
                    }
                    monitorenter(a);
                    try {
                        if (a.k) {
                            leb.k(null);
                            monitorexit(a);
                        }
                        else {
                            a.i.add(leb);
                            monitorexit(a);
                            n = 1;
                        }
                    }
                    finally {
                        monitorexit(a);
                        while (true) {}
                    }
                }
                if (n != 0) {
                    a.a();
                }
            }
        }
    }
}
