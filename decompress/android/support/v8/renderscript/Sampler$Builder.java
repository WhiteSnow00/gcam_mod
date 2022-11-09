// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class Sampler$Builder
{
    float mAniso;
    Sampler$Value mMag;
    Sampler$Value mMin;
    RenderScript mRS;
    Sampler$Value mWrapR;
    Sampler$Value mWrapS;
    Sampler$Value mWrapT;
    
    public Sampler$Builder(final RenderScript mrs) {
        this.mRS = mrs;
        this.mMin = Sampler$Value.NEAREST;
        this.mMag = Sampler$Value.NEAREST;
        this.mWrapS = Sampler$Value.WRAP;
        this.mWrapT = Sampler$Value.WRAP;
        this.mWrapR = Sampler$Value.WRAP;
        this.mAniso = 1.0f;
    }
    
    public Sampler create() {
        this.mRS.validate();
        final Sampler sampler = new Sampler(this.mRS.nSamplerCreate(this.mMag.mID, this.mMin.mID, this.mWrapS.mID, this.mWrapT.mID, this.mWrapR.mID, this.mAniso), this.mRS);
        sampler.mMin = this.mMin;
        sampler.mMag = this.mMag;
        sampler.mWrapS = this.mWrapS;
        sampler.mWrapT = this.mWrapT;
        sampler.mWrapR = this.mWrapR;
        sampler.mAniso = this.mAniso;
        return sampler;
    }
    
    public void setAnisotropy(final float mAniso) {
        if (mAniso >= 0.0f) {
            this.mAniso = mAniso;
            return;
        }
        throw new IllegalArgumentException("Invalid value");
    }
    
    public void setMagnification(final Sampler$Value mMag) {
        if (mMag != Sampler$Value.NEAREST && mMag != Sampler$Value.LINEAR) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.mMag = mMag;
    }
    
    public void setMinification(final Sampler$Value mMin) {
        if (mMin != Sampler$Value.NEAREST && mMin != Sampler$Value.LINEAR && mMin != Sampler$Value.LINEAR_MIP_LINEAR && mMin != Sampler$Value.LINEAR_MIP_NEAREST) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.mMin = mMin;
    }
    
    public void setWrapS(final Sampler$Value mWrapS) {
        if (mWrapS != Sampler$Value.WRAP && mWrapS != Sampler$Value.CLAMP && mWrapS != Sampler$Value.MIRRORED_REPEAT) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.mWrapS = mWrapS;
    }
    
    public void setWrapT(final Sampler$Value mWrapT) {
        if (mWrapT != Sampler$Value.WRAP && mWrapT != Sampler$Value.CLAMP && mWrapT != Sampler$Value.MIRRORED_REPEAT) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.mWrapT = mWrapT;
    }
}
