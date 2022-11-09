// 
// Decompiled by Procyon v0.6.0
// 

public final class grw extends kmg
{
    private final int a;
    private final int b;
    private boolean c;
    
    public grw(final klj klj, final int b) {
        super(klj);
        njo.d(true);
        this.a = 1;
        this.b = b;
        this.c = this.d((Integer)klj.aQ());
    }
    
    protected final Boolean d(final Integer n) {
        if (n < this.a) {
            this.c = false;
        }
        else if (n >= this.b) {
            this.c = true;
        }
        return this.c;
    }
}
