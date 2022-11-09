import android.os.Environment;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etu
{
    public static final nsd a;
    public File b;
    public final File c;
    public final File d;
    public final eya e;
    public final hif f;
    public final hgy g;
    public final hwz h;
    public final hhw i;
    
    static {
        a = nsd.g("com/google/android/apps/camera/legacy/lightcycle/storage/LocalFileStorageManager");
    }
    
    public etu(final hfn hfn, final hwz h, final hgy g, final hhw i, final eya e, final hif f) {
        this.c = hfn.c("");
        this.d = hfn.c("panorama_sessions");
        File b = new File(Environment.getExternalStorageDirectory(), "panoramas");
        if (!b.mkdirs() && !b.exists()) {
            a.l(etu.a.b(), "Panorama directory not created.", '\u0588');
            b = null;
        }
        this.b = b;
        this.h = h;
        this.g = g;
        this.i = i;
        this.e = e;
        this.f = f;
    }
    
    public final File a() {
        final String value = String.valueOf(this.b.getAbsolutePath());
        if (value.length() != 0) {
            "Panorama directory is : ".concat(value);
        }
        else {
            new String("Panorama directory is : ");
        }
        File file2;
        final File file = file2 = new File(this.b, "thumbnails");
        if (!file.mkdirs()) {
            file2 = file;
            if (!file.exists()) {
                a.l(etu.a.b(), "Thumbnails directory not created.", '\u0589');
                file2 = null;
            }
        }
        return file2;
    }
}
