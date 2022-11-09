import android.content.Context;
import android.app.ActivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bai
{
    final ActivityManager a;
    float b;
    final baj c;
    
    public bai(final Context context) {
        this.b = 1.0f;
        final ActivityManager a = (ActivityManager)context.getSystemService("activity");
        this.a = a;
        this.c = new baj(context.getResources().getDisplayMetrics());
        if (a.isLowRamDevice()) {
            this.b = 0.0f;
        }
    }
}
