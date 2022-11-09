// 
// Decompiled by Procyon v0.6.0
// 

public final class itq implements Runnable
{
    final /* synthetic */ its a = a;
    private final /* synthetic */ int b;
    
    public itq(final its a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                this.a.f();
                return;
            }
            case 0: {
                final its a = this.a;
                a.a = 1;
                a.i();
            }
        }
    }
}
