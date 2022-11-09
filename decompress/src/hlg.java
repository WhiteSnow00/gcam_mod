// 
// Decompiled by Procyon v0.6.0
// 

public final class hlg
{
    public kre a;
    public kre b;
    public kre c;
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 26 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("SelectedPictureSizes: ");
        sb.append(value);
        sb.append(", ");
        sb.append(value2);
        sb.append(", ");
        sb.append(value3);
        return sb.toString();
    }
}
