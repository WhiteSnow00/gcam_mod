// 
// Decompiled by Procyon v0.6.0
// 

public final class oul implements oun
{
    private pii a;
    
    public static void a(final pii pii, final pii a) {
        a.getClass();
        final oul oul = (oul)pii;
        if (oul.a == null) {
            oul.a = a;
            return;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final Object get() {
        final pii a = this.a;
        if (a != null) {
            return a.get();
        }
        throw new IllegalStateException();
    }
}
