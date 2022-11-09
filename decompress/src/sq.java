// 
// Decompiled by Procyon v0.6.0
// 

public final class sq
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public int n;
    public int o;
    public int p;
    
    public sq() {
        this.a = -1;
        this.b = 0;
        this.c = 0;
        this.d = 1;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
    }
    
    public final int a() {
        int e;
        if (this.g) {
            e = this.b - this.c;
        }
        else {
            e = this.e;
        }
        return e;
    }
    
    public final void b(final int n) {
        if ((this.d & n) != 0x0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Layout state should be one of ");
        sb.append(Integer.toBinaryString(n));
        sb.append(" but it is ");
        sb.append(Integer.toBinaryString(this.d));
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("State{mTargetPosition=");
        sb.append(this.a);
        sb.append(", mData=");
        sb.append((Object)null);
        sb.append(", mItemCount=");
        sb.append(this.e);
        sb.append(", mIsMeasuring=");
        sb.append(this.i);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.b);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.c);
        sb.append(", mStructureChanged=");
        sb.append(this.f);
        sb.append(", mInPreLayout=");
        sb.append(this.g);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.j);
        sb.append(", mRunPredictiveAnimations=");
        sb.append(this.k);
        sb.append('}');
        return sb.toString();
    }
}
