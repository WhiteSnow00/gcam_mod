import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cua
{
    private cua() {
    }
    
    public static Pair a(final fjc fjc) {
        final jdl jdl = new jdl();
        final float[] array = new float[16];
        jxc.n(fjc.a, jdl);
        jdl.b(array);
        final float n = (float)Math.asin(array[4]);
        float n2 = (float)Math.asin(array[5]);
        float n3 = n;
        if (array[6] > 0.0f) {
            n3 = -n;
            n2 = -n2;
        }
        return new Pair((Object)n3, (Object)n2);
    }
}
