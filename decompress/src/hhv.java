import java.io.File;
import java.io.FileFilter;

// 
// Decompiled by Procyon v0.6.0
// 

final class hhv implements FileFilter
{
    public hhv() {
    }
    
    @Override
    public final boolean accept(final File file) {
        return file.isDirectory();
    }
}
