import androidx.work.impl.background.systemalarm.SystemAlarmService;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akq implements ajm
{
    public static final String a;
    public final Context b;
    public final Map c;
    public final Object d;
    
    static {
        a = aiy.b("CommandHandler");
    }
    
    public akq(final Context b) {
        this.b = b;
        this.c = new HashMap();
        this.d = new Object();
    }
    
    static Intent b(final Context context) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }
    
    static Intent c(final Context context, final String s) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    static Intent d(final Context context, final String s, final boolean b) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", b);
        return intent;
    }
    
    static Intent e(final Context context, final String s) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    static Intent f(final Context context, final String s) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    @Override
    public final void a(final String s, final boolean b) {
        synchronized (this.d) {
            final ajm ajm = this.c.remove(s);
            if (ajm != null) {
                ajm.a(s, b);
            }
        }
    }
}
