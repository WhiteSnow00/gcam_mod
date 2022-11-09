// 
// Decompiled by Procyon v0.6.0
// 

public final class jtt
{
    public jtm a;
    public boolean b;
    public jpu[] c;
    public int d;
    
    public jtt() {
        this.b = true;
        this.d = 0;
    }
    
    public final jtu a() {
        jvu.c(this.a != null, "execute parameter required");
        return new jtu(this, this.c, this.b, this.d);
    }
}
