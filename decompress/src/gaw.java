import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class gaw implements oen
{
    final /* synthetic */ gax a;
    private final /* synthetic */ int b;
    
    public gaw(final gax a) {
        this.a = a;
    }
    
    public gaw(final gax a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        switch (this.b) {
            default: {
                this.a.e.a.e("Failed to generate thumbnails", t);
                return;
            }
            case 3: {
                this.a.e.a.e("Failed to generate thumbnail", t);
                return;
            }
            case 2: {
                this.a.e.a.e("Failed to generate thumbnail", t);
                return;
            }
            case 1: {
                this.a.e.a.e("Jpeg encoding result failed, not updating remote thumbnail.", t);
                return;
            }
            case 0: {
                this.a.e.a.e("Failed to save image!", t);
            }
        }
    }
}
