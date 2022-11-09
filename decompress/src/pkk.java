import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pkk extends pkl
{
    private boolean b;
    
    public pkk(final File file) {
        super(file);
    }
    
    @Override
    public final File a() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return super.a;
    }
}
