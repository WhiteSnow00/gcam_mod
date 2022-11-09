// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.app.silentfeedback;

import android.content.pm.PackageManager$NameNotFoundException;
import java.util.concurrent.Executor;
import android.app.ApplicationErrorReport$CrashInfo;
import android.app.ApplicationErrorReport;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public final class SilentFeedbackService extends Service
{
    private final Object a;
    private int b;
    private int c;
    
    public SilentFeedbackService() {
        this.a = new Object();
        this.b = 0;
        this.c = 0;
    }
    
    public final void a() {
        synchronized (this.a) {
            final int b = this.b - 1;
            this.b = b;
            Integer value;
            if (b == 0) {
                value = this.c;
            }
            else {
                value = null;
            }
            monitorexit(this.a);
            if (value != null) {
                this.stopSelf((int)value);
            }
        }
    }
    
    public final IBinder onBind(final Intent intent) {
        return null;
    }
    
    public final int onStartCommand(final Intent intent, int throwLineNumber, final int c) {
        Object a = this.a;
        synchronized (a) {
            ++this.b;
            this.c = c;
            monitorexit(a);
            try {
                throwLineNumber = this.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                if (throwLineNumber >= 6577000) {
                    a = new jqt(this.getApplicationContext());
                    final jxr jxr = new jxr();
                    jxr.d = new ApplicationErrorReport();
                    jxr.d.crashInfo = new ApplicationErrorReport$CrashInfo();
                    jxr.d.crashInfo.throwLineNumber = -1;
                    jxs jxs;
                    if (intent == null) {
                        jxs = ltl.o(jxr);
                    }
                    else {
                        jxr.a = " ";
                        jxr.c = true;
                        if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.exceptionClass")) {
                            jxr.d.crashInfo.exceptionClassName = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.exceptionClass");
                        }
                        if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.stackTrace")) {
                            jxr.d.crashInfo.stackTrace = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.stackTrace");
                        }
                        if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingClass")) {
                            jxr.d.crashInfo.throwClassName = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingClass");
                        }
                        if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingFile")) {
                            jxr.d.crashInfo.throwFileName = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingFile");
                        }
                        if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingLine")) {
                            throwLineNumber = intent.getIntExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingLine", -1);
                            jxr.d.crashInfo.throwLineNumber = throwLineNumber;
                        }
                        if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingMethod")) {
                            jxr.d.crashInfo.throwMethodName = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingMethod");
                        }
                        if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.categoryTag")) {
                            jxr.b = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.categoryTag");
                        }
                        jxs = ltl.o(jxr);
                    }
                    jvu.l(jxq.a(((jqt)a).j, jxs)).g(odx.a, new brd(this));
                    return 2;
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {}
            this.a();
            return 2;
        }
    }
}
