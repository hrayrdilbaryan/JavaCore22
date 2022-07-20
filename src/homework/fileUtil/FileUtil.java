package homework.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);
    static String path = "C:\\Users\\User\\IdeaProjects\\JavaCore22";

    public static void main(String[] args) throws IOException {
//        fileSearch();
//        contentSearch();
//        findLines();
//        printSizeOfPackage();
        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() throws IOException {
//        String separator = File.separator;
//        String path = separator + "C:" + separator + "Users" + separator + "User" + separator + "IdeaProjects" + separator + "JavaCore22" + separator + "src" + separator + "homework" + separator + "fileUtil" + separator + "potter.txt";

        System.out.println("input file name in folder");
        String filename = scanner.nextLine();
        File myFile = new File(path);
        File[] files = myFile.listFiles();
        boolean exist = false;
        for (File file : files) {
            if (file.getName().equals(filename)) {
//                myFile = new File(myFile.getAbsolutePath() + filename);
                System.out.println(file.exists());
                break;

            }


        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("input keyword");
        String keyword = scanner.nextLine();
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isFile() && file1.getName().endsWith(".txt")) {
                    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
                        String line;
                        boolean exist = false;
                        while ((line = bufferedReader.readLine()) != null) {
                            if (line.contains(keyword)) {
                                System.out.println(file1.getName());
                                exist = true;
                            }
                        }
                        if (!exist) {
                            System.out.println("no file");
                        }

                    }


                }

            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        File folderPath = new File(path);
        File[] files = folderPath.listFiles();
        System.out.println("All file format .txt");
        if (files != null) {
            String getPathTxtFormat;
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    getPathTxtFormat = file.getAbsolutePath();
                    System.out.println(getPathTxtFormat);
                    System.out.println("Input file path for format .txt");
                    String filePathTxt = scanner.nextLine();
                    System.out.println("Input keyword");
                    String keyword = scanner.nextLine();
                    if (filePathTxt.equals(getPathTxtFormat)) {
                        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                            String line;
                            while ((line = bufferedReader.readLine()) != null) {
                                if (!line.contains(keyword)) {
                                    continue;
                                }
                                System.out.println(line);
                            }
                        }
                    }
                }
            }

        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Input path for size folder");
        String pathFolderSize = scanner.nextLine();
        File folderFile = new File(path);
        File[] allFiles = folderFile.listFiles();
        long size = 0;
        if (allFiles != null) {
            for (File allFile : allFiles) {
                if (allFile.getName().equals(pathFolderSize)) {
                    folderFile = new File(pathFolderSize);
                    allFiles = folderFile.listFiles();
                    if (allFile.isDirectory()) {
                        for (File file : allFiles) {
                            size += file.length();
                        }
                        System.out.println(size + " byte");
                    }
                }
            }
            if (size == 0) {
                System.out.println("Invalid package name");
            }

        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("Input path for create package");
        String packageName = scanner.nextLine();
        System.out.println("Input file name for created your package");
        String fileName = scanner.nextLine();
        System.out.println("Input content for add your file");
        String contentFile = scanner.nextLine();
        File myFile = new File(path);
        File[] lFile = myFile.listFiles();
        for (File file : lFile) {
            if (!file.getName().equals(packageName)) {
                myFile = new File(packageName);
                myFile.mkdir();
                if (myFile.isDirectory()) {
                    File createNewFile = new File(fileName);
                    createNewFile.createNewFile();
                }
            }
        }

    }


}


