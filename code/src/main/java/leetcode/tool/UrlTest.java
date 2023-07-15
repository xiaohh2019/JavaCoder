package leetcode.tool;

import java.security.MessageDigest;

/**
 * URL 加密
 */
public class UrlTest {

    public static void main(String[] args) {
        getKuaiShouSign("dab19e82e1f9a681ee73346d3e7a575e");
    }

    public static String getKuaiShouSign(String url){

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(url.getBytes("UTF-8"));
            byte[] b = md5.digest();

            int i;
            StringBuffer buf = new StringBuffer();
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if(i < 0) {
                    i += 256;
                }
                if(i < 16){
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            url = buf.toString();
            System.out.println("result = "+ url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return url;
    }
}

