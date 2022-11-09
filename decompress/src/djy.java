import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djy implements jgb, krc
{
    public niz a;
    private final Context b;
    private final kjm c;
    private final hzf d;
    private final hzg e;
    private final kse f;
    private jgd g;
    private final lit h;
    
    public djy(final Context b, final lit h, final kse f, final kjm c, final hzf d, final hzg e) {
        this.a = nii.a;
        this.b = b;
        this.h = h;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final jfy a(final jgd g) {
        if (!this.a.g() || this.g != g) {
            if (this.a.g()) {
                ((djw)this.a.c()).close();
            }
            this.g = g;
            this.a = niz.i(new djw(g, this.b, this.h, this.f, djt.c));
        }
        final hzg e = this.e;
        final hzi a = hzj.a();
        a.a = "FaceObfuscation";
        a.c(this.c);
        a.f(this.d);
        a.e(new djx(this, 1));
        a.d(new djx(this));
        e.d(a.a());
        return (jfy)this.a.c();
    }
    
    @Override
    public final void close() {
        this.g = null;
        this.a = nii.a;
    }
}
