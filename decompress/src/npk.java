import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class npk extends nkv
{
    final /* synthetic */ Entry a;
    
    public npk(final Entry a) {
        this.a = a;
    }
    
    @Override
    public final Object getKey() {
        return this.a.getKey();
    }
    
    @Override
    public final Object getValue() {
        return this.a.getValue();
    }
}
