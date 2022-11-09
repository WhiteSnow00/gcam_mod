import android.os.Process;
import android.util.Log;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class mpz implements Runnable
{
    final /* synthetic */ ofb a;
    final /* synthetic */ TimeUnit b;
    
    public mpz(final ofb a, final TimeUnit b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
        final int importance = activityManager$RunningAppProcessInfo.importance;
        final StringBuilder sb = new StringBuilder(28);
        sb.append("Memory state is: ");
        sb.append(importance);
        Log.w("ProcessReaper", sb.toString());
        if (activityManager$RunningAppProcessInfo.importance >= 400) {
            Log.w("ProcessReaper", "Killing process to refresh experiment configuration");
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
        mpp.a(this.a.d(this, 10L, this.b));
    }
}
