// 
// Decompiled by Procyon v0.6.0
// 

public enum psh implements olb
{
    a("UNKNOWN", 0, 0), 
    b("CREDENTIAL_ENCRYPTED", 1, 1), 
    c("DEVICE_ENCRYPTED", 2, 2);
    
    public final int d;
    
    private psh(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static psh b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 2: {
                return psh.c;
            }
            case 1: {
                return psh.b;
            }
            case 0: {
                return psh.a;
            }
        }
    }
    
    public static old c() {
        return opp.m;
    }
    
    @Override
    public final int a() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
