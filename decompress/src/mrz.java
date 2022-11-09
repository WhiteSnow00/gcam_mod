import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrz implements mso
{
    public mrz() {
        new mug();
    }
    
    public mrz(final byte[] array) {
    }
    
    @Override
    public final File c(final Uri uri) {
        return mry.a(uri);
    }
    
    @Override
    public final InputStream d(final Uri uri) {
        final File a = mry.a(uri);
        return new msg(new FileInputStream(a), a);
    }
    
    @Override
    public final String e() {
        return "file";
    }
    
    @Override
    public final boolean f(final Uri uri) {
        return mry.a(uri).exists();
    }
    
    @Override
    public final void g(final Uri uri, final Uri uri2) {
        final File a = mry.a(uri);
        final File a2 = mry.a(uri2);
        och.r(a2);
        if (a.renameTo(a2)) {
            return;
        }
        throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
    }
    
    @Override
    public final OutputStream j(final Uri uri) {
        final File a = mry.a(uri);
        och.r(a);
        return new msh(new FileOutputStream(a), a);
    }
    
    @Override
    public final void k(final Uri uri) {
        final File a = mry.a(uri);
        if (a.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (a.delete()) {
            return;
        }
        if (!a.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }
}
