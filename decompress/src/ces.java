import android.util.Range;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ces implements cer
{
    private final knc a;
    
    public ces(final knc a) {
        this.a = a;
    }
    
    @Override
    public final Range a() {
        return Range.create((Comparable)30, (Comparable)this.a.a());
    }
    
    @Override
    public final Range b() {
        final Integer value = this.a.a();
        return Range.create((Comparable)value, (Comparable)value);
    }
}
