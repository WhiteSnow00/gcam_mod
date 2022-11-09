// 
// Decompiled by Procyon v0.6.0
// 

public class nhq
{
    private final zb a;
    public boolean b;
    
    public nhq(final zb a) {
        this.b = false;
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SpanExtras<");
        for (nhq nhq = this; nhq != null; nhq = null) {
            for (int i = 0; i < nhq.a.j; ++i) {
                sb.append(this.a.i(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
