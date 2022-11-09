import android.content.IntentSender$SendIntentException;
import android.util.Log;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osp implements Runnable
{
    final /* synthetic */ otf a;
    
    public osp(final otf a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            final otf a = this.a;
            a.a.startIntentSenderForResult(a.b.getIntentSender(), this.a.c, (Intent)null, 0, 0, 0);
        }
        catch (final IntentSender$SendIntentException ex) {
            final String value = String.valueOf(ex);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 43);
            sb.append("Exception while starting next VR activity: ");
            sb.append(value);
            Log.e("DaydreamApi", sb.toString());
        }
    }
}
