// 
// Decompiled by Procyon v0.6.0
// 

final class w implements Runnable
{
    final g a;
    private boolean b;
    private final i c;
    
    public w(final i c, final g a) {
        this.b = false;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (!this.b) {
            this.c.c(this.a);
            this.b = true;
        }
    }
}
