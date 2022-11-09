// 
// Decompiled by Procyon v0.6.0
// 

final class any implements Runnable
{
    final anz a;
    final Runnable b;
    
    public any(final anz a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        try {
            this.b.run();
        }
        finally {
            this.a.a();
        }
    }
}
