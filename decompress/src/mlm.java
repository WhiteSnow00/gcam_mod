// 
// Decompiled by Procyon v0.6.0
// 

public final class mlm
{
    public Float a;
    public int b;
    
    public final mln a() {
        final int b = this.b;
        if (b != 0) {
            final Float a = this.a;
            if (a != null) {
                final mln mln = new mln(b, a);
                final float a2 = mln.a;
                boolean b2 = false;
                if (a2 >= 0.0f && a2 <= 1.0f) {
                    b2 = true;
                }
                njo.p(b2, "Probability shall be between 0 and 1.");
                return mln;
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == null) {
            sb.append(" samplingProbability");
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
