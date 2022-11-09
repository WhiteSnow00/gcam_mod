import java.util.concurrent.Executor;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbt implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public dbt(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public dbt(final pii b, final pii a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public dbt(final pii a, final pii b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dbt(final pii a, final pii b, final int c, final char[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dbt(final pii a, final pii b, final int c, final short[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static dbt a(final pii pii, final pii pii2) {
        return new dbt(pii, pii2, 6);
    }
    
    public static dbt b(final pii pii, final pii pii2) {
        return new dbt(pii, pii2, 7, (char[])null);
    }
    
    public static dbt c(final pii pii, final pii pii2) {
        return new dbt(pii, pii2, 9);
    }
    
    public static dbt d(final pii pii, final pii pii2) {
        return new dbt(pii, pii2, 10, (short[])null);
    }
    
    public static dbt e(final pii pii, final pii pii2) {
        return new dbt(pii, pii2, 20);
    }
}
