// 
// Decompiled by Procyon v0.6.0
// 

public final class gcc implements Runnable
{
    final /* synthetic */ Exception a = a;
    private final /* synthetic */ int b;
    
    public gcc(final Exception a) {
        this.a = a;
    }
    
    public gcc(final Exception a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                throw new RuntimeException(this.a);
            }
            case 1: {
                throw new RuntimeException(this.a);
            }
            case 0: {
                throw new RuntimeException(this.a);
            }
        }
    }
}
