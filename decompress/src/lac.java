import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class lac implements oen
{
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;
    final /* synthetic */ lad c;
    
    public lac(final lad c, final Set a, final Set b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Throwable t) {
        final krr a = this.c.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 41);
        sb.append("Failed to allocate pending ");
        sb.append(value);
        sb.append(" this may leak");
        a.d(sb.toString());
        synchronized (this.c) {
            lad.f(this.c);
            this.c.e();
        }
    }
}
