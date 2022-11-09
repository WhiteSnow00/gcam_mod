import android.content.DialogInterface$OnCancelListener;
import android.os.Looper;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jyd
{
    public final Activity a;
    private final njp b;
    
    public jyd(final Activity a) {
        this.a = a;
        this.b = new jyb(a);
    }
    
    public final void a(Intent setData) {
        if (!setData.getAction().equals("com.google.android.gms.googlehelp.HELP") || !setData.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int b = jqg.b((Context)this.a, 11925000);
        if (b == 0) {
            final Object a = this.b.a();
            final jym jym = (jym)a;
            jvu.a(jym.a);
            final jqw j = ((jqt)a).j;
            final jyk jyk = new jyk(j, setData, new WeakReference((T)jym.a));
            j.b(jyk);
            jvu.l(jyk);
            return;
        }
        setData = new Intent("android.intent.action.VIEW").setData(((GoogleHelp)setData.getParcelableExtra("EXTRA_GOOGLE_HELP")).q);
        if (b != 7) {
            if (this.a.getPackageManager().queryIntentActivities(setData, 0).size() > 0) {
                new kax(Looper.getMainLooper()).post((Runnable)new jyc(this, setData));
                return;
            }
        }
        else {
            b = 7;
        }
        final Activity a2 = this.a;
        if (jqg.d((Context)a2, b)) {
            b = 18;
        }
        jpw.a.d(a2, b, 0, null);
    }
}
