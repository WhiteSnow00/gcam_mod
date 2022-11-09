// 
// Decompiled by Procyon v0.6.0
// 

final class fre implements frc
{
    final /* synthetic */ frc a;
    private final /* synthetic */ int b;
    
    public fre(final frc a) {
        this.a = a;
    }
    
    public fre(final frc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final fra a(final lju lju, final frb frb) {
        throw null;
    }
    
    @Override
    public final void close() {
        switch (this.b) {
            default: {
                this.a.close();
                return;
            }
            case 0: {
                this.a.close();
            }
        }
    }
}
