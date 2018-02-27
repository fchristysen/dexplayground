package greenfroyo.org.dexplayground;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by fchristysen on 27/02/18.
 */

public class SomeConstant {

    /* Class which contain this Retention and @interface will be included in classes.dex
    * Reference to R file in this same class, cause the R to be included in the classes.dex also
    * Notes : try to remove this SomeEnum to remove the R from classes.dex
    */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SomeEnum{

    }

    public int getSomeResource(){
        return R.string.app_name;
    }
}
