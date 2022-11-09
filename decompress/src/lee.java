// 
// Decompiled by Procyon v0.6.0
// 

final class lee extends ljr
{
    private final krc a;
    
    public lee(final lju lju, final krc a) {
        super(lju);
        this.a = a;
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.a.close();
        }
    }
}
