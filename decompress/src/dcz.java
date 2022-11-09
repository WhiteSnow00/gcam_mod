// 
// Decompiled by Procyon v0.6.0
// 

final class dcz extends ba
{
    public dcz(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "UPDATE shots SET most_recent_event_millis = ? WHERE shot_id = ?";
    }
}
