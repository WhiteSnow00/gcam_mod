import android.database.Cursor;
import java.util.Iterator;
import java.util.Collection;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bk
{
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;
    
    public bk(final String a, final Map map, final Set set, final Set set2) {
        this.a = a;
        this.b = Collections.unmodifiableMap((Map<?, ?>)map);
        this.c = Collections.unmodifiableSet((Set<?>)set);
        Set<Object> unmodifiableSet;
        if (set2 == null) {
            unmodifiableSet = null;
        }
        else {
            unmodifiableSet = Collections.unmodifiableSet((Set<?>)set2);
        }
        this.d = unmodifiableSet;
    }
    
    public static bk a(final afh afh, final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info(`");
        sb.append(s);
        final String s2 = "`)";
        sb.append("`)");
        Object o = afh.b(sb.toString());
        final HashMap hashMap = new HashMap();
        try {
            if (((Cursor)o).getColumnCount() > 0) {
                final int columnIndex = ((Cursor)o).getColumnIndex("name");
                final int columnIndex2 = ((Cursor)o).getColumnIndex("type");
                final int columnIndex3 = ((Cursor)o).getColumnIndex("notnull");
                final int columnIndex4 = ((Cursor)o).getColumnIndex("pk");
                final int columnIndex5 = ((Cursor)o).getColumnIndex("dflt_value");
                while (((Cursor)o).moveToNext()) {
                    final String string = ((Cursor)o).getString(columnIndex);
                    hashMap.put(string, new bg(string, ((Cursor)o).getString(columnIndex2), ((Cursor)o).getInt(columnIndex3) != 0, ((Cursor)o).getInt(columnIndex4), ((Cursor)o).getString(columnIndex5), 2));
                }
            }
            ((Cursor)o).close();
            final HashSet set = new HashSet();
            o = new StringBuilder();
            ((StringBuilder)o).append("PRAGMA foreign_key_list(`");
            ((StringBuilder)o).append(s);
            ((StringBuilder)o).append("`)");
            o = afh.b(((StringBuilder)o).toString());
            try {
                final int columnIndex6 = ((Cursor)o).getColumnIndex("id");
                final int columnIndex7 = ((Cursor)o).getColumnIndex("seq");
                final int columnIndex8 = ((Cursor)o).getColumnIndex("table");
                final int columnIndex9 = ((Cursor)o).getColumnIndex("on_delete");
                final int columnIndex10 = ((Cursor)o).getColumnIndex("on_update");
                final int columnIndex11 = ((Cursor)o).getColumnIndex("id");
                final int columnIndex12 = ((Cursor)o).getColumnIndex("seq");
                final int columnIndex13 = ((Cursor)o).getColumnIndex("from");
                final int columnIndex14 = ((Cursor)o).getColumnIndex("to");
                final int count = ((Cursor)o).getCount();
                final ArrayList list = new ArrayList();
                for (int i = 0; i < count; ++i) {
                    ((Cursor)o).moveToPosition(i);
                    list.add(new bi(((Cursor)o).getInt(columnIndex11), ((Cursor)o).getInt(columnIndex12), ((Cursor)o).getString(columnIndex13), ((Cursor)o).getString(columnIndex14)));
                }
                Collections.sort((List<Comparable>)list);
                for (int count2 = ((Cursor)o).getCount(), j = 0; j < count2; ++j) {
                    ((Cursor)o).moveToPosition(j);
                    if (((Cursor)o).getInt(columnIndex7) == 0) {
                        final int int1 = ((Cursor)o).getInt(columnIndex6);
                        final ArrayList list2 = new ArrayList();
                        final ArrayList list3 = new ArrayList();
                        for (final bi bi : list) {
                            if (bi.a == int1) {
                                list2.add(bi.c);
                                list3.add(bi.d);
                            }
                        }
                        set.add(new bh(((Cursor)o).getString(columnIndex8), ((Cursor)o).getString(columnIndex9), ((Cursor)o).getString(columnIndex10), list2, list3));
                    }
                }
                ((Cursor)o).close();
                o = new StringBuilder();
                ((StringBuilder)o).append("PRAGMA index_list(`");
                ((StringBuilder)o).append(s);
                ((StringBuilder)o).append(s2);
                final Cursor b = afh.b(((StringBuilder)o).toString());
                o = "name";
                try {
                    final int columnIndex15 = b.getColumnIndex((String)o);
                    final int columnIndex16 = b.getColumnIndex("origin");
                    final int columnIndex17 = b.getColumnIndex("unique");
                    Label_1096: {
                        if (columnIndex15 != -1 && columnIndex16 != -1) {
                            if (columnIndex17 != -1) {
                                final HashSet<Object> set2 = new HashSet<Object>();
                                while (b.moveToNext()) {
                                    if ("c".equals(b.getString(columnIndex16))) {
                                        final String string2 = b.getString(columnIndex15);
                                        final boolean b2 = b.getInt(columnIndex17) == 1;
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("PRAGMA index_xinfo(`");
                                        sb2.append(string2);
                                        sb2.append(s2);
                                        final Cursor b3 = afh.b(sb2.toString());
                                        try {
                                            final int columnIndex18 = b3.getColumnIndex("seqno");
                                            final int columnIndex19 = b3.getColumnIndex("cid");
                                            final int columnIndex20 = b3.getColumnIndex((String)o);
                                            Object o2;
                                            if (columnIndex18 != -1 && columnIndex19 != -1 && columnIndex20 != -1) {
                                                final TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
                                                while (b3.moveToNext()) {
                                                    if (b3.getInt(columnIndex19) >= 0) {
                                                        treeMap.put(b3.getInt(columnIndex18), b3.getString(columnIndex20));
                                                    }
                                                }
                                                final ArrayList list4 = new ArrayList(treeMap.size());
                                                list4.addAll((Collection)treeMap.values());
                                                o2 = new bj(string2, b2, list4);
                                                b3.close();
                                            }
                                            else {
                                                b3.close();
                                                o2 = null;
                                            }
                                            if (o2 == null) {
                                                break Label_1096;
                                            }
                                            set2.add(o2);
                                        }
                                        finally {
                                            b3.close();
                                        }
                                    }
                                }
                                b.close();
                                final Set<Object> set3 = set2;
                                return new bk(s, hashMap, set, set3);
                            }
                        }
                    }
                    b.close();
                    final Set<Object> set3 = null;
                    return new bk(s, hashMap, set, set3);
                }
                finally {
                    b.close();
                }
            }
            finally {
                ((Cursor)o).close();
            }
        }
        finally {
            ((Cursor)o).close();
            while (true) {}
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bk)) {
            return false;
        }
        final bk bk = (bk)o;
        if (this.a.equals(bk.a)) {
            final Map b = this.b;
            Label_0069: {
                if (b != null) {
                    if (b.equals(bk.b)) {
                        break Label_0069;
                    }
                }
                else if (bk.b == null) {
                    break Label_0069;
                }
                return false;
            }
            final Set c = this.c;
            Label_0103: {
                if (c != null) {
                    if (c.equals(bk.c)) {
                        break Label_0103;
                    }
                }
                else if (bk.c == null) {
                    break Label_0103;
                }
                return false;
            }
            final Set d = this.d;
            if (d != null) {
                final Set d2 = bk.d;
                if (d2 != null) {
                    return d.equals(d2);
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Map b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final Set c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TableInfo{name='");
        sb.append(this.a);
        sb.append("', columns=");
        sb.append(this.b);
        sb.append(", foreignKeys=");
        sb.append(this.c);
        sb.append(", indices=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
