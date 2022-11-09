import java.io.File;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class car
{
    public final kse a;
    public final Set b;
    private caq c;
    
    public car(final kse a, final Set b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final String s) {
        (this.c = new caq(this)).execute((Object[])new String[] { s });
    }
    
    public final void b(final File file) {
        for (final File file2 : (File[])nov.z(file.listFiles())) {
            if (file2.isDirectory()) {
                this.b(file2);
            }
            else {
                file2.delete();
            }
        }
        file.delete();
    }
}
