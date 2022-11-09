// 
// Decompiled by Procyon v0.6.0
// 

public final class krj
{
    final String a;
    private boolean b;
    
    public krj(final String a) {
        this.b = false;
        this.a = a;
    }
    
    public final boolean a() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (!this.b) {
                System.loadLibrary(this.a);
                this.b = true;
            }
        }
    }
}
