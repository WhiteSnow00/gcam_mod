// 
// Decompiled by Procyon v0.6.0
// 

public final class lzr implements luy
{
    public final lyh a;
    public final int b;
    
    public lzr(final lyh a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final lwk a() {
        return this.a.a();
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 60);
        sb.append("GLIndexArray{buffer=");
        sb.append(value);
        sb.append(", count=");
        sb.append(b);
        sb.append(", glType=5123}");
        return sb.toString();
    }
}
