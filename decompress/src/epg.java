import android.graphics.Bitmap;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import android.view.ViewStub;
import android.view.View;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import com.google.android.apps.camera.ui.widget.ReviewImageView;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epg
{
    public static final nsd a;
    public final bqo b;
    public final imb c;
    public final Executor d;
    public final ReviewImageView e;
    public final ProgressOverlay f;
    public boolean g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/legacy/app/module/pckimageintent/ImageIntentModuleUI");
    }
    
    public epg(final bqo b, final View view, final Executor d, final imb c) {
        this.g = false;
        this.b = b;
        this.c = c;
        this.d = d;
        ((ViewStub)view.findViewById(2131427476)).inflate();
        this.e = (ReviewImageView)view.findViewById(2131427664);
        this.f = (ProgressOverlay)view.findViewById(2131427663);
        final CaptureAnimationOverlay captureAnimationOverlay = (CaptureAnimationOverlay)view.findViewById(2131427661);
        ((ViewfinderCover)view.findViewById(2131428135)).g = false;
    }
    
    public final void a(final boolean b) {
        kjm.a();
        this.b.k(b);
    }
    
    public final void b(final Bitmap bitmap, final boolean b) {
        monitorenter(this);
        Label_0021: {
            if (!b) {
                break Label_0021;
            }
            try {
                if (!this.g) {
                    kjm.a();
                    if (b) {
                        this.f.setVisibility(0);
                        this.f.a.start();
                    }
                    else {
                        this.f.a.stop();
                        this.f.setVisibility(8);
                    }
                    this.g = true;
                    this.e.b(bitmap);
                    final ReviewImageView e = this.e;
                    e.announceForAccessibility((CharSequence)e.getContext().getString(2131952397));
                }
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final boolean c() {
        return this.c.c();
    }
}
