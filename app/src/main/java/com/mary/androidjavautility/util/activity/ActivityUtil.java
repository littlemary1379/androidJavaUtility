package com.mary.androidjavautility.util.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class ActivityUtil {

    public static String bundleKey = "BUNDLE_KEY";

    // 액티비티의 종료 없이 새 액티비티를 호출하는 매서드(뒤로가기 누르면 이전 액티비티가 나타납니다.)
    // 데이터 호출 없음
    public static void startActivityWithoutFinish(Context context, Class<?> cls){
        Intent intent = new Intent(context, cls);
        context.startActivity(intent);
    }

    // 액티비티의 종료 없이 새 액티비티를 호출하는 매서드(뒤로가기 누르면 이전 액티비티가 나타납니다.)
    // bundle을 통해 새 액티비티로 데이터 전달
    public static void startActivityWithoutFinish(Context context, Class<?> cls, Bundle bundle){
        Intent intent = new Intent(context, cls);
        intent.putExtra(bundleKey, bundle);
        context.startActivity(intent);
    }

    //현재 액티비티 종료 후 새 액티비티를 호출하는 매서드(뒤로가기를 눌러도 이전 액티비티가 나타나지 않습니다.)
    // 데이터 호출 없음
    public static void startActivityWithFinish(Context context, Class<?> cls){
        Intent intent = new Intent(context, cls);
        context.startActivity(intent);
        Activity activity = (Activity) context;
        activity.finish();
    }

    // 현재 액티비티 종료 후 새 액티비티를 호출하는 매서드(뒤로가기를 눌러도 이전 액티비티가 나타나지 않습니다.)
    // bundle을 통해 새 액티비티로 데이터 전달
    public static void startActivityWithFinish(Context context, Class<?> cls, Bundle bundle){
        Intent intent = new Intent(context, cls);
        intent.putExtra(bundleKey, bundle);
        context.startActivity(intent);
        Activity activity = (Activity) context;
        activity.finish();
    }

}
