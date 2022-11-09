import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loc implements lns
{
    private final lnu a;
    private final ooh b;
    private final lne c;
    
    public loc(final lnu a, final ooh b, final lne c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final boolean b(final ooe ooe) {
        final Iterator<Object> iterator = new olh(ooe.a, ooe.b).iterator();
        while (iterator.hasNext()) {
            if (!this.a.a(iterator.next(), this.c).a()) {
                return false;
            }
        }
        final Iterator<Object> iterator2 = ooe.c.iterator();
        while (iterator2.hasNext()) {
            if (!this.c(iterator2.next())) {
                return false;
            }
        }
        return true;
    }
    
    private final boolean c(final oog oog) {
        final Iterator<Object> iterator = new olh(oog.a, oog.b).iterator();
        while (iterator.hasNext()) {
            if (this.a.a(iterator.next(), this.c).a()) {
                return true;
            }
        }
        final Iterator<Object> iterator2 = oog.c.iterator();
        while (iterator2.hasNext()) {
            if (this.b(iterator2.next())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean a() {
        final ooh b = this.b;
        final int a = b.a;
        Boolean b2;
        if (a == 2) {
            b2 = this.b((ooe)b.b);
        }
        else if (a == 3) {
            b2 = this.c((oog)b.b);
        }
        else {
            final lnu a2 = this.a;
            ood ood;
            if (a == 1) {
                if ((ood = ood.b((int)b.b)) == null) {
                    ood = ood.a;
                }
            }
            else {
                ood = ood.a;
            }
            b2 = a2.a(ood, this.c).a();
        }
        return b2;
    }
}
