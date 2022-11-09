import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.hardware.Camera$Parameters;
import android.hardware.camera2.CameraCharacteristics;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqu extends asx
{
    public final atm a;
    public boolean b;
    final /* synthetic */ ard c;
    private final ard d;
    private final int e;
    private final are f;
    private atu g;
    
    public aqu(final ard c, final ard d, final int e, final atm a, final CameraCharacteristics cameraCharacteristics) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
        this.f = new are(cameraCharacteristics);
        this.g = null;
        this.b = true;
    }
    
    @Override
    public final int a() {
        return this.e;
    }
    
    @Override
    public final Camera$Parameters b() {
        return null;
    }
    
    @Override
    public final Handler c() {
        return this.c.b;
    }
    
    @Override
    public final atd d() {
        return this.d;
    }
    
    @Override
    public final atl e() {
        return this.f;
    }
    
    @Override
    public final atu f() {
        if (this.g == null) {
            this.g = this.c.b.b();
        }
        return this.g;
    }
    
    @Override
    public final atv g() {
        return this.c.c;
    }
    
    @Override
    public final atx h() {
        return this.c.d;
    }
    
    @Override
    public final void i(final byte[] array) {
    }
    
    @Override
    public final void j(final Handler handler, final asg asg) {
        try {
            this.c.d.a(new aqq(this, asg, handler));
        }
        catch (final RuntimeException ex) {
            this.d.g.c(ex);
        }
    }
    
    @Override
    public final void k(final boolean b) {
        this.b = b;
    }
    
    @Override
    public final void l(final SurfaceTexture surfaceTexture) {
        this.f().g = true;
        super.l(surfaceTexture);
    }
    
    @Override
    public final void m(final Handler handler, final esl esl) {
    }
    
    @Override
    public final void n(final Handler handler, final esl esl) {
    }
    
    @Override
    public final void o(final atu g) {
        if (g == null) {
            auc.c(ard.a, "null parameters in applySettings()");
            return;
        }
        if (!(g instanceof arf)) {
            auc.a(ard.a, "Provided settings not compatible with the backing framework API");
            return;
        }
        if (this.s(g, -2)) {
            this.g = g;
        }
    }
    
    @Override
    public final void p() {
        this.f().g = true;
        super.l(null);
    }
    
    @Override
    public final void q(final Handler handler, final esn esn, final aso aso, final aso aso2) {
        final arc arc = new arc(this, esn, handler, aso2);
        try {
            this.c.d.a(new aqt(this, arc));
        }
        catch (final RuntimeException ex) {
            this.d.g.c(ex);
        }
    }
}
