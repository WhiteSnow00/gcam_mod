import android.graphics.Bitmap;
import com.google.android.apps.camera.ui.widget.ReviewImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccx implements cei
{
    public ReviewImageView a;
    private final kjm b;
    
    public ccx(final ixx ixx, final kjm b) {
        (this.b = b).b(new ccw(this, ixx));
    }
    
    @Override
    public final void a() {
        this.b.b(new ccu(this));
    }
    
    @Override
    public final void b(final Bitmap bitmap) {
        this.b.b(new ccv(this, bitmap));
    }
}
