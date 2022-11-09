import java.util.ArrayList;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjs
{
    public static final nsd a;
    public final ofn b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/tonemap/MeanVarianceToneMapParameterExtractor");
    }
    
    public fjs(final Executor executor, final oey oey, final oey oey2, final ofn b) {
        this.b = b;
        final ArrayList list = new ArrayList();
        list.add(oey);
        list.add(oey2);
        ofi.s(list).d(new fjq(this, oey, oey2), executor);
    }
}
