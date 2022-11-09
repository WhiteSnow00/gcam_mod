import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class msg extends msi implements msb
{
    private final FileInputStream a;
    private final File b;
    
    public msg(final FileInputStream a, final File b) {
        super(a);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final File a() {
        return this.b;
    }
}
