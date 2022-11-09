// 
// Decompiled by Procyon v0.6.0
// 

final class bce
{
    final Class a;
    final bbx b;
    private final Class c;
    
    public bce(final Class c, final Class a, final bbx b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final boolean a(final Class clazz) {
        return this.c.isAssignableFrom(clazz);
    }
}
