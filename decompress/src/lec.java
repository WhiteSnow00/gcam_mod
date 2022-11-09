// 
// Decompiled by Procyon v0.6.0
// 

final class lec implements krc
{
    final /* synthetic */ led a;
    private boolean b;
    private final /* synthetic */ int c;
    
    public lec(final led a) {
        this.a = a;
        this.b = false;
    }
    
    public lec(final led a, final int c) {
        this.c = c;
        this.a = a;
        this.b = false;
    }
    
    @Override
    public final void close() {
        final int c = this.c;
        final int n = 0;
        final int n2 = 0;
        switch (c) {
            default: {
                monitorenter(this);
                break;
            }
            case 0: {
                synchronized (this) {
                    boolean b;
                    if (!this.b) {
                        this.b = true;
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    monitorexit(this);
                    if (b) {
                        final led a = this.a;
                        monitorenter(a);
                        try {
                            nov.A(a.b > 0);
                            final int b2 = a.b - 1;
                            a.b = b2;
                            int n3;
                            if (b2 == 0 && a.a == 0) {
                                a.c = true;
                                n3 = 1;
                            }
                            else {
                                n3 = n2;
                            }
                            monitorexit(a);
                            if (n3 != 0) {
                                a.d.close();
                            }
                            a.c();
                        }
                        finally {}
                    }
                    return;
                }
                break;
            }
        }
        try {
            boolean b3;
            if (!this.b) {
                this.b = true;
                b3 = true;
            }
            else {
                b3 = false;
            }
            monitorexit(this);
            if (b3) {
                final led a2 = this.a;
                monitorenter(a2);
                try {
                    nov.A(a2.a > 0);
                    final int a3 = a2.a - 1;
                    a2.a = a3;
                    int n4;
                    if (a3 == 0 && a2.b == 0) {
                        a2.c = true;
                        n4 = 1;
                    }
                    else {
                        n4 = n;
                    }
                    monitorexit(a2);
                    if (n4 != 0) {
                        a2.d.close();
                    }
                    a2.c();
                }
                finally {}
            }
        }
        finally {
            monitorexit(this);
        }
    }
}
