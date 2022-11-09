import com.google.android.gms.common.api.internal.BasePendingResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrz
{
    final /* synthetic */ BasePendingResult a;
    
    public jrz(final BasePendingResult a) {
        this.a = a;
    }
    
    @Override
    protected final void finalize() {
        final BasePendingResult a = this.a;
        final ThreadLocal c = BasePendingResult.c;
        BasePendingResult.i(a.g);
        super.finalize();
    }
}
