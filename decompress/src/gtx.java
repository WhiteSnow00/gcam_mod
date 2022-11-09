import com.google.googlex.gcam.BurstSpec;

// 
// Decompiled by Procyon v0.6.0
// 

final class gtx extends gtn
{
    final /* synthetic */ gty k;
    
    public gtx(final gty k, final gen gen, final dtx dtx, final BurstSpec burstSpec, final ljm ljm) {
        this.k = k;
        super(gen, dtx, burstSpec, ljm);
    }
    
    @Override
    public final void c(final kvs kvs) {
        if (this.k.c.a(kvs)) {
            super.c(kvs);
            return;
        }
        kvs.close();
    }
}
