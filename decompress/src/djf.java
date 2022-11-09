import com.google.android.apps.camera.faceboxes.FaceView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djf
{
    public final FaceView a;
    
    public djf(final FaceView a) {
        (this.a = a).setZOrderOnTop(true);
        a.getHolder().setFormat(-2);
    }
    
    public final void a() {
        this.a.a();
        this.a.setVisibility(0);
    }
    
    public final void b() {
        this.a.a();
        this.a.setVisibility(4);
    }
}
