import android.content.Intent;
import com.google.android.apps.camera.prewarm.NoOpPrewarmService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ehp
{
    public final Context a;
    private final eho b;
    
    public ehp(final Context a, final eho b) {
        this.a = a;
        this.b = b;
    }
    
    public static void b(final Context context) {
        context.startService(new Intent(context, (Class)NoOpPrewarmService.class));
    }
    
    public final boolean a() {
        return this.b.a();
    }
}
