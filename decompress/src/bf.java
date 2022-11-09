import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bf
{
    private static final String[] d;
    public final String a;
    public final Set b;
    public final Set c;
    
    static {
        d = new String[] { "tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress=" };
    }
    
    public bf(final Set b) {
        this.a = "ResourceFts";
        this.b = b;
        this.c = a("CREATE VIRTUAL TABLE IF NOT EXISTS `ResourceFts` USING FTS4(`experienceId` TEXT, `queryableTags` TEXT NOT NULL, `namespaceId` TEXT, `partitionId` TEXT, `f250ResourceId` TEXT, `nonSignedInDataOwners` TEXT NOT NULL, content=`ResourceEntity`)");
    }
    
    public bf(final Set b, final Set c) {
        this.a = "ResourceFts";
        this.b = b;
        this.c = c;
    }
    
    public static Set a(final String s) {
        if (s.isEmpty()) {
            return new HashSet();
        }
        final String substring = s.substring(s.indexOf(40) + 1, s.lastIndexOf(41));
        final ArrayList list = new ArrayList();
        final ArrayDeque arrayDeque = new ArrayDeque();
        int n = -1;
        int n2 = 0;
        for (int i = 0; i < substring.length(); ++i, n = n2) {
            final char char1 = substring.charAt(i);
            switch (char1) {
                default: {
                    n2 = n;
                    break;
                }
                case 93: {
                    n2 = n;
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    n2 = n;
                    if ((char)arrayDeque.peek() == '[') {
                        arrayDeque.pop();
                        n2 = n;
                        break;
                    }
                    break;
                }
                case 91: {
                    n2 = n;
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(char1);
                        n2 = n;
                        break;
                    }
                    break;
                }
                case 44: {
                    n2 = n;
                    if (arrayDeque.isEmpty()) {
                        list.add(substring.substring(n + 1, i).trim());
                        n2 = i;
                        break;
                    }
                    break;
                }
                case 34:
                case 39:
                case 96: {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(char1);
                        n2 = n;
                        break;
                    }
                    n2 = n;
                    if (arrayDeque.peek() == char1) {
                        arrayDeque.pop();
                        n2 = n;
                        break;
                    }
                    break;
                }
            }
        }
        list.add(substring.substring(n + 1).trim());
        final HashSet<String> set = new HashSet<String>();
        for (int size = list.size(), j = 0; j < size; ++j) {
            final String s2 = (String)list.get(j);
            final String[] d = bf.d;
            for (int k = 0; k < 9; ++k) {
                if (s2.startsWith(d[k])) {
                    set.add(s2);
                }
            }
        }
        return set;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bf)) {
            return false;
        }
        final bf bf = (bf)o;
        return this.a.equals(bf.a) && this.b.equals(bf.b) && this.c.equals(bf.c);
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FtsTableInfo{name='");
        sb.append(this.a);
        sb.append("', columns=");
        sb.append(this.b);
        sb.append(", options=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
