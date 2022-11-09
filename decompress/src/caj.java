import com.google.android.apps.camera.brella.mediastore.MediaListeningService;
import android.app.job.JobParameters;

// 
// Decompiled by Procyon v0.6.0
// 

public final class caj implements oen
{
    final /* synthetic */ JobParameters a;
    final /* synthetic */ MediaListeningService b;
    
    public caj(final MediaListeningService b, final JobParameters a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        final int c = MediaListeningService.c;
        MediaListeningService.a(this.b.getApplicationContext());
        this.b.jobFinished(this.a, false);
    }
}
