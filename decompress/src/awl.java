import java.io.FileNotFoundException;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awl extends axb
{
    public awl(final ContentResolver contentResolver, final Uri uri) {
        super(contentResolver, uri);
    }
    
    @Override
    public final Class a() {
        return AssetFileDescriptor.class;
    }
}
