// 
// Decompiled by Procyon v0.6.0
// 

public final class aqe
{
    public String a;
    public int b;
    public boolean c;
    public int d;
    
    public aqe(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        this.c = true;
    }
    
    @Override
    public final String toString() {
        switch (this.b) {
            default: {
                return this.a;
            }
            case 5:
            case 6: {
                return this.a;
            }
            case 1:
            case 2:
            case 3:
            case 4: {
                return this.a;
            }
        }
    }
}
