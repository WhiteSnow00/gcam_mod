// 
// Decompiled by Procyon v0.6.0
// 

final class kjr implements Runnable
{
    final /* synthetic */ kjs a;
    private final Runnable b;
    
    public kjr(final kjs a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        try {
            this.b.run();
        }
        finally {
            final Throwable t;
            this.a.b.execute(new jzd(t, 2, (byte[])null));
        }
    }
}
