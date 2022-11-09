import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class yf implements ThreadFactory
{
    final /* synthetic */ pnd a;
    private final /* synthetic */ int b;
    
    public yf(final pnd a) {
        this.a = a;
    }
    
    public yf(final pnd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        switch (this.b) {
            default: {
                return new yd(this.a, runnable);
            }
            case 0: {
                return new ye(this.a, runnable);
            }
        }
    }
}
