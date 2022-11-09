import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozy extends owt
{
    final owv[] a;
    
    public ozy(final owv[] a) {
        this.a = a;
    }
    
    public final void j(final owu owu) {
        final oxo oxo = new oxo();
        final ozx ozx = new ozx(owu, new AtomicBoolean(), oxo);
        owu.bV(oxo);
        final owv[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            final owv owv = a[i];
            if (oxo.b) {
                return;
            }
            if (owv == null) {
                oxo.bX();
                ozx.b(new NullPointerException("A completable source is null"));
                return;
            }
            owv.i(ozx);
        }
        ozx.e();
    }
}
