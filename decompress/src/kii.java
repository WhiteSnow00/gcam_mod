import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class kii extends kih
{
    public kii(final jrt jrt) {
        super(jrt);
    }
    
    @Override
    public final void b(final kgp kgp) {
        final Status p = mcn.p(kgp.a);
        final kgd b = kgp.b;
        kfd kfd;
        if (b == null) {
            kfd = null;
        }
        else {
            kfd = new kgb(b);
        }
        this.f(new kgc(p, kfd));
    }
}
