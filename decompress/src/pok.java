// 
// Decompiled by Procyon v0.6.0
// 

final class pok implements por
{
    public final boolean a;
    
    public pok(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final ppd ck() {
        return null;
    }
    
    @Override
    public final boolean cl() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        String s;
        if (!this.a) {
            s = "New";
        }
        else {
            s = "Active";
        }
        sb.append(s);
        sb.append('}');
        return sb.toString();
    }
}
