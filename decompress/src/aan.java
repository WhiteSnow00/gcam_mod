// 
// Decompiled by Procyon v0.6.0
// 

public final class aan
{
    public boolean a;
    public aam b;
    public boolean c;
    
    public final void a(final aam b) {
        monitorenter(this);
        try {
            while (this.c) {
                try {
                    this.wait();
                }
                catch (final InterruptedException ex) {}
            }
            if (this.b == b) {
                monitorexit(this);
                return;
            }
            this.b = b;
            if (this.a && b != null) {
                monitorexit(this);
                b.a();
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
