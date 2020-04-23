package udp.v1.v3;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlEncodeDecodeTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "陈沛鑫";
        // URL 编码
        String 编码后的结果  = URLEncoder.encode(s, "UTF-8");
        System.out.println(编码后的结果);

        // URL 解码
        //String o = 编码后的结果;
        String o = "C%2B%2B%E8%8F%9C%E9%B8%9F";
        String 解码后的结果 = URLDecoder.decode(o, "UTF-8");
        System.out.println(解码后的结果);
    }
}
