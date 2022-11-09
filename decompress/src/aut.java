// 
// Decompiled by Procyon v0.6.0
// 

public final class aut extends aup
{
    public aut(final Class clazz) {
        final String value = String.valueOf(clazz);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 46);
        sb.append("Failed to find source encoder for data class: ");
        sb.append(value);
        super(sb.toString());
    }
}
