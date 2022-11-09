import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class okf extends IOException
{
    private static final long serialVersionUID = -6947486886997889499L;
    
    okf() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
    
    public okf(String s, final Throwable t) {
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(s);
        }
        else {
            s = new String("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
        }
        super(s, t);
    }
    
    public okf(final Throwable t) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", t);
    }
}
