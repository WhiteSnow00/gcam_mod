import com.google.android.apps.camera.rewind.ui.RewindControllerView;
import com.google.android.apps.camera.rewind.ui.RewindPreview;
import com.google.android.apps.camera.ui.views.ViewfinderCover;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbu extends hcz implements huk
{
    public final huj a;
    public final hul b;
    public final hul c;
    public final hul d;
    
    public hbu(final hcp hcp, final ViewfinderCover viewfinderCover, final RewindPreview rewindPreview, final RewindControllerView rewindControllerView) {
        super(hcp, viewfinderCover, rewindPreview, rewindControllerView);
        final hul b = new hul(new hbr(this), new huh[0]);
        this.b = b;
        this.c = new hul(new hbs(this), new huh[0]);
        this.d = new hul(new hbt(this), new huh[0]);
        (this.a = new huj(b, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((hcu)this.a.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((hcu)this.a.a().a).b();
    }
    
    @Override
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((hcu)this.a.a().a).c();
    }
    
    @Override
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
    }
    
    @Override
    public final void f() {
        this.a.c();
    }
    
    @Override
    public final void g() {
        this.a.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}
