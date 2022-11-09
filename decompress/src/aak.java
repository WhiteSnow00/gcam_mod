import android.support.v7.widget.RecyclerView;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class aak
{
    public static ComponentName c(final Context context, final Intent intent) {
        return context.startForegroundService(intent);
    }
    
    public static float d(final float[] array, final float n) {
        if (n >= 1.0f) {
            return 1.0f;
        }
        if (n <= 0.0f) {
            return 0.0f;
        }
        final int min = Math.min((int)(200.0f * n), 199);
        final float n2 = array[min];
        return n2 + (n - min * 0.005f) / 0.005f * (array[min + 1] - n2);
    }
    
    public void a(final RecyclerView recyclerView, final int n, final int n2) {
    }
    
    public void b(final int n) {
    }
}
