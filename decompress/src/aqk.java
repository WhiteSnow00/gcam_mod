// 
// Decompiled by Procyon v0.6.0
// 

public final class aqk extends aqh
{
    public int b;
    public String c;
    public String d;
    
    public aqk() {
        this.b = 2048;
        this.c = "\n";
        this.d = "  ";
    }
    
    public aqk(final int n) {
        super(n);
        this.b = 2048;
        this.c = "\n";
        this.d = "  ";
    }
    
    @Override
    protected final int a() {
        return 4976;
    }
    
    public final String b() {
        if (this.c()) {
            return "UTF-16BE";
        }
        if (this.d()) {
            return "UTF-16LE";
        }
        return "UTF-8";
    }
    
    public final boolean c() {
        return (super.a & 0x3) == 0x2;
    }
    
    public final Object clone() {
        try {
            final aqk aqk = new aqk(super.a);
            aqk.d = this.d;
            aqk.c = this.c;
            aqk.b = this.b;
            return aqk;
        }
        catch (final ape ape) {
            return null;
        }
    }
    
    public final boolean d() {
        return (super.a & 0x3) == 0x3;
    }
    
    public final boolean i() {
        return this.h(512);
    }
    
    public final boolean j() {
        return this.h(256);
    }
    
    public final boolean k() {
        return this.h(16);
    }
    
    public final boolean l() {
        return this.h(32);
    }
}
