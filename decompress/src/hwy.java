import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwy
{
    private final File a;
    
    public hwy(final File a) {
        this.a = a;
    }
    
    public final File a() {
        final boolean mkdirs = this.a.mkdirs();
        boolean b = true;
        if (!mkdirs) {
            if (!this.a.isDirectory()) {
                b = false;
            }
        }
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 44);
        sb.append("Folder doesn't exist and cannot be created: ");
        sb.append(value);
        njo.p(b, sb.toString());
        return this.a;
    }
    
    public final String b() {
        return this.a.getAbsolutePath();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
