import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwu
{
    final /* synthetic */ File a;
    
    public mwu(final File a) {
        this.a = a;
    }
    
    public final File a(final mxe mxe) {
        mxe.getClass();
        final File a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("resource_");
        sb.append(mxe.a);
        final File b = pkh.b(a, sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("annotachment_");
        sb2.append(mxe.i);
        return pkh.b(b, sb2.toString());
    }
}
