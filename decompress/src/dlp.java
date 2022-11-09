// 
// Decompiled by Procyon v0.6.0
// 

public final class dlp implements dky
{
    final /* synthetic */ Runnable a;
    private final /* synthetic */ int b;
    
    public dlp(final Runnable a) {
        this.a = a;
    }
    
    public dlp(final Runnable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void c() {
        switch (this.b) {
            default: {
                return;
            }
            case 0: {
                this.a.run();
            }
        }
    }
    
    @Override
    public final void d(final lfg lfg, final boa boa) {
        switch (this.b) {
            default: {
                this.a.run();
            }
            case 0: {}
        }
    }
}
