import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfs implements klj, kri
{
    private final krr a;
    private final kkz b;
    private final fxu c;
    private int d;
    
    public gfs(final krq krq, final fxu c, final ggu ggu) {
        this.a = krq.a("AutoFlashIndicator");
        this.c = c;
        final boolean equals = ((ggv)ggu.aQ()).equals(ggv.c);
        boolean b = false;
        if (equals && c.F()) {
            b = true;
        }
        this.b = new kkz(b);
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.b.a(kri, executor);
    }
}
