package com.andrewelliott.dev.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by dev on 9/14/14.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "sfYfSrl5dHYYGkOz7UfiGPFfnhTk8yTvf7BgWtxl", "iYUsdcyb8emQ23vbvHISuKqfhbgppWzVHhr8hVOU");
    }
}
