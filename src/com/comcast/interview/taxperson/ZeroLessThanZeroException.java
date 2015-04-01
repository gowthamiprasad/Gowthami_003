package com.comcast.interview.taxperson;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by psivareddy on 4/1/15.
 */
public class ZeroLessThanZeroException extends Exception {

    public ZeroLessThanZeroException(String message){
        super(message);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.print("Debug info for exception below:" + message);
        this.printStackTrace(pw);
    }
}
