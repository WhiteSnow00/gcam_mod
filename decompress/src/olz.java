// 
// Decompiled by Procyon v0.6.0
// 

final class olz implements omh
{
    public static final olz a;
    private final /* synthetic */ int b;
    
    static {
        a = new olz(1);
    }
    
    public olz() {
    }
    
    private olz(final int b) {
        this.b = b;
    }
    
    @Override
    public final omg a(final Class clazz) {
        switch (this.b) {
            default: {
                if (!oky.class.isAssignableFrom(clazz)) {
                    final String value = String.valueOf(clazz.getName());
                    String concat;
                    if (value.length() != 0) {
                        concat = "Unsupported message type: ".concat(value);
                    }
                    else {
                        concat = new String("Unsupported message type: ");
                    }
                    throw new IllegalArgumentException(concat);
                }
                try {
                    final Class<? extends oky> subclass = clazz.asSubclass(oky.class);
                    oky oky;
                    if ((oky = oky.az.get(subclass)) == null) {
                        try {
                            Class.forName(subclass.getName(), true, subclass.getClassLoader());
                            oky = oky.az.get(subclass);
                        }
                        catch (final ClassNotFoundException ex) {
                            throw new IllegalStateException("Class initialization cannot fail.", ex);
                        }
                    }
                    oky oky2;
                    if ((oky2 = oky) == null) {
                        oky2 = (oky)((oky)ons.g(subclass)).H(6);
                        if (oky2 == null) {
                            throw new IllegalStateException();
                        }
                        oky.az.put(subclass, oky2);
                    }
                    return (omg)oky2.H(3);
                }
                catch (final Exception ex2) {
                    final String value2 = String.valueOf(clazz.getName());
                    String concat2;
                    if (value2.length() != 0) {
                        concat2 = "Unable to get message info for ".concat(value2);
                    }
                    else {
                        concat2 = new String("Unable to get message info for ");
                    }
                    throw new RuntimeException(concat2, ex2);
                }
                break;
            }
            case 0: {
                throw new IllegalStateException("This should never be called.");
            }
        }
    }
    
    @Override
    public final boolean b(final Class clazz) {
        switch (this.b) {
            default: {
                return oky.class.isAssignableFrom(clazz);
            }
            case 0: {
                return false;
            }
        }
    }
}
