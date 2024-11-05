import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFileChooser;

public class FileOrganizer {
    public static void main(String[] args) throws IOException {
        // Create a file chooser to select the directory
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Allow only directories to be selected

        // Open the dialog and check if the user selected a directory
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File folder = chooser.getSelectedFile(); // Get the selected directory

            // Loop through each file in the selected directory
            for (File file : folder.listFiles()) {
                // Check if the current item is a file (not a directory)
                if (file.isFile()) {
                    // Get the file extension by finding the substring after the last dot
                    String ext = file.getName().substring(file.getName().lastIndexOf(".") + 1);

                    // Create a new directory for the extension if it doesn't already exist
                    File dir = new File(folder + "/" + ext);
                    if (!dir.exists()) {
                        dir.mkdir(); // Make the directory for this file extension
                    }

                    // Move the file to the new directory based on its extension
                    Files.move(file.toPath(), Paths.get(dir + "/" + file.getName()));
                }
            }

            System.out.println("Files organized successfully!");
        } else {
            System.out.println("No directory selected.");
        }
    }
}
