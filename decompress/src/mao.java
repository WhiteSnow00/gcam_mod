// 
// Decompiled by Procyon v0.6.0
// 

public final class mao implements lvi
{
    public static final float[] a;
    public final lyp b;
    public lzu c;
    
    static {
        a = new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f };
    }
    
    private mao(final lyp b) {
        this.c = null;
        this.b = b;
    }
    
    public static mao a(final lyp lyp) {
        return new mao(lyp);
    }
    
    public final void b(final lyp lyp) {
        if (lyp == this.b) {
            return;
        }
        final String value = String.valueOf(lyp);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 111 + String.valueOf(value2).length());
        sb.append("Input to GLTextureCopier must be on the copier's GL context. Found input on context ");
        sb.append(value);
        sb.append(" but expect input to be on ");
        sb.append(value2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void c(final lzn lzn, final lyo lyo) {
        this.d(lzn, lyo, mao.a);
    }
    
    @Override
    public final void close() {
        final lzu c = this.c;
        if (c != null) {
            c.close();
            this.c = null;
        }
    }
    
    public final void d(final lzn lzn, final lyo lyo, final float[] array) {
        this.b(lzn.a);
        this.b(lyo.a);
        final lyp a = lyo.a;
        final float[] a2 = lzw.a;
        final maq maq = (maq)a.h(String.valueOf(lzw.class.getName()).concat("_texcoords"), new lzv(a)).c();
        njo.d(maq.c >= 3);
        final lzf lzf = new lzf(5, maq, null);
        this.b.e();
        if (this.c == null) {
            final mal d = mal.d(this.b, "attribute vec2 aPosition;\nattribute vec2 aTexCoord;\nuniform mat4 uTransform;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}");
            final mal b = mal.b(this.b, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES uImgTex;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(uImgTex, texCoord);\n}");
            final lzt b2 = lzu.b(this.b);
            b2.b(mga.g(d));
            b2.b(mga.g(b));
            this.c = b2.a();
        }
        final lzi a3 = lzf.a(this.c);
        a3.d(lzn);
        a3.e.put("uTransform", new lzb(array));
        a3.c("aPosition", 0);
        a3.c("aTexCoord", 1);
        a3.b(lyo);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 17);
        sb.append("GLTextureCopier[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
