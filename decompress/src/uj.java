import java.io.Serializable;
import android.support.wearable.complications.ComplicationText;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.TimeDifferenceText;
import android.support.wearable.complications.TimeFormatText;
import android.support.wearable.complications.rendering.ComplicationStyle$Builder;
import j$.time.Instant;
import java.util.Collection;
import java.util.List;
import android.net.Uri;
import java.util.ArrayList;
import android.accounts.Account;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import android.app.PendingIntent;
import com.google.android.gms.common.data.BitmapTeleporter;
import android.os.ParcelFileDescriptor;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import android.database.CursorWindow;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uj implements Parcelable$Creator
{
    private final /* synthetic */ int a;
    
    public uj() {
    }
    
    public uj(final int a) {
        this.a = a;
    }
}
