// 
// Decompiled by Procyon v0.6.0
// 

final class zp extends zm
{
    final /* synthetic */ zq c;
    
    public zp(final zq c) {
        this.c = c;
    }
    
    @Override
    protected final String c() {
        final zn zn = (zn)this.c.a.get();
        if (zn == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("tag=[");
        sb.append(zn.a);
        sb.append("]");
        return sb.toString();
    }
}
