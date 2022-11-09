// 
// Decompiled by Procyon v0.6.0
// 

final class dcv extends ai
{
    public dcv(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "INSERT OR ABORT INTO `shots` (`shot_id`,`title`,`start_millis`,`persisted_millis`,`canceled_millis`,`deleted_millis`,`most_recent_event_millis`,`capture_session_type`,`capture_session_shot_id`,`pid`,`stuck`,`failed`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
