import java.io.FileNotFoundException;
import android.provider.ContactsContract$Contacts;
import java.io.InputStream;
import android.net.Uri;
import android.content.ContentResolver;
import android.content.UriMatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axf extends axb
{
    private static final UriMatcher a;
    
    static {
        final UriMatcher a2 = new UriMatcher(-1);
        (a = a2).addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        a2.addURI("com.android.contacts", "contacts/lookup/*", 1);
        a2.addURI("com.android.contacts", "contacts/#/photo", 2);
        a2.addURI("com.android.contacts", "contacts/#", 3);
        a2.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        a2.addURI("com.android.contacts", "phone_lookup/*", 5);
    }
    
    public axf(final ContentResolver contentResolver, final Uri uri) {
        super(contentResolver, uri);
    }
    
    private static final InputStream e(final ContentResolver contentResolver, final Uri uri) {
        return ContactsContract$Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
    
    @Override
    public final Class a() {
        return InputStream.class;
    }
}
