import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyu implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public cyu(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final cyt a() {
        return new cyt((ljb)this.a.get(), (SharedPreferences)this.b.get(), ((cyq)this.c).a(), dna.a());
    }
}
