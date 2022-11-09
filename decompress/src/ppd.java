// 
// Decompiled by Procyon v0.6.0
// 

public final class ppd extends ppu implements por
{
    public final String c(String string) {
        final StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(string);
        sb.append("}[");
        final Object f = this.f();
        if (f != null) {
            ppw g = (ppw)f;
            int n = 1;
            while (plr.b(g, this) ^ true) {
                int n2 = n;
                if (g instanceof poy) {
                    final poy poy = (poy)g;
                    if (n == 0) {
                        sb.append(", ");
                    }
                    sb.append(poy);
                    n2 = 0;
                }
                g = g.g();
                n = n2;
            }
            sb.append("]");
            string = sb.toString();
            string.getClass();
            return string;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }
    
    @Override
    public final ppd ck() {
        return this;
    }
    
    @Override
    public final boolean cl() {
        return true;
    }
    
    @Override
    public final String toString() {
        String s;
        if (pod.a) {
            s = this.c("Active");
        }
        else {
            s = super.toString();
        }
        return s;
    }
}
