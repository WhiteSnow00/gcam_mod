// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public final class ScriptIntrinsicBLAS extends ScriptIntrinsic
{
    public static final int CONJ_TRANSPOSE = 113;
    private static final int INTRINSIC_API_LEVEL = 23;
    public static final int LEFT = 141;
    public static final int LOWER = 122;
    public static final int NON_UNIT = 131;
    public static final int NO_TRANSPOSE = 111;
    public static final int RIGHT = 142;
    private static final int RsBlas_bnnm = 1000;
    private static final int RsBlas_caxpy = 29;
    private static final int RsBlas_ccopy = 28;
    private static final int RsBlas_cdotc_sub = 6;
    private static final int RsBlas_cdotu_sub = 5;
    private static final int RsBlas_cgbmv = 64;
    private static final int RsBlas_cgemm = 125;
    private static final int RsBlas_cgemv = 63;
    private static final int RsBlas_cgerc = 99;
    private static final int RsBlas_cgeru = 98;
    private static final int RsBlas_chbmv = 96;
    private static final int RsBlas_chemm = 137;
    private static final int RsBlas_chemv = 95;
    private static final int RsBlas_cher = 100;
    private static final int RsBlas_cher2 = 102;
    private static final int RsBlas_cher2k = 139;
    private static final int RsBlas_cherk = 138;
    private static final int RsBlas_chpmv = 97;
    private static final int RsBlas_chpr = 101;
    private static final int RsBlas_chpr2 = 103;
    private static final int RsBlas_cscal = 43;
    private static final int RsBlas_csscal = 45;
    private static final int RsBlas_cswap = 27;
    private static final int RsBlas_csymm = 126;
    private static final int RsBlas_csyr2k = 128;
    private static final int RsBlas_csyrk = 127;
    private static final int RsBlas_ctbmv = 66;
    private static final int RsBlas_ctbsv = 69;
    private static final int RsBlas_ctpmv = 67;
    private static final int RsBlas_ctpsv = 70;
    private static final int RsBlas_ctrmm = 129;
    private static final int RsBlas_ctrmv = 65;
    private static final int RsBlas_ctrsm = 130;
    private static final int RsBlas_ctrsv = 68;
    private static final int RsBlas_dasum = 12;
    private static final int RsBlas_daxpy = 26;
    private static final int RsBlas_dcopy = 25;
    private static final int RsBlas_ddot = 4;
    private static final int RsBlas_dgbmv = 56;
    private static final int RsBlas_dgemm = 119;
    private static final int RsBlas_dgemv = 55;
    private static final int RsBlas_dger = 90;
    private static final int RsBlas_dnrm2 = 11;
    private static final int RsBlas_drot = 39;
    private static final int RsBlas_drotg = 37;
    private static final int RsBlas_drotm = 40;
    private static final int RsBlas_drotmg = 38;
    private static final int RsBlas_dsbmv = 88;
    private static final int RsBlas_dscal = 42;
    private static final int RsBlas_dsdot = 2;
    private static final int RsBlas_dspmv = 89;
    private static final int RsBlas_dspr = 92;
    private static final int RsBlas_dspr2 = 94;
    private static final int RsBlas_dswap = 24;
    private static final int RsBlas_dsymm = 120;
    private static final int RsBlas_dsymv = 87;
    private static final int RsBlas_dsyr = 91;
    private static final int RsBlas_dsyr2 = 93;
    private static final int RsBlas_dsyr2k = 122;
    private static final int RsBlas_dsyrk = 121;
    private static final int RsBlas_dtbmv = 58;
    private static final int RsBlas_dtbsv = 61;
    private static final int RsBlas_dtpmv = 59;
    private static final int RsBlas_dtpsv = 62;
    private static final int RsBlas_dtrmm = 123;
    private static final int RsBlas_dtrmv = 57;
    private static final int RsBlas_dtrsm = 124;
    private static final int RsBlas_dtrsv = 60;
    private static final int RsBlas_dzasum = 16;
    private static final int RsBlas_dznrm2 = 15;
    private static final int RsBlas_icamax = 19;
    private static final int RsBlas_idamax = 18;
    private static final int RsBlas_isamax = 17;
    private static final int RsBlas_izamax = 20;
    private static final int RsBlas_sasum = 10;
    private static final int RsBlas_saxpy = 23;
    private static final int RsBlas_scasum = 14;
    private static final int RsBlas_scnrm2 = 13;
    private static final int RsBlas_scopy = 22;
    private static final int RsBlas_sdot = 3;
    private static final int RsBlas_sdsdot = 1;
    private static final int RsBlas_sgbmv = 48;
    private static final int RsBlas_sgemm = 113;
    private static final int RsBlas_sgemv = 47;
    private static final int RsBlas_sger = 82;
    private static final int RsBlas_snrm2 = 9;
    private static final int RsBlas_srot = 35;
    private static final int RsBlas_srotg = 33;
    private static final int RsBlas_srotm = 36;
    private static final int RsBlas_srotmg = 34;
    private static final int RsBlas_ssbmv = 80;
    private static final int RsBlas_sscal = 41;
    private static final int RsBlas_sspmv = 81;
    private static final int RsBlas_sspr = 84;
    private static final int RsBlas_sspr2 = 86;
    private static final int RsBlas_sswap = 21;
    private static final int RsBlas_ssymm = 114;
    private static final int RsBlas_ssymv = 79;
    private static final int RsBlas_ssyr = 83;
    private static final int RsBlas_ssyr2 = 85;
    private static final int RsBlas_ssyr2k = 116;
    private static final int RsBlas_ssyrk = 115;
    private static final int RsBlas_stbmv = 50;
    private static final int RsBlas_stbsv = 53;
    private static final int RsBlas_stpmv = 51;
    private static final int RsBlas_stpsv = 54;
    private static final int RsBlas_strmm = 117;
    private static final int RsBlas_strmv = 49;
    private static final int RsBlas_strsm = 118;
    private static final int RsBlas_strsv = 52;
    private static final int RsBlas_zaxpy = 32;
    private static final int RsBlas_zcopy = 31;
    private static final int RsBlas_zdotc_sub = 8;
    private static final int RsBlas_zdotu_sub = 7;
    private static final int RsBlas_zdscal = 46;
    private static final int RsBlas_zgbmv = 72;
    private static final int RsBlas_zgemm = 131;
    private static final int RsBlas_zgemv = 71;
    private static final int RsBlas_zgerc = 108;
    private static final int RsBlas_zgeru = 107;
    private static final int RsBlas_zhbmv = 105;
    private static final int RsBlas_zhemm = 140;
    private static final int RsBlas_zhemv = 104;
    private static final int RsBlas_zher = 109;
    private static final int RsBlas_zher2 = 111;
    private static final int RsBlas_zher2k = 142;
    private static final int RsBlas_zherk = 141;
    private static final int RsBlas_zhpmv = 106;
    private static final int RsBlas_zhpr = 110;
    private static final int RsBlas_zhpr2 = 112;
    private static final int RsBlas_zscal = 44;
    private static final int RsBlas_zswap = 30;
    private static final int RsBlas_zsymm = 132;
    private static final int RsBlas_zsyr2k = 134;
    private static final int RsBlas_zsyrk = 133;
    private static final int RsBlas_ztbmv = 74;
    private static final int RsBlas_ztbsv = 77;
    private static final int RsBlas_ztpmv = 75;
    private static final int RsBlas_ztpsv = 78;
    private static final int RsBlas_ztrmm = 135;
    private static final int RsBlas_ztrmv = 73;
    private static final int RsBlas_ztrsm = 136;
    private static final int RsBlas_ztrsv = 76;
    public static final int TRANSPOSE = 112;
    public static final int UNIT = 132;
    public static final int UPPER = 121;
    private Allocation mLUT;
    
    private ScriptIntrinsicBLAS(final long n, final RenderScript renderScript) {
        super(n, renderScript);
    }
    
    public static ScriptIntrinsicBLAS create(final RenderScript renderScript) {
        renderScript.isUseNative();
        final ScriptIntrinsicBLAS scriptIntrinsicBLAS = new ScriptIntrinsicBLAS(renderScript.nScriptIntrinsicCreate(13, Element.U32(renderScript).getID(renderScript), false), renderScript);
        scriptIntrinsicBLAS.setIncSupp(false);
        return scriptIntrinsicBLAS;
    }
    
    static void validateConjTranspose(final int n) {
        if (n != 111 && n != 113) {
            throw new RSRuntimeException("Invalid transpose passed to BLAS");
        }
    }
    
    static void validateDiag(final int n) {
        if (n != 131 && n != 132) {
            throw new RSRuntimeException("Invalid diag passed to BLAS");
        }
    }
    
    static void validateGEMV(final Element element, int n, final Allocation allocation, final Allocation allocation2, int n2, final Allocation allocation3, final int n3) {
        validateTranspose(n);
        final int y = allocation.getType().getY();
        final int x = allocation.getType().getX();
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element) || !allocation3.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        if (allocation2.getType().getY() > 1 || allocation3.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        }
        if (n2 <= 0 || n3 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
        if (n == 111) {
            n2 = (x - 1) * n2 + 1;
            n = (y - 1) * n3 + 1;
        }
        else {
            n = (x - 1) * n3 + 1;
            n2 = (y - 1) * n2 + 1;
        }
        if (allocation2.getType().getX() == n2 && allocation3.getType().getX() == n) {
            return;
        }
        throw new RSRuntimeException("Incorrect vector dimensions for GEMV");
    }
    
    static void validateGER(final Element element, final Allocation allocation, final int n, final Allocation allocation2, final int n2, final Allocation allocation3) {
        if (!allocation3.getType().getElement().isCompatible(element) || !allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        if (allocation.getType().getY() > 1 || allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        }
        final int y = allocation3.getType().getY();
        final int x = allocation3.getType().getX();
        if (x <= 0 || y <= 0) {
            throw new RSRuntimeException("M and N must be 1 or greater for GER");
        }
        if (n <= 0 || n2 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
        if (allocation.getType().getX() != (y - 1) * n + 1) {
            throw new RSRuntimeException("Incorrect vector dimensions for GER");
        }
        if (allocation2.getType().getX() == (x - 1) * n2 + 1) {
            return;
        }
        throw new RSRuntimeException("Incorrect vector dimensions for GER");
    }
    
    static void validateGERU(final Element element, final Allocation allocation, final int n, final Allocation allocation2, final int n2, final Allocation allocation3) {
        if (!allocation3.getType().getElement().isCompatible(element) || !allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        if (allocation.getType().getY() > 1 || allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        }
        final int y = allocation3.getType().getY();
        final int x = allocation3.getType().getX();
        if (n <= 0 || n2 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
        if (allocation.getType().getX() != (y - 1) * n + 1) {
            throw new RSRuntimeException("Incorrect vector dimensions for GERU");
        }
        if (allocation2.getType().getX() == (x - 1) * n2 + 1) {
            return;
        }
        throw new RSRuntimeException("Incorrect vector dimensions for GERU");
    }
    
    static void validateHEMM(final Element element, final int n, final Allocation allocation, final Allocation allocation2, final Allocation allocation3) {
        validateSide(n);
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element) || !allocation3.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        final int x = allocation.getType().getX();
        if (x != allocation.getType().getY()) {
            throw new RSRuntimeException("Called HEMM with non-square A");
        }
        Label_0123: {
            if (n == 141) {
                if (x == allocation2.getType().getY()) {
                    break Label_0123;
                }
            }
            else {
                if (n != 142) {
                    break Label_0123;
                }
                if (x == allocation2.getType().getX()) {
                    break Label_0123;
                }
            }
            throw new RSRuntimeException("Called HEMM with invalid B");
        }
        if (allocation2.getType().getX() == allocation3.getType().getX() && allocation2.getType().getY() == allocation3.getType().getY()) {
            return;
        }
        throw new RSRuntimeException("Called HEMM with mismatched B and C");
    }
    
    static void validateHER2K(final Element element, final int n, final Allocation allocation, final Allocation allocation2, final Allocation allocation3) {
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element) || !allocation3.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        validateConjTranspose(n);
        final int x = allocation3.getType().getX();
        if (x != allocation3.getType().getY()) {
            throw new RSRuntimeException("Called HER2K with non-square C");
        }
        if (n == 111) {
            if (allocation.getType().getY() != x) {
                throw new RSRuntimeException("Called HER2K with invalid matrices");
            }
        }
        else if (allocation.getType().getX() != x) {
            throw new RSRuntimeException("Called HER2K with invalid matrices");
        }
        if (allocation.getType().getX() == allocation2.getType().getX() && allocation.getType().getY() == allocation2.getType().getY()) {
            return;
        }
        throw new RSRuntimeException("Called HER2K with invalid A and B matrices");
    }
    
    static void validateHERK(final Element element, final int n, final Allocation allocation, final Allocation allocation2) {
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        validateConjTranspose(n);
        final int x = allocation2.getType().getX();
        if (x == allocation2.getType().getY()) {
            if (n == 111) {
                if (x != allocation.getType().getY()) {
                    throw new RSRuntimeException("Called HERK with invalid A");
                }
            }
            else if (x != allocation.getType().getX()) {
                throw new RSRuntimeException("Called HERK with invalid A");
            }
            return;
        }
        throw new RSRuntimeException("Called HERK with non-square C");
    }
    
    static void validateL3(final Element element, int n, int y, int n2, final Allocation allocation, final Allocation allocation2, final Allocation allocation3) {
        if ((allocation != null && !allocation.getType().getElement().isCompatible(element)) || (allocation2 != null && !allocation2.getType().getElement().isCompatible(element)) || (allocation3 != null && !allocation3.getType().getElement().isCompatible(element))) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        if (allocation3 != null) {
            final int y2 = allocation3.getType().getY();
            final int x = allocation3.getType().getX();
            final int n3 = -1;
            int n4;
            if (n2 == 142) {
                if ((allocation == null && allocation2 != null) || (allocation != null && allocation2 == null)) {
                    throw new RSRuntimeException("Provided Matrix A without Matrix B, or vice versa");
                }
                if (allocation2 != null) {
                    n4 = allocation.getType().getY();
                    n = allocation.getType().getX();
                }
                else {
                    n4 = -1;
                    n = -1;
                }
                if (allocation != null) {
                    y = allocation2.getType().getY();
                    final int x2 = allocation2.getType().getX();
                    n2 = n;
                    n = x2;
                }
                else {
                    n2 = n;
                    y = -1;
                    n = n3;
                }
            }
            else {
                if (allocation != null) {
                    if (n != 112 && n != 113) {
                        n2 = allocation.getType().getY();
                        n = allocation.getType().getX();
                    }
                    else {
                        n = allocation.getType().getY();
                        n2 = allocation.getType().getX();
                    }
                }
                else {
                    n2 = -1;
                    n = -1;
                }
                if (allocation2 != null) {
                    if (y != 112 && y != 113) {
                        n4 = allocation2.getType().getY();
                        final int x3 = allocation2.getType().getX();
                        y = n2;
                        n2 = x3;
                    }
                    else {
                        final int y3 = allocation2.getType().getY();
                        n4 = allocation2.getType().getX();
                        y = n2;
                        n2 = y3;
                    }
                }
                else {
                    y = n2;
                    n4 = -1;
                    n2 = -1;
                }
            }
            if (allocation != null && allocation2 != null) {
                if (n != n4 || y != y2 || n2 != x) {
                    throw new RSRuntimeException("Called BLAS with invalid dimensions");
                }
            }
            else if (allocation != null) {
                if (y2 != x) {
                    throw new RSRuntimeException("Matrix C is not symmetric");
                }
                if (y != y2) {
                    throw new RSRuntimeException("Called BLAS with invalid dimensions");
                }
            }
            return;
        }
        throw new RSRuntimeException("Allocation C cannot be null");
    }
    
    static int validateSPMV(final Element element, int n, final Allocation allocation, final Allocation allocation2, final int n2, final Allocation allocation3, final int n3) {
        validateUplo(n);
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element) || !allocation3.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        if (allocation2.getType().getY() > 1 || allocation3.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        }
        if (allocation.getType().getY() > 1) {
            throw new RSRuntimeException("Ap must have a Y dimension of 0 or 1");
        }
        final double n4 = allocation.getType().getX();
        Double.isNaN(n4);
        Double.isNaN(n4);
        n = (int)Math.sqrt(n4 + n4);
        if (allocation.getType().getX() != (n + 1) * n / 2) {
            throw new RSRuntimeException("Invalid dimension for Ap");
        }
        if (n2 <= 0 || n3 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
        final int n5 = n - 1;
        if (allocation2.getType().getX() != n2 * n5 + 1) {
            throw new RSRuntimeException("Incorrect vector dimensions for SPMV");
        }
        if (allocation3.getType().getX() == n5 * n3 + 1) {
            return n;
        }
        throw new RSRuntimeException("Incorrect vector dimensions for SPMV");
    }
    
    static int validateSPR(final Element element, int n, final Allocation allocation, final int n2, final Allocation allocation2) {
        validateUplo(n);
        if (!allocation2.getType().getElement().isCompatible(element) || !allocation.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        if (allocation.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        }
        if (allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("Ap must have a Y dimension of 0 or 1");
        }
        final double n3 = allocation2.getType().getX();
        Double.isNaN(n3);
        Double.isNaN(n3);
        n = (int)Math.sqrt(n3 + n3);
        if (allocation2.getType().getX() != (n + 1) * n / 2) {
            throw new RSRuntimeException("Invalid dimension for Ap");
        }
        if (n2 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
        if (allocation.getType().getX() == (n - 1) * n2 + 1) {
            return n;
        }
        throw new RSRuntimeException("Incorrect vector dimensions for SPR");
    }
    
    static int validateSPR2(final Element element, int n, final Allocation allocation, final int n2, final Allocation allocation2, final int n3, final Allocation allocation3) {
        validateUplo(n);
        if (!allocation3.getType().getElement().isCompatible(element) || !allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        if (allocation.getType().getY() > 1 || allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        }
        if (allocation3.getType().getY() > 1) {
            throw new RSRuntimeException("Ap must have a Y dimension of 0 or 1");
        }
        final double n4 = allocation3.getType().getX();
        Double.isNaN(n4);
        Double.isNaN(n4);
        n = (int)Math.sqrt(n4 + n4);
        if (allocation3.getType().getX() != (n + 1) * n / 2) {
            throw new RSRuntimeException("Invalid dimension for Ap");
        }
        if (n2 <= 0 || n3 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
        final int n5 = n - 1;
        if (allocation.getType().getX() == n5 * n2 + 1 && allocation2.getType().getX() == n3 * n5 + 1) {
            return n;
        }
        throw new RSRuntimeException("Incorrect vector dimensions for SPR2");
    }
    
    static int validateSYMV(final Element element, int y, final Allocation allocation, final Allocation allocation2, final Allocation allocation3, final int n, final int n2) {
        validateUplo(y);
        y = allocation.getType().getY();
        if (allocation.getType().getX() != y) {
            throw new RSRuntimeException("A must be a square matrix for SYMV");
        }
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element) || !allocation3.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        if (allocation2.getType().getY() > 1 || allocation3.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        }
        if (n <= 0 || n2 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
        final int n3 = y - 1;
        if (allocation2.getType().getX() != n * n3 + 1) {
            throw new RSRuntimeException("Incorrect vector dimensions for SYMV");
        }
        if (allocation3.getType().getX() == n3 * n2 + 1) {
            return y;
        }
        throw new RSRuntimeException("Incorrect vector dimensions for SYMV");
    }
    
    static int validateSYR(final Element element, int x, final Allocation allocation, final int n, final Allocation allocation2) {
        validateUplo(x);
        if (!allocation2.getType().getElement().isCompatible(element) || !allocation.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        x = allocation2.getType().getX();
        if (allocation.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        }
        if (x != allocation2.getType().getY()) {
            throw new RSRuntimeException("A must be a symmetric matrix");
        }
        if (n <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
        if (allocation.getType().getX() == (x - 1) * n + 1) {
            return x;
        }
        throw new RSRuntimeException("Incorrect vector dimensions for SYR");
    }
    
    static int validateSYR2(final Element element, int n, final Allocation allocation, final int n2, final Allocation allocation2, final int n3, final Allocation allocation3) {
        validateUplo(n);
        if (!allocation3.getType().getElement().isCompatible(element) || !allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        if (allocation.getType().getY() > 1 || allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        }
        final int x = allocation3.getType().getX();
        if (x != allocation3.getType().getY()) {
            throw new RSRuntimeException("A must be a symmetric matrix");
        }
        if (n2 <= 0 || n3 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
        n = x - 1;
        if (allocation.getType().getX() == n * n2 + 1 && allocation2.getType().getX() == n3 * n + 1) {
            return x;
        }
        throw new RSRuntimeException("Incorrect vector dimensions for SYR");
    }
    
    static void validateSYR2K(final Element element, int n, final Allocation allocation, final Allocation allocation2, final Allocation allocation3) {
        validateTranspose(n);
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element) || !allocation3.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        if (n == 112) {
            n = allocation.getType().getX();
        }
        else {
            n = allocation.getType().getY();
        }
        if (allocation3.getType().getX() != n || allocation3.getType().getY() != n) {
            throw new RSRuntimeException("Invalid symmetric matrix in SYR2K");
        }
        if (allocation.getType().getX() == allocation2.getType().getX() && allocation.getType().getY() == allocation2.getType().getY()) {
            return;
        }
        throw new RSRuntimeException("Invalid A and B in SYR2K");
    }
    
    static void validateSide(final int n) {
        if (n != 141 && n != 142) {
            throw new RSRuntimeException("Invalid side passed to BLAS");
        }
    }
    
    static int validateTPMV(final Element element, int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        validateTranspose(n2);
        validateUplo(n);
        validateDiag(n3);
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        if (allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        }
        if (allocation.getType().getY() > 1) {
            throw new RSRuntimeException("Ap must have a Y dimension of 0 or 1");
        }
        final double n5 = allocation.getType().getX();
        Double.isNaN(n5);
        Double.isNaN(n5);
        n = (int)Math.sqrt(n5 + n5);
        if (allocation.getType().getX() != (n + 1) * n / 2) {
            throw new RSRuntimeException("Invalid dimension for Ap");
        }
        if (n4 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
        if (allocation2.getType().getX() == (n - 1) * n4 + 1) {
            return n;
        }
        throw new RSRuntimeException("Incorrect vector dimensions for TPMV");
    }
    
    static void validateTRMM(final Element element, final int n, int x, final Allocation allocation, final Allocation allocation2) {
        validateSide(n);
        validateTranspose(x);
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        final int y = allocation.getType().getY();
        final int x2 = allocation.getType().getX();
        if (y == x2) {
            final int y2 = allocation2.getType().getY();
            x = allocation2.getType().getX();
            if (n == 141) {
                if (x2 != y2) {
                    throw new RSRuntimeException("Called TRMM with invalid matrices");
                }
            }
            else if (x != y) {
                throw new RSRuntimeException("Called TRMM with invalid matrices");
            }
            return;
        }
        throw new RSRuntimeException("Called TRMM with a non-symmetric matrix A");
    }
    
    static void validateTRMV(final Element element, int y, final int n, final int n2, final Allocation allocation, final Allocation allocation2, final int n3) {
        validateTranspose(n);
        validateUplo(y);
        validateDiag(n2);
        y = allocation.getType().getY();
        if (allocation.getType().getX() != y) {
            throw new RSRuntimeException("A must be a square matrix for TRMV");
        }
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        if (allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        }
        if (n3 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
        if (allocation2.getType().getX() == (y - 1) * n3 + 1) {
            return;
        }
        throw new RSRuntimeException("Incorrect vector dimensions for TRMV");
    }
    
    static void validateTRSM(final Element element, final int n, int x, final Allocation allocation, final Allocation allocation2) {
        validateSide(n);
        validateTranspose(x);
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        final int x2 = allocation.getType().getX();
        if (x2 == allocation.getType().getY()) {
            final int y = allocation2.getType().getY();
            x = allocation2.getType().getX();
            if (n == 141) {
                if (x2 != y) {
                    throw new RSRuntimeException("Called TRSM with invalid matrix dimensions");
                }
            }
            else if (x2 != x) {
                throw new RSRuntimeException("Called TRSM with invalid matrix dimensions");
            }
            return;
        }
        throw new RSRuntimeException("Called TRSM with a non-symmetric matrix A");
    }
    
    static void validateTranspose(final int n) {
        if (n != 111 && n != 112 && n != 113) {
            throw new RSRuntimeException("Invalid transpose passed to BLAS");
        }
    }
    
    static void validateUplo(final int n) {
        if (n != 121 && n != 122) {
            throw new RSRuntimeException("Invalid uplo passed to BLAS");
        }
    }
    
    public void BNNM(final Allocation allocation, final int n, final Allocation allocation2, final int n2, final Allocation allocation3, final int n3, final int n4) {
        validateL3(Element.U8(this.mRS), 111, 112, 0, allocation, allocation2, allocation3);
        if (n < 0 || n > 255) {
            throw new RSRuntimeException("Invalid a_offset passed to BNNM");
        }
        if (n2 >= 0 && n2 <= 255) {
            final int y = allocation.getType().getY();
            final int y2 = allocation2.getType().getY();
            final int x = allocation.getType().getX();
            final boolean incSupp = this.isIncSupp();
            long n5 = allocation.getID(this.mRS);
            long n6 = allocation2.getID(this.mRS);
            long n7 = allocation3.getID(this.mRS);
            if (incSupp) {
                n5 = this.getDummyAlloc(allocation);
                n6 = this.getDummyAlloc(allocation2);
                n7 = this.getDummyAlloc(allocation3);
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_BNNM(this.getID(mrs), y, y2, x, n5, n, n6, n2, n7, n3, n4, incSupp);
            return;
        }
        throw new RSRuntimeException("Invalid b_offset passed to BNNM");
    }
    
    public void CGBMV(final int n, final int n2, final int n3, final Float2 float2, final Allocation allocation, final Allocation allocation2, final int n4, final Float2 float3, final Allocation allocation3, final int n5) {
        validateGEMV(Element.F32_2(this.mRS), n, allocation, allocation2, n4, allocation3, n5);
        if (n2 >= 0 && n3 >= 0) {
            final int y = allocation.getType().getY();
            final int x = allocation.getType().getX();
            final boolean incSupp = this.isIncSupp();
            final long id = allocation.getID(this.mRS);
            long id2 = allocation2.getID(this.mRS);
            long id3 = allocation3.getID(this.mRS);
            long n6;
            if (incSupp) {
                final long dummyAlloc = this.getDummyAlloc(allocation);
                final long dummyAlloc2 = this.getDummyAlloc(allocation2);
                final long dummyAlloc3 = this.getDummyAlloc(allocation3);
                n6 = dummyAlloc;
                id2 = dummyAlloc2;
                id3 = dummyAlloc3;
            }
            else {
                n6 = id;
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 64, n, 0, 0, 0, 0, y, x, 0, float2.x, float2.y, n6, id2, float3.x, float3.y, id3, n4, n5, n2, n3, incSupp);
            return;
        }
        throw new RSRuntimeException("KL and KU must be greater than or equal to 0");
    }
    
    public void CGEMM(final int n, final int n2, final Float2 float2, final Allocation allocation, final Allocation allocation2, final Float2 float3, final Allocation allocation3) {
        validateTranspose(n);
        validateTranspose(n2);
        validateL3(Element.F32_2(this.mRS), n, n2, 0, allocation, allocation2, allocation3);
        int n3;
        int n4;
        if (n != 111) {
            n3 = allocation.getType().getX();
            n4 = allocation.getType().getY();
        }
        else {
            n3 = allocation.getType().getY();
            n4 = allocation.getType().getX();
        }
        int n5;
        if (n2 != 111) {
            n5 = allocation2.getType().getY();
        }
        else {
            n5 = allocation2.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n6 = allocation3.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n6 = this.getDummyAlloc(allocation3);
            id2 = dummyAlloc2;
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 125, n, n2, 0, 0, 0, n3, n5, n4, float2.x, float2.y, dummyAlloc, id2, float3.x, float3.y, n6, 0, 0, 0, 0, incSupp);
    }
    
    public void CGEMV(final int n, final Float2 float2, final Allocation allocation, final Allocation allocation2, final int n2, final Float2 float3, final Allocation allocation3, final int n3) {
        validateGEMV(Element.F32_2(this.mRS), n, allocation, allocation2, n2, allocation3, n3);
        final int y = allocation.getType().getY();
        final int x = allocation.getType().getX();
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation.getID(this.mRS);
        long n5 = allocation2.getID(this.mRS);
        long n6 = allocation3.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation);
            n5 = this.getDummyAlloc(allocation2);
            n6 = this.getDummyAlloc(allocation3);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 63, n, 0, 0, 0, 0, y, x, 0, float2.x, float2.y, n4, n5, float3.x, float3.y, n6, n2, n3, 0, 0, incSupp);
    }
    
    public void CGERC(final Float2 float2, final Allocation allocation, final int n, final Allocation allocation2, final int n2, final Allocation allocation3) {
        validateGERU(Element.F32_2(this.mRS), allocation, n, allocation2, n2, allocation3);
        final int y = allocation3.getType().getY();
        final int x = allocation3.getType().getX();
        final boolean incSupp = this.isIncSupp();
        final long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        final long id3 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        long dummyAlloc3;
        long n3;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            dummyAlloc3 = this.getDummyAlloc(allocation2);
            n3 = dummyAlloc;
        }
        else {
            n3 = id;
            dummyAlloc3 = id3;
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 99, 0, 0, 0, 0, 0, y, x, 0, float2.x, float2.y, dummyAlloc2, dummyAlloc3, 0.0f, 0.0f, n3, n, n2, 0, 0, incSupp);
    }
    
    public void CGERU(final Float2 float2, final Allocation allocation, final int n, final Allocation allocation2, final int n2, final Allocation allocation3) {
        validateGERU(Element.F32_2(this.mRS), allocation, n, allocation2, n2, allocation3);
        final int y = allocation3.getType().getY();
        final int x = allocation3.getType().getX();
        final boolean incSupp = this.isIncSupp();
        final long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        long n3 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        long n4;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            n3 = this.getDummyAlloc(allocation2);
            n4 = dummyAlloc;
        }
        else {
            n4 = id;
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 98, 0, 0, 0, 0, 0, y, x, 0, float2.x, float2.y, dummyAlloc2, n3, 0.0f, 0.0f, n4, n, n2, 0, 0, incSupp);
    }
    
    public void CHBMV(final int n, final int n2, final Float2 float2, final Allocation allocation, final Allocation allocation2, final int n3, final Float2 float3, final Allocation allocation3, final int n4) {
        final int validateSYR2 = validateSYR2(Element.F32_2(this.mRS), n, allocation2, n3, allocation3, n4, allocation);
        if (n2 >= 0) {
            final boolean incSupp = this.isIncSupp();
            long n5 = allocation.getID(this.mRS);
            long n6 = allocation2.getID(this.mRS);
            long n7 = allocation3.getID(this.mRS);
            if (incSupp) {
                n5 = this.getDummyAlloc(allocation);
                n6 = this.getDummyAlloc(allocation2);
                n7 = this.getDummyAlloc(allocation3);
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 96, 0, 0, 0, n, 0, 0, validateSYR2, n2, float2.x, float2.y, n5, n6, float3.x, float3.y, n7, n3, n4, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("K must be 0 or greater for HBMV");
    }
    
    public void CHEMM(final int n, final int n2, final Float2 float2, final Allocation allocation, final Allocation allocation2, final Float2 float3, final Allocation allocation3) {
        validateUplo(n2);
        validateHEMM(Element.F32_2(this.mRS), n, allocation, allocation2, allocation3);
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n3 = allocation3.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n3 = this.getDummyAlloc(allocation3);
            id2 = dummyAlloc2;
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 137, 0, 0, n, n2, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, float2.x, float2.y, dummyAlloc, id2, float3.x, float3.y, n3, 0, 0, 0, 0, incSupp);
    }
    
    public void CHEMV(final int n, final Float2 float2, final Allocation allocation, final Allocation allocation2, final int n2, final Float2 float3, final Allocation allocation3, final int n3) {
        final int validateSYR2 = validateSYR2(Element.F32_2(this.mRS), n, allocation2, n2, allocation3, n3, allocation);
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation.getID(this.mRS);
        final long id = allocation2.getID(this.mRS);
        long n5 = allocation3.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation);
            dummyAlloc = this.getDummyAlloc(allocation2);
            n5 = this.getDummyAlloc(allocation3);
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 95, 0, 0, 0, n, 0, 0, validateSYR2, 0, float2.x, float2.y, n4, dummyAlloc, float3.x, float3.y, n5, n2, n3, 0, 0, incSupp);
    }
    
    public void CHER(final int n, final float n2, final Allocation allocation, final int n3, final Allocation allocation2) {
        final int validateSYR = validateSYR(Element.F32_2(this.mRS), n, allocation, n3, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation2.getID(this.mRS);
        long n5 = allocation.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation2);
            n5 = this.getDummyAlloc(allocation);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 100, 0, 0, 0, n, 0, 0, validateSYR, 0, n2, 0.0f, n5, 0L, 0.0f, 0.0f, n4, n3, 0, 0, 0, incSupp);
    }
    
    public void CHER2(final int n, final Float2 float2, final Allocation allocation, final int n2, final Allocation allocation2, final int n3, final Allocation allocation3) {
        final int validateSYR2 = validateSYR2(Element.F32_2(this.mRS), n, allocation, n2, allocation2, n3, allocation3);
        final boolean incSupp = this.isIncSupp();
        final long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        long n4 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        long n5;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            n4 = this.getDummyAlloc(allocation2);
            n5 = dummyAlloc;
        }
        else {
            n5 = id;
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 102, 0, 0, 0, n, 0, 0, validateSYR2, 0, float2.x, float2.y, dummyAlloc2, n4, 0.0f, 0.0f, n5, n2, n3, 0, 0, incSupp);
    }
    
    public void CHER2K(final int n, final int n2, final Float2 float2, final Allocation allocation, final Allocation allocation2, final float n3, final Allocation allocation3) {
        validateUplo(n);
        validateHER2K(Element.F32_2(this.mRS), n2, allocation, allocation2, allocation3);
        int n4;
        if (n2 == 111) {
            n4 = allocation.getType().getX();
        }
        else {
            n4 = allocation.getType().getY();
        }
        final boolean incSupp = this.isIncSupp();
        allocation.getID(this.mRS);
        final long id = allocation2.getID(this.mRS);
        long n5 = allocation3.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            this.getDummyAlloc(allocation);
            dummyAlloc = this.getDummyAlloc(allocation2);
            n5 = this.getDummyAlloc(allocation3);
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 139, n2, 0, 0, n, 0, 0, allocation3.getType().getX(), n4, float2.x, float2.y, allocation.getID(this.mRS), dummyAlloc, n3, 0.0f, n5, 0, 0, 0, 0, incSupp);
    }
    
    public void CHERK(final int n, final int n2, final float n3, final Allocation allocation, final float n4, final Allocation allocation2) {
        validateUplo(n);
        validateHERK(Element.F32_2(this.mRS), n2, allocation, allocation2);
        int n5;
        if (n2 == 113) {
            n5 = allocation.getType().getY();
        }
        else {
            n5 = allocation.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        long n6 = allocation.getID(this.mRS);
        long n7 = allocation2.getID(this.mRS);
        if (incSupp) {
            n6 = this.getDummyAlloc(allocation);
            n7 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 138, n2, 0, 0, n, 0, 0, allocation2.getType().getX(), n5, n3, 0.0f, n6, 0L, n4, 0.0f, n7, 0, 0, 0, 0, incSupp);
    }
    
    public void CHPMV(final int n, final Float2 float2, final Allocation allocation, final Allocation allocation2, final int n2, final Float2 float3, final Allocation allocation3, final int n3) {
        final int validateSPR2 = validateSPR2(Element.F32_2(this.mRS), n, allocation2, n2, allocation3, n3, allocation);
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n4 = allocation3.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n4 = this.getDummyAlloc(allocation3);
            id2 = dummyAlloc2;
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 97, 0, 0, 0, n, 0, 0, validateSPR2, 0, float2.x, float2.y, dummyAlloc, id2, float3.x, float3.y, n4, n2, n3, 0, 0, incSupp);
    }
    
    public void CHPR(final int n, final float n2, final Allocation allocation, final int n3, final Allocation allocation2) {
        final int validateSPR = validateSPR(Element.F32_2(this.mRS), n, allocation, n3, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation2.getID(this.mRS);
        long n5 = allocation.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation2);
            n5 = this.getDummyAlloc(allocation);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 101, 0, 0, 0, n, 0, 0, validateSPR, 0, n2, 0.0f, n5, 0L, 0.0f, 0.0f, n4, n3, 0, 0, 0, incSupp);
    }
    
    public void CHPR2(final int n, final Float2 float2, final Allocation allocation, final int n2, final Allocation allocation2, final int n3, final Allocation allocation3) {
        final int validateSPR2 = validateSPR2(Element.F32_2(this.mRS), n, allocation, n2, allocation2, n3, allocation3);
        final boolean incSupp = this.isIncSupp();
        long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        long n4 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            n4 = this.getDummyAlloc(allocation2);
            id = dummyAlloc;
        }
        else {
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 103, 0, 0, 0, n, 0, 0, validateSPR2, 0, float2.x, float2.y, dummyAlloc2, n4, 0.0f, 0.0f, id, n2, n3, 0, 0, incSupp);
    }
    
    public void CSYMM(final int n, final int n2, final Float2 float2, final Allocation allocation, final Allocation allocation2, final Float2 float3, final Allocation allocation3) {
        validateSide(n);
        validateUplo(n2);
        if (allocation.getType().getX() == allocation.getType().getY()) {
            validateL3(Element.F32_2(this.mRS), 0, 0, n, allocation, allocation2, allocation3);
            final boolean incSupp = this.isIncSupp();
            final long id = allocation.getID(this.mRS);
            final long id2 = allocation2.getID(this.mRS);
            long n3 = allocation3.getID(this.mRS);
            long dummyAlloc;
            long dummyAlloc2;
            if (incSupp) {
                dummyAlloc = this.getDummyAlloc(allocation);
                dummyAlloc2 = this.getDummyAlloc(allocation2);
                n3 = this.getDummyAlloc(allocation3);
            }
            else {
                dummyAlloc2 = id2;
                dummyAlloc = id;
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 126, 0, 0, n, n2, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, float2.x, float2.y, dummyAlloc, dummyAlloc2, float3.x, float3.y, n3, 0, 0, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("Matrix A is not symmetric");
    }
    
    public void CSYR2K(final int n, final int n2, final Float2 float2, final Allocation allocation, final Allocation allocation2, final Float2 float3, final Allocation allocation3) {
        validateUplo(n);
        validateSYR2K(Element.F32_2(this.mRS), n2, allocation, allocation2, allocation3);
        int n3;
        if (n2 != 111) {
            n3 = allocation.getType().getY();
        }
        else {
            n3 = allocation.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n4 = allocation3.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n4 = this.getDummyAlloc(allocation3);
            id2 = dummyAlloc2;
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 128, n2, 0, 0, n, 0, 0, allocation3.getType().getX(), n3, float2.x, float2.y, dummyAlloc, id2, float3.x, float3.y, n4, 0, 0, 0, 0, incSupp);
    }
    
    public void CSYRK(final int n, final int n2, final Float2 float2, final Allocation allocation, final Float2 float3, final Allocation allocation2) {
        validateTranspose(n2);
        validateUplo(n);
        validateL3(Element.F32_2(this.mRS), n2, 0, 0, allocation, null, allocation2);
        int n3;
        if (n2 != 111) {
            n3 = allocation.getType().getY();
        }
        else {
            n3 = allocation.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation.getID(this.mRS);
        allocation2.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation);
            this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 127, n2, 0, 0, n, 0, 0, allocation2.getType().getX(), n3, float2.x, float2.y, n4, 0L, float3.x, float3.y, allocation2.getID(this.mRS), 0, 0, 0, 0, incSupp);
    }
    
    public void CTBMV(final int n, final int n2, final int n3, final int n4, final Allocation allocation, final Allocation allocation2, final int n5) {
        if (n4 >= 0) {
            validateTRMV(Element.F32_2(this.mRS), n, n2, n3, allocation, allocation2, n5);
            final int y = allocation.getType().getY();
            final boolean incSupp = this.isIncSupp();
            final long id = allocation.getID(this.mRS);
            long n6 = allocation2.getID(this.mRS);
            long dummyAlloc;
            if (incSupp) {
                dummyAlloc = this.getDummyAlloc(allocation);
                n6 = this.getDummyAlloc(allocation2);
            }
            else {
                dummyAlloc = id;
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 66, n2, 0, 0, n, n3, 0, y, n4, 0.0f, 0.0f, dummyAlloc, n6, 0.0f, 0.0f, 0L, n5, 0, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("K must be greater than or equal to 0");
    }
    
    public void CTBSV(final int n, final int n2, final int n3, final int n4, final Allocation allocation, final Allocation allocation2, final int n5) {
        validateTRMV(Element.F32_2(this.mRS), n, n2, n3, allocation, allocation2, n5);
        final int y = allocation.getType().getY();
        if (n4 >= 0) {
            final boolean incSupp = this.isIncSupp();
            long n6 = allocation.getID(this.mRS);
            long n7 = allocation2.getID(this.mRS);
            if (incSupp) {
                n6 = this.getDummyAlloc(allocation);
                n7 = this.getDummyAlloc(allocation2);
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 69, n2, 0, 0, n, n3, 0, y, n4, 0.0f, 0.0f, n6, n7, 0.0f, 0.0f, 0L, n5, 0, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("Number of diagonals must be positive");
    }
    
    public void CTPMV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        final int validateTPMV = validateTPMV(Element.F32_2(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 67, n2, 0, 0, n, n3, 0, validateTPMV, 0, 0.0f, 0.0f, n5, n6, 0.0f, 0.0f, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void CTPSV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        final int validateTPMV = validateTPMV(Element.F32_2(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 70, n2, 0, 0, n, n3, 0, validateTPMV, 0, 0.0f, 0.0f, n5, n6, 0.0f, 0.0f, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void CTRMM(final int n, final int n2, final int n3, final int n4, final Float2 float2, final Allocation allocation, final Allocation allocation2) {
        validateUplo(n2);
        validateDiag(n4);
        validateTRMM(Element.F32_2(this.mRS), n, n3, allocation, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 129, n3, 0, n, n2, n4, allocation2.getType().getY(), allocation2.getType().getX(), 0, float2.x, float2.y, n5, n6, 0.0f, 0.0f, 0L, 0, 0, 0, 0, incSupp);
    }
    
    public void CTRMV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        validateTRMV(Element.F32_2(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final int y = allocation.getType().getY();
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 65, n2, 0, 0, n, n3, 0, y, 0, 0.0f, 0.0f, n5, n6, 0.0f, 0.0f, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void CTRSM(final int n, final int n2, final int n3, final int n4, final Float2 float2, final Allocation allocation, final Allocation allocation2) {
        validateUplo(n2);
        validateDiag(n4);
        validateTRSM(Element.F32_2(this.mRS), n, n3, allocation, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 130, n3, 0, n, n2, n4, allocation2.getType().getY(), allocation2.getType().getX(), 0, float2.x, float2.y, n5, n6, 0.0f, 0.0f, 0L, 0, 0, 0, 0, incSupp);
    }
    
    public void CTRSV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        validateTRMV(Element.F32_2(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final int y = allocation.getType().getY();
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Complex(this.getID(mrs), 68, n2, 0, 0, n, n3, 0, y, 0, 0.0f, 0.0f, n5, n6, 0.0f, 0.0f, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void DGBMV(final int n, final int n2, final int n3, final double n4, final Allocation allocation, final Allocation allocation2, final int n5, final double n6, final Allocation allocation3, final int n7) {
        validateGEMV(Element.F64(this.mRS), n, allocation, allocation2, n5, allocation3, n7);
        if (n2 >= 0 && n3 >= 0) {
            final int y = allocation.getType().getY();
            final int x = allocation.getType().getX();
            final boolean incSupp = this.isIncSupp();
            long n8 = allocation.getID(this.mRS);
            long n9 = allocation2.getID(this.mRS);
            long n10 = allocation3.getID(this.mRS);
            if (incSupp) {
                n8 = this.getDummyAlloc(allocation);
                n9 = this.getDummyAlloc(allocation2);
                n10 = this.getDummyAlloc(allocation3);
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 56, n, 0, 0, 0, 0, y, x, 0, n4, n8, n9, n6, n10, n5, n7, n2, n3, incSupp);
            return;
        }
        throw new RSRuntimeException("KL and KU must be greater than or equal to 0");
    }
    
    public void DGEMM(final int n, final int n2, final double n3, final Allocation allocation, final Allocation allocation2, final double n4, final Allocation allocation3) {
        validateTranspose(n);
        validateTranspose(n2);
        validateL3(Element.F64(this.mRS), n, n2, 0, allocation, allocation2, allocation3);
        int n5;
        int n6;
        if (n != 111) {
            n5 = allocation.getType().getX();
            n6 = allocation.getType().getY();
        }
        else {
            n5 = allocation.getType().getY();
            n6 = allocation.getType().getX();
        }
        int n7;
        if (n2 != 111) {
            n7 = allocation2.getType().getY();
        }
        else {
            n7 = allocation2.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        long n8 = allocation.getID(this.mRS);
        long n9 = allocation2.getID(this.mRS);
        long n10 = allocation3.getID(this.mRS);
        if (incSupp) {
            n8 = this.getDummyAlloc(allocation);
            n9 = this.getDummyAlloc(allocation2);
            n10 = this.getDummyAlloc(allocation3);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 119, n, n2, 0, 0, 0, n5, n7, n6, n3, n8, n9, n4, n10, 0, 0, 0, 0, incSupp);
    }
    
    public void DGEMV(final int n, final double n2, final Allocation allocation, final Allocation allocation2, final int n3, final double n4, final Allocation allocation3, final int n5) {
        validateGEMV(Element.F64(this.mRS), n, allocation, allocation2, n3, allocation3, n5);
        final int y = allocation.getType().getY();
        final int x = allocation.getType().getX();
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n6 = allocation3.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n6 = this.getDummyAlloc(allocation3);
            id2 = dummyAlloc2;
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 55, n, 0, 0, 0, 0, y, x, 0, n2, dummyAlloc, id2, n4, n6, n3, n5, 0, 0, incSupp);
    }
    
    public void DGER(final double n, final Allocation allocation, final int n2, final Allocation allocation2, final int n3, final Allocation allocation3) {
        final int y = allocation3.getType().getY();
        final int x = allocation3.getType().getX();
        validateGER(Element.F64(this.mRS), allocation, n2, allocation2, n3, allocation3);
        final boolean incSupp = this.isIncSupp();
        long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        long n4 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            n4 = this.getDummyAlloc(allocation2);
            id = dummyAlloc;
        }
        else {
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 90, 0, 0, 0, 0, 0, y, x, 0, n, dummyAlloc2, n4, 0.0, id, n2, n3, 0, 0, incSupp);
    }
    
    public void DSBMV(final int n, final int n2, final double n3, final Allocation allocation, final Allocation allocation2, final int n4, final double n5, final Allocation allocation3, final int n6) {
        if (n2 >= 0) {
            final int validateSYMV = validateSYMV(Element.F64(this.mRS), n, allocation, allocation2, allocation3, n4, n6);
            final boolean incSupp = this.isIncSupp();
            final long id = allocation.getID(this.mRS);
            long n7 = allocation2.getID(this.mRS);
            long n8 = allocation3.getID(this.mRS);
            long dummyAlloc;
            if (incSupp) {
                dummyAlloc = this.getDummyAlloc(allocation);
                n7 = this.getDummyAlloc(allocation2);
                n8 = this.getDummyAlloc(allocation3);
            }
            else {
                dummyAlloc = id;
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 88, 0, 0, 0, n, 0, 0, validateSYMV, n2, n3, dummyAlloc, n7, n5, n8, n4, n6, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("K must be greater than or equal to 0");
    }
    
    public void DSPMV(final int n, final double n2, final Allocation allocation, final Allocation allocation2, final int n3, final double n4, final Allocation allocation3, final int n5) {
        final int validateSPMV = validateSPMV(Element.F64(this.mRS), n, allocation, allocation2, n3, allocation3, n5);
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n6 = allocation3.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n6 = this.getDummyAlloc(allocation3);
            id2 = dummyAlloc2;
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 89, 0, 0, 0, n, 0, 0, validateSPMV, 0, n2, dummyAlloc, id2, n4, n6, n3, n5, 0, 0, incSupp);
    }
    
    public void DSPR(final int n, final double n2, final Allocation allocation, final int n3, final Allocation allocation2) {
        final int validateSPR = validateSPR(Element.F64(this.mRS), n, allocation, n3, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation2.getID(this.mRS);
        long n5 = allocation.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation2);
            n5 = this.getDummyAlloc(allocation);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 92, 0, 0, 0, n, 0, 0, validateSPR, 0, n2, n5, n4, 0.0, 0L, n3, 0, 0, 0, incSupp);
    }
    
    public void DSPR2(final int n, final double n2, final Allocation allocation, final int n3, final Allocation allocation2, final int n4, final Allocation allocation3) {
        final int validateSPR2 = validateSPR2(Element.F64(this.mRS), n, allocation, n3, allocation2, n4, allocation3);
        final boolean incSupp = this.isIncSupp();
        final long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        final long id3 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        long dummyAlloc3;
        long n5;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            dummyAlloc3 = this.getDummyAlloc(allocation2);
            n5 = dummyAlloc;
        }
        else {
            n5 = id;
            dummyAlloc3 = id3;
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 94, 0, 0, 0, n, 0, 0, validateSPR2, 0, n2, dummyAlloc2, dummyAlloc3, 0.0, n5, n3, n4, 0, 0, incSupp);
    }
    
    public void DSYMM(final int n, final int n2, final double n3, final Allocation allocation, final Allocation allocation2, final double n4, final Allocation allocation3) {
        validateSide(n);
        validateUplo(n2);
        if (allocation.getType().getX() == allocation.getType().getY()) {
            validateL3(Element.F64(this.mRS), 0, 0, n, allocation, allocation2, allocation3);
            final boolean incSupp = this.isIncSupp();
            final long id = allocation.getID(this.mRS);
            long id2 = allocation2.getID(this.mRS);
            long id3 = allocation3.getID(this.mRS);
            long n5;
            if (incSupp) {
                final long dummyAlloc = this.getDummyAlloc(allocation);
                final long dummyAlloc2 = this.getDummyAlloc(allocation2);
                final long dummyAlloc3 = this.getDummyAlloc(allocation3);
                n5 = dummyAlloc;
                id2 = dummyAlloc2;
                id3 = dummyAlloc3;
            }
            else {
                n5 = id;
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 120, 0, 0, n, n2, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, n3, n5, id2, n4, id3, 0, 0, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("Matrix A is not symmetric");
    }
    
    public void DSYMV(final int n, final double n2, final Allocation allocation, final Allocation allocation2, final int n3, final double n4, final Allocation allocation3, final int n5) {
        final int validateSYMV = validateSYMV(Element.F64(this.mRS), n, allocation, allocation2, allocation3, n3, n5);
        final boolean incSupp = this.isIncSupp();
        long n6 = allocation.getID(this.mRS);
        long n7 = allocation2.getID(this.mRS);
        long n8 = allocation3.getID(this.mRS);
        if (incSupp) {
            n6 = this.getDummyAlloc(allocation);
            n7 = this.getDummyAlloc(allocation2);
            n8 = this.getDummyAlloc(allocation3);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 87, 0, 0, 0, n, 0, 0, validateSYMV, 0, n2, n6, n7, n4, n8, n3, n5, 0, 0, incSupp);
    }
    
    public void DSYR(final int n, final double n2, final Allocation allocation, final int n3, final Allocation allocation2) {
        final int validateSYR = validateSYR(Element.F64(this.mRS), n, allocation, n3, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation2.getID(this.mRS);
        long n5 = allocation.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation2);
            n5 = this.getDummyAlloc(allocation);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 91, 0, 0, 0, n, 0, 0, validateSYR, 0, n2, n5, n4, 0.0, 0L, n3, 0, 0, 0, incSupp);
    }
    
    public void DSYR2(final int n, final double n2, final Allocation allocation, final int n3, final Allocation allocation2, final int n4, final Allocation allocation3) {
        final int validateSYR2 = validateSYR2(Element.F64(this.mRS), n, allocation, n3, allocation2, n4, allocation3);
        final boolean incSupp = this.isIncSupp();
        long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        long n5 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            n5 = this.getDummyAlloc(allocation2);
            id = dummyAlloc;
        }
        else {
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 93, 0, 0, 0, n, 0, 0, validateSYR2, 0, n2, dummyAlloc2, n5, 0.0, id, n3, n4, 0, 0, incSupp);
    }
    
    public void DSYR2K(final int n, final int n2, final double n3, final Allocation allocation, final Allocation allocation2, final double n4, final Allocation allocation3) {
        validateUplo(n);
        validateSYR2K(Element.F64(this.mRS), n2, allocation, allocation2, allocation3);
        int n5;
        if (n2 != 111) {
            n5 = allocation.getType().getY();
        }
        else {
            n5 = allocation.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n6 = allocation3.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n6 = this.getDummyAlloc(allocation3);
            id2 = dummyAlloc2;
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 122, n2, 0, 0, n, 0, 0, allocation3.getType().getX(), n5, n3, dummyAlloc, id2, n4, n6, 0, 0, 0, 0, incSupp);
    }
    
    public void DSYRK(final int n, final int n2, final double n3, final Allocation allocation, final double n4, final Allocation allocation2) {
        validateTranspose(n2);
        validateUplo(n);
        validateL3(Element.F64(this.mRS), n2, 0, 0, allocation, null, allocation2);
        int n5;
        if (n2 != 111) {
            n5 = allocation.getType().getY();
        }
        else {
            n5 = allocation.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        long n6 = allocation.getID(this.mRS);
        long n7 = allocation2.getID(this.mRS);
        if (incSupp) {
            n6 = this.getDummyAlloc(allocation);
            n7 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 121, n2, 0, 0, n, 0, 0, allocation2.getType().getX(), n5, n3, n6, 0L, n4, n7, 0, 0, 0, 0, incSupp);
    }
    
    public void DTBMV(final int n, final int n2, final int n3, final int n4, final Allocation allocation, final Allocation allocation2, final int n5) {
        if (n4 >= 0) {
            validateTRMV(Element.F64(this.mRS), n, n2, n3, allocation, allocation2, n5);
            final int y = allocation.getType().getY();
            final boolean incSupp = this.isIncSupp();
            long n6 = allocation.getID(this.mRS);
            long n7 = allocation2.getID(this.mRS);
            if (incSupp) {
                n6 = this.getDummyAlloc(allocation);
                n7 = this.getDummyAlloc(allocation2);
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 58, n2, 0, 0, n, n3, 0, y, n4, 0.0, n6, n7, 0.0, 0L, n5, 0, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("K must be greater than or equal to 0");
    }
    
    public void DTBSV(final int n, final int n2, final int n3, final int n4, final Allocation allocation, final Allocation allocation2, final int n5) {
        validateTRMV(Element.F64(this.mRS), n, n2, n3, allocation, allocation2, n5);
        final int y = allocation.getType().getY();
        if (n4 >= 0) {
            final boolean incSupp = this.isIncSupp();
            long n6 = allocation.getID(this.mRS);
            long n7 = allocation2.getID(this.mRS);
            if (incSupp) {
                n6 = this.getDummyAlloc(allocation);
                n7 = this.getDummyAlloc(allocation2);
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 61, n2, 0, 0, n, n3, 0, y, n4, 0.0, n6, n7, 0.0, 0L, n5, 0, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("Number of diagonals must be positive");
    }
    
    public void DTPMV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        final int validateTPMV = validateTPMV(Element.F64(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 59, n2, 0, 0, n, n3, 0, validateTPMV, 0, 0.0, n5, n6, 0.0, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void DTPSV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        final int validateTPMV = validateTPMV(Element.F64(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 62, n2, 0, 0, n, n3, 0, validateTPMV, 0, 0.0, n5, n6, 0.0, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void DTRMM(final int n, final int n2, final int n3, final int n4, final double n5, final Allocation allocation, final Allocation allocation2) {
        validateUplo(n2);
        validateDiag(n4);
        validateTRMM(Element.F64(this.mRS), n, n3, allocation, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n6 = allocation.getID(this.mRS);
        long n7 = allocation2.getID(this.mRS);
        if (incSupp) {
            n6 = this.getDummyAlloc(allocation);
            n7 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 123, n3, 0, n, n2, n4, allocation2.getType().getY(), allocation2.getType().getX(), 0, n5, n6, n7, 0.0, 0L, 0, 0, 0, 0, incSupp);
    }
    
    public void DTRMV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        validateTRMV(Element.F64(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final int y = allocation.getType().getY();
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long n5 = allocation2.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            n5 = this.getDummyAlloc(allocation2);
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 57, n2, 0, 0, n, n3, 0, y, 0, 0.0, dummyAlloc, n5, 0.0, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void DTRSM(final int n, final int n2, final int n3, final int n4, final double n5, final Allocation allocation, final Allocation allocation2) {
        validateUplo(n2);
        validateDiag(n4);
        validateTRSM(Element.F64(this.mRS), n, n3, allocation, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n6 = allocation.getID(this.mRS);
        long n7 = allocation2.getID(this.mRS);
        if (incSupp) {
            n6 = this.getDummyAlloc(allocation);
            n7 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 124, n3, 0, n, n2, n4, allocation2.getType().getY(), allocation2.getType().getX(), 0, n5, n6, n7, 0.0, 0L, 0, 0, 0, 0, incSupp);
    }
    
    public void DTRSV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        validateTRMV(Element.F64(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final int y = allocation.getType().getY();
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Double(this.getID(mrs), 60, n2, 0, 0, n, n3, 0, y, 0, 0.0, n5, n6, 0.0, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void SGBMV(final int n, final int n2, final int n3, final float n4, final Allocation allocation, final Allocation allocation2, final int n5, final float n6, final Allocation allocation3, final int n7) {
        validateGEMV(Element.F32(this.mRS), n, allocation, allocation2, n5, allocation3, n7);
        if (n2 >= 0 && n3 >= 0) {
            final int y = allocation.getType().getY();
            final int x = allocation.getType().getX();
            final boolean incSupp = this.isIncSupp();
            final long id = allocation.getID(this.mRS);
            final long id2 = allocation2.getID(this.mRS);
            long n8 = allocation3.getID(this.mRS);
            long dummyAlloc;
            long n9;
            if (incSupp) {
                dummyAlloc = this.getDummyAlloc(allocation);
                final long dummyAlloc2 = this.getDummyAlloc(allocation2);
                n8 = this.getDummyAlloc(allocation3);
                n9 = dummyAlloc2;
            }
            else {
                n9 = id2;
                dummyAlloc = id;
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 48, n, 0, 0, 0, 0, y, x, 0, n4, dummyAlloc, n9, n6, n8, n5, n7, n2, n3, incSupp);
            return;
        }
        throw new RSRuntimeException("KL and KU must be greater than or equal to 0");
    }
    
    public void SGEMM(final int n, final int n2, final float n3, final Allocation allocation, final Allocation allocation2, final float n4, final Allocation allocation3) {
        validateTranspose(n);
        validateTranspose(n2);
        validateL3(Element.F32(this.mRS), n, n2, 0, allocation, allocation2, allocation3);
        int n5;
        int n6;
        if (n != 111) {
            n5 = allocation.getType().getX();
            n6 = allocation.getType().getY();
        }
        else {
            n5 = allocation.getType().getY();
            n6 = allocation.getType().getX();
        }
        int n7;
        if (n2 != 111) {
            n7 = allocation2.getType().getY();
        }
        else {
            n7 = allocation2.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n8 = allocation3.getID(this.mRS);
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n8 = this.getDummyAlloc(allocation3);
            id = dummyAlloc;
            id2 = dummyAlloc2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 113, n, n2, 0, 0, 0, n5, n7, n6, n3, id, id2, n4, n8, 0, 0, 0, 0, incSupp);
    }
    
    public void SGEMV(final int n, final float n2, final Allocation allocation, final Allocation allocation2, final int n3, final float n4, final Allocation allocation3, final int n5) {
        validateGEMV(Element.F32(this.mRS), n, allocation, allocation2, n3, allocation3, n5);
        final int y = allocation.getType().getY();
        final int x = allocation.getType().getX();
        final boolean incSupp = this.isIncSupp();
        long n6 = allocation.getID(this.mRS);
        long n7 = allocation2.getID(this.mRS);
        long n8 = allocation3.getID(this.mRS);
        if (incSupp) {
            n6 = this.getDummyAlloc(allocation);
            n7 = this.getDummyAlloc(allocation2);
            n8 = this.getDummyAlloc(allocation3);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 47, n, 0, 0, 0, 0, y, x, 0, n2, n6, n7, n4, n8, n3, n5, 0, 0, incSupp);
    }
    
    public void SGER(final float n, final Allocation allocation, final int n2, final Allocation allocation2, final int n3, final Allocation allocation3) {
        final int y = allocation3.getType().getY();
        final int x = allocation3.getType().getX();
        validateGER(Element.F32(this.mRS), allocation, n2, allocation2, n3, allocation3);
        final boolean incSupp = this.isIncSupp();
        long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        long n4 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            n4 = this.getDummyAlloc(allocation2);
            id = dummyAlloc;
        }
        else {
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 82, 0, 0, 0, 0, 0, y, x, 0, n, dummyAlloc2, n4, 0.0f, id, n2, n3, 0, 0, incSupp);
    }
    
    public void SSBMV(final int n, final int n2, final float n3, final Allocation allocation, final Allocation allocation2, final int n4, final float n5, final Allocation allocation3, final int n6) {
        if (n2 >= 0) {
            final int validateSYMV = validateSYMV(Element.F32(this.mRS), n, allocation, allocation2, allocation3, n4, n6);
            final boolean incSupp = this.isIncSupp();
            final long id = allocation.getID(this.mRS);
            long id2 = allocation2.getID(this.mRS);
            long n7 = allocation3.getID(this.mRS);
            long dummyAlloc;
            if (incSupp) {
                dummyAlloc = this.getDummyAlloc(allocation);
                final long dummyAlloc2 = this.getDummyAlloc(allocation2);
                n7 = this.getDummyAlloc(allocation3);
                id2 = dummyAlloc2;
            }
            else {
                dummyAlloc = id;
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 80, 0, 0, 0, n, 0, 0, validateSYMV, n2, n3, dummyAlloc, id2, n5, n7, n4, n6, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("K must be greater than or equal to 0");
    }
    
    public void SSPMV(final int n, final float n2, final Allocation allocation, final Allocation allocation2, final int n3, final float n4, final Allocation allocation3, final int n5) {
        final int validateSPMV = validateSPMV(Element.F32(this.mRS), n, allocation, allocation2, n3, allocation3, n5);
        final boolean incSupp = this.isIncSupp();
        long n6 = allocation.getID(this.mRS);
        final long id = allocation2.getID(this.mRS);
        long id2 = allocation3.getID(this.mRS);
        long n7;
        if (incSupp) {
            n6 = this.getDummyAlloc(allocation);
            final long dummyAlloc = this.getDummyAlloc(allocation2);
            final long dummyAlloc2 = this.getDummyAlloc(allocation3);
            n7 = dummyAlloc;
            id2 = dummyAlloc2;
        }
        else {
            n7 = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 81, 0, 0, 0, n, 0, 0, validateSPMV, 0, n2, n6, n7, n4, id2, n3, n5, 0, 0, incSupp);
    }
    
    public void SSPR(final int n, final float n2, final Allocation allocation, final int n3, final Allocation allocation2) {
        final int validateSPR = validateSPR(Element.F32(this.mRS), n, allocation, n3, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation2.getID(this.mRS);
        long n5 = allocation.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation2);
            n5 = this.getDummyAlloc(allocation);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 84, 0, 0, 0, n, 0, 0, validateSPR, 0, n2, n5, n4, 0.0f, 0L, n3, 0, 0, 0, incSupp);
    }
    
    public void SSPR2(final int n, final float n2, final Allocation allocation, final int n3, final Allocation allocation2, final int n4, final Allocation allocation3) {
        final int validateSPR2 = validateSPR2(Element.F32(this.mRS), n, allocation, n3, allocation2, n4, allocation3);
        final boolean incSupp = this.isIncSupp();
        long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        long n5 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            n5 = this.getDummyAlloc(allocation2);
            id = dummyAlloc;
        }
        else {
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 86, 0, 0, 0, n, 0, 0, validateSPR2, 0, n2, dummyAlloc2, n5, 0.0f, id, n3, n4, 0, 0, incSupp);
    }
    
    public void SSYMM(final int n, final int n2, final float n3, final Allocation allocation, final Allocation allocation2, final float n4, final Allocation allocation3) {
        validateSide(n);
        validateUplo(n2);
        if (allocation.getType().getX() == allocation.getType().getY()) {
            validateL3(Element.F32(this.mRS), 0, 0, n, allocation, allocation2, allocation3);
            final boolean incSupp = this.isIncSupp();
            long n5 = allocation.getID(this.mRS);
            long n6 = allocation2.getID(this.mRS);
            long n7 = allocation3.getID(this.mRS);
            if (incSupp) {
                n5 = this.getDummyAlloc(allocation);
                n6 = this.getDummyAlloc(allocation2);
                n7 = this.getDummyAlloc(allocation3);
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 114, 0, 0, n, n2, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, n3, n5, n6, n4, n7, 0, 0, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("Matrix A is not symmetric");
    }
    
    public void SSYMV(final int n, final float n2, final Allocation allocation, final Allocation allocation2, final int n3, final float n4, final Allocation allocation3, final int n5) {
        final int validateSYMV = validateSYMV(Element.F32(this.mRS), n, allocation, allocation2, allocation3, n3, n5);
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        final long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        long dummyAlloc;
        long n6;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            final long dummyAlloc3 = this.getDummyAlloc(allocation3);
            n6 = dummyAlloc2;
            id3 = dummyAlloc3;
        }
        else {
            n6 = id2;
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 79, 0, 0, 0, n, 0, 0, validateSYMV, 0, n2, dummyAlloc, n6, n4, id3, n3, n5, 0, 0, incSupp);
    }
    
    public void SSYR(final int n, final float n2, final Allocation allocation, final int n3, final Allocation allocation2) {
        final int validateSYR = validateSYR(Element.F32(this.mRS), n, allocation, n3, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation2.getID(this.mRS);
        long n5 = allocation.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation2);
            n5 = this.getDummyAlloc(allocation);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 83, 0, 0, 0, n, 0, 0, validateSYR, 0, n2, n5, n4, 0.0f, 0L, n3, 0, 0, 0, incSupp);
    }
    
    public void SSYR2(final int n, final float n2, final Allocation allocation, final int n3, final Allocation allocation2, final int n4, final Allocation allocation3) {
        final int validateSYR2 = validateSYR2(Element.F32(this.mRS), n, allocation, n3, allocation2, n4, allocation3);
        final boolean incSupp = this.isIncSupp();
        long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        long n5 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            n5 = this.getDummyAlloc(allocation2);
            id = dummyAlloc;
        }
        else {
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 85, 0, 0, 0, n, 0, 0, validateSYR2, 0, n2, dummyAlloc2, n5, 0.0f, id, n3, n4, 0, 0, incSupp);
    }
    
    public void SSYR2K(final int n, final int n2, final float n3, final Allocation allocation, final Allocation allocation2, final float n4, final Allocation allocation3) {
        validateUplo(n);
        validateSYR2K(Element.F32(this.mRS), n2, allocation, allocation2, allocation3);
        int n5;
        if (n2 != 111) {
            n5 = allocation.getType().getY();
        }
        else {
            n5 = allocation.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        final long id2 = allocation2.getID(this.mRS);
        long n6 = allocation3.getID(this.mRS);
        long dummyAlloc;
        long n7;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n6 = this.getDummyAlloc(allocation3);
            n7 = dummyAlloc2;
        }
        else {
            n7 = id2;
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 116, n2, 0, 0, n, 0, 0, allocation3.getType().getX(), n5, n3, dummyAlloc, n7, n4, n6, 0, 0, 0, 0, incSupp);
    }
    
    public void SSYRK(final int n, final int n2, final float n3, final Allocation allocation, final float n4, final Allocation allocation2) {
        validateTranspose(n2);
        validateUplo(n);
        validateL3(Element.F32(this.mRS), n2, 0, 0, allocation, null, allocation2);
        int n5;
        if (n2 != 111) {
            n5 = allocation.getType().getY();
        }
        else {
            n5 = allocation.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 115, n2, 0, 0, n, 0, 0, allocation2.getType().getX(), n5, n3, dummyAlloc, 0L, n4, n6, 0, 0, 0, 0, incSupp);
    }
    
    public void STBMV(final int n, final int n2, final int n3, final int n4, final Allocation allocation, final Allocation allocation2, final int n5) {
        if (n4 >= 0) {
            validateTRMV(Element.F32(this.mRS), n, n2, n3, allocation, allocation2, n5);
            final int y = allocation.getType().getY();
            final boolean incSupp = this.isIncSupp();
            long n6 = allocation.getID(this.mRS);
            long n7 = allocation2.getID(this.mRS);
            if (incSupp) {
                n6 = this.getDummyAlloc(allocation);
                n7 = this.getDummyAlloc(allocation2);
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 50, n2, 0, 0, n, n3, 0, y, n4, 0.0f, n6, n7, 0.0f, 0L, n5, 0, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("K must be greater than or equal to 0");
    }
    
    public void STBSV(final int n, final int n2, final int n3, final int n4, final Allocation allocation, final Allocation allocation2, final int n5) {
        validateTRMV(Element.F32(this.mRS), n, n2, n3, allocation, allocation2, n5);
        final int y = allocation.getType().getY();
        if (n4 >= 0) {
            final boolean incSupp = this.isIncSupp();
            final long id = allocation.getID(this.mRS);
            long id2 = allocation2.getID(this.mRS);
            long n6;
            if (incSupp) {
                final long dummyAlloc = this.getDummyAlloc(allocation);
                final long dummyAlloc2 = this.getDummyAlloc(allocation2);
                n6 = dummyAlloc;
                id2 = dummyAlloc2;
            }
            else {
                n6 = id;
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 53, n2, 0, 0, n, n3, 0, y, n4, 0.0f, n6, id2, 0.0f, 0L, n5, 0, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("Number of diagonals must be positive");
    }
    
    public void STPMV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        final int validateTPMV = validateTPMV(Element.F32(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long n5 = allocation2.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            n5 = this.getDummyAlloc(allocation2);
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 51, n2, 0, 0, n, n3, 0, validateTPMV, 0, 0.0f, dummyAlloc, n5, 0.0f, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void STPSV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        final int validateTPMV = validateTPMV(Element.F32(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 54, n2, 0, 0, n, n3, 0, validateTPMV, 0, 0.0f, n5, n6, 0.0f, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void STRMM(final int n, final int n2, final int n3, final int n4, final float n5, final Allocation allocation, final Allocation allocation2) {
        validateUplo(n2);
        validateDiag(n4);
        validateTRMM(Element.F32(this.mRS), n, n3, allocation, allocation2);
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n6;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n6 = dummyAlloc;
            id2 = dummyAlloc2;
        }
        else {
            n6 = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 117, n3, 0, n, n2, n4, allocation2.getType().getY(), allocation2.getType().getX(), 0, n5, n6, id2, 0.0f, 0L, 0, 0, 0, 0, incSupp);
    }
    
    public void STRMV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        validateTRMV(Element.F32(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final int y = allocation.getType().getY();
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 49, n2, 0, 0, n, n3, 0, y, 0, 0.0f, n5, n6, 0.0f, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void STRSM(final int n, final int n2, final int n3, final int n4, final float n5, final Allocation allocation, final Allocation allocation2) {
        validateUplo(n2);
        validateDiag(n4);
        validateTRSM(Element.F32(this.mRS), n, n3, allocation, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n6 = allocation.getID(this.mRS);
        long n7 = allocation2.getID(this.mRS);
        if (incSupp) {
            n6 = this.getDummyAlloc(allocation);
            n7 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 118, n3, 0, n, n2, n4, allocation2.getType().getY(), allocation2.getType().getX(), 0, n5, n6, n7, 0.0f, 0L, 0, 0, 0, 0, incSupp);
    }
    
    public void STRSV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        validateTRMV(Element.F32(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final int y = allocation.getType().getY();
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long n5 = allocation2.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            n5 = this.getDummyAlloc(allocation2);
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Single(this.getID(mrs), 52, n2, 0, 0, n, n3, 0, y, 0, 0.0f, dummyAlloc, n5, 0.0f, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void ZGBMV(final int n, final int n2, final int n3, final Double2 double2, final Allocation allocation, final Allocation allocation2, final int n4, final Double2 double3, final Allocation allocation3, final int n5) {
        validateGEMV(Element.F64_2(this.mRS), n, allocation, allocation2, n4, allocation3, n5);
        if (n2 >= 0 && n3 >= 0) {
            final int y = allocation.getType().getY();
            final int x = allocation.getType().getX();
            final boolean incSupp = this.isIncSupp();
            long n6 = allocation.getID(this.mRS);
            long n7 = allocation2.getID(this.mRS);
            long n8 = allocation3.getID(this.mRS);
            if (incSupp) {
                n6 = this.getDummyAlloc(allocation);
                n7 = this.getDummyAlloc(allocation2);
                n8 = this.getDummyAlloc(allocation3);
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 72, n, 0, 0, 0, 0, y, x, 0, double2.x, double2.y, n6, n7, double3.x, double3.y, n8, n4, n5, n2, n3, incSupp);
            return;
        }
        throw new RSRuntimeException("KL and KU must be greater than or equal to 0");
    }
    
    public void ZGEMM(final int n, final int n2, final Double2 double2, final Allocation allocation, final Allocation allocation2, final Double2 double3, final Allocation allocation3) {
        validateTranspose(n);
        validateTranspose(n2);
        validateL3(Element.F64_2(this.mRS), n, n2, 0, allocation, allocation2, allocation3);
        int n3;
        int n4;
        if (n != 111) {
            n3 = allocation.getType().getX();
            n4 = allocation.getType().getY();
        }
        else {
            n3 = allocation.getType().getY();
            n4 = allocation.getType().getX();
        }
        int n5;
        if (n2 != 111) {
            n5 = allocation2.getType().getY();
        }
        else {
            n5 = allocation2.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        long n6 = allocation.getID(this.mRS);
        long n7 = allocation2.getID(this.mRS);
        long n8 = allocation3.getID(this.mRS);
        if (incSupp) {
            n6 = this.getDummyAlloc(allocation);
            n7 = this.getDummyAlloc(allocation2);
            n8 = this.getDummyAlloc(allocation3);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 131, n, n2, 0, 0, 0, n3, n5, n4, double2.x, double2.y, n6, n7, double3.x, double3.y, n8, 0, 0, 0, 0, incSupp);
    }
    
    public void ZGEMV(final int n, final Double2 double2, final Allocation allocation, final Allocation allocation2, final int n2, final Double2 double3, final Allocation allocation3, final int n3) {
        validateGEMV(Element.F64_2(this.mRS), n, allocation, allocation2, n2, allocation3, n3);
        final int y = allocation.getType().getY();
        final int x = allocation.getType().getX();
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation.getID(this.mRS);
        long n5 = allocation2.getID(this.mRS);
        long n6 = allocation3.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation);
            n5 = this.getDummyAlloc(allocation2);
            n6 = this.getDummyAlloc(allocation3);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 71, n, 0, 0, 0, 0, y, x, 0, double2.x, double2.y, n4, n5, double3.x, double3.y, n6, n2, n3, 0, 0, incSupp);
    }
    
    public void ZGERC(final Double2 double2, final Allocation allocation, final int n, final Allocation allocation2, final int n2, final Allocation allocation3) {
        validateGERU(Element.F64_2(this.mRS), allocation, n, allocation2, n2, allocation3);
        final int y = allocation3.getType().getY();
        final int x = allocation3.getType().getX();
        final boolean incSupp = this.isIncSupp();
        long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        long n3 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            n3 = this.getDummyAlloc(allocation2);
            id = dummyAlloc;
        }
        else {
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 108, 0, 0, 0, 0, 0, y, x, 0, double2.x, double2.y, dummyAlloc2, n3, 0.0, 0.0, id, n, n2, 0, 0, incSupp);
    }
    
    public void ZGERU(final Double2 double2, final Allocation allocation, final int n, final Allocation allocation2, final int n2, final Allocation allocation3) {
        validateGERU(Element.F64_2(this.mRS), allocation, n, allocation2, n2, allocation3);
        final int y = allocation3.getType().getY();
        final int x = allocation3.getType().getX();
        final boolean incSupp = this.isIncSupp();
        final long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        final long id3 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        long dummyAlloc3;
        long n3;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            dummyAlloc3 = this.getDummyAlloc(allocation2);
            n3 = dummyAlloc;
        }
        else {
            n3 = id;
            dummyAlloc3 = id3;
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 107, 0, 0, 0, 0, 0, y, x, 0, double2.x, double2.y, dummyAlloc2, dummyAlloc3, 0.0, 0.0, n3, n, n2, 0, 0, incSupp);
    }
    
    public void ZHBMV(final int n, final int n2, final Double2 double2, final Allocation allocation, final Allocation allocation2, final int n3, final Double2 double3, final Allocation allocation3, final int n4) {
        final int validateSYR2 = validateSYR2(Element.F64_2(this.mRS), n, allocation2, n3, allocation3, n4, allocation);
        if (n2 >= 0) {
            final boolean incSupp = this.isIncSupp();
            final long id = allocation.getID(this.mRS);
            final long id2 = allocation2.getID(this.mRS);
            long n5 = allocation3.getID(this.mRS);
            long dummyAlloc;
            long n6;
            if (incSupp) {
                dummyAlloc = this.getDummyAlloc(allocation);
                final long dummyAlloc2 = this.getDummyAlloc(allocation2);
                n5 = this.getDummyAlloc(allocation3);
                n6 = dummyAlloc2;
            }
            else {
                n6 = id2;
                dummyAlloc = id;
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 105, 0, 0, 0, n, 0, 0, validateSYR2, n2, double2.x, double2.y, dummyAlloc, n6, double3.x, double3.y, n5, n3, n4, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("K must be 0 or greater for HBMV");
    }
    
    public void ZHEMM(final int n, final int n2, final Double2 double2, final Allocation allocation, final Allocation allocation2, final Double2 double3, final Allocation allocation3) {
        validateUplo(n2);
        validateHEMM(Element.F64_2(this.mRS), n, allocation, allocation2, allocation3);
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n3 = allocation3.getID(this.mRS);
        long dummyAlloc;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n3 = this.getDummyAlloc(allocation3);
            id2 = dummyAlloc2;
        }
        else {
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 140, 0, 0, n, n2, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, double2.x, double2.y, dummyAlloc, id2, double3.x, double3.y, n3, 0, 0, 0, 0, incSupp);
    }
    
    public void ZHEMV(final int n, final Double2 double2, final Allocation allocation, final Allocation allocation2, final int n2, final Double2 double3, final Allocation allocation3, final int n3) {
        final int validateSYR2 = validateSYR2(Element.F64_2(this.mRS), n, allocation2, n2, allocation3, n3, allocation);
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation.getID(this.mRS);
        long n5 = allocation2.getID(this.mRS);
        long n6 = allocation3.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation);
            n5 = this.getDummyAlloc(allocation2);
            n6 = this.getDummyAlloc(allocation3);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 104, 0, 0, 0, n, 0, 0, validateSYR2, 0, double2.x, double2.y, n4, n5, double3.x, double3.y, n6, n2, n3, 0, 0, incSupp);
    }
    
    public void ZHER(final int n, final double n2, final Allocation allocation, final int n3, final Allocation allocation2) {
        final int validateSYR = validateSYR(Element.F64_2(this.mRS), n, allocation, n3, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation2.getID(this.mRS);
        long n5 = allocation.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation2);
            n5 = this.getDummyAlloc(allocation);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 109, 0, 0, 0, n, 0, 0, validateSYR, 0, n2, 0.0, n5, 0L, 0.0, 0.0, n4, n3, 0, 0, 0, incSupp);
    }
    
    public void ZHER2(final int n, final Double2 double2, final Allocation allocation, final int n2, final Allocation allocation2, final int n3, final Allocation allocation3) {
        final int validateSYR2 = validateSYR2(Element.F64_2(this.mRS), n, allocation, n2, allocation2, n3, allocation3);
        final boolean incSupp = this.isIncSupp();
        long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        long n4 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            n4 = this.getDummyAlloc(allocation2);
            id = dummyAlloc;
        }
        else {
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 111, 0, 0, 0, n, 0, 0, validateSYR2, 0, double2.x, double2.y, dummyAlloc2, n4, 0.0, 0.0, id, n2, n3, 0, 0, incSupp);
    }
    
    public void ZHER2K(final int n, final int n2, final Double2 double2, final Allocation allocation, final Allocation allocation2, final double n3, final Allocation allocation3) {
        validateUplo(n);
        validateHER2K(Element.F64_2(this.mRS), n2, allocation, allocation2, allocation3);
        int n4;
        if (n2 == 111) {
            n4 = allocation.getType().getX();
        }
        else {
            n4 = allocation.getType().getY();
        }
        final boolean incSupp = this.isIncSupp();
        allocation.getID(this.mRS);
        long n5 = allocation2.getID(this.mRS);
        long n6 = allocation3.getID(this.mRS);
        if (incSupp) {
            this.getDummyAlloc(allocation);
            n5 = this.getDummyAlloc(allocation2);
            n6 = this.getDummyAlloc(allocation3);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 142, n2, 0, 0, n, 0, 0, allocation3.getType().getX(), n4, double2.x, double2.y, allocation.getID(this.mRS), n5, n3, 0.0, n6, 0, 0, 0, 0, incSupp);
    }
    
    public void ZHERK(final int n, final int n2, final double n3, final Allocation allocation, final double n4, final Allocation allocation2) {
        validateUplo(n);
        validateHERK(Element.F64_2(this.mRS), n2, allocation, allocation2);
        int n5;
        if (n2 == 113) {
            n5 = allocation.getType().getY();
        }
        else {
            n5 = allocation.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        long n6 = allocation.getID(this.mRS);
        long n7 = allocation2.getID(this.mRS);
        if (incSupp) {
            n6 = this.getDummyAlloc(allocation);
            n7 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 141, n2, 0, 0, n, 0, 0, allocation2.getType().getX(), n5, n3, 0.0, n6, 0L, n4, 0.0, n7, 0, 0, 0, 0, incSupp);
    }
    
    public void ZHPMV(final int n, final Double2 double2, final Allocation allocation, final Allocation allocation2, final int n2, final Double2 double3, final Allocation allocation3, final int n3) {
        final int validateSPR2 = validateSPR2(Element.F64_2(this.mRS), n, allocation2, n2, allocation3, n3, allocation);
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation.getID(this.mRS);
        long n5 = allocation2.getID(this.mRS);
        long n6 = allocation3.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation);
            n5 = this.getDummyAlloc(allocation2);
            n6 = this.getDummyAlloc(allocation3);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 106, 0, 0, 0, n, 0, 0, validateSPR2, 0, double2.x, double2.y, n4, n5, double3.x, double3.y, n6, n2, n3, 0, 0, incSupp);
    }
    
    public void ZHPR(final int n, final double n2, final Allocation allocation, final int n3, final Allocation allocation2) {
        final int validateSPR = validateSPR(Element.F64_2(this.mRS), n, allocation, n3, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation2.getID(this.mRS);
        long n5 = allocation.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation2);
            n5 = this.getDummyAlloc(allocation);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 110, 0, 0, 0, n, 0, 0, validateSPR, 0, n2, 0.0, n5, 0L, 0.0, 0.0, n4, n3, 0, 0, 0, incSupp);
    }
    
    public void ZHPR2(final int n, final Double2 double2, final Allocation allocation, final int n2, final Allocation allocation2, final int n3, final Allocation allocation3) {
        final int validateSPR2 = validateSPR2(Element.F64_2(this.mRS), n, allocation, n2, allocation2, n3, allocation3);
        final boolean incSupp = this.isIncSupp();
        long id = allocation3.getID(this.mRS);
        final long id2 = allocation.getID(this.mRS);
        long n4 = allocation2.getID(this.mRS);
        long dummyAlloc2;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation3);
            dummyAlloc2 = this.getDummyAlloc(allocation);
            n4 = this.getDummyAlloc(allocation2);
            id = dummyAlloc;
        }
        else {
            dummyAlloc2 = id2;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 112, 0, 0, 0, n, 0, 0, validateSPR2, 0, double2.x, double2.y, dummyAlloc2, n4, 0.0, 0.0, id, n2, n3, 0, 0, incSupp);
    }
    
    public void ZSYMM(final int n, final int n2, final Double2 double2, final Allocation allocation, final Allocation allocation2, final Double2 double3, final Allocation allocation3) {
        validateSide(n);
        validateUplo(n2);
        if (allocation.getType().getX() == allocation.getType().getY()) {
            validateL3(Element.F64_2(this.mRS), 0, 0, n, allocation, allocation2, allocation3);
            final boolean incSupp = this.isIncSupp();
            final long id = allocation.getID(this.mRS);
            long n3 = allocation2.getID(this.mRS);
            long n4 = allocation3.getID(this.mRS);
            long dummyAlloc;
            if (incSupp) {
                dummyAlloc = this.getDummyAlloc(allocation);
                n3 = this.getDummyAlloc(allocation2);
                n4 = this.getDummyAlloc(allocation3);
            }
            else {
                dummyAlloc = id;
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 132, 0, 0, n, n2, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, double2.x, double2.y, dummyAlloc, n3, double3.x, double3.y, n4, 0, 0, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("Matrix A is not symmetric");
    }
    
    public void ZSYR2K(final int n, final int n2, final Double2 double2, final Allocation allocation, final Allocation allocation2, final Double2 double3, final Allocation allocation3) {
        validateUplo(n);
        validateSYR2K(Element.F64_2(this.mRS), n2, allocation, allocation2, allocation3);
        int n3;
        if (n2 != 111) {
            n3 = allocation.getType().getY();
        }
        else {
            n3 = allocation.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        final long id2 = allocation2.getID(this.mRS);
        long n4 = allocation3.getID(this.mRS);
        long dummyAlloc;
        long n5;
        if (incSupp) {
            dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n4 = this.getDummyAlloc(allocation3);
            n5 = dummyAlloc2;
        }
        else {
            n5 = id2;
            dummyAlloc = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 134, n2, 0, 0, n, 0, 0, allocation3.getType().getX(), n3, double2.x, double2.y, dummyAlloc, n5, double3.x, double3.y, n4, 0, 0, 0, 0, incSupp);
    }
    
    public void ZSYRK(final int n, final int n2, final Double2 double2, final Allocation allocation, final Double2 double3, final Allocation allocation2) {
        validateTranspose(n2);
        validateUplo(n);
        validateL3(Element.F64_2(this.mRS), n2, 0, 0, allocation, null, allocation2);
        int n3;
        if (n2 != 111) {
            n3 = allocation.getType().getY();
        }
        else {
            n3 = allocation.getType().getX();
        }
        final boolean incSupp = this.isIncSupp();
        long n4 = allocation.getID(this.mRS);
        allocation2.getID(this.mRS);
        if (incSupp) {
            n4 = this.getDummyAlloc(allocation);
            this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 133, n2, 0, 0, n, 0, 0, allocation2.getType().getX(), n3, double2.x, double2.y, n4, 0L, double3.x, double3.y, allocation2.getID(this.mRS), 0, 0, 0, 0, incSupp);
    }
    
    public void ZTBMV(final int n, final int n2, final int n3, final int n4, final Allocation allocation, final Allocation allocation2, final int n5) {
        if (n4 >= 0) {
            validateTRMV(Element.F64_2(this.mRS), n, n2, n3, allocation, allocation2, n5);
            final int y = allocation.getType().getY();
            final boolean incSupp = this.isIncSupp();
            long n6 = allocation.getID(this.mRS);
            long n7 = allocation2.getID(this.mRS);
            if (incSupp) {
                n6 = this.getDummyAlloc(allocation);
                n7 = this.getDummyAlloc(allocation2);
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 74, n2, 0, 0, n, n3, 0, y, n4, 0.0, 0.0, n6, n7, 0.0, 0.0, 0L, n5, 0, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("K must be greater than or equal to 0");
    }
    
    public void ZTBSV(final int n, final int n2, final int n3, final int n4, final Allocation allocation, final Allocation allocation2, final int n5) {
        validateTRMV(Element.F64_2(this.mRS), n, n2, n3, allocation, allocation2, n5);
        final int y = allocation.getType().getY();
        if (n4 >= 0) {
            final boolean incSupp = this.isIncSupp();
            final long id = allocation.getID(this.mRS);
            long n6 = allocation2.getID(this.mRS);
            long dummyAlloc;
            if (incSupp) {
                dummyAlloc = this.getDummyAlloc(allocation);
                n6 = this.getDummyAlloc(allocation2);
            }
            else {
                dummyAlloc = id;
            }
            final RenderScript mrs = this.mRS;
            mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 77, n2, 0, 0, n, n3, 0, y, n4, 0.0, 0.0, dummyAlloc, n6, 0.0, 0.0, 0L, n5, 0, 0, 0, incSupp);
            return;
        }
        throw new RSRuntimeException("Number of diagonals must be positive");
    }
    
    public void ZTPMV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        final int validateTPMV = validateTPMV(Element.F64_2(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 75, n2, 0, 0, n, n3, 0, validateTPMV, 0, 0.0, 0.0, n5, n6, 0.0, 0.0, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void ZTPSV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        final int validateTPMV = validateTPMV(Element.F64_2(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n5;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n5 = dummyAlloc;
            id2 = dummyAlloc2;
        }
        else {
            n5 = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 78, n2, 0, 0, n, n3, 0, validateTPMV, 0, 0.0, 0.0, n5, id2, 0.0, 0.0, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void ZTRMM(final int n, final int n2, final int n3, final int n4, final Double2 double2, final Allocation allocation, final Allocation allocation2) {
        validateUplo(n2);
        validateDiag(n4);
        validateTRMM(Element.F64_2(this.mRS), n, n3, allocation, allocation2);
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 135, n3, 0, n, n2, n4, allocation2.getType().getY(), allocation2.getType().getX(), 0, double2.x, double2.y, n5, n6, 0.0, 0.0, 0L, 0, 0, 0, 0, incSupp);
    }
    
    public void ZTRMV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        validateTRMV(Element.F64_2(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final int y = allocation.getType().getY();
        final boolean incSupp = this.isIncSupp();
        long n5 = allocation.getID(this.mRS);
        long n6 = allocation2.getID(this.mRS);
        if (incSupp) {
            n5 = this.getDummyAlloc(allocation);
            n6 = this.getDummyAlloc(allocation2);
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 73, n2, 0, 0, n, n3, 0, y, 0, 0.0, 0.0, n5, n6, 0.0, 0.0, 0L, n4, 0, 0, 0, incSupp);
    }
    
    public void ZTRSM(final int n, final int n2, final int n3, final int n4, final Double2 double2, final Allocation allocation, final Allocation allocation2) {
        validateUplo(n2);
        validateDiag(n4);
        validateTRSM(Element.F64_2(this.mRS), n, n3, allocation, allocation2);
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n5;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n5 = dummyAlloc;
            id2 = dummyAlloc2;
        }
        else {
            n5 = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 136, n3, 0, n, n2, n4, allocation2.getType().getY(), allocation2.getType().getX(), 0, double2.x, double2.y, n5, id2, 0.0, 0.0, 0L, 0, 0, 0, 0, incSupp);
    }
    
    public void ZTRSV(final int n, final int n2, final int n3, final Allocation allocation, final Allocation allocation2, final int n4) {
        validateTRMV(Element.F64_2(this.mRS), n, n2, n3, allocation, allocation2, n4);
        final int y = allocation.getType().getY();
        final boolean incSupp = this.isIncSupp();
        final long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long n5;
        if (incSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            n5 = dummyAlloc;
            id2 = dummyAlloc2;
        }
        else {
            n5 = id;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptIntrinsicBLAS_Z(this.getID(mrs), 76, n2, 0, 0, n, n3, 0, y, 0, 0.0, 0.0, n5, id2, 0.0, 0.0, 0L, n4, 0, 0, 0, incSupp);
    }
}
