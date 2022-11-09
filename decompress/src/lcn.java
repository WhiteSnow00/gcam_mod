import java.util.Collection;
import android.os.Handler;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class lcn extends lco
{
    private final List a;
    
    public lcn(final List a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Handler handler) {
        leg.c(this.a, handler);
    }
    
    @Override
    public final void b(final lcr lcr) {
        lcr.f(this.a);
    }
}
