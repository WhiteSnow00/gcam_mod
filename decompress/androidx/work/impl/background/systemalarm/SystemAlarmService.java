// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.content.Context;

public class SystemAlarmService extends n implements akx
{
    private akz a;
    private boolean b;
    
    static {
        aiy.b("SystemAlarmService");
    }
    
    private final void b() {
        final akz a = new akz((Context)this);
        this.a = a;
        if (a.i != null) {
            aiy.a();
            aiy.e(akz.a, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            return;
        }
        a.i = this;
    }
    
    @Override
    public final void a() {
        this.b = true;
        aiy.a().d(new Throwable[0]);
        aod.b();
        this.stopSelf();
    }
    
    @Override
    public final void onCreate() {
        super.onCreate();
        this.b();
        this.b = false;
    }
    
    @Override
    public final void onDestroy() {
        super.onDestroy();
        this.b = true;
        this.a.c();
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        super.onStartCommand(intent, n, n2);
        if (this.b) {
            aiy.a();
            aiy.f(new Throwable[0]);
            this.a.c();
            this.b();
            this.b = false;
        }
        if (intent != null) {
            this.a.f(intent, n2);
        }
        return 3;
    }
}
