import java.util.UUID;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajh
{
    public final ana a;
    public final Set b;
    private final UUID c;
    
    public ajh(final ajg ajg) {
        final UUID a = ajg.a;
        final ana b = ajg.b;
        final Set c = ajg.c;
        this.c = a;
        this.a = b;
        this.b = c;
    }
    
    public final String a() {
        return this.c.toString();
    }
}
