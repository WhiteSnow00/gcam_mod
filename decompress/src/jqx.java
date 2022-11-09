import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.api.internal.BasePendingResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqx extends jqz
{
    private final BasePendingResult a;
    
    public jqx() {
    }
    
    public jqx(final jqz jqz) {
        this.a = (BasePendingResult)jqz;
    }
    
    @Override
    public final void l(final jqy jqy) {
        this.a.l(jqy);
    }
    
    @Override
    public final jrf m(final TimeUnit timeUnit) {
        return this.a.m(timeUnit);
    }
}
