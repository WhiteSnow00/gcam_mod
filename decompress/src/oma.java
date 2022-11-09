// 
// Decompiled by Procyon v0.6.0
// 

final class oma implements omh
{
    private final omh[] a;
    
    public oma(final omh... a) {
        this.a = a;
    }
    
    @Override
    public final omg a(final Class clazz) {
        final omh[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            final omh omh = a[i];
            if (omh.b(clazz)) {
                return omh.a(clazz);
            }
        }
        final String value = String.valueOf(clazz.getName());
        String concat;
        if (value.length() != 0) {
            concat = "No factory is available for message type: ".concat(value);
        }
        else {
            concat = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(concat);
    }
    
    @Override
    public final boolean b(final Class clazz) {
        final omh[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            if (a[i].b(clazz)) {
                return true;
            }
        }
        return false;
    }
}
