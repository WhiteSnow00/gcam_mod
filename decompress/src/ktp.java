import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ktp implements ktq
{
    private final lfh a;
    private final List b;
    private int c;
    
    public ktp(final lfh a) {
        this.a = a;
        final ArrayList b = new ArrayList();
        this.b = b;
        try {
            b.addAll(a.g());
        }
        catch (final lfm lfm) {}
        catch (final lfq lfq) {}
        catch (final lfp lfp) {}
        this.c = 0;
    }
    
    @Override
    public final lfg a() {
        if (this.c == this.b.size()) {
            return null;
        }
        return this.a.a(this.b.get(this.c++));
    }
    
    @Override
    public final void b() {
        this.c = 0;
    }
}
