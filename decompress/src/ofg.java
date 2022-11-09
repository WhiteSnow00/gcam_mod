// 
// Decompiled by Procyon v0.6.0
// 

final class ofg extends ocy implements Runnable
{
    private final Runnable a;
    
    public ofg(final Runnable a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    protected final String bp() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 7);
        sb.append("task=[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public final void run() {
        try {
            this.a.run();
        }
        finally {
            final Throwable t;
            this.a(t);
            throw njt.a(t);
        }
    }
}
