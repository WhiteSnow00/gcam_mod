// 
// Decompiled by Procyon v0.6.0
// 

public final class bis
{
    private Class a;
    private Class b;
    private Class c;
    
    public bis() {
    }
    
    public bis(final Class clazz, final Class clazz2, final Class clazz3) {
        this.a(clazz, clazz2, clazz3);
    }
    
    public final void a(final Class a, final Class b, final Class c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final bis bis = (bis)o;
            return this.a.equals(bis.a) && this.b.equals(bis.b) && biv.l(this.c, bis.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final Class c = this.c;
        int hashCode3;
        if (c != null) {
            hashCode3 = c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode * 31 + hashCode2) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 30 + String.valueOf(value2).length());
        sb.append("MultiClassKey{first=");
        sb.append(value);
        sb.append(", second=");
        sb.append(value2);
        sb.append('}');
        return sb.toString();
    }
}
