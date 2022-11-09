// 
// Decompiled by Procyon v0.6.0
// 

public final class fhj implements krc
{
    public final lzu a;
    
    public fhj(final lyp lyp) {
        final lzt lzt = new lzt(lyp);
        lzt.b(mga.g(mal.d(lyp, "#version 320 es\nin vec4 aPosition;\nin vec2 aTexCoord;\nuniform float uZoomFactor;\nout vec2 vTexCoord;\nvoid main() {\n  vTexCoord = aTexCoord;\n  gl_Position = vec4(uZoomFactor * aPosition.xyz, aPosition.w);\n}")));
        lzt.b(mga.g(mal.b(lyp, "#version 320 es\n#extension GL_EXT_YUV_target : enable\nprecision highp float;\nuniform highp __samplerExternal2DY2YEXT uImgTex;\nin vec2 vTexCoord;\nout vec4 outColor;\nvoid main() {\n    outColor = vec4(yuv_2_rgb(texture(uImgTex, vTexCoord).rgb,\n                              itu_601_full_range), 1.0);\n}")));
        this.a = lzt.a();
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
}
