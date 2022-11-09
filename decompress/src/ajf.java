import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ajf
{
    protected ajf() {
    }
    
    public abstract oey a(final String p0);
    
    public abstract ajc b(final String p0, final int p1, final List p2);
    
    public final ajc c(final String s, final int n, final ajh ajh) {
        return this.b(s, n, Collections.singletonList(ajh));
    }
    
    public abstract ajc d();
}
