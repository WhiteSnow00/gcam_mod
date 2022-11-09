import java.util.HashMap;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyt
{
    public final Object a;
    public final LinkedList b;
    public final HashMap c;
    public int d;
    
    public gyt() {
        njo.e(true, "maxSize must be > 0.");
        this.a = new Object();
        this.b = new LinkedList();
        this.c = new HashMap();
    }
    
    public static final void a() {
        njo.e(true, "Size was < 0.");
    }
}
