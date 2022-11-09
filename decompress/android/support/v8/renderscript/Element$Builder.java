// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class Element$Builder
{
    int[] mArraySizes;
    int mCount;
    String[] mElementNames;
    Element[] mElements;
    RenderScript mRS;
    int mSkipPadding;
    
    public Element$Builder(final RenderScript mrs) {
        this.mRS = mrs;
        this.mCount = 0;
        this.mElements = new Element[8];
        this.mElementNames = new String[8];
        this.mArraySizes = new int[8];
    }
    
    public Element$Builder add(final Element element, final String s) {
        return this.add(element, s, 1);
    }
    
    public Element$Builder add(final Element element, final String s, final int n) {
        if (n <= 0) {
            throw new RSIllegalArgumentException("Array size cannot be less than 1.");
        }
        if (this.mSkipPadding != 0 && s.startsWith("#padding_")) {
            this.mSkipPadding = 0;
            return this;
        }
        if (element.mVectorSize == 3) {
            this.mSkipPadding = 1;
        }
        else {
            this.mSkipPadding = 0;
        }
        final int mCount = this.mCount;
        final Element[] mElements = this.mElements;
        if (mCount == mElements.length) {
            final int n2 = mCount + 8;
            final Element[] mElements2 = new Element[n2];
            final String[] mElementNames = new String[n2];
            final int[] mArraySizes = new int[n2];
            System.arraycopy(mElements, 0, mElements2, 0, mCount);
            System.arraycopy(this.mElementNames, 0, mElementNames, 0, this.mCount);
            System.arraycopy(this.mArraySizes, 0, mArraySizes, 0, this.mCount);
            this.mElements = mElements2;
            this.mElementNames = mElementNames;
            this.mArraySizes = mArraySizes;
        }
        final Element[] mElements3 = this.mElements;
        final int mCount2 = this.mCount;
        mElements3[mCount2] = element;
        this.mElementNames[mCount2] = s;
        this.mArraySizes[mCount2] = n;
        this.mCount = mCount2 + 1;
        return this;
    }
    
    public Element create() {
        this.mRS.validate();
        final int mCount = this.mCount;
        final Element[] array = new Element[mCount];
        final String[] array2 = new String[mCount];
        final int[] array3 = new int[mCount];
        final Element[] mElements = this.mElements;
        int i = 0;
        System.arraycopy(mElements, 0, array, 0, mCount);
        System.arraycopy(this.mElementNames, 0, array2, 0, this.mCount);
        System.arraycopy(this.mArraySizes, 0, array3, 0, this.mCount);
        final long[] array4 = new long[mCount];
        while (i < mCount) {
            array4[i] = array[i].getID(this.mRS);
            ++i;
        }
        return new Element(this.mRS.nElementCreate2(array4, array2, array3), this.mRS, array, array2, array3);
    }
}
