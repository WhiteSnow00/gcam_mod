import java.io.OutputStream;
import java.io.InputStream;
import java.io.File;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class msp implements mso
{
    protected Uri a(final Uri uri) {
        throw null;
    }
    
    protected abstract mso b();
    
    @Override
    public InputStream d(final Uri uri) {
        throw null;
    }
    
    @Override
    public boolean f(final Uri uri) {
        throw null;
    }
    
    @Override
    public final void g(final Uri uri, final Uri uri2) {
        this.b().g(this.a(uri), this.a(uri2));
    }
    
    @Override
    public final OutputStream j(final Uri uri) {
        return this.b().j(this.a(uri));
    }
    
    @Override
    public final void k(final Uri uri) {
        this.b().k(this.a(uri));
    }
}
