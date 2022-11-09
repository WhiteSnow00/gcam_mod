// 
// Decompiled by Procyon v0.6.0
// 

class ocr extends Throwable
{
    public ocr() {
        super("Failure occurred while trying to finish a future.");
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        monitorenter(this);
        monitorexit(this);
        return this;
    }
}
