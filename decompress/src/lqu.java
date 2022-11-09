import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqu extends ClassLoader
{
    private final ClassLoader a;
    private final Set b;
    
    public lqu(final ClassLoader a, final Set b) {
        super(a.getParent());
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected final Class findClass(final String s) {
        if (this.b.contains(s)) {
            return this.a.loadClass(s);
        }
        return super.findClass(s);
    }
}
