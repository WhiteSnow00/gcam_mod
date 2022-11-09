import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ieh
{
    public final idc a;
    
    public ieh() {
    }
    
    public ieh(final idc a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null timelapseMode");
    }
    
    public static String a(final Context context, final idc idc, final double n) {
        final int n2 = (int)(idc.a(n) * 10.0);
        String s;
        if (n2 % 10 == 0) {
            s = String.valueOf(n2 / 10);
        }
        else {
            s = String.format("%.01f", n2 / 10.0f);
        }
        return context.getString(2131952649, new Object[] { s });
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof ieh && this.a.equals(((ieh)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 43);
        sb.append("SpeedUpSeekBarConfiguration{timelapseMode=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
