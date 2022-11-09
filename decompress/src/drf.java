import android.content.UriMatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drf implements oun
{
    private final pii a;
    
    public drf(final pii a) {
        this.a = a;
    }
    
    public final UriMatcher a() {
        final String a = ((czf)this.a).a();
        final UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(a, "type/*", 1);
        uriMatcher.addURI(a, "data/*", 2);
        uriMatcher.addURI(a, "icon/#/badge", 3);
        uriMatcher.addURI(a, "icon/#/interact", 4);
        uriMatcher.addURI(a, "icon/#/dialog", 5);
        uriMatcher.addURI(a, "delete/#", 6);
        uriMatcher.addURI(a, "processing", 7);
        uriMatcher.addURI(a, "processing/#", 8);
        return uriMatcher;
    }
}
