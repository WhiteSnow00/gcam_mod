// 
// Decompiled by Procyon v0.6.0
// 

public final class mhl
{
    public Float a;
    public int b;
    
    public final mhm a() {
        final int b = this.b;
        if (b != 0) {
            final Float a = this.a;
            if (a != null) {
                final mhm mhm = new mhm(b, a);
                final float a2 = mhm.a;
                boolean b2 = false;
                if (a2 > 0.0f && a2 <= 100.0f) {
                    b2 = true;
                }
                njo.e(b2, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
                return mhm;
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == null) {
            sb.append(" startupSamplePercentage");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        int b2;
        if (!b) {
            b2 = 2;
        }
        else {
            b2 = 3;
        }
        this.b = b2;
    }
}
