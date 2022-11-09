import java.util.List;
import java.util.ArrayList;
import com.integrity.annotations.PaiConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

final class ccn implements oen
{
    final /* synthetic */ kof a;
    final /* synthetic */ ccs b;
    
    public ccn(final ccs b, final kof a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
    }
    
    @PaiConfiguration(continueOnFailure = false, modeFallback = false)
    public void c(final Void void1) {
        final ArrayList list = new ArrayList();
        list.add(this.b.r);
        if (this.b.h.e()) {
            if (this.b.k.k(cwv.N)) {
                list.add(new chu(this.a));
            }
            if (this.b.m.d == kmt.a) {
                final kof a = this.a;
                a.getClass();
                list.add(new chs(a));
                if (this.b.w.g()) {
                    list.add(this.b.w.c());
                }
            }
        }
        this.b.p.f(list);
    }
}
