import android.os.LocaleList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aap
{
    public final LocaleList a;
    
    public aap(final LocaleList a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.a.equals((Object)((aap)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
