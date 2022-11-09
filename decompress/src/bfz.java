// 
// Decompiled by Procyon v0.6.0
// 

final class bfz
{
    final bfy a;
    private final Class b;
    private final Class c;
    
    public bfz(final Class b, final Class c, final bfy a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final boolean a(final Class clazz, final Class clazz2) {
        return this.b.isAssignableFrom(clazz) && clazz2.isAssignableFrom(this.c);
    }
}
