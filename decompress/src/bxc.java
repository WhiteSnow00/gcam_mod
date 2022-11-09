// 
// Decompiled by Procyon v0.6.0
// 

final class bxc implements oen
{
    final /* synthetic */ bxd a;
    private final /* synthetic */ int b;
    
    public bxc(final bxd a) {
        this.a = a;
    }
    
    public bxc(final bxd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        switch (this.b) {
            default: {
                a.m(bxd.a.b(), "Failed to add Media Record", '«', t);
                return;
            }
            case 0: {
                a.m(bxd.a.c(), "Retrieving user opt in failed.", '\u00ad', t);
            }
        }
    }
}
