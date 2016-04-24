package com.zzj.gdgm.support;

import com.zzj.gdgm.cookie.CookiesManager;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by J。 on 2016/4/23.
 * OkHttp工具类
 */
public class OkHttpUtil {
    /**
     * 实例化静态okHttpClient对象
     */
    private static OkHttpClient okHttpClient = new OkHttpClient.Builder().cookieJar(new CookiesManager()).build();
    /**
     * Host
     */
    private static final String HOST = "jw.gdgm.cn";
    /**
     * Referer
     */
    private static final String REFERER = "http://jw.gdgm.cn/";
    /**
     * 验证码请求地址
     */
    private static final String URL_CODE = "http://jw.gdgm.cn/CheckCode.aspx";
    /**
     * 登录地址
     */
    private static final String URL_LOGIN = "http://jw.gdgm.cn/default2.aspx";

    public static OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }

    public static String getUrlLogin() {
        return URL_LOGIN;
    }

    public static String getUrlCode() {
        return URL_CODE;
    }

    public static String getREFERER() {
        return REFERER;
    }

    /**
     * 获得一个Request对象
     *
     * @param url 请求的Url
     * @return 返回一个Request对象
     */
    public static Request getRequest(String url) {
        Request request = new Request.Builder().url(url).addHeader("Host", HOST).addHeader("Referer", REFERER).build();
        return request;
    }

    /**
     * 获得一个Request对象
     *
     * @param url         请求的Url
     * @param requestBody 请求的参数
     * @return 返回一个Request对象
     */
    public static Request getRequest(String url, RequestBody requestBody) {
        Request request = new Request.Builder().url(url).addHeader("Host", HOST).addHeader("Referer", REFERER).post(requestBody).build();
        return request;
    }
}
