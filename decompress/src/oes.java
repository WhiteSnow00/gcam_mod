// 
// Decompiled by Procyon v0.6.0
// 

final class oes extends ocy implements Runnable
{
    private oey a;
    
    public oes(final oey a) {
        this.a = a;
    }
    
    @Override
    protected final String bp() {
        final oey a = this.a;
        if (a != null) {
            final String value = String.valueOf(a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 11);
            sb.append("delegate=[");
            sb.append(value);
            sb.append("]");
            return sb.toString();
        }
        return null;
    }
    
    @Override
    protected final void c() {
        this.a = null;
    }
    
    @Override
    public final void run() {
        final oey a = this.a;
        if (a != null) {
            this.e(a);
        }
    }
}
