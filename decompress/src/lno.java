// 
// Decompiled by Procyon v0.6.0
// 

final class lno implements lns
{
    public static final lno a;
    public static final lno b;
    private final /* synthetic */ int c;
    
    static {
        b = new lno(1);
        a = new lno();
    }
    
    private lno() {
    }
    
    public lno(final int c) {
        this.c = c;
    }
    
    @Override
    public final boolean a() {
        switch (this.c) {
            default: {
                return false;
            }
            case 1: {
                return true;
            }
            case 0: {
                return false;
            }
        }
    }
}
