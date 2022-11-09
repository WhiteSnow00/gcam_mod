import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mjt
{
    public static final nsd a;
    public final pii b;
    
    static {
        a = nsd.g("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricCollector");
        noi.K("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
        Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
        Pattern.compile("([^\\?]+)(\\?+)");
        Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
        Pattern.compile("([a-zA-Z0-9-_]+)");
        Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    }
    
    public mjt(final pii b) {
        this.b = b;
    }
}
