import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abf implements ThreadFactory
{
    private final /* synthetic */ int c;
    
    static {
        b = new abf(3);
        a = new abf(2);
    }
    
    public abf() {
    }
    
    public abf(final int c) {
        this.c = c;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        switch (this.c) {
            default: {
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
            }
            case 2: {
                return new Thread(runnable, "LensSvConn");
            }
            case 1: {
                return new yb(runnable);
            }
            case 0: {
                return new abe(runnable);
            }
        }
    }
}
