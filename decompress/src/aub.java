// 
// Decompiled by Procyon v0.6.0
// 

public final class aub
{
    final String a;
    
    public aub(final String s) {
        final int n = s.length() - 14;
        if (n > 0) {
            final aub a = auc.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Tag ");
            sb.append(s);
            sb.append(" is ");
            sb.append(n);
            sb.append(" chars longer than limit.");
            auc.c(a, sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("CAM2PORT_");
        String substring = s;
        if (n > 0) {
            substring = s.substring(0, 14);
        }
        sb2.append(substring);
        this.a = sb2.toString();
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
