import java.util.Iterator;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class air extends ajk
{
    private static final String b;
    public final List a;
    
    static {
        b = aiy.b("DelegatingWkrFctry");
    }
    
    public air() {
        this.a = new CopyOnWriteArrayList();
    }
    
    @Override
    public final ListenableWorker a(final Context context, String format, final WorkerParameters workerParameters) {
        for (final ajk ajk : this.a) {
            try {
                final ListenableWorker a = ajk.a(context, format, workerParameters);
                if (a != null) {
                    return a;
                }
                continue;
            }
            finally {
                format = String.format("Unable to instantiate a ListenableWorker (%s)", format);
                aiy.a();
                aiy.e(air.b, format, (Throwable)context);
            }
            break;
        }
        return null;
    }
}
