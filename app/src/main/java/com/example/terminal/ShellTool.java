package com.example.terminal;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ShellTool {
    public String getShellResult(String shell) {
        String result = "";
        Runtime mRuntime = Runtime.getRuntime();
        try {
            Process mProcess = mRuntime.exec(shell);
            InputStream is = mProcess.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader mReader = new BufferedReader(isr);
            String string;
            Log.e("->",mReader.readLine());
            while ((string = mReader.readLine()) != null) {
                result = result + string + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
