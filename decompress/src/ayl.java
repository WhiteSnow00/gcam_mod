import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

final class ayl
{
    private volatile azz a;
    private final bae b;
    
    public ayl(final bae b) {
        this.b = b;
    }
    
    public final azz a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    final bag a = this.b.a;
                    final File cacheDir = a.a.getCacheDir();
                    final azz azz = null;
                    azz a2 = null;
                    File file;
                    if (cacheDir == null) {
                        file = null;
                    }
                    else {
                        file = new File(cacheDir, a.b);
                    }
                    if (file == null) {
                        a2 = azz;
                    }
                    else if (file.isDirectory() || file.mkdirs()) {
                        a2 = new baf(file);
                    }
                    this.a = a2;
                }
                if (this.a == null) {
                    this.a = new baa();
                }
            }
        }
        return this.a;
    }
}
