import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class ee extends ep
{
    final /* synthetic */ ei a;
    
    public ee(final ei a) {
        this.a = a;
    }
    
    @Override
    public final View aB(final int n) {
        final View o = this.a.O;
        if (o != null) {
            return o.findViewById(n);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this.a);
        sb.append(" does not have a view");
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final boolean aC() {
        return this.a.O != null;
    }
}
