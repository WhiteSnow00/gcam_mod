import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class lcy implements oen
{
    final /* synthetic */ kjk a;
    final /* synthetic */ lcd b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ lcz e;
    
    public lcy(final lcz e, final kjk a, final lcd b, final List c, final List d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final Throwable t) {
        final krr b = this.e.b;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 38 + String.valueOf(value2).length());
        sb.append("Failed to finalize outputs for ");
        sb.append(value);
        sb.append(" using ");
        sb.append(value2);
        b.i(sb.toString(), t);
        this.b.h();
    }
}
