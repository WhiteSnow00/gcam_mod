import android.os.StrictMode$ThreadPolicy;
import android.view.View$OnAttachStateChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.StrictMode;
import java.util.Locale;
import android.widget.ImageView;
import android.graphics.drawable.AnimatedVectorDrawable;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezs implements fal
{
    public final kjm a;
    private final Context b;
    private final ihg c;
    private final niz d;
    private final float e;
    private final klv f;
    private final cxl g;
    
    public ezs(final Context b, final kjm a, final ihg c, final niz d, final cxl g, final klv f) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
        this.e = TimeUnit.MILLISECONDS.toSeconds((int)g.a(cxs.t).c()) / 60.0f;
    }
    
    @Override
    public final void a() {
        final FrameLayout frameLayout = new FrameLayout(this.b);
        final Context b = this.b;
        int n;
        if (!this.g.k(cxr.at)) {
            n = 2131623977;
        }
        else {
            n = 2131623974;
        }
        View.inflate(b, n, (ViewGroup)frameLayout);
        final EduImageView eduImageView = (EduImageView)frameLayout.findViewById(2131427452);
        eduImageView.a(this.b.getString(2131951752), this.b.getString(2131951746));
        eduImageView.a.setBackgroundColor(0);
        final AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable)((ImageView)frameLayout.findViewById(2131427451)).getDrawable();
        if (this.d.g() && (boolean)this.f.aQ()) {
            final Context b2 = this.b;
            final fbo fbo = (fbo)this.d.c();
            final float e = this.e;
            final Locale default1 = Locale.getDefault();
            final String string = b2.getResources().getString(2131952149);
            final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                final String a = bw.a(default1, string, "count", e);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                ((TextView)frameLayout.findViewById(2131427681)).setText((CharSequence)a);
                ((LinearLayout)frameLayout.findViewById(2131427680)).setVisibility(0);
            }
            finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        frameLayout.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new ezr(this, animatedVectorDrawable, frameLayout));
        this.c.e(6, 2131951754, (View)frameLayout);
    }
}
