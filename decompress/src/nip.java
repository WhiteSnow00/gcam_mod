import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nip
{
    public static final Charset a;
    
    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        a = Charset.forName("UTF-8");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-16");
    }
}
