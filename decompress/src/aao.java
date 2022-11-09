import java.util.Locale;
import android.os.LocaleList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aao
{
    public final aap a;
    
    static {
        new LocaleList(new Locale[0]);
    }
    
    public aao(final aap a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aao && this.a.equals(((aao)o).a);
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
