package com.yf.fengmai.myserver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    class MyStringRequest extends StringRequest {
        public MyStringRequest(String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
            this(Method.GET, url, listener, errorListener);
        }

        public MyStringRequest(int method, String url, Response.Listener<String> listener,
                               Response.ErrorListener errorListener) {
            super(method, url, listener, errorListener);
        }

        @Override
        protected Response<String> parseNetworkResponse(NetworkResponse response) {
            String str = null;

            try {
                str = new String(response.data, "utf-8");
            }
            catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            return Response.success(str, HttpHeaderParser.parseCacheHeaders(response));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.tv);
        RequestQueue mQueue = Volley.newRequestQueue(this);
        MyStringRequest stringRequest = new MyStringRequest("http://192.168.23.1:8889",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        tv.setText(response);

                        Log.e("TestVolley", "onResponse - " + response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TestVolley", "onErrorResponse" + error.getMessage(), error);
                    }
                });
        mQueue.add(stringRequest);
    }
}
