import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;
import android.os.ParcelFileDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbj implements bbi
{
    private final /* synthetic */ int a;
    
    public bbj() {
    }
    
    public bbj(final int a) {
        this.a = a;
    }
    
    @Override
    public final Class a() {
        switch (this.a) {
            default: {
                return ParcelFileDescriptor.class;
            }
            case 0: {
                return InputStream.class;
            }
        }
    }
}
