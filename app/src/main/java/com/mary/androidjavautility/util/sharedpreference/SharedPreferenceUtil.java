package com.mary.androidjavautility.util.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

import com.mary.androidjavautility.util.log.DlogUtil;

public class SharedPreferenceUtil {

    public static String SHARED_PREFERENCES_KEY="SharedPreferences_Key";

    /**
     * SharedPreference에 [key, value] 쌍으로 값을 저장합니다.
     * */
    public static void registeredSharedPreference(Context context, String key, String value){
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();

    }

    /**
     * SharedPreference에 저장되어있는 값 중에서 key에 대응되는 value값을 불러옵니다.
     * */
    public static String getStringSharedPreference(Context context, String key) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, "");
    }

}
