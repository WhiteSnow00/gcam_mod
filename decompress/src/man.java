import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class man extends lyv
{
    private man(final lyp lyp, final lwh lwh) {
        super(lyp, lwh);
    }
    
    public static man c(final lyp lyp, final lxx lxx) {
        return new man(lyp, lyv.h(lyp, new mam(lyp, lxx)));
    }
    
    public static man d(final lyp lyp, final lxx lxx, final int n, final int n2) {
        final mai mai = new mai(lyp.e(), n, n2, lxx);
        mai.f = true;
        return new man(lyp, lwt.b(mai));
    }
    
    public final lxx b() {
        return ((maj)this.j()).g;
    }
    
    @Override
    public final String toString() {
        final String simpleName = this.getClass().getSimpleName();
        final int hashCode = this.hashCode();
        final String value = String.valueOf(this.b());
        final StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 21 + String.valueOf(value).length());
        sb.append(simpleName);
        sb.append("@");
        sb.append(hashCode);
        sb.append("[layout=");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
