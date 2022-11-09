import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class mnc implements mmu
{
    public final String a;
    public final mmz b;
    public final String c;
    public final boolean d;
    private final mmp e;
    
    public mnc(final Context context, final niz niz, final niz niz2, final niz niz3) {
        final String packageName = context.getPackageName();
        final mmp e = (mmp)niz.e(mmp.b);
        final mmz b = (mmz)niz2.e(mmz.b);
        final boolean booleanValue = (boolean)niz3.e(false);
        this.c = "CAMERA_ANDROID_PRIMES";
        this.e = e;
        this.b = b;
        this.d = booleanValue;
        final String value = String.valueOf(packageName);
        String concat;
        if (value.length() != 0) {
            concat = "com.google.android.libraries.performance.primes#".concat(value);
        }
        else {
            concat = new String("com.google.android.libraries.performance.primes#");
        }
        this.a = concat;
    }
    
    @Override
    public final oey a() {
        return odg.h(oco.h(oet.q(this.e.a()), RuntimeException.class, mcj.e, odx.a), new mnb(this), odx.a);
    }
}
