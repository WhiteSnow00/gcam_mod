// 
// Decompiled by Procyon v0.6.0
// 

final class bhb
{
    final Class a;
    final awi b;
    private final Class c;
    
    public bhb(final Class c, final Class a, final awi b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final boolean a(final Class clazz, final Class clazz2) {
        return this.c.isAssignableFrom(clazz) && clazz2.isAssignableFrom(this.a);
    }
}
