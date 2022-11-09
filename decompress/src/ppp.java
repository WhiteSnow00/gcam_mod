// 
// Decompiled by Procyon v0.6.0
// 

public final class ppp implements pob
{
    private final pjq a;
    
    public ppp(final pjq a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CoroutineScope(coroutineContext=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
