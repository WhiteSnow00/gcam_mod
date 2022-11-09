import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.TreeSet;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class mrh extends adt
{
    private List i;
    
    public mrh(final Context context) {
        super(context.getApplicationContext());
    }
    
    @Override
    public final void h() {
        final List i = this.i;
        if (i != null) {
            this.k(i);
            return;
        }
        this.d();
    }
    
    @Override
    public final void i() {
        this.f();
    }
    
    public final void k(final List i) {
        super.g(this.i = i);
    }
}
