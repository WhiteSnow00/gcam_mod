import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gct
{
    public gct() {
        new fzu();
    }
    
    public static final gcu a(final String s, final List list) {
        return new gcu(s, list);
    }
    
    public static final void b(final String s, final boolean b, final List list) {
        if (!b) {
            list.add(s);
        }
    }
}
