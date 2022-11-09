import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public class olm extends IOException
{
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;
    
    public olm(final IOException ex) {
        super(ex.getMessage(), ex);
    }
    
    public olm(final String s) {
        super(s);
    }
    
    public static oll a() {
        return new oll();
    }
    
    public static olm b() {
        return new olm("Protocol message end-group tag did not match expected tag.");
    }
    
    static olm c() {
        return new olm("Protocol message contained an invalid tag (zero).");
    }
    
    public static olm d() {
        return new olm("Protocol message had invalid UTF-8.");
    }
    
    static olm e() {
        return new olm("CodedInputStream encountered a malformed varint.");
    }
    
    static olm f() {
        return new olm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    
    static olm g() {
        return new olm("Failed to parse the message.");
    }
    
    static olm h() {
        return new olm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
    
    static olm i() {
        return new olm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
    
    final void j() {
        this.a = true;
    }
}
