// 
// Decompiled by Procyon v0.6.0
// 

public final class cxi
{
    public static final cxm a;
    public static final cxm b;
    
    static {
        final cxn cxn = new cxn();
        cxn.a = "camera.fc_extraction";
        a = cxn.f();
        new cxn().a = "camera.fc_diet";
        new cxn().a = "camera.fc_imu_sensor";
        final cxn cxn2 = new cxn();
        cxn2.a = "camera.fc_orientation";
        b = cxn2.f();
    }
}
