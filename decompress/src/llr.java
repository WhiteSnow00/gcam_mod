import java.util.Locale;
import android.content.ContentValues;

// 
// Decompiled by Procyon v0.6.0
// 

public final class llr implements llz
{
    public final krr a;
    private final lou b;
    
    public llr(final lou b, final krr krr, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = krr.a("MediaFS-Q");
    }
    
    @Override
    public final llw a(final lmf lmf, final llu llu) {
        if (lmf.a.b()) {
            final lou b = this.b;
            njo.d(lmf.d());
            final ContentValues contentValues = new ContentValues();
            contentValues.put(llu.e, String.format(Locale.ROOT, "%s.%s", lmf.c, lmf.d));
            contentValues.put(llu.f, lmf.e);
            contentValues.put(llu.j, String.format(Locale.ROOT, "%s/%s", lmf.a.a(llu.a).getName(), lmf.b));
            if (lou.c(lmf.e)) {
                contentValues.put(llu.k, Integer.valueOf(llu.l));
            }
            else if (lou.d(lmf.e)) {
                contentValues.put(llu.k, Integer.valueOf(llu.m));
            }
            contentValues.put(llu.g, Integer.valueOf(llu.h));
            return new lmg(b, new lmi(lmf, llu.a.getContentResolver(), contentValues, llu), this.a, null, null);
        }
        return new lmh(this.b, lmk.l(lmf, llu, this.a), this.a, null, null);
    }
    
    @Override
    public final lly b(final llu llu) {
        return new llq(this, llu);
    }
}
