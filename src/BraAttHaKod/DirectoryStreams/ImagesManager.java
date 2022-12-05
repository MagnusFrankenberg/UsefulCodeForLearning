package BraAttHaKod.DirectoryStreams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ImagesManager {

    List<Path> bilder = new ArrayList<>();

    public ImagesManager() {
        Path dirName = Paths.get("/Users/magnusfrankenberg/Desktop/BilderTillJavaTräning");

        try (var inStream = Files.newDirectoryStream(dirName, "*.jpg")) {

            for (Path path : inStream) {
                bilder.add(path);
            }
            //   inStream.forEach(path -> bilder.add(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


