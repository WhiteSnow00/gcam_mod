// 
// Decompiled by Procyon v0.6.0
// 

public final class mqz
{
    public final nnn a;
    public Boolean b;
    public boolean c;
    
    public mqz() {
        this.a = nns.e();
        this.c = false;
    }
    
    public final mra a() {
        final Boolean b = this.b;
        b.getClass();
        return new mra(b, this.c, this.a.f());
    }
    
    public final void b() {
        njo.p(this.b == null, "A SourcePolicy can only set internal() or external() once.");
        this.b = false;
    }
}
