import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class lzm implements Callable
{
    final /* synthetic */ lyp a;
    final /* synthetic */ lxy b;
    final /* synthetic */ lvk c;
    
    public lzm(final lyp a, final lxy b, final lvk c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 23);
        sb.append("createExternalTexture(");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
}
