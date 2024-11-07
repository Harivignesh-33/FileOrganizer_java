# 📂 Java File Organizer

[![My Skills](https://skills.thijs.gg/icons?i=js,html,css,wasm)](https://skills.thijs.gg)

## 🔥 Quick Run

```bash
# Navigate to the project directory
cd /path/to/your/project/directory

# Compile the Java program
javac FileOrganizer.java

# Run the Java program
java FileOrganizer
```

## 🔄 How to Use

1. **Run the Program**: Start the application from your preferred IDE or command line.
2. **Select Directory**: Use the file chooser dialog to select the folder you want to organize.
3. **Automatic Organization**: The program will scan through the files in the selected directory, create folders based on file extensions (e.g., .jpg, .pdf), and move the files into their respective folders.
4. **Done**: Your files are now neatly organized by type!

## 🚀 Overview

Organize your files with ease! This **Java-based File Organizer** automatically sorts and moves files into categorized folders based on their file extensions. Perfect for cleaning up messy directories in one go!

## 📋 Features

- **Automatic Organization**: Quickly categorizes files by type (e.g., .jpg, .pdf, .docx).
- **User-Friendly Directory Selection**: Simply choose a directory, and the program does the rest.
- **Error Handling**: Handles file move operations safely, preventing errors.

## 🔧 Technology Used

- **Java I/O**: Handles file operations and error management.
- **NIO Files API**: Efficiently moves files between directories.
- **Swing JFileChooser**: Simplifies directory selection with a GUI.

## 👨‍💻 Code Highlights

- Utilizes `JFileChooser` for easy directory selection.
- Leverages `Files.move()` for seamless file transfer to new folders.
- Creates organized folders based on each file’s extension dynamically.


