package greenfroyo.org.dexplayground;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by fchristysen on 27/02/18.
 */

public class SomeConstant {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SomeEnum{

    }

    public int getSomeResource(){
        return R.string.app_name;
    }
}
