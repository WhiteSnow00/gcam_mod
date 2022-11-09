// 
// Decompiled by Procyon v0.6.0
// 

abstract class lhq
{
    public lhq() {
    }
    
    public static lhq c(final lht[] array, final pii pii) {
        if (array.length == 0) {
            return new lhp(pii);
        }
        return new lho(pii);
    }
    
    public abstract void a(final Object p0, final lhu p1);
    
    public abstract void b(final lih p0, final lhz p1);
}
