import java.util.List;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ldb implements lcs
{
    private final ljf a;
    
    public ldb(final ljf a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.a.b();
    }
    
    @Override
    public final void b() {
        this.a.d();
    }
    
    @Override
    public final leo c(final lda lda) {
        return this.a.a().h(lda.a);
    }
    
    @Override
    public final int d(final ljh ljh, final ldg ldg, final Handler handler, final boolean b) {
        return this.a.e(ljh, ldg, handler);
    }
    
    @Override
    public final int e(final List list, final ldg ldg, final Handler handler, final boolean b) {
        return this.a.f(list, ldg, handler);
    }
    
    @Override
    public final int f(final ljh ljh, final ldg ldg, final Handler handler, final boolean b) {
        return this.a.g(ljh, ldg, handler);
    }
}
