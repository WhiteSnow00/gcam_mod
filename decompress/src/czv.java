import java.util.Iterator;
import com.integrity.annotations.PaiConfiguration;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import j$.util.Optional;
import java.util.HashMap;
import android.content.ContentProviderOperation;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czv
{
    private static final nsd a;
    private final ContentResolver b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/data/MarsStoreDataLoader");
    }
    
    public czv(final ContentResolver b) {
        this.b = b;
    }
    
    @PaiConfiguration(continueOnFailure = false, modeFallback = false)
    public Map a(List o) {
        final ArrayList list = new ArrayList();
        o = ((List<Uri>)o).iterator();
        while (((Iterator)o).hasNext()) {
            final Uri uri = ((Iterator<Uri>)o).next();
            list.add(ContentProviderOperation.newAssertQuery(uri).withValue("_id", (Object)uri.getLastPathSegment()).build());
        }
        final HashMap hashMap = new HashMap();
        try {
            o = this.b.applyBatch("com.google.android.libraries.photos.api.mars", list);
            for (int i = 0; i < ((Iterator<Uri>)o).length; ++i) {
                hashMap.put(((ContentProviderOperation)list.get(i)).getUri(), (int)Optional.ofNullable((Object)o[i].count).orElse((Object)0) > 0);
            }
            return hashMap;
        }
        catch (final RemoteException o) {}
        catch (final OperationApplicationException ex) {}
        a.m(czv.a.b(), "Failed to query for mars items.", '\u029a', (Throwable)o);
        return hashMap;
    }
}
