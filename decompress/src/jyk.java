import android.os.Parcel;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.os.IInterface;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jyk extends jrs
{
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    
    public jyk(final jqw jqw, final Intent a, final WeakReference b) {
        this.a = a;
        this.b = b;
        super(jqw);
    }
}
