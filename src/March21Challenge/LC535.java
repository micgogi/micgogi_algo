package March21Challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 3/15/2021  6:47 PM
 * Rahul Gogyani
 */
public class LC535 {
    public static void main(String args[]) {
        LC535 lc535 = new LC535();
        System.out.println(lc535.decode(lc535.encode("https://leetcode.com/problems/design-tinyurl")));
        System.out.println((lc535.encode("https://leetcode.com/problems/design-tinyurl")));

    }

    // Encodes a URL to a shortened URL.
    Map<String, String> longtoShort = new HashMap<>();
    Map<String, String> shortToLong = new HashMap<>();
    String base = "http://tinyurl.com/";

    public String encode(String longUrl) {

        String code = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if (longtoShort.containsKey(longUrl)) return base + longtoShort.get(longUrl);
        String enc = "";
        go:
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append(code.charAt((int) (Math.random() * code.length())));
            }
            enc = sb.toString();
            if (!longtoShort.containsKey(enc)) break go;
        }
        longtoShort.put(longUrl, base + enc);
        shortToLong.put(base + enc, longUrl);
        return base + enc;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortToLong.get(shortUrl);
    }
}

