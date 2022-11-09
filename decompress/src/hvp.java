// 
// Decompiled by Procyon v0.6.0
// 

public final class hvp
{
    public int a;
    private final int b;
    private final boolean c;
    
    public hvp(final int b, final boolean c) {
        this.b = b;
        this.c = c;
    }
    
    public final boolean a() {
        return !this.c && this.b == 0;
    }
    
    public final int b() {
        switch (this.a) {
            default: {
                return 3;
            }
            case 1: {
                if (this.a()) {
                    return 1;
                }
                return 2;
            }
            case 0: {
                return 4;
            }
        }
    }
}
