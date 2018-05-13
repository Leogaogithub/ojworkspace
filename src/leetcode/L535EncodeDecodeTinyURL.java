package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class L535EncodeDecodeTinyURL {

    static String CHARSET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    static String PREFIX_URL = "http://tinyurl.com/";
    // Encodes a URL to a shortened URL.
    Map<String, String> long2short = new HashMap<>();
    Map<String, String> short2long = new HashMap<>();

    public String encode(final String longUrl) {
        return PREFIX_URL + encodeInternal(longUrl);
    }

    String encodeInternal(final String longUrl) {
        if (long2short.containsKey(longUrl)) {
            return long2short.get(longUrl);
        }
        String shortUrl;
        while (true) {
            shortUrl = generateRandomString();
            if (long2short.containsKey(longUrl)) {
                continue;
            }
            long2short.put(longUrl, shortUrl);
            short2long.put(shortUrl, longUrl);
            break;
        }
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(final String shortUrl) {
        final String storedShortUrl = shortUrl.substring(PREFIX_URL.length());
        if (!short2long.containsKey(storedShortUrl)) {
            return "error";
        }
        return short2long.get(storedShortUrl);
    }

    String generateRandomString() {
        final Random random = new Random();
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            final int index = random.nextInt(CHARSET.length());
            stringBuilder.append(CHARSET.charAt(index));
        }
        return stringBuilder.toString();
    }
}
