package com.Test.Test;

public class Enande {
    public static String encrypt(String sue,String pad){
        char[] p = pad.toCharArray(); // 字符串转字符数组
        int n = p.length;  // 密码长度
        char[] c = sue.toCharArray();
        int m = c.length; // 字符串长度
        for (int i = 0;i<m;i++){
            int mima = c[i] + p[i / n];
            c[i] = (char) mima;
        }
        return new String(c);
    }
    public static String decrypt(String sourceString, String password) {
        char[] p = password.toCharArray(); // 字符串转字符数组
        int n = p.length; // 密码长度
        char[] c = sourceString.toCharArray();
        int m = c.length; // 字符串长度
        for (int k = 0; k < m; k++) {
            int mima = c[k] - p[k / n]; // 解密
            c[k] = (char) mima;
        }
        return new String(c);
    }
    public static void main(String arg[]) {
        String wen = "这是一段明文";
        String pass = "123456789";
        System.out.println(encrypt(wen, pass));
        System.out.println(decrypt(encrypt(wen, pass), pass));
    }
}
