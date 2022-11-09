import android.os.Build;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqp
{
    public static final boolean a;
    public static final lri b;
    private static final List c;
    
    static {
        final boolean b2 = a = lqq.c();
        lqq.d();
        if (!lqq.a()) {
            lqq.b();
        }
        final List list = c = Collections.unmodifiableList((List<?>)Arrays.asList("GM1900", "GM1901", "GM1903", "GM1905", "GM1910", "GM1911", "GM1913", "GM1917", "GM1915", "GM1920", "GM1925", "SS8821", "SS8831", "SS8827", "SS8857", "HD1910", "HD1911", "HD1913", "HD1917", "HD1900", "HD1901", "HD1903", "HD1905", "HD1907", "HD1925", "IN2020", "IN2021", "IN2023", "IN2025", "IN2010", "IN2011", "IN2013", "IN2015", "IN2017", "IN2019"));
        if (!lqq.c()) {
            list.contains(Build.MODEL);
        }
        if (!lqq.b() && !lqq.a()) {
            lqq.e();
        }
        if (!lqq.b() && !lqq.a()) {
            lqq.e();
        }
        if (!lqq.b()) {
            lqq.a();
        }
        if (!lqq.b()) {
            lqq.a();
        }
        if (!lqq.b()) {
            lqq.a();
        }
        if (b2) {
            lqq.e();
        }
        if (!b2) {
            lqq.e();
        }
        if (!b2) {
            lqq.e();
        }
        list.contains(Build.MODEL);
        lri b3;
        if (!lqq.a() && !lqq.b()) {
            b3 = lri.c;
        }
        else {
            b3 = lri.b;
        }
        b = b3;
        if (!lqq.a() && !lqq.b()) {
            lqq.e();
        }
        lqq.d();
    }
}
