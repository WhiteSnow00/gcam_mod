import java.util.List;
import java.net.URISyntaxException;
import java.util.Collection;
import android.net.Uri;
import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mqw
{
    public final Intent a;
    private final Context b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private final String g;
    private final nns h;
    private final nns i;
    private final String j;
    private final Uri k;
    private final nns l;
    private final Uri m;
    private final String n;
    private final Uri o;
    private final int p;
    
    public mqw() {
    }
    
    public mqw(final Context b, final String c, final String d, final String e, final boolean f, final String g, final nns h, final nns i, final String j, final Intent a, final Uri k, final nns l, final Uri m, final String n, final Uri o, final int p16) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.a = a;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p16;
    }
    
    public static mqw a(Context o, final mqx mqx) {
        try {
            final boolean empty = mqx.a.isEmpty();
            final int n = 1;
            njo.e(empty ^ true, "Tips label is empty");
            njo.e(mqx.b.isEmpty() ^ true, "Tips title is empty");
            njo.e(mqx.c.isEmpty() ^ true, "Tips title icon uri is empty");
            njo.e(mqx.i.isEmpty() ^ true, "Tips launch intent is empty");
            njo.e(mqx.j.isEmpty() ^ true, "Tips content uri is empty");
            final mqv mqv = new mqv();
            mqv.a = (Context)o;
            o = (NullPointerException)mqx.a;
            if (o == null) {
                o = new NullPointerException("Null label");
                throw o;
            }
            mqv.b = (String)o;
            o = (NullPointerException)mqx.b;
            if (o == null) {
                o = new NullPointerException("Null title");
                throw o;
            }
            mqv.c = (String)o;
            o = (NullPointerException)mqx.c;
            if (o == null) {
                o = new NullPointerException("Null titleIconUriString");
                throw o;
            }
            mqv.d = (String)o;
            mqv.e = mqx.d;
            o = (NullPointerException)mqx.e;
            if (o == null) {
                o = new NullPointerException("Null article");
                throw o;
            }
            mqv.f = (String)o;
            mqv.g = nns.j(mqx.f);
            mqv.h = nns.j(mqx.g);
            o = (NullPointerException)mqx.h;
            if (o == null) {
                o = new NullPointerException("Null thumbnailUriString");
                throw o;
            }
            mqv.i = (String)o;
            o = (NullPointerException)Intent.parseUri(mqx.i, 0);
            if (o == null) {
                o = new NullPointerException("Null launchIntent");
                throw o;
            }
            mqv.j = (Intent)o;
            o = (NullPointerException)Uri.parse(mqx.j);
            if (o == null) {
                o = new NullPointerException("Null tipContentUri");
                throw o;
            }
            mqv.k = (Uri)o;
            mqv.l = nns.j(mqx.k);
            o = (NullPointerException)Uri.parse(mqx.l);
            if (o == null) {
                o = new NullPointerException("Null sliceUri");
                throw o;
            }
            mqv.m = (Uri)o;
            o = (NullPointerException)mqx.m;
            if (o == null) {
                o = new NullPointerException("Null featureDescription");
                throw o;
            }
            mqv.n = (String)o;
            o = (NullPointerException)Uri.parse(mqx.n);
            if (o != null) {
                mqv.o = (Uri)o;
                int c = mry.c(mqx.o);
                if (c == 0) {
                    c = n;
                }
                mqv.p = c;
                final Context a = mqv.a;
                if (a != null) {
                    o = (NullPointerException)mqv.b;
                    if (o != null) {
                        final String c2 = mqv.c;
                        if (c2 != null) {
                            final String d = mqv.d;
                            if (d != null) {
                                final Boolean e = mqv.e;
                                if (e != null && mqv.f != null && mqv.g != null && mqv.h != null && mqv.i != null && mqv.j != null && mqv.k != null && mqv.l != null && mqv.m != null && mqv.n != null && mqv.o != null) {
                                    return new mqw(a, (String)o, c2, d, e, mqv.f, mqv.g, mqv.h, mqv.i, mqv.j, mqv.k, mqv.l, mqv.m, mqv.n, mqv.o, mqv.p);
                                }
                            }
                        }
                    }
                }
                final StringBuilder sb = new StringBuilder();
                if (mqv.a == null) {
                    sb.append(" context");
                }
                if (mqv.b == null) {
                    sb.append(" label");
                }
                if (mqv.c == null) {
                    sb.append(" title");
                }
                if (mqv.d == null) {
                    sb.append(" titleIconUriString");
                }
                if (mqv.e == null) {
                    sb.append(" titleIconFillColor");
                }
                if (mqv.f == null) {
                    sb.append(" article");
                }
                if (mqv.g == null) {
                    sb.append(" articleIconUriStrings");
                }
                if (mqv.h == null) {
                    sb.append(" articleIconFillColors");
                }
                if (mqv.i == null) {
                    sb.append(" thumbnailUriString");
                }
                if (mqv.j == null) {
                    sb.append(" launchIntent");
                }
                if (mqv.k == null) {
                    sb.append(" tipContentUri");
                }
                if (mqv.l == null) {
                    sb.append(" keywords");
                }
                if (mqv.m == null) {
                    sb.append(" sliceUri");
                }
                if (mqv.n == null) {
                    sb.append(" featureDescription");
                }
                if (mqv.o == null) {
                    sb.append(" mediaUri");
                }
                if (mqv.p == 0) {
                    sb.append(" mediaType");
                }
                o = new(java.lang.IllegalStateException.class)();
                final String value = String.valueOf(sb);
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(value);
                new IllegalStateException(sb2.toString());
                throw o;
            }
            o = new NullPointerException("Null mediaUri");
            throw o;
        }
        catch (final NullPointerException o) {}
        catch (final IllegalStateException o) {}
        catch (final URISyntaxException ex) {}
        final String value2 = String.valueOf(o);
        final StringBuilder sb3 = new StringBuilder(String.valueOf(value2).length() + 33);
        sb3.append("Fail to convert TipProto to Tip. ");
        sb3.append(value2);
        throw new IllegalArgumentException(sb3.toString());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mqw) {
            final mqw mqw = (mqw)o;
            if (this.b.equals(mqw.b) && this.c.equals(mqw.c) && this.d.equals(mqw.d) && this.e.equals(mqw.e) && this.f == mqw.f && this.g.equals(mqw.g) && nqb.t(this.h, mqw.h) && nqb.t(this.i, mqw.i) && this.j.equals(mqw.j) && this.a.equals(mqw.a) && this.k.equals((Object)mqw.k) && nqb.t(this.l, mqw.l) && this.m.equals((Object)mqw.m) && this.n.equals(mqw.n) && this.o.equals((Object)mqw.o)) {
                final int p = this.p;
                final int p2 = mqw.p;
                if (p == 0) {
                    throw null;
                }
                if (p == p2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final int hashCode3 = this.d.hashCode();
        final int hashCode4 = this.e.hashCode();
        int n;
        if (!this.f) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final int hashCode5 = this.g.hashCode();
        final int hashCode6 = this.h.hashCode();
        final int hashCode7 = this.i.hashCode();
        final int hashCode8 = this.j.hashCode();
        final int hashCode9 = this.a.hashCode();
        final int hashCode10 = this.k.hashCode();
        final int hashCode11 = this.l.hashCode();
        final int hashCode12 = this.m.hashCode();
        final int hashCode13 = this.n.hashCode();
        final int hashCode14 = this.o.hashCode();
        final int p = this.p;
        if (p != 0) {
            return (((((((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ hashCode13) * 1000003 ^ hashCode14) * 1000003 ^ p;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final boolean f = this.f;
        final String g = this.g;
        final String value2 = String.valueOf(this.h);
        final String value3 = String.valueOf(this.i);
        final String j = this.j;
        final String value4 = String.valueOf(this.a);
        final String value5 = String.valueOf(this.k);
        final String value6 = String.valueOf(this.l);
        final String value7 = String.valueOf(this.m);
        final String n = this.n;
        final String value8 = String.valueOf(this.o);
        final int p = this.p;
        String string;
        if (p != 0) {
            string = Integer.toString(p - 1);
        }
        else {
            string = "null";
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 252 + String.valueOf(c).length() + String.valueOf(d).length() + String.valueOf(e).length() + String.valueOf(g).length() + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(j).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length() + String.valueOf(value7).length() + String.valueOf(n).length() + String.valueOf(value8).length() + String.valueOf(string).length());
        sb.append("Tip{context=");
        sb.append(value);
        sb.append(", label=");
        sb.append(c);
        sb.append(", title=");
        sb.append(d);
        sb.append(", titleIconUriString=");
        sb.append(e);
        sb.append(", titleIconFillColor=");
        sb.append(f);
        sb.append(", article=");
        sb.append(g);
        sb.append(", articleIconUriStrings=");
        sb.append(value2);
        sb.append(", articleIconFillColors=");
        sb.append(value3);
        sb.append(", thumbnailUriString=");
        sb.append(j);
        sb.append(", launchIntent=");
        sb.append(value4);
        sb.append(", tipContentUri=");
        sb.append(value5);
        sb.append(", keywords=");
        sb.append(value6);
        sb.append(", sliceUri=");
        sb.append(value7);
        sb.append(", featureDescription=");
        sb.append(n);
        sb.append(", mediaUri=");
        sb.append(value8);
        sb.append(", mediaType=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
