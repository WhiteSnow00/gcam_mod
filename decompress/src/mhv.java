// 
// Decompiled by Procyon v0.6.0
// 

public final class mhv implements mft
{
    public final int a;
    
    public mhv() {
    }
    
    public mhv(final byte[] array) {
        this.a = 1;
    }
    
    @Override
    public final int b() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof mhv)) {
            return false;
        }
        final mhv mhv = (mhv)o;
        final int a = this.a;
        if (a != mhv.a) {
            b = false;
        }
        if (a != 0) {
            return b;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        mfu.b(this.a);
        return 1000002;
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.a);
        final StringBuilder sb = new StringBuilder(a.length() + 42);
        sb.append("ApplicationExitConfigurations{enablement=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
