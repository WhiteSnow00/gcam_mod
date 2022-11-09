// 
// Decompiled by Procyon v0.6.0
// 

public final class oxr extends oxq
{
    private static final long serialVersionUID = -8219729196779211169L;
    
    public oxr(final Runnable runnable) {
        super(runnable);
    }
    
    @Override
    public final String toString() {
        final boolean ca = this.ca();
        final String value = String.valueOf(this.get());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 36);
        sb.append("RunnableDisposable(disposed=");
        sb.append(ca);
        sb.append(", ");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
}
