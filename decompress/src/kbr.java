import java.io.Serializable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import android.os.IBinder;
import android.app.PendingIntent;
import android.content.Intent;
import java.util.List;
import java.util.ArrayList;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kbr implements Parcelable$Creator
{
    private final /* synthetic */ int a;
    
    public kbr() {
    }
    
    public kbr(final int a) {
        this.a = a;
    }
    
    public static boolean a(final int n) {
        return n == 0;
    }
    
    public static boolean b(final Object o) {
        return o == null;
    }
}
