package q.rorbin.verticaltablayout.util;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by chqiu on 2017/1/20.
 */

public class DisplayUtil {

    private static float density = Resources.getSystem().getDisplayMetrics().density;
    private static float scaledDensity = Resources.getSystem().getDisplayMetrics().scaledDensity;

    public static int dp2px(float dp) {
        return (int) (dp * density + 0.5f);
    }

    public static float sp2px(float spValue){
        return spValue * scaledDensity;
    }
}
