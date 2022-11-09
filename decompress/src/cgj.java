import java.io.IOException;
import java.io.FileDescriptor;
import android.os.ParcelFileDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgj implements cgr
{
    private static final nsd a;
    private final ParcelFileDescriptor b;
    private final FileDescriptor c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/file/FileDescriptorOutputVideo");
    }
    
    public cgj(final ParcelFileDescriptor b) {
        this.b = b;
        this.c = b.getFileDescriptor();
    }
    
    @Override
    public final long a() {
        return this.b.getStatSize();
    }
    
    @Override
    public final niz c() {
        return nii.a;
    }
    
    @Override
    public final void close() {
        try {
            this.b.close();
        }
        catch (final IOException ex) {
            a.m(cgj.a.b(), "Error closing parcelFileDescriptor.", '\u01a4', ex);
        }
    }
    
    @Override
    public final niz d() {
        return nii.a;
    }
    
    @Override
    public final oey e() {
        return ofi.n(this.c);
    }
    
    @Override
    public final FileDescriptor f() {
        throw null;
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final boolean h() {
        return true;
    }
    
    @Override
    public final void i() {
    }
}
