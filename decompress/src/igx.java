import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igx implements oun
{
    private final pii a;
    
    public igx(final pii a) {
        this.a = a;
    }
    
    public static igx b(final pii pii) {
        return new igx(pii);
    }
    
    public final igw a() {
        return new igw((AccessibilityManager)this.a.get());
    }
}
