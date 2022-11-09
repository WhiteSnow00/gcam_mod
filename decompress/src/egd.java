import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egd implements oun
{
    private final egc a;
    
    public egd(final egc a) {
        this.a = a;
    }
    
    public final ContentResolver a() {
        final ContentResolver contentResolver = this.a.a.getContentResolver();
        pqf.k(contentResolver);
        return contentResolver;
    }
}
