import java.util.Set;
import android.content.Context;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eat
{
    private static final nsd b;
    public final String a;
    private final File c;
    private final hwy d;
    
    static {
        b = nsd.g("com/google/android/apps/camera/imax/ImaxDataset");
    }
    
    public eat(final Context context, final hwy d, final hwz hwz, final Set set) {
        final String b = hwz.b(System.currentTimeMillis());
        final File file = new File(context.getCacheDir(), "datasets");
        final File c = new File(file, b);
        synchronized (set) {
            set.add(c.toString());
            monitorexit(set);
            if (!file.exists()) {
                file.mkdir();
            }
            if (!c.mkdirs()) {
                a.l(eat.b.b(), "Failed to create directory", '\u042d');
            }
            this.c = c;
            this.a = c.getName();
            this.d = d;
        }
    }
    
    public final String a() {
        final String parent = this.c.getParent();
        final String separator = File.separator;
        final String name = this.c.getName();
        final StringBuilder sb = new StringBuilder(String.valueOf(parent).length() + String.valueOf(separator).length() + String.valueOf(name).length());
        sb.append(parent);
        sb.append(separator);
        sb.append(name);
        return sb.toString();
    }
    
    public final String b() {
        final String a = this.a();
        final String separator = File.separator;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 11 + String.valueOf(separator).length());
        sb.append(a);
        sb.append(separator);
        sb.append("capture.mp4");
        return sb.toString();
    }
    
    public final void c() {
        final String value = String.valueOf(this.d.a());
        final String separator = File.separator;
        final String a = this.a;
        String.valueOf(value).length();
        String.valueOf(separator).length();
        String.valueOf(a).length();
    }
}
