package com.mary.androidjavautility.util.log;

import android.util.Log;

public class DlogUtil {

    private static final boolean isDebugged=true;

    // 개발단계에서 로그를 띄워주는 유틸(상용으로 사용할땐 isDebugged = false로 변경합니다).
    // 사용방법. 필요한 곳에 DebugUtil(TAG, 데이터를 보아야 하는 값)을 사용하시면 됩니다.
    // TAG는 logt로 호출 가능
    public static void logD(String TAG, Object obj){
        if(DlogUtil.isDebugged){
            Log.d(TAG, buildMsg(obj));
        }
    }

    private static String buildMsg(Object obj){

        StackTraceElement ste = Thread.currentThread().getStackTrace()[4];
        StringBuilder sb = new StringBuilder();

        sb.append("DebugLogUnit : ");
        sb.append(ste.getFileName().replace(".java",""));
        sb.append(" :: ");
        sb.append(obj);

        return sb.toString();
    }

}
