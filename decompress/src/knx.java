import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knx extends IOException
{
    public knx(final String s, final int n, final Throwable t) {
        final StringBuilder sb = new StringBuilder("file descriptor".length() + 66);
        sb.append("Unable to create MediaMuxer with file path ");
        sb.append("file descriptor");
        sb.append(" and format ");
        sb.append(n);
        super(sb.toString(), t);
    }
}
