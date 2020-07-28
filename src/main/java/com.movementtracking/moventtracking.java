package com.movementtracking;

import java.io.IOException;
import org.python.util.PythonInterpreter;
import org.python.core.*;

public class moventtracking {


    public static void main(String args []) {
        Process p;

        {
            try {
                PythonInterpreter python = new PythonInterpreter();
                python.exec("python trackposition.py");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
