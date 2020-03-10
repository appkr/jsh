package util;

public class MyUtil {

    /**
     * Convert a string representation of a hex dump to a byte array using Java?
     * @see https://stackoverflow.com/a/140861
     *
     * @param s Hex string
     * @return byte array
     *
     * Example:
     * import util.MyUtil;
     * MyUtil.hexStringToByteArray("00000c9f");
     * => byte[4] { 0, 0, 12, -97 }
     */
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                                 + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
}