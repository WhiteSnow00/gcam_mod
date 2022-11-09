import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class lyu implements Callable
{
    final /* synthetic */ lva a;
    final /* synthetic */ lzq b;
    final /* synthetic */ lyv c;
    
    public lyu(final lyv c, final lva a, final lzq b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object call() {
        try {
            return this.a.a(this.c.g());
        }
        catch (final Exception ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            throw new Error(t);
        }
    }
    
    @Override
    public final String toString() {
        final String string = this.c.toString();
        final String a = this.b.a();
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 22 + String.valueOf(a).length());
        sb.append("withRawGLObject(");
        sb.append(string);
        sb.append(", fn=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
