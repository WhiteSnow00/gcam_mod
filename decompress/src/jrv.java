import android.app.AlertDialog;
import android.app.PendingIntent;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.app.AlertDialog$Builder;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.content.DialogInterface$OnCancelListener;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiActivity;

// 
// Decompiled by Procyon v0.6.0
// 

final class jrv implements Runnable
{
    final /* synthetic */ jrw a;
    private final jru b;
    
    public jrv(final jrw a, final jru b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (!this.a.a) {
            return;
        }
        final jps b = this.b.b;
        if (b.b()) {
            final jrw a = this.a;
            final jsx f = a.f;
            final Activity l = a.l();
            final PendingIntent d = b.d;
            jvu.a(d);
            f.startActivityForResult(GoogleApiActivity.a((Context)l, d, this.b.a, false), 1);
            return;
        }
        final jrw a2 = this.a;
        if (a2.d.g((Context)a2.l(), b.c, null) != null) {
            final jrw a3 = this.a;
            final jpw d2 = a3.d;
            final Activity i = a3.l();
            final jrw a4 = this.a;
            final jsx f2 = a4.f;
            final int c = b.c;
            final Dialog a5 = d2.a((Context)i, c, new juv(d2.g((Context)i, c, "d"), f2), (DialogInterface$OnCancelListener)a4);
            if (a5 == null) {
                return;
            }
            d2.b(i, a5, "GooglePlayServicesErrorDialog", (DialogInterface$OnCancelListener)a4);
        }
        else {
            if (b.c == 18) {
                final jrw a6 = this.a;
                final jpw d3 = a6.d;
                final Activity j = a6.l();
                final jrw a7 = this.a;
                final ProgressBar view = new ProgressBar((Context)j, (AttributeSet)null, 16842874);
                view.setIndeterminate(true);
                view.setVisibility(0);
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)j);
                alertDialog$Builder.setView((View)view);
                alertDialog$Builder.setMessage((CharSequence)jur.d((Context)j, 18));
                alertDialog$Builder.setPositiveButton((CharSequence)"", (DialogInterface$OnClickListener)null);
                final AlertDialog create = alertDialog$Builder.create();
                d3.b(j, (Dialog)create, "GooglePlayServicesUpdatingDialog", (DialogInterface$OnCancelListener)a7);
                final Context applicationContext = this.a.l().getApplicationContext();
                final jss jss = new jss(this, (Dialog)create);
                final IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                final jst jst = new jst(jss);
                applicationContext.registerReceiver((BroadcastReceiver)jst, intentFilter);
                jst.a = applicationContext;
                if (!jqg.f(applicationContext)) {
                    jss.a();
                    jst.a();
                }
                return;
            }
            this.a.a(b, this.b.a);
        }
    }
}
