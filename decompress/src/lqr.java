import java.nio.ByteBuffer;
import java.util.List;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLLinkResultListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqr implements DLLinkResultListener
{
    final /* synthetic */ okm a;
    final /* synthetic */ lqg b;
    
    public lqr(final okm a, final lqg b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void onResultUpdate(final List list, final ByteBuffer byteBuffer) {
        final lqe a = lqf.a();
        a.b(list);
        a.d(lqs.a(byteBuffer, this.a));
        a.c(lqh.b);
        this.b.a(a.a());
    }
    
    @Override
    public final void onResultUpdate(final List list, final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2) {
        final lqe a = lqf.a();
        a.b(list);
        a.d(lqs.a(byteBuffer, this.a));
        final okm a2 = this.a;
        lqh b;
        try {
            b = (lqh)oky.s(lqh.b, byteBuffer2, a2);
        }
        catch (final Exception ex) {
            b = lqh.b;
        }
        a.c(b);
        this.b.a(a.a());
    }
}
