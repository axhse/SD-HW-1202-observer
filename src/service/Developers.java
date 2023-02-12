package service;

import model.GameInfo;
import model.GameTechnicalInfo;
import service.abstraction.IObserver;
import service.utils.ThreadingUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Developers implements IObserver {
    @Override
    public void update(Object object) {
        celebrateGameRelease((GameInfo) object);
    }

    private void celebrateGameRelease(GameInfo gameInfo) {
        if (gameInfo == null || gameInfo.name == null || gameInfo.technicalInfo == null) {
            return;
        }
        GameTechnicalInfo technicalInfo = gameInfo.technicalInfo;
        if (technicalInfo.isSupportedOnWindows10 == null) {
            return;
        }
        System.out.println("\u001B[96m\nDevelopers' discussion log:\n\u001B[94m");
        if (technicalInfo.isSupportedOnWindows10) {
            ThreadingUtils.sleep(800);
            log("phplover", "Is it supported on Ubuntu?");
            String message = null;
            if (technicalInfo.windowsHddSize > 1) {
                message = String.format("%s GB??!! It's OK, though", technicalInfo.windowsHddSize);
            } else {
                message = String.format("%s GB? Wow, it's cool", technicalInfo.windowsHddSize);
            }
            log("devops247", message);
        }
        System.out.print("\u001B[0m");
    }

    private void log(String author, String message) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(
                String.format(
                        "%s\tDEBUG\tT1\t%s\t%s",
                        format.format(new Date()),
                        author,
                        message
                )
        );
    }
}