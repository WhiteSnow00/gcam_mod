// 
// Decompiled by Procyon v0.6.0
// 

public final class cya
{
    public static final cxm a;
    public static final cxm b;
    public static final cxm c;
    public static final cxm d;
    
    static {
        new cxn().a = "camera.optbar.hdr";
        final cxn cxn = new cxn();
        cxn.a = "default_aspect_ratio";
        a = cxn.f();
        final cxn cxn2 = new cxn();
        cxn2.a = "camera.use_video_resolution_option";
        b = cxn2.f();
        final cxn cxn3 = new cxn();
        cxn3.a = "camera.optbar.show_auto_flash_option";
        c = cxn3.d();
        final cxn cxn4 = new cxn();
        cxn4.a = "camera.optbar.standalone_settings_button";
        d = cxn4.f();
        new cxn().a = "camera.optbar.icons_on_closed_menu";
    }
}
