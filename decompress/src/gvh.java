import com.google.googlex.gcam.creativecamera.portraitmode.PortraitImageCallback;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitOpaqueHandleCallback;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.PortraitRequest;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;

// 
// Decompiled by Procyon v0.6.0
// 

final class gvh implements gab
{
    public ogo a;
    public DynamicDepthResult b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ PortraitRequest e;
    final /* synthetic */ RawReadView f;
    final /* synthetic */ ShotMetadata g;
    final /* synthetic */ RawReadView h;
    final /* synthetic */ ShotMetadata i;
    final /* synthetic */ InterleavedImageU16 j;
    final /* synthetic */ InterleavedImageU8 k;
    final /* synthetic */ gvl l;
    final /* synthetic */ dzt m;
    
    public gvh(final gvl l, final long c, final dzt m, final boolean d, final PortraitRequest e, final RawReadView f, final ShotMetadata g, final RawReadView h, final ShotMetadata i, final InterleavedImageU16 j, final InterleavedImageU8 k) {
        this.l = l;
        this.c = c;
        this.m = m;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.b = null;
    }
    
    public static final PortraitOpaqueHandleCallback d(final gvi gvi) {
        return new gvf(gvi);
    }
    
    @Override
    public final oey a() {
        final ofn f = ofn.f();
        final ofn f2 = ofn.f();
        final nsd a = gvl.a;
        this.l.e.execute(new gvg(this, this.m, f, this.d, f2, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.c));
        return f;
    }
    
    @Override
    public final oey b() {
        return ofi.n(false);
    }
    
    public final PortraitImageCallback c(final gvi gvi) {
        return new gve(this, gvi);
    }
}
