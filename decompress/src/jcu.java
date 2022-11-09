// 
// Decompiled by Procyon v0.6.0
// 

public final class jcu
{
    public final Class a;
    public final Class b;
    
    public jcu() {
        if (!idb.class.isEnum()) {
            final String value = String.valueOf(idb.class);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 36);
            sb.append("Class to do conversion is not enum: ");
            sb.append(value);
            throw new IllegalArgumentException(sb.toString());
        }
        if (obl.class.isEnum()) {
            this.a = idb.class;
            this.b = obl.class;
            return;
        }
        final String value2 = String.valueOf(obl.class);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 36);
        sb2.append("Class to do conversion is not enum: ");
        sb2.append(value2);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public static final Enum a(final Enum enum1, final Class clazz) {
        enum1.getClass();
        return Enum.valueOf((Class<Enum>)clazz, enum1.name());
    }
}
