import android.util.Log;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class kfb extends kex
{
    public kfb() {
    }
    
    @Override
    public final void c(final Status status) {
        if (!status.b()) {
            final String value = String.valueOf(status);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 52);
            sb.append("disconnect(): Could not unregister listener: status=");
            sb.append(value);
            Log.e("UsageReportingClientImp", sb.toString());
        }
    }
}
