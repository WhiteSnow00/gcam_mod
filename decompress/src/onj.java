// 
// Decompiled by Procyon v0.6.0
// 

public final class onj extends RuntimeException
{
    private static final long serialVersionUID = -7466929953374883507L;
    
    public onj() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
    
    public final olm a() {
        return new olm(this.getMessage());
    }
}
