package org.aerogear.mobile.core.utils;


import android.util.Log;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public final class CertificatePinningUtil {
    static OkHttpClient client = new OkHttpClient();

    private CertificatePinningUtil(){}

    public static void preFlightCheck(String url) throws IOException{
        Log.i("bla check",run(url));

    }

    static String run(String url) throws IOException{
        Request request = new Request.Builder()
            .url(url)
            .build();
        try(Response response = client.newCall(request).execute()){
            return response.body().string();
        }
    }
}
