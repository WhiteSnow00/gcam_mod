import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mpj
{
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    
    public mpj(final Context context, final mpk mpk) {
        final boolean b = mpk.b;
        final int n = 1;
        String a2;
        if (b) {
            final String a = mpk.a;
            final String packageName = context.getPackageName();
            final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(packageName).length());
            sb.append(a);
            sb.append("#");
            sb.append(packageName);
            a2 = sb.toString();
        }
        else {
            a2 = mpk.a;
        }
        this.a = a2;
        int b2 = okn.B(mpk.c);
        if (b2 == 0) {
            b2 = n;
        }
        this.e = b2;
        this.b = mpk.f;
        this.c = mpk.d;
        this.d = mpk.e;
    }
}
