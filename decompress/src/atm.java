// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atm
{
    private static final aub a;
    
    static {
        a = new aub("CamDvcInfChar");
    }
    
    public abstract int a();
    
    public abstract boolean b();
    
    public abstract boolean c();
    
    public final int d(final int n) {
        return this.e(n, false);
    }
    
    protected final int e(int n, final boolean b) {
        final int n2 = 0;
        if (n % 90 != 0) {
            auc.a(atm.a, "Provided display orientation is not divisible by 90");
        }
        else {
            if (n >= 0 && n <= 270) {
                if (this.c()) {
                    final int n3 = n = (this.a() + n) % 360;
                    if (b) {
                        return (360 - n3) % 360;
                    }
                }
                else if (this.b()) {
                    n = (this.a() - n + 360) % 360;
                }
                else {
                    auc.a(atm.a, "Camera is facing unhandled direction");
                    n = n2;
                }
                return n;
            }
            auc.a(atm.a, "Provided display orientation is outside expected range");
        }
        return 0;
    }
}
