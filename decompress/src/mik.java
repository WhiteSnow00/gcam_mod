import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mik
{
    private final mdx a;
    
    public mik() {
    }
    
    public mik(final mdx a) {
        this.a = a;
    }
    
    public static mik a(final Activity activity) {
        return new mik(new mdx(activity.getClass().getName()));
    }
    
    public final String b() {
        return this.a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof mik && this.b().equals(((mik)o).b());
    }
    
    @Override
    public final int hashCode() {
        return this.b().hashCode() * 31 ^ 0x4CF;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf((Object)null).length() + 70 + String.valueOf(value).length());
        sb.append("MeasurementKey{rawStringEventName=null, noPiiEventName=");
        sb.append(value);
        sb.append(", isActivity=true}");
        return sb.toString();
    }
}
