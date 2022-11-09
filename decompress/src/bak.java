import android.app.ActivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bak
{
    public final int a;
    public final int b;
    public final int c;
    
    public bak(final bai bai) {
        int c;
        if (!bai.a.isLowRamDevice()) {
            c = 4194304;
        }
        else {
            c = 2097152;
        }
        this.c = c;
        final ActivityManager a = bai.a;
        final float n = (float)(a.getMemoryClass() * 1048576);
        float n2;
        if (!a.isLowRamDevice()) {
            n2 = 0.4f;
        }
        else {
            n2 = 0.33f;
        }
        final int round = Math.round(n * n2);
        final float n3 = (float)(bai.c.a.widthPixels * bai.c.a.heightPixels * 4);
        final int round2 = Math.round(bai.b * n3);
        final int round3 = Math.round(n3 + n3);
        final int n4 = round - c;
        if (round3 + round2 <= n4) {
            this.b = round3;
            this.a = round2;
            return;
        }
        final float n5 = n4 / (bai.b + 2.0f);
        this.b = Math.round(n5 + n5);
        this.a = Math.round(n5 * bai.b);
    }
}
