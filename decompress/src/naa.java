// 
// Decompiled by Procyon v0.6.0
// 

public final class naa
{
    public final mza a;
    public final mwu b;
    
    public naa(final mza a, final mwu b) {
        a.getClass();
        b.getClass();
        this.a = a;
        this.b = b;
    }
    
    private final void b(final Throwable t, final myz myz, final mvl mvl, final mxe mxe) {
        this.a.a(myz.b(20, t, mvl, mxe));
    }
    
    public final boolean a(final myz myz, final myc myc, final mxe mxe) {
        myc.getClass();
        mxk mxk;
        if (mxe == null || (mxk = mxe.h) == null) {
            mxk = myc.r;
        }
        if (mxk.d != mus.c) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Not in airlock: airlockFileState ");
            sb.append(mxk.d);
            final IllegalStateException ex = new IllegalStateException(sb.toString());
            this.b(ex, myz, myc, mxe);
            throw ex;
        }
        final mvt e = mxk.e;
        final mvt a = mvt.a;
        switch (e.ordinal()) {
            default: {
                throw new pil();
            }
            case 6: {
                return false;
            }
            case 1:
            case 2:
            case 3:
            case 4: {
                return true;
            }
            case 0:
            case 5: {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Permanent failure: uploadState ");
                sb2.append(mxk.e);
                final IllegalStateException ex2 = new IllegalStateException(sb2.toString());
                this.b(ex2, myz, myc, mxe);
                throw ex2;
            }
        }
    }
}
