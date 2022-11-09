import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aiu
{
    private static final String a;
    
    static {
        a = aiy.b("InputMerger");
    }
    
    public static aiu b(final String s) {
        try {
            return (aiu)Class.forName(s).newInstance();
        }
        catch (final Exception ex) {
            aiy.a();
            final String a = aiu.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Trouble instantiating + ");
            sb.append(s);
            aiy.e(a, sb.toString(), ex);
            return null;
        }
    }
    
    public abstract aiq a(final List p0);
}
