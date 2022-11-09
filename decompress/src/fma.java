// 
// Decompiled by Procyon v0.6.0
// 

public final class fma
{
    private final lfj a;
    private final kre b;
    
    public fma() {
    }
    
    public fma(final lfj a, final kre b) {
        if (a == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null viewfinderSize");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fma) {
            final fma fma = (fma)o;
            if (this.a.equals(fma.a) && this.b.equals(fma.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.b ^ 0xF4243) * -721379959 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf((Object)null);
        final String value3 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 64 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("CaptureModuleCameraKey{cameraId=");
        sb.append(value);
        sb.append(", hdrPlusMode=");
        sb.append(value2);
        sb.append(", viewfinderSize=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
