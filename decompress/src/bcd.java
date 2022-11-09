// 
// Decompiled by Procyon v0.6.0
// 

public final class bcd implements bbw
{
    public static final bcd a;
    private final /* synthetic */ int b;
    
    static {
        a = new bcd(2, null);
    }
    
    public bcd() {
    }
    
    public bcd(final int b) {
        this.b = b;
    }
    
    @Deprecated
    public bcd(final int b, final byte[] array) {
        this.b = b;
    }
    
    @Override
    public final bbv a(final Object o, final int n, final int n2, final awg awg) {
        switch (this.b) {
            default: {
                return new bbv(new bif(o), new bcj(o));
            }
            case 1: {
                return new bbv(new bif(o), new bbd(o.toString()));
            }
            case 0: {
                return null;
            }
        }
    }
    
    @Override
    public final boolean b(final Object o) {
        switch (this.b) {
            default: {
                return true;
            }
            case 1: {
                return o.toString().startsWith("data:image");
            }
            case 0: {
                return false;
            }
        }
    }
}
