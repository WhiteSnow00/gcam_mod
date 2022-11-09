import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggh implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final /* synthetic */ int e;
    
    public ggh(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public ggh(final pii b, final pii d, final pii a, final pii c, final int e) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public ggh(final pii d, final pii c, final pii b, final pii a, final int e, final byte[] array) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ggh(final pii a, final pii c, final pii d, final pii b, final int e, final char[] array) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public ggh(final pii a, final pii d, final pii c, final pii b, final int e, final int[] array) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public ggh(final pii c, final pii a, final pii d, final pii b, final int e, final short[] array) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public static ggh a(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new ggh(pii, pii2, pii3, pii4);
    }
    
    public static ggh b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new ggh(pii, pii2, pii3, pii4, 1);
    }
    
    public static ggh c(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new ggh(pii, pii2, pii3, pii4, 2, (byte[])null);
    }
    
    public static ggh d(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new ggh(pii, pii2, pii3, pii4, 3, (char[])null);
    }
    
    public static ggh e(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new ggh(pii, pii2, pii3, pii4, 4, (short[])null);
    }
    
    public static ggh f(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new ggh(pii, pii2, pii3, pii4, 5, (int[])null);
    }
}
