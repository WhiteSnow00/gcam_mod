import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myi implements mye
{
    public final aq a;
    
    public myi(final aq a) {
        this.a = a;
    }
    
    @Override
    public final oxk a(final int n, final Set set, final mus mus) {
        final StringBuilder a = bo.a();
        a.append("\n      SELECT * FROM ResourceEntity\n      WHERE\n        status_uploadState IN (");
        final int size = set.size();
        bo.b(a, size);
        a.append(")\n        AND status_airlockFileState IS ?\n        AND namespaceId IS NOT NULL\n        AND partitionId IS NOT NULL\n      ORDER BY status_uploadToF250RequestedEpochTimestamp ASC\n      LIMIT ?\n    ");
        final int n2 = size + 2;
        final at a2 = at.a(a.toString(), n2);
        final Iterator iterator = set.iterator();
        int n3 = 1;
        while (iterator.hasNext()) {
            a2.e(n3, mya.s((mvt)iterator.next()));
            ++n3;
        }
        a2.e(size + 1, mya.b(mus));
        a2.e(n2, n);
        return ay.a(new myh(this, a2));
    }
    
    @Override
    public final oxk b(final Set set, final mus mus) {
        final StringBuilder a = bo.a();
        a.append("\n      SELECT * FROM ResourceEntity\n      WHERE\n        status_uploadState IN (");
        final int size = set.size();
        bo.b(a, size);
        a.append(")\n        AND (\n          status_airlockFileState IS NOT ?\n          OR namespaceId IS NULL\n          OR partitionId IS NULL\n        )\n    ");
        final int n = size + 1;
        final at a2 = at.a(a.toString(), n);
        final Iterator iterator = set.iterator();
        int n2 = 1;
        while (iterator.hasNext()) {
            a2.e(n2, mya.s((mvt)iterator.next()));
            ++n2;
        }
        a2.e(n, mya.b(mus));
        return ay.a(new myg(this, a2));
    }
    
    @Override
    public final oxk c(final mvt mvt) {
        final at a = at.a("SELECT * FROM ResourceEntity WHERE status_uploadState IS ?", 1);
        a.e(1, mya.s(mvt));
        return ay.a(new myf(this, a));
    }
    
    public final void d(final HashMap hashMap) {
        final Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            final Iterator iterator = keySet.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final Long n2 = (Long)iterator.next();
                hashMap2.put(n2, hashMap.get(n2));
                if (++n == 999) {
                    this.d(hashMap2);
                    hashMap2 = new HashMap(999);
                    n = 0;
                }
            }
            if (n > 0) {
                this.d(hashMap2);
            }
            return;
        }
        final StringBuilder a = bo.a();
        a.append("SELECT `resourceOnDeviceId`,`isAttachment`,`id`,`contentType`,`onDeviceSize`,`uploadTransferHandle`,`blobstoreId`,`contentHash`,`onDeviceId`,`status_addedToAirlockEpochTimestamp`,`status_uploadToF250RequestedEpochTimestamp`,`status_uploadToF250CompletedEpochTimestamp`,`status_airlockFileState`,`status_uploadState`,`status_uploadProgressPercent` FROM `AnnotachmentEntity` WHERE `resourceOnDeviceId` IN (");
        final int size = keySet.size();
        bo.b(a, size);
        a.append(")");
        final at a2 = at.a(a.toString(), size);
        final Iterator iterator2 = keySet.iterator();
        int n3 = 1;
        while (iterator2.hasNext()) {
            final Long n4 = (Long)iterator2.next();
            if (n4 == null) {
                a2.f(n3);
            }
            else {
                a2.e(n3, n4);
            }
            ++n3;
        }
        final Cursor s = gz.s(this.a, a2, false);
        try {
            final int u = gz.u(s, "resourceOnDeviceId");
            if (u != -1) {
                final int v = gz.v(s, "resourceOnDeviceId");
                final int v2 = gz.v(s, "isAttachment");
                final int v3 = gz.v(s, "id");
                final int v4 = gz.v(s, "contentType");
                final int v5 = gz.v(s, "onDeviceSize");
                final int v6 = gz.v(s, "uploadTransferHandle");
                final int v7 = gz.v(s, "blobstoreId");
                final int v8 = gz.v(s, "contentHash");
                final int v9 = gz.v(s, "onDeviceId");
                final int v10 = gz.v(s, "status_addedToAirlockEpochTimestamp");
                final int v11 = gz.v(s, "status_uploadToF250RequestedEpochTimestamp");
                final int v12 = gz.v(s, "status_uploadToF250CompletedEpochTimestamp");
                final int v13 = gz.v(s, "status_airlockFileState");
                final int v14 = gz.v(s, "status_uploadState");
                final int v15 = gz.v(s, "status_uploadProgressPercent");
                while (s.moveToNext()) {
                    final ArrayList list = hashMap.get(s.getLong(u));
                    if (list != null) {
                        final long long1 = s.getLong(v);
                        final muu r = mya.r(s.getInt(v2));
                        final boolean null = s.isNull(v3);
                        final Long n5 = null;
                        String string;
                        if (null) {
                            string = null;
                        }
                        else {
                            string = s.getString(v3);
                        }
                        final mva v16 = mya.v(string);
                        String string2;
                        if (s.isNull(v4)) {
                            string2 = null;
                        }
                        else {
                            string2 = s.getString(v4);
                        }
                        final long long2 = s.getLong(v5);
                        String string3;
                        if (s.isNull(v6)) {
                            string3 = null;
                        }
                        else {
                            string3 = s.getString(v6);
                        }
                        String string4;
                        if (s.isNull(v7)) {
                            string4 = null;
                        }
                        else {
                            string4 = s.getString(v7);
                        }
                        String string5;
                        if (s.isNull(v8)) {
                            string5 = null;
                        }
                        else {
                            string5 = s.getString(v8);
                        }
                        final long long3 = s.getLong(v9);
                        mxk mxk;
                        if (s.isNull(v10) && s.isNull(v11) && s.isNull(v12) && s.isNull(v13) && s.isNull(v14) && s.isNull(v15)) {
                            mxk = null;
                        }
                        else {
                            Long value;
                            if (s.isNull(v10)) {
                                value = null;
                            }
                            else {
                                value = s.getLong(v10);
                            }
                            final oni i = mya.i(value);
                            Long value2;
                            if (s.isNull(v11)) {
                                value2 = null;
                            }
                            else {
                                value2 = s.getLong(v11);
                            }
                            final oni j = mya.i(value2);
                            Long value3;
                            if (s.isNull(v12)) {
                                value3 = n5;
                            }
                            else {
                                value3 = s.getLong(v12);
                            }
                            mxk = new mxk(i, j, mya.i(value3), mya.k(s.getInt(v13)), mya.l(s.getInt(v14)), s.getDouble(v15));
                        }
                        list.add(new mxe(long1, r, v16, string2, long2, string3, string4, string5, mxk, long3));
                    }
                }
            }
            s.close();
        }
        finally {
            s.close();
            while (true) {}
        }
    }
}
