import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aur extends aup
{
    public aur(final Class clazz, final Class clazz2) {
        final String value = String.valueOf(clazz);
        final String value2 = String.valueOf(clazz2);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 54 + String.valueOf(value2).length());
        sb.append("Failed to find any ModelLoaders for model: ");
        sb.append(value);
        sb.append(" and data: ");
        sb.append(value2);
        super(sb.toString());
    }
    
    public aur(final Object o) {
        final String value = String.valueOf(o.getClass());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 60);
        sb.append("Failed to find any ModelLoaders registered for model class: ");
        sb.append(value);
        super(sb.toString());
    }
    
    public aur(final Object o, final List list) {
        final String value = String.valueOf(list);
        final String value2 = String.valueOf(o);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 89 + String.valueOf(value2).length());
        sb.append("Found ModelLoaders for model class: ");
        sb.append(value);
        sb.append(", but none that handle this specific model instance: ");
        sb.append(value2);
        super(sb.toString());
    }
}
