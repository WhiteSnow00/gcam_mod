import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mlz
{
    public final float a;
    public final Random b;
    
    public mlz(final Random b, final float a) {
        boolean b2 = false;
        if (a >= 0.0f && a <= 1.0f) {
            b2 = true;
        }
        njo.e(b2, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = a;
        this.b = b;
    }
}
