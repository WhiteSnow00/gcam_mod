// 
// Decompiled by Procyon v0.6.0
// 

final class onz extends okm
{
    public onz() {
        super(null);
    }
    
    @Override
    public final okk d(final omj omj, final int n) {
        final String name = omj.getClass().getName();
        int n2 = 0;
        Label_0117: {
            switch (name.hashCode()) {
                case 110242: {
                    if (name.equals("opc")) {
                        n2 = 2;
                        break Label_0117;
                    }
                    break;
                }
                case 108244: {
                    if (name.equals("mmt")) {
                        n2 = 3;
                        break Label_0117;
                    }
                    break;
                }
                case 105314: {
                    if (name.equals("jld")) {
                        n2 = 1;
                        break Label_0117;
                    }
                    break;
                }
                case 105297: {
                    if (name.equals("jkr")) {
                        n2 = 0;
                        break Label_0117;
                    }
                    break;
                }
            }
            n2 = -1;
        }
        switch (n2) {
            default: {
                return null;
            }
            case 3: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 334728578: {
                        return mna.h;
                    }
                }
                break;
            }
            case 2: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 202575443: {
                        return oqc.j;
                    }
                }
                break;
            }
            case 1: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 152666888: {
                        return jku.a;
                    }
                }
                break;
            }
            case 0: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 191915334: {
                        return jlb.a;
                    }
                    case 152666889: {
                        return jks.a;
                    }
                }
                break;
            }
        }
    }
}
