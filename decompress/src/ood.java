// 
// Decompiled by Procyon v0.6.0
// 

public enum ood implements olb
{
    a("CB_NONE", 0, 0), 
    b("CB_RESERVED_FOR_TESTING_IN_PRODUCT_CONTROL", 1, 12), 
    c("CB_GOOGLE_TOS_AND_PP", 2, 1), 
    d("CB_CHECKBOX", 3, 2), 
    e("CB_SUPPLEMENTAL_WEB_AND_APP_ACTIVITY_DEVICE_LEVEL", 4, 3), 
    f("CB_PLAY_TOS", 5, 4), 
    g("CB_GLOBAL_LOCATION", 6, 5), 
    h("CB_LOCATION_REPORTING_DEVICE_LEVEL", 7, 7), 
    i("CB_LOCATION_ACCURACY", 8, 8), 
    j("CB_EARTHQUAKE_ALERTS", 9, 18), 
    k("CB_WIFI_SCANNING", 10, 9), 
    l("CB_GLOBAL_WIFI", 11, 10), 
    m("CB_BACKUP_AND_RESTORE", 12, 11), 
    n("CB_WEAR_CLOUD_SYNC", 13, 13), 
    o("CB_FIT_APP_USAGE_AND_DIAGNOSTICS", 14, 14), 
    p("CB_GBOARD_USER_METRICS_SETTINGS", 15, 15), 
    q("CB_DEVICE_CONTACTS_INFO", 16, 16), 
    r("CB_FI_TOS", 17, 17), 
    s("CB_FI_NETWORK_DIAGNOSTICS", 18, 19), 
    t("CB_FIND_MY_DEVICE", 19, 20), 
    u("CB_PAY_TOS", 20, 21);
    
    public final int v;
    
    private ood(final String s, final int n, final int v) {
        this.v = v;
    }
    
    public static ood b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 21: {
                return ood.u;
            }
            case 20: {
                return ood.t;
            }
            case 19: {
                return ood.s;
            }
            case 18: {
                return ood.j;
            }
            case 17: {
                return ood.r;
            }
            case 16: {
                return ood.q;
            }
            case 15: {
                return ood.p;
            }
            case 14: {
                return ood.o;
            }
            case 13: {
                return ood.n;
            }
            case 12: {
                return ood.b;
            }
            case 11: {
                return ood.m;
            }
            case 10: {
                return ood.l;
            }
            case 9: {
                return ood.k;
            }
            case 8: {
                return ood.i;
            }
            case 7: {
                return ood.h;
            }
            case 5: {
                return ood.g;
            }
            case 4: {
                return ood.f;
            }
            case 3: {
                return ood.e;
            }
            case 2: {
                return ood.d;
            }
            case 1: {
                return ood.c;
            }
            case 0: {
                return ood.a;
            }
        }
    }
    
    public static old c() {
        return obh.p;
    }
    
    @Override
    public final int a() {
        return this.v;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.v);
    }
}
