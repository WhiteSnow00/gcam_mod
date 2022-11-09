// 
// Decompiled by Procyon v0.6.0
// 

public final class qy
{
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    
    public qy() {
        this.a = true;
        this.f = 0;
        this.g = 0;
    }
    
    public final boolean a(final sq sq) {
        final int c = this.c;
        return c >= 0 && c < sq.a();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LayoutState{mAvailable=");
        sb.append(this.b);
        sb.append(", mCurrentPosition=");
        sb.append(this.c);
        sb.append(", mItemDirection=");
        sb.append(this.d);
        sb.append(", mLayoutDirection=");
        sb.append(this.e);
        sb.append(", mStartLine=");
        sb.append(this.f);
        sb.append(", mEndLine=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
