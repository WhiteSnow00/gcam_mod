// 
// Decompiled by Procyon v0.6.0
// 

public class kwn extends kwp
{
    private boolean a;
    
    public kwn() {
        this.a = true;
    }
    
    public final void g() {
        monitorenter(this);
        try {
            while (this.a) {
                this.wait();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    protected final void h() {
        synchronized (this) {
            this.a = false;
            this.notifyAll();
        }
    }
}
