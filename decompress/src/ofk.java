// 
// Decompiled by Procyon v0.6.0
// 

final class ofk implements Runnable
{
    final /* synthetic */ Runnable a;
    
    public ofk(final Runnable a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.run();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
