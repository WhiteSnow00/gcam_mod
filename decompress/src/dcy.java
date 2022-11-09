// 
// Decompiled by Procyon v0.6.0
// 

final class dcy extends ba
{
    public dcy(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "DELETE FROM shots WHERE start_millis < ?";
    }
}
