import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lre
{
    public final DLEngineApi a;
    public final String b;
    
    public lre() {
    }
    
    public lre(final DLEngineApi a, final String b) {
        if (a == null) {
            throw new NullPointerException("Null dlEngineApi");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null hostPackageName");
    }
    
    public static lre a(final DLEngineApi dlEngineApi, final String s) {
        return new lre(dlEngineApi, s);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof lre) {
            final lre lre = (lre)o;
            if (this.a.equals(lre.a) && this.b.equals(lre.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 47 + b.length());
        sb.append("EngineApiBundle{dlEngineApi=");
        sb.append(value);
        sb.append(", hostPackageName=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
