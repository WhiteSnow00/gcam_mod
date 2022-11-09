// 
// Decompiled by Procyon v0.6.0
// 

public final class iqd
{
    public final eyt a;
    public final jbm b;
    public final jbm c;
    public final hwh d;
    
    public iqd(final eyt a, final hwc hwc, final jbm b, final jbm c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (hwh)hwc.a();
        final String value = String.valueOf(b);
        final String value2 = String.valueOf(c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 4 + String.valueOf(value2).length());
        sb.append(value);
        sb.append(" -> ");
        sb.append(value2);
        String.valueOf(sb.toString()).length();
    }
}
