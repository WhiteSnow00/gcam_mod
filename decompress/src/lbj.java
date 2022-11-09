// 
// Decompiled by Procyon v0.6.0
// 

public final class lbj
{
    public final lhr a;
    public final lhw b;
    final lhr c;
    public final lhr d;
    public final lhr e;
    final lhr f;
    public final lhr g;
    final lhr h;
    public final lhr i;
    public final lhr j;
    final /* synthetic */ lbk k;
    
    public lbj(final lbk k) {
        this.k = k;
        this.a = k.b.a("/pck/frameserver/frameserver_count", lht.b("camera_id"));
        this.b = k.b.b("/pck/frameserver/frameserver_open_durations_ns", lht.b("camera_id"));
        this.c = k.b.a("/pck/frameserver/frame_stream_count", lht.b("camera_id"), lht.a("stream_count"), lht.a("parameter_count"));
        this.d = k.b.a("/pck/frameserver/framebuffer_acquire_count", new lht[0]);
        this.e = k.b.a("/pck/frameserver/framebuffer_release_count", new lht[0]);
        this.f = k.b.a("/pck/frameserver/request_submit_count", lht.a("burst_size"), new lht("repeating", Boolean.class));
        this.g = k.b.a("/pck/frameserver/request_abort", new lht[0]);
        this.h = k.b.a("/pck/frameserver/stream_count", lht.b("camera_id"), lht.b("type"), lht.a("format"), lht.a("width"), lht.a("height"), lht.a("capacity"));
        this.i = k.b.a("/pck/frameserver/image_acquire_count", lht.a("width"), lht.a("height"), lht.a("format"));
        this.j = k.b.a("/pck/frameserver/image_release_count", lht.a("width"), lht.a("height"), lht.a("format"));
    }
}
