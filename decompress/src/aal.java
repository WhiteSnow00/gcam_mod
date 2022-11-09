import android.view.WindowManager$LayoutParams;
import android.view.Window;
import android.os.IBinder;
import android.app.Activity;
import android.view.View;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class aal
{
    public static Executor a(final Context context) {
        return context.getMainExecutor();
    }
    
    public static void b(final View view, final aex aex) {
        view.setTag(2131428131, (Object)aex);
    }
    
    public static IBinder c(final Activity activity) {
        Window window;
        if (activity == null) {
            window = null;
        }
        else {
            window = activity.getWindow();
        }
        if (window != null) {
            final WindowManager$LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                return attributes.token;
            }
        }
        return null;
    }
    
    public void d(final int n) {
    }
    
    public void e(final int n, final float n2, final int n3) {
    }
    
    public void f(final int n) {
        throw null;
    }
}
