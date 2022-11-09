import android.os.Parcelable$Creator;
import android.view.View;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.common.api.Status;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;
import android.view.ViewGroup;
import android.app.Activity;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

final class jyj extends jyo
{
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ jyk c;
    
    public jyj(final Intent a, final WeakReference b, final jyk c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final GoogleHelp a) {
        this.a.putExtra("EXTRA_START_TICK", System.nanoTime());
        final Activity activity = (Activity)this.b.get();
        if (activity == null) {
            this.c.h(jyl.a);
            return;
        }
        a.z = jpw.b;
        final TogglingData w = a.w;
        if (w != null) {
            String c = activity.getTitle().toString();
            final int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0) {
                final ViewGroup viewGroup = (ViewGroup)activity.findViewById(identifier);
                if (viewGroup != null) {
                    for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                        final View child = viewGroup.getChildAt(i);
                        if (child instanceof TextView) {
                            c = ((TextView)child).getText().toString();
                            break;
                        }
                    }
                }
            }
            w.c = c;
        }
        final jyk c2 = this.c;
        final Intent a2 = this.a;
        if (a2.hasExtra("EXTRA_GOOGLE_HELP")) {
            a2.putExtra("EXTRA_GOOGLE_HELP", (Parcelable)a);
        }
        else if (a2.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            final Parcelable$Creator creator = jyg.CREATOR;
            final byte[] byteArrayExtra = a2.getByteArrayExtra("EXTRA_IN_PRODUCT_HELP");
            jwe jwe;
            if (byteArrayExtra == null) {
                jwe = null;
            }
            else {
                jvu.a(creator);
                final int length = byteArrayExtra.length;
                final Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArrayExtra, 0, length);
                obtain.setDataPosition(0);
                jwe = (jwe)creator.createFromParcel(obtain);
                obtain.recycle();
            }
            final jyg jyg = (jyg)jwe;
            jyg.a = a;
            final Parcel obtain2 = Parcel.obtain();
            ul.c(jyg, obtain2, 0);
            final byte[] marshall = obtain2.marshall();
            obtain2.recycle();
            a2.putExtra("EXTRA_IN_PRODUCT_HELP", marshall);
        }
        new kax(Looper.getMainLooper()).post((Runnable)new jyi(activity, a2));
        c2.j(Status.a);
    }
}
