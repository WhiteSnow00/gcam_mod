// 
// Decompiled by Procyon v0.6.0
// 

public final class imr
{
    public final boolean a;
    public final boolean b;
    public final klj c;
    public final klj d;
    
    public imr() {
    }
    
    public imr(final boolean a, final boolean b, final klj c, final klj d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static imq a() {
        final imq imq = new imq();
        imq.e(false);
        imq.d(false);
        final Boolean value = false;
        imq.c(new kkz(value));
        imq.b(new kkz(value));
        return imq;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof imr) {
            final imr imr = (imr)o;
            if (this.a == imr.a && this.b == imr.b && this.c.equals(imr.c) && this.d.equals(imr.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.b) {
            n = 1231;
        }
        return (((n2 ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 118 + String.valueOf(value2).length());
        sb.append("ElapsedTimeUIConfig{showOutputTimer=");
        sb.append(a);
        sb.append(", showMutedAudioIcon=");
        sb.append(b);
        sb.append(", showMicInputExtWired=");
        sb.append(value);
        sb.append(", showMicInputExtBluetooth=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
