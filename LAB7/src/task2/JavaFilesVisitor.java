package task2;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * Counter for java files of a given directory using java.nio API
 */
public class JavaFilesVisitor extends SimpleFileVisitor<Path> {

    private ArrayList<Path> javaFiles = new ArrayList<>();

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(file.toString().endsWith(".java") || file.toString().endsWith(".class")){
            javaFiles.add(file);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }



    public final ArrayList<Path> getJavaFiles() {
        return javaFiles;
    }

    // TODO - override the visitFile(Path file, BasicFileAttributes attr) method of the SimpleFileVisitor
    // add to javaFiles all the Java related files: the ones with .java and .class extensions

    public static void main(String[] args) throws IOException {

        Path startingDir = Paths.get(".");
        JavaFilesVisitor filesVisitor = new JavaFilesVisitor();

        Files.walkFileTree(startingDir, filesVisitor);

        for(Path path : filesVisitor.getJavaFiles()){
            System.out.println(path);
        }
        System.out.println("The number of files is " + filesVisitor.getJavaFiles().size());



        // TODO
        // use Files.walkFileTree
        // obtain the list of files and print some info about them (e.g. size and path)
    }
}
