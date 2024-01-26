package software.ulpgc.imageviewer.swing;

import software.ulpgc.imageviewer.Image;
import software.ulpgc.imageviewer.NextImageCommand;
import software.ulpgc.imageviewer.PrevImageCommand;
import software.ulpgc.imageviewer.fileimageloader.FileImageLoader;

import java.io.File;

public class Main {
    public static final String root = "C:\\Users\\pedro\\Downloads\\images";
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        Image image = new FileImageLoader(new File(root)).load();
        frame.imageDisplay().show(image);
        frame.add("<", new PrevImageCommand(frame.imageDisplay()));
        frame.add(">", new NextImageCommand(frame.imageDisplay()));
        frame.setVisible(true);
    }
}
