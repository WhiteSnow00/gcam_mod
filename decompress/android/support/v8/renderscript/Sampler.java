// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class Sampler extends BaseObj
{
    float mAniso;
    Sampler$Value mMag;
    Sampler$Value mMin;
    Sampler$Value mWrapR;
    Sampler$Value mWrapS;
    Sampler$Value mWrapT;
    
    public Sampler(final long n, final RenderScript renderScript) {
        super(n, renderScript);
    }
    
    public static Sampler CLAMP_LINEAR(final RenderScript renderScript) {
        if (renderScript.mSampler_CLAMP_LINEAR == null) {
            final Sampler$Builder sampler$Builder = new Sampler$Builder(renderScript);
            sampler$Builder.setMinification(Sampler$Value.LINEAR);
            sampler$Builder.setMagnification(Sampler$Value.LINEAR);
            sampler$Builder.setWrapS(Sampler$Value.CLAMP);
            sampler$Builder.setWrapT(Sampler$Value.CLAMP);
            renderScript.mSampler_CLAMP_LINEAR = sampler$Builder.create();
        }
        return renderScript.mSampler_CLAMP_LINEAR;
    }
    
    public static Sampler CLAMP_LINEAR_MIP_LINEAR(final RenderScript renderScript) {
        if (renderScript.mSampler_CLAMP_LINEAR_MIP_LINEAR == null) {
            final Sampler$Builder sampler$Builder = new Sampler$Builder(renderScript);
            sampler$Builder.setMinification(Sampler$Value.LINEAR_MIP_LINEAR);
            sampler$Builder.setMagnification(Sampler$Value.LINEAR);
            sampler$Builder.setWrapS(Sampler$Value.CLAMP);
            sampler$Builder.setWrapT(Sampler$Value.CLAMP);
            renderScript.mSampler_CLAMP_LINEAR_MIP_LINEAR = sampler$Builder.create();
        }
        return renderScript.mSampler_CLAMP_LINEAR_MIP_LINEAR;
    }
    
    public static Sampler CLAMP_NEAREST(final RenderScript renderScript) {
        if (renderScript.mSampler_CLAMP_NEAREST == null) {
            final Sampler$Builder sampler$Builder = new Sampler$Builder(renderScript);
            sampler$Builder.setMinification(Sampler$Value.NEAREST);
            sampler$Builder.setMagnification(Sampler$Value.NEAREST);
            sampler$Builder.setWrapS(Sampler$Value.CLAMP);
            sampler$Builder.setWrapT(Sampler$Value.CLAMP);
            renderScript.mSampler_CLAMP_NEAREST = sampler$Builder.create();
        }
        return renderScript.mSampler_CLAMP_NEAREST;
    }
    
    public static Sampler MIRRORED_REPEAT_LINEAR(final RenderScript renderScript) {
        if (renderScript.mSampler_MIRRORED_REPEAT_LINEAR == null) {
            final Sampler$Builder sampler$Builder = new Sampler$Builder(renderScript);
            sampler$Builder.setMinification(Sampler$Value.LINEAR);
            sampler$Builder.setMagnification(Sampler$Value.LINEAR);
            sampler$Builder.setWrapS(Sampler$Value.MIRRORED_REPEAT);
            sampler$Builder.setWrapT(Sampler$Value.MIRRORED_REPEAT);
            renderScript.mSampler_MIRRORED_REPEAT_LINEAR = sampler$Builder.create();
        }
        return renderScript.mSampler_MIRRORED_REPEAT_LINEAR;
    }
    
    public static Sampler MIRRORED_REPEAT_NEAREST(final RenderScript renderScript) {
        if (renderScript.mSampler_MIRRORED_REPEAT_NEAREST == null) {
            final Sampler$Builder sampler$Builder = new Sampler$Builder(renderScript);
            sampler$Builder.setMinification(Sampler$Value.NEAREST);
            sampler$Builder.setMagnification(Sampler$Value.NEAREST);
            sampler$Builder.setWrapS(Sampler$Value.MIRRORED_REPEAT);
            sampler$Builder.setWrapT(Sampler$Value.MIRRORED_REPEAT);
            renderScript.mSampler_MIRRORED_REPEAT_NEAREST = sampler$Builder.create();
        }
        return renderScript.mSampler_MIRRORED_REPEAT_NEAREST;
    }
    
    public static Sampler WRAP_LINEAR(final RenderScript renderScript) {
        if (renderScript.mSampler_WRAP_LINEAR == null) {
            final Sampler$Builder sampler$Builder = new Sampler$Builder(renderScript);
            sampler$Builder.setMinification(Sampler$Value.LINEAR);
            sampler$Builder.setMagnification(Sampler$Value.LINEAR);
            sampler$Builder.setWrapS(Sampler$Value.WRAP);
            sampler$Builder.setWrapT(Sampler$Value.WRAP);
            renderScript.mSampler_WRAP_LINEAR = sampler$Builder.create();
        }
        return renderScript.mSampler_WRAP_LINEAR;
    }
    
    public static Sampler WRAP_LINEAR_MIP_LINEAR(final RenderScript renderScript) {
        if (renderScript.mSampler_WRAP_LINEAR_MIP_LINEAR == null) {
            final Sampler$Builder sampler$Builder = new Sampler$Builder(renderScript);
            sampler$Builder.setMinification(Sampler$Value.LINEAR_MIP_LINEAR);
            sampler$Builder.setMagnification(Sampler$Value.LINEAR);
            sampler$Builder.setWrapS(Sampler$Value.WRAP);
            sampler$Builder.setWrapT(Sampler$Value.WRAP);
            renderScript.mSampler_WRAP_LINEAR_MIP_LINEAR = sampler$Builder.create();
        }
        return renderScript.mSampler_WRAP_LINEAR_MIP_LINEAR;
    }
    
    public static Sampler WRAP_NEAREST(final RenderScript renderScript) {
        if (renderScript.mSampler_WRAP_NEAREST == null) {
            final Sampler$Builder sampler$Builder = new Sampler$Builder(renderScript);
            sampler$Builder.setMinification(Sampler$Value.NEAREST);
            sampler$Builder.setMagnification(Sampler$Value.NEAREST);
            sampler$Builder.setWrapS(Sampler$Value.WRAP);
            sampler$Builder.setWrapT(Sampler$Value.WRAP);
            renderScript.mSampler_WRAP_NEAREST = sampler$Builder.create();
        }
        return renderScript.mSampler_WRAP_NEAREST;
    }
    
    public float getAnisotropy() {
        return this.mAniso;
    }
    
    public Sampler$Value getMagnification() {
        return this.mMag;
    }
    
    public Sampler$Value getMinification() {
        return this.mMin;
    }
    
    public Sampler$Value getWrapS() {
        return this.mWrapS;
    }
    
    public Sampler$Value getWrapT() {
        return this.mWrapT;
    }
}
