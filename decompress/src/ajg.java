import androidx.work.OverwritingInputMerger;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajg
{
    UUID a;
    public ana b;
    final Set c;
    
    public ajg(final Class clazz) {
        this.c = new HashSet();
        this.a = UUID.randomUUID();
        this.b = new ana(this.a.toString(), clazz.getName());
        this.b(clazz.getName());
        this.b.c = OverwritingInputMerger.class.getName();
    }
    
    public final ajh a() {
        final ajh ajh = new ajh(this);
        final ain i = this.b.i;
        final boolean a = i.a();
        boolean b = true;
        if (!a && !i.d && !i.b) {
            if (!i.c) {
                b = false;
            }
        }
        if (this.b.o && b) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.a = UUID.randomUUID();
        final ana b2 = new ana(this.b);
        this.b = b2;
        b2.a = this.a.toString();
        return ajh;
    }
    
    public final void b(final String s) {
        this.c.add(s);
    }
}
