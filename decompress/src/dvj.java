import com.google.googlex.gcam.ViewfinderResults;
import com.google.googlex.gcam.PhysicalStabilityParams;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.PostviewParams;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public interface dvj
{
    public static final jcy a = new jcy(100.0f);
    
    Bitmap A(final lju p0, final ljm p1, final ggv p2, final niz p3, final niz p4, final niz p5, final niz p6);
    
    boolean B(final int p0, final ljm p1, final lju p2, final lju p3, final ljm p4, final lju p5);
    
    int a(final ljm p0);
    
    dug b();
    
    dwg c(final lju p0, final ljm p1, final kre p2);
    
    dxh d(final int p0, final him p1, final gen p2, final PostviewParams p3, final ggv p4, final ljm p5);
    
    dxh e(final int p0, final gen p1, final PostviewParams p2, final ggv p3, final ljm p4);
    
    dxh f(final int p0, final gen p1, final PostviewParams p2, final ggv p3, final ljm p4, final int p5, final boolean p6, final int p7, final niz p8);
    
    dxh g(final int p0, final gen p1, final PostviewParams p2, final ggv p3, final ljm p4, final int p5, final int p6, final boolean p7);
    
    AeResults h(final dwg p0);
    
    BurstSpec i(final dxh p0, final lju p1, final ljm p2);
    
    BurstSpec j(final dxh p0, final lju p1, final ljm p2, final boolean p3);
    
    FrameMetadata k(final ljm p0, final GyroSampleVector p1);
    
    PhysicalStabilityParams l(final int p0);
    
    ViewfinderResults m(final int p0);
    
    void n(final dxh p0);
    
    void o(final dxh p0, final int p1, final ljm p2, final lju p3, final lju p4);
    
    void p(final dxh p0, final int p1, final ljm p2, final lju p3, final lju p4, final niz p5);
    
    void q(final int p0, final lju p1, final ljm p2);
    
    void r(final dxh p0);
    
    void s(final dxh p0, final BurstSpec p1);
    
    void t(final dxh p0);
    
    void u(final int p0);
    
    void v(final int p0);
    
    boolean w(final ljm p0);
    
    boolean x(final dxh p0);
    
    boolean y(final dxh p0);
    
    boolean z(final ljm p0);
}
