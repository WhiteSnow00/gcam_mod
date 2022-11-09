import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$MarginLayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public class cr extends ViewGroup$MarginLayoutParams
{
    public float A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public float X;
    public dd Y;
    public int a;
    public int b;
    public float c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public String y;
    int z;
    
    public cr(final int n, final int n2) {
        super(n, n2);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = null;
        this.z = 1;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = true;
        this.O = true;
        this.P = false;
        this.Q = false;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = 0.5f;
        this.Y = new dd();
    }
    
    public cr(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = null;
        this.z = 1;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = true;
        this.O = true;
        this.P = false;
        this.Q = false;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = 0.5f;
        this.Y = new dd();
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(set, cu.a);
        for (int indexCount = ((TypedArray)obtainStyledAttributes).getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = ((TypedArray)obtainStyledAttributes).getIndex(i);
            if (index == 83) {
                if ((this.d = ((TypedArray)obtainStyledAttributes).getResourceId(83, this.d)) == -1) {
                    this.d = ((TypedArray)obtainStyledAttributes).getInt(83, -1);
                }
            }
            else if (index == 84) {
                if ((this.e = ((TypedArray)obtainStyledAttributes).getResourceId(84, this.e)) == -1) {
                    this.e = ((TypedArray)obtainStyledAttributes).getInt(84, -1);
                }
            }
            else if (index == 86) {
                if ((this.f = ((TypedArray)obtainStyledAttributes).getResourceId(86, this.f)) == -1) {
                    this.f = ((TypedArray)obtainStyledAttributes).getInt(86, -1);
                }
            }
            else if (index == 87) {
                if ((this.g = ((TypedArray)obtainStyledAttributes).getResourceId(87, this.g)) == -1) {
                    this.g = ((TypedArray)obtainStyledAttributes).getInt(87, -1);
                }
            }
            else if (index == 93) {
                if ((this.h = ((TypedArray)obtainStyledAttributes).getResourceId(93, this.h)) == -1) {
                    this.h = ((TypedArray)obtainStyledAttributes).getInt(93, -1);
                }
            }
            else if (index == 92) {
                if ((this.i = ((TypedArray)obtainStyledAttributes).getResourceId(92, this.i)) == -1) {
                    this.i = ((TypedArray)obtainStyledAttributes).getInt(92, -1);
                }
            }
            else if (index == 64) {
                if ((this.j = ((TypedArray)obtainStyledAttributes).getResourceId(64, this.j)) == -1) {
                    this.j = ((TypedArray)obtainStyledAttributes).getInt(64, -1);
                }
            }
            else if (index == 63) {
                if ((this.k = ((TypedArray)obtainStyledAttributes).getResourceId(63, this.k)) == -1) {
                    this.k = ((TypedArray)obtainStyledAttributes).getInt(63, -1);
                }
            }
            else if (index == 59) {
                if ((this.l = ((TypedArray)obtainStyledAttributes).getResourceId(59, this.l)) == -1) {
                    this.l = ((TypedArray)obtainStyledAttributes).getInt(59, -1);
                }
            }
            else if (index == 102) {
                this.K = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(102, this.K);
            }
            else if (index == 103) {
                this.L = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(103, this.L);
            }
            else if (index == 71) {
                this.a = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(71, this.a);
            }
            else if (index == 72) {
                this.b = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(72, this.b);
            }
            else if (index == 73) {
                this.c = ((TypedArray)obtainStyledAttributes).getFloat(73, this.c);
            }
            else if (index == 0) {
                this.M = ((TypedArray)obtainStyledAttributes).getInt(0, this.M);
            }
            else if (index == 88) {
                if ((this.m = ((TypedArray)obtainStyledAttributes).getResourceId(88, this.m)) == -1) {
                    this.m = ((TypedArray)obtainStyledAttributes).getInt(88, -1);
                }
            }
            else if (index == 89) {
                if ((this.n = ((TypedArray)obtainStyledAttributes).getResourceId(89, this.n)) == -1) {
                    this.n = ((TypedArray)obtainStyledAttributes).getInt(89, -1);
                }
            }
            else if (index == 70) {
                if ((this.o = ((TypedArray)obtainStyledAttributes).getResourceId(70, this.o)) == -1) {
                    this.o = ((TypedArray)obtainStyledAttributes).getInt(70, -1);
                }
            }
            else if (index == 69) {
                if ((this.p = ((TypedArray)obtainStyledAttributes).getResourceId(69, this.p)) == -1) {
                    this.p = ((TypedArray)obtainStyledAttributes).getInt(69, -1);
                }
            }
            else if (index == 107) {
                this.q = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(107, this.q);
            }
            else if (index == 110) {
                this.r = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(110, this.r);
            }
            else if (index == 108) {
                this.s = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(108, this.s);
            }
            else if (index == 105) {
                this.t = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(105, this.t);
            }
            else if (index == 109) {
                this.u = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(109, this.u);
            }
            else if (index == 106) {
                this.v = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(106, this.v);
            }
            else if (index == 79) {
                this.w = ((TypedArray)obtainStyledAttributes).getFloat(79, this.w);
            }
            else if (index == 94) {
                this.x = ((TypedArray)obtainStyledAttributes).getFloat(94, this.x);
            }
            else if (index == 68) {
                final String string = ((TypedArray)obtainStyledAttributes).getString(68);
                this.y = string;
                this.z = -1;
                if (string != null) {
                    final int length = string.length();
                    int index2 = this.y.indexOf(44);
                    if (index2 > 0 && index2 < length - 1) {
                        final String substring = this.y.substring(0, index2);
                        if (substring.equalsIgnoreCase("W")) {
                            this.z = 0;
                        }
                        else if (substring.equalsIgnoreCase("H")) {
                            this.z = 1;
                        }
                        ++index2;
                    }
                    else {
                        index2 = 0;
                    }
                    final int index3 = this.y.indexOf(58);
                    Label_1454: {
                        if (index3 < 0 || index3 >= length - 1) {
                            break Label_1454;
                        }
                        final String substring2 = this.y.substring(index2, index3);
                        final String substring3 = this.y.substring(index3 + 1);
                        if (substring2.length() <= 0 || substring3.length() <= 0) {
                            continue;
                        }
                        try {
                            final float float1 = Float.parseFloat(substring2);
                            final float float2 = Float.parseFloat(substring3);
                            if (float1 <= 0.0f || float2 <= 0.0f) {
                                continue;
                            }
                            if (this.z == 1) {
                                Math.abs(float2 / float1);
                                continue;
                            }
                            Math.abs(float1 / float2);
                            continue;
                            final String substring4 = this.y.substring(index2);
                            iftrue(Label_1702:)(substring4.length() <= 0);
                            Float.parseFloat(substring4);
                        }
                        catch (final NumberFormatException ex) {}
                    }
                }
            }
            else if (index == 81) {
                this.A = ((TypedArray)obtainStyledAttributes).getFloat(81, 0.0f);
            }
            else if (index == 96) {
                this.B = ((TypedArray)obtainStyledAttributes).getFloat(96, 0.0f);
            }
            else if (index == 80) {
                this.C = ((TypedArray)obtainStyledAttributes).getInt(80, 0);
            }
            else if (index == 95) {
                this.D = ((TypedArray)obtainStyledAttributes).getInt(95, 0);
            }
            else if (index == 98) {
                this.E = ((TypedArray)obtainStyledAttributes).getInt(98, 0);
            }
            else if (index == 75) {
                this.F = ((TypedArray)obtainStyledAttributes).getInt(75, 0);
            }
            else if (index == 100) {
                this.G = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(100, this.G);
            }
            else if (index == 99) {
                this.I = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(99, this.I);
            }
            else if (index == 77) {
                this.H = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(77, this.H);
            }
            else if (index == 76) {
                this.J = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(76, this.J);
            }
        }
        ((TypedArray)obtainStyledAttributes).recycle();
        this.a();
    }
    
    public cr(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = null;
        this.z = 1;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = true;
        this.O = true;
        this.P = false;
        this.Q = false;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = 0.5f;
        this.Y = new dd();
    }
    
    public final void a() {
        this.Q = false;
        this.N = true;
        this.O = true;
        if (this.width == 0 || this.width == -1) {
            this.N = false;
        }
        if (this.height == 0 || this.height == -1) {
            this.O = false;
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.Q = true;
        this.N = true;
        this.O = true;
        if (!(this.Y instanceof df)) {
            this.Y = new df();
        }
        ((df)this.Y).A(this.M);
    }
    
    public final void resolveLayoutDirection(int n) {
        super.resolveLayoutDirection(n);
        this.T = -1;
        this.U = -1;
        this.R = -1;
        this.S = -1;
        this.V = this.q;
        this.W = this.s;
        this.X = this.w;
        if (this.getLayoutDirection() == 1) {
            n = this.m;
            if (n != -1) {
                this.T = n;
            }
            else {
                n = this.n;
                if (n != -1) {
                    this.U = n;
                }
            }
            n = this.o;
            if (n != -1) {
                this.S = n;
            }
            n = this.p;
            if (n != -1) {
                this.R = n;
            }
            n = this.u;
            if (n != -1) {
                this.W = n;
            }
            n = this.v;
            if (n != -1) {
                this.V = n;
            }
            this.X = 1.0f - this.w;
        }
        else {
            n = this.m;
            if (n != -1) {
                this.S = n;
            }
            n = this.n;
            if (n != -1) {
                this.R = n;
            }
            n = this.o;
            if (n != -1) {
                this.T = n;
            }
            n = this.p;
            if (n != -1) {
                this.U = n;
            }
            n = this.u;
            if (n != -1) {
                this.V = n;
            }
            n = this.v;
            if (n != -1) {
                this.W = n;
            }
        }
        if (this.o == -1 && this.p == -1) {
            n = this.f;
            if (n != -1) {
                this.T = n;
            }
            else {
                n = this.g;
                if (n != -1) {
                    this.U = n;
                }
            }
        }
        if (this.n == -1 && this.m == -1) {
            n = this.d;
            if (n != -1) {
                this.R = n;
                return;
            }
            n = this.e;
            if (n != -1) {
                this.S = n;
            }
        }
    }
}
