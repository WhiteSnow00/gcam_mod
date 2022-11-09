// 
// Decompiled by Procyon v0.6.0
// 

public final class aom implements Runnable
{
    private final aon a;
    private final String b;
    
    public aom(final aon a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        synchronized (this.a.d) {
            if (this.a.b.remove(this.b) != null) {
                final aol aol = this.a.c.remove(this.b);
                if (aol != null) {
                    aol.b(this.b);
                }
            }
            else {
                final aiy a = aiy.a();
                String.format("Timer with %s is already marked as complete.", this.b);
                a.d(new Throwable[0]);
            }
        }
    }
}
