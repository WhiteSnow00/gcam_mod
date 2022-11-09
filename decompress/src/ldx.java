import android.hardware.camera2.CameraCharacteristics;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ldx
{
    public final ldr a;
    public final kwg b;
    public final kse c;
    public final krr d;
    public final lbk e;
    public final Set f;
    public final int g;
    public final kjk h;
    
    public ldx(final kwg b, final ldr a, final kjk h, final krr krr, final kse c, final lbk e, final lfh lfh) {
        this.b = b;
        this.a = a;
        this.h = h;
        this.c = c;
        this.e = e;
        this.d = krr.a("StreamMap");
        this.f = ((lff)lfh.a(b.a)).b;
        this.g = 64 - (byte)lfh.a(b.a).n(CameraCharacteristics.REQUEST_PIPELINE_MAX_DEPTH, 8);
    }
}
