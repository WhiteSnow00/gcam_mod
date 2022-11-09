// 
// Decompiled by Procyon v0.6.0
// 

public enum hvu
{
    a("ACTIVITY_ONCREATE_START", 0, true), 
    b("ACTIVITY_ONCREATE_END", 1, true), 
    c("PERMISSIONS_STARTUP_TASK_START", 2, true), 
    d("PERMISSIONS_STARTUP_TASK_END", 3, true), 
    e("WAIT_FOR_CAMERA_DEVICES_TASK_START", 4, true), 
    f("WAIT_FOR_CAMERA_DEVICES_TASK_END", 5, true), 
    g("ACTIVITY_ONSTART_START", 6, false), 
    h("ACTIVITY_ONRESUME_START", 7, false), 
    i("ACTIVITY_ONRESUME_END", 8, false), 
    j("ACTIVITY_SURFACE_VIEW_CREATED", 9, false), 
    k("ACTIVITY_INITIALIZED", 10, true), 
    l("ACTIVITY_FIRST_PREVIEW_FRAME_RECEIVED", 11, false), 
    m("ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED", 12, false), 
    n("ACTIVITY_FIRST_PREVIEW_FRAME_VFE_RENDERED", 13, false, false), 
    o("ACTIVITY_SHUTTER_BUTTON_DRAWN", 14, false), 
    p("ACTIVITY_SHUTTER_BUTTON_ENABLED", 15, false), 
    q("ACTIVITY_STEADY", 16, false, false);
    
    public final boolean r;
    public final boolean s;
    
    private hvu(final String s, final int n, final boolean b) {
        this(s, n, b, true);
    }
    
    private hvu(final String s, final int n, final boolean r, final boolean s2) {
        this.r = r;
        this.s = s2;
    }
}
