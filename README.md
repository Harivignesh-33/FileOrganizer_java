<h1 align="center">File Organizer using Java</h1>

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)
[![Contributors](https://img.shields.io/github/contributors/Harivignesh-33/FileOrganizer_java)](https://github.com/Harivignesh-33/FileOrganizer_java/graphs/contributors)

> **FileOrganizer** is a powerful Java-based tool for managing and organizing files on your system by categorizing them into designated folders. Perfect for developers, students, or anyone who needs to keep files well-structured and easily accessible!

## 🚀 Features

- **Automatic File Organization**: Organizes files by their type (e.g., images, documents, audio).
- **Customizable Sorting Rules**: Users can define sorting rules to organize files.
- **Easy-to-Use CLI**: Interact with the application through a clean, command-line interface.
- **Cross-Platform Support**: Compatible with Windows, macOS, and Linux.

## 🛠️ Getting Started

### Prerequisites

- **Java 17** or higher installed on your machine.  
- Basic knowledge of navigating the command line.

### Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/Harivignesh-33/FileOrganizer_java.git
    cd FileOrganizer_java
    ```

2. **Compile the project**:
    ```bash
    javac FileOrganizer.java
    ```

3. **Run the application**:
    ```bash
    java FileOrganizer
    ```

## 💻 Usage



https://github.com/user-attachments/assets/2697ba6c-ad83-42bc-8749-9f769f367848



The application will automatically move files into predefined folders based on their file type. 

### Example

```bash
java -cp bin FileOrganizer /Users/username/Documents
```

After running, the application organizes files into subfolders like `/pdf`, `/jpeg`, `/mp4.....`, etc., within the specified directory.

## 📁 File Types Supported

- **Images**: `jpg`, `png`, `gif`
- **Documents**: `pdf`, `docx`, `txt`
- **Audio**: `mp3`, `wav`
- **Video**: `mp4`, `avi`
- **Compressed**: `zip`, `rar`
  
*More file types can be added by configuring the application's sorting rules.*

## ⚙️ Configuration

Modify `config.json` (if available) to adjust sorting rules or add custom file types. For detailed instructions, refer to [Configuration Guide](CONFIG.md).

## 🤝 Contributing

We welcome contributions! Here’s how you can help:

1. **Fork the project**
2. **Create a new branch** (`feature/YourFeatureName`)
3. **Commit your changes** (`git commit -m 'Add new feature'`)
4. **Push to the branch** (`git push origin feature/YourFeatureName`)
5. **Open a Pull Request**



## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Contact

For questions, feedback, or suggestions, feel free to reach out!

- **Author**: Harivignesh K.
- **Email**: harivigneshk.dev@gmail.com

---
