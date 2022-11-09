import java.util.concurrent.Callable;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lyh extends lyv
{
    protected lyh(final lyp lyp, final lwh lwh) {
        super(lyp, lwh);
    }
    
    public static lyh b(final lyp lyp, final int n, final ByteBuffer byteBuffer) {
        return new lyh(lyp, lyv.h(lyp, new lyg(lyp, n, byteBuffer)));
    }
    
    @Override
    public final String toString() {
        final String string = ((lzx)this.j()).toString();
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 10);
        sb.append("GLBuffer{");
        sb.append(string);
        sb.append('}');
        return sb.toString();
    }
}
