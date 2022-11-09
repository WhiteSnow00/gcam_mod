import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class njx extends nmo
{
    final /* synthetic */ nkc a;
    private final Entry b;
    
    public njx(final nkc a, final Entry b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected final Entry b() {
        return this.b;
    }
    
    @Override
    public final Object setValue(final Object value) {
        this.a.d(value);
        njo.p(this.a.entrySet().contains(this), "entry no longer in map");
        if (nqb.E(value, this.getValue())) {
            return value;
        }
        njo.i(this.a.containsValue(value) ^ true, "value already present: %s", value);
        final Object setValue = this.b.setValue(value);
        njo.p(nqb.E(value, this.a.get(this.getKey())), "entry no longer in map");
        this.a.j(this.getKey(), true, setValue, value);
        return setValue;
    }
}
