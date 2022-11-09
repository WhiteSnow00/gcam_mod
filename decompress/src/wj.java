import java.util.concurrent.CopyOnWriteArraySet;
import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wj
{
    public final Set a;
    public volatile Context b;
    
    public wj() {
        this.a = new CopyOnWriteArraySet();
    }
}
