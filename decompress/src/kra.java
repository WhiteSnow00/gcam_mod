import android.view.Display;

// 
// Decompiled by Procyon v0.6.0
// 

public enum kra
{
    a("CLOCKWISE_0", 0, 0), 
    b("CLOCKWISE_90", 1, 90), 
    c("CLOCKWISE_180", 2, 180), 
    d("CLOCKWISE_270", 3, 270);
    
    public final int e;
    
    private kra(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static kra b(int n) {
        switch (n) {
            default: {
                n = (Math.abs(n / 360) * 360 + 360 + n) % 360;
                if (n > 315 || n <= 45) {
                    return kra.a;
                }
                if (n <= 135) {
                    return kra.b;
                }
                if (n <= 225) {
                    return kra.c;
                }
                return kra.d;
            }
            case 270: {
                return kra.d;
            }
            case 180: {
                return kra.c;
            }
            case 90: {
                return kra.b;
            }
            case 0: {
                return kra.a;
            }
            case -1: {
                return kra.a;
            }
        }
    }
    
    public static kra c(final Display display) {
        return e(display.getRotation());
    }
    
    public static kra d(final int n) {
        return b((360 - n) % 360);
    }
    
    public static kra e(final int n) {
        switch (n) {
            default: {
                return kra.a;
            }
            case 3: {
                return d(270);
            }
            case 2: {
                return d(180);
            }
            case 1: {
                return d(90);
            }
            case 0: {
                return d(0);
            }
        }
    }
    
    public final int a() {
        return (360 - this.e) % 360;
    }
}
