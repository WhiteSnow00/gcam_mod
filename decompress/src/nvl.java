import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum nvl
{
    A("DATETIME_HOURS_MINUTES_SECONDS", 26, 'T'), 
    B("DATETIME_HOURS_MINUTES_SECONDS_12H", 27, 'r'), 
    C("DATETIME_MONTH_DAY_YEAR", 28, 'D'), 
    D("DATETIME_YEAR_MONTH_DAY", 29, 'F'), 
    E("DATETIME_FULL", 30, 'c');
    
    public static final Map F;
    
    a("TIME_HOUR_OF_DAY_PADDED", 0, 'H'), 
    b("TIME_HOUR_OF_DAY", 1, 'k'), 
    c("TIME_HOUR_12H_PADDED", 2, 'I'), 
    d("TIME_HOUR_12H", 3, 'l'), 
    e("TIME_MINUTE_OF_HOUR_PADDED", 4, 'M'), 
    f("TIME_SECONDS_OF_MINUTE_PADDED", 5, 'S'), 
    g("TIME_MILLIS_OF_SECOND_PADDED", 6, 'L'), 
    h("TIME_NANOS_OF_SECOND_PADDED", 7, 'N'), 
    i("TIME_AM_PM", 8, 'p'), 
    j("TIME_TZ_NUMERIC", 9, 'z'), 
    k("TIME_TZ_SHORT", 10, 'Z'), 
    l("TIME_EPOCH_SECONDS", 11, 's'), 
    m("TIME_EPOCH_MILLIS", 12, 'Q'), 
    n("DATE_MONTH_FULL", 13, 'B'), 
    o("DATE_MONTH_SHORT", 14, 'b'), 
    p("DATE_MONTH_SHORT_ALT", 15, 'h'), 
    q("DATE_DAY_FULL", 16, 'A'), 
    r("DATE_DAY_SHORT", 17, 'a'), 
    s("DATE_CENTURY_PADDED", 18, 'C'), 
    t("DATE_YEAR_PADDED", 19, 'Y'), 
    u("DATE_YEAR_OF_CENTURY_PADDED", 20, 'y'), 
    v("DATE_DAY_OF_YEAR_PADDED", 21, 'j'), 
    w("DATE_MONTH_PADDED", 22, 'm'), 
    x("DATE_DAY_OF_MONTH_PADDED", 23, 'd'), 
    y("DATE_DAY_OF_MONTH", 24, 'e'), 
    z("DATETIME_HOURS_MINUTES", 25, 'R');
    
    public final char G;
    
    static {
        int n2 = 0;
        final HashMap hashMap = new HashMap();
        for (nvl[] values = values(); n2 < values.length; ++n2) {
            final nvl nvl32 = values[n2];
            if (hashMap.put(nvl32.G, nvl32) != null) {
                final String value = String.valueOf(nvl32);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 28);
                sb.append("duplicate format character: ");
                sb.append(value);
                throw new IllegalStateException(sb.toString());
            }
        }
        F = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    private nvl(final String s, final int n, final char c) {
        this.G = c;
    }
}
