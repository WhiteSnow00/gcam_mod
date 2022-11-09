// 
// Decompiled by Procyon v0.6.0
// 

public abstract class maf implements mae
{
    public int b;
    
    public maf(final int b) {
        this.b = b;
    }
    
    @Override
    public final lwk a() {
        this.close();
        return lwj.a;
    }
    
    protected abstract void c();
    
    @Override
    public final void close() {
        if (this.b != 0) {
            this.c();
            this.b = 0;
        }
    }
}
