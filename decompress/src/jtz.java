import java.util.Iterator;
import com.google.android.gms.common.data.DataHolder;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jtz implements jua
{
    protected final DataHolder a;
    
    protected jtz(final DataHolder a) {
        this.a = a;
    }
    
    @Override
    public final void b() {
        try (final DataHolder a = this.a) {}
    }
    
    @Override
    public int c() {
        throw null;
    }
    
    @Override
    public final void close() {
        this.b();
    }
    
    @Override
    public final Iterator iterator() {
        return new jub(this);
    }
}
