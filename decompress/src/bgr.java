// 
// Decompiled by Procyon v0.6.0
// 

final class bgr implements bgp
{
    final /* synthetic */ bgs a;
    
    public bgr(final bgs a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 11 + String.valueOf(value).length());
        sb.append(string);
        sb.append("{fragment=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
