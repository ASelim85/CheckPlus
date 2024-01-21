package Utility;

import java.io.File;

public class ScreenshotFailedCases {

    public static void deleteScreenShots() {
        File file = new File (".\\TestData\\ScreenShots\\");
        String[] currentFiles;
        if (file.isDirectory ( )) {
            currentFiles = file.list ( );
            for (int i = 0; i < currentFiles.length; i++) {
                File myFile = new File (file, currentFiles[i]);
                myFile.delete ( );
            }
        }
    }
}