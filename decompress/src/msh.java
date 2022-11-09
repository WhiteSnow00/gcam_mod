import java.io.OutputStream;
import java.io.File;
import java.io.FileOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class msh extends msj implements msb
{
    public final FileOutputStream a;
    private final File b;
    
    public msh(final FileOutputStream a, final File b) {
        super(a);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final File a() {
        return this.b;
    }
}
