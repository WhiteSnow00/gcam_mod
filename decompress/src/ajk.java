import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ajk
{
    private static final String a;
    
    static {
        a = aiy.b("WorkerFactory");
    }
    
    public static ajk c() {
        return new ajj();
    }
    
    public abstract ListenableWorker a(final Context p0, final String p1, final WorkerParameters p2);
    
    public final ListenableWorker b(final Context context, final String s, final WorkerParameters workerParameters) {
        final ListenableWorker a = this.a(context, s, workerParameters);
        ListenableWorker listenableWorker2 = null;
        Label_0188: {
            if (a == null) {
                Class clazz = null;
                try {
                    Class.forName(s).asSubclass(ListenableWorker.class);
                }
                finally {
                    aiy.a();
                    final String a2 = ajk.a;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid class: ");
                    sb.append(s);
                    final Throwable t;
                    aiy.e(a2, sb.toString(), t);
                    clazz = null;
                }
                if (clazz != null) {
                    try {
                        final ListenableWorker listenableWorker = (ListenableWorker)clazz.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    }
                    finally {
                        aiy.a();
                        final String a3 = ajk.a;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Could not instantiate ");
                        sb2.append(s);
                        final Throwable t2;
                        aiy.e(a3, sb2.toString(), t2);
                        listenableWorker2 = a;
                    }
                    break Label_0188;
                }
            }
            listenableWorker2 = a;
        }
        if (listenableWorker2 != null && listenableWorker2.d) {
            throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", this.getClass().getName(), s));
        }
        return listenableWorker2;
    }
}
