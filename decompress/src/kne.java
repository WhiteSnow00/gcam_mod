import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kne extends IOException
{
    public kne(final kng kng, final Throwable t) {
        final String value = String.valueOf(kng);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 37);
        sb.append("fail to create media codec with mime ");
        sb.append(value);
        super(sb.toString(), t);
    }
}
