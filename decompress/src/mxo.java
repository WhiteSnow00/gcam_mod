// 
// Decompiled by Procyon v0.6.0
// 

public final class mxo extends be
{
    public mxo() {
        super(2, 3);
    }
    
    @Override
    public final void a(final afh afh) {
        afh.g("ALTER TABLE ResourceEntity ADD COLUMN title TEXT");
        afh.g("ALTER TABLE AnnotachmentEntity ADD COLUMN contentHash TEXT");
        afh.g("ALTER TABLE ResourceEntity ADD COLUMN relations BLOB");
    }
}
