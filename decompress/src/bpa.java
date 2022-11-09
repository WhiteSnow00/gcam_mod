// 
// Decompiled by Procyon v0.6.0
// 

public final class bpa
{
    private static final box b;
    public box a;
    private final kjm c;
    private final boy d;
    
    static {
        b = new boh();
    }
    
    public bpa(final kjm c, final boy d) {
        this.c = c;
        this.d = d;
    }
    
    public final box a(final boe boe) {
        final box a = this.a;
        if (a != null && a.c() != 3) {
            return bpa.b;
        }
        this.a = this.d.a(boe);
        this.c.execute(new boz(this));
        return this.a;
    }
}
