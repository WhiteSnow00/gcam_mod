// 
// Decompiled by Procyon v0.6.0
// 

public final class lom
{
    private final Long a;
    private final int b;
    
    public lom() {
    }
    
    public lom(final Long a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof lom) {
            final lom lom = (lom)o;
            if (this.a.equals(lom.a) && this.b == lom.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String string = Integer.toString(phn.j(this.b));
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 54 + String.valueOf(string).length());
        sb.append("VerificationFailureKey{protoId=");
        sb.append(value);
        sb.append(", verificationFailure=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
