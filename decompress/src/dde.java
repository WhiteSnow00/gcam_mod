// 
// Decompiled by Procyon v0.6.0
// 

final class dde extends ai
{
    public dde(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "INSERT OR ABORT INTO `shot_log` (`sequence`,`shot_id`,`time_millis`,`message`) VALUES (nullif(?, 0),?,?,?)";
    }
}
