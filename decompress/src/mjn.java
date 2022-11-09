import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

final class mjn
{
    static final Pattern a;
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    Long f;
    Long g;
    Long h;
    Long i;
    Long j;
    
    static {
        a = Pattern.compile("VmHWM:\\s*(\\d+)\\s*kB");
        b = Pattern.compile("VmRSS:\\s*(\\d+)\\s*kB");
        c = Pattern.compile("RssAnon:\\s*(\\d+)\\s*kB");
        d = Pattern.compile("VmSwap:\\s*(\\d+)\\s*kB");
        e = Pattern.compile("VmSize:\\s*(\\d+)\\s*kB");
    }
    
    public mjn() {
    }
}
