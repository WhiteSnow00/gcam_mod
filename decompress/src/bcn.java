import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcn implements bbx
{
    public static final bcn a;
    private final /* synthetic */ int b;
    
    static {
        a = new bcn(1);
    }
    
    public bcn() {
    }
    
    @Deprecated
    public bcn(final int b) {
        this.b = b;
    }
    
    public bcn(final int b, final byte[] array) {
        this.b = b;
    }
    
    @Override
    public final bbw b(final bcf bcf) {
        switch (this.b) {
            default: {
                return new bcw(bcf.a(bbl.class, InputStream.class));
            }
            case 1: {
                return bcd.a;
            }
            case 0: {
                return new bco(bcf.a(bbl.class, InputStream.class));
            }
        }
    }
}
