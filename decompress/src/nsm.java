// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nsm implements nsn
{
    public static final nsm a;
    
    static {
        a = new nsk();
    }
    
    public abstract int a();
    
    public abstract String b();
    
    public abstract String c();
    
    public abstract String d();
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LogSite{ class=");
        sb.append(this.b());
        sb.append(", method=");
        sb.append(this.d());
        sb.append(", line=");
        sb.append(this.a());
        if (this.c() != null) {
            sb.append(", file=");
            sb.append(this.c());
        }
        sb.append(" }");
        return sb.toString();
    }
}
