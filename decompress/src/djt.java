// 
// Decompiled by Procyon v0.6.0
// 

enum djt
{
    a("PASSTHROUGH", 0), 
    b("GRAPH_DETECTION", 1), 
    c("CAMERA_DETECTION", 2), 
    d("CAMERA_DETECTION_WITH_SCALING", 3);
    
    public static final nnx e;
    public static final nnx f;
    public static final nnx g;
    
    static {
        final nnt nnt = new nnt();
        final djt djt;
        nnt.d(djt, "gca_passthrough.binarypb");
        final djt djt2;
        nnt.d(djt2, "gca_viewfinder_orientation.binarypb");
        final djt djt3;
        nnt.d(djt3, "gca_viewfinder_only_redaction.binarypb");
        final djt djt4;
        nnt.d(djt4, "gca_viewfinder_only_redaction_with_scaling.binarypb");
        e = nnt.b();
        final nnt nnt2 = new nnt();
        final Boolean value = true;
        nnt2.d(djt2, value);
        f = nnt2.b();
        final nnt nnt3 = new nnt();
        final Boolean value2 = false;
        nnt3.d(djt, value2);
        nnt3.d(djt2, value2);
        nnt3.d(djt3, value);
        nnt3.d(djt4, value);
        g = nnt3.b();
    }
    
    private djt(final String s, final int n) {
    }
}
