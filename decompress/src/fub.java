// 
// Decompiled by Procyon v0.6.0
// 

public final class fub implements frl
{
    private final /* synthetic */ int a;
    
    public fub() {
    }
    
    public fub(final int a) {
        this.a = a;
    }
    
    @Override
    public final void a(final lju lju) {
        switch (this.a) {
            default: {
                lju.close();
                return;
            }
            case 0: {
                lju.close();
            }
        }
    }
    
    @Override
    public final void close() {
        final int a = this.a;
    }
}
