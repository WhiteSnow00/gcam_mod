import android.content.res.AssetFileDescriptor;
import java.io.FileNotFoundException;
import android.os.ParcelFileDescriptor;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awx extends axb
{
    public awx(final ContentResolver contentResolver, final Uri uri) {
        super(contentResolver, uri);
    }
    
    @Override
    public final Class a() {
        return ParcelFileDescriptor.class;
    }
}
