import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class gdc implements oen
{
    final /* synthetic */ gdd a;
    final /* synthetic */ gda b;
    
    public gdc(final gdd a, final gda b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Throwable t) {
        final krr a = this.a.a;
        final String value = String.valueOf(t);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 32);
        sb.append("Unable to log capture metadata: ");
        sb.append(value);
        a.d(sb.toString());
    }
}
