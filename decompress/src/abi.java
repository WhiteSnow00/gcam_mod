import android.content.ClipData;
import android.content.ClipData$Item;
import android.util.Log;
import android.os.Parcelable;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abi extends InputConnectionWrapper
{
    final /* synthetic */ pc a;
    
    public abi(final InputConnection inputConnection, final pc a) {
        this.a = a;
        super(inputConnection, false);
    }
    
    public final boolean commitContent(final InputContentInfo inputContentInfo, final int n, final Bundle bundle) {
        final pc a = this.a;
        abk abk;
        if (inputContentInfo == null) {
            abk = null;
        }
        else {
            abk = new abk(new abj(inputContentInfo));
        }
        Bundle e = null;
        Label_0116: {
            if ((n & 0x1) != 0x0) {
                try {
                    abk.a.a.requestPermission();
                    final InputContentInfo a2 = abk.a.a;
                    if (bundle == null) {
                        e = new Bundle();
                    }
                    else {
                        e = new Bundle(bundle);
                    }
                    e.putParcelable("android.support.v4.view.extra.INPUT_CONTENT_INFO", (Parcelable)a2);
                    break Label_0116;
                }
                catch (final Exception ex) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", (Throwable)ex);
                    return super.commitContent(inputContentInfo, n, bundle);
                }
            }
            e = bundle;
        }
        final hv hv = new hv(new ClipData(abk.a.a.getDescription(), new ClipData$Item(abk.a.a.getContentUri())), 2);
        hv.d = abk.a.a.getLinkUri();
        hv.e = e;
        if (ik.o(a.a, hv.a()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, n, bundle);
    }
}
