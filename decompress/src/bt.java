import java.io.InvalidObjectException;
import java.text.Format;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bt extends Field
{
    public static final bt a;
    private static final long serialVersionUID = 7510380454602616157L;
    
    static {
        a = new bt();
    }
    
    protected bt() {
        super("message argument field");
    }
    
    @Override
    protected Object readResolve() {
        if (this.getClass() != bt.class) {
            throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
        }
        final String name = this.getName();
        final bt a = bt.a;
        if (name.equals(a.getName())) {
            return a;
        }
        throw new InvalidObjectException("Unknown attribute name.");
    }
}
