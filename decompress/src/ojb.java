// 
// Decompiled by Procyon v0.6.0
// 

public enum ojb
{
    a("OK", 0, "ok"), 
    b("CANCELLED", 1, "canceled"), 
    c("UNKNOWN", 2, "unknown"), 
    d("INVALID_ARGUMENT", 3, "invalid argument"), 
    e("DEADLINE_EXCEEDED", 4, "deadline exceeded"), 
    f("NOT_FOUND", 5, "not found"), 
    g("ALREADY_EXISTS", 6, "already exists"), 
    h("PERMISSION_DENIED", 7, "permission denied"), 
    i("RESOURCE_EXHAUSTED", 8, "resource exhausted"), 
    j("FAILED_PRECONDITION", 9, "failed precondition"), 
    k("ABORTED", 10, "aborted"), 
    l("OUT_OF_RANGE", 11, "out of range"), 
    m("UNIMPLEMENTED", 12, "unimplemented"), 
    n("INTERNAL", 13, "internal"), 
    o("UNAVAILABLE", 14, "unavailable"), 
    p("DATA_LOSS", 15, "data loss"), 
    q("UNAUTHENTICATED", 16, "unauthenticated");
    
    public final String r;
    
    private ojb(final String s, final int n, final String r) {
        this.r = r;
    }
}
