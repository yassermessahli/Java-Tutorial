package com.JavaCoursePackage;


import java.io.*;


public class Files_section{

    public static void main(String[] args) throws FileNotFoundException, java.io.IOException{


        // FileInputStrem: to read data from a file.

///        import the file:
        FileInputStream file = new FileInputStream("files/input_file.txt");

//        read the file:

//        first way:
        int data = file.read();

        while(data != -1){
            System.out.print((char)data);
            data = file.read();
        }
        file.close(); // close the file.


//        second way:
        byte[] data2 = new byte[37];  // create a byte array.
        file.read(data2);  // read the file into the array.
        System.out.print(new String(data2));  // convert the array to a string.
        file.close();  // close the file.


//        FileOutputStream: to write data to a file.

        import the file:
        FileOutputStream file2 = new FileOutputStream("files/output_file.txt");
        file2.write("Hello World!".getBytes());  // write to the file.

        file2.flush();  // flush the file.


//        File class:
        File file3 = new File("hello.txt");  // create a file object.
        System.out.println("file exist: " + file3.exists()); // check if the file exists.



//        some methods:

        file3.createNewFile();  // create a new file.
        file3.delete();  // delete the file.
        file3.renameTo(new File("new_file.txt"));  // rename the file.
        System.out.println("absolute path: " + file3.getAbsolutePath());  // get the absolute path of the file.
        System.out.println("name: " + file3.getName());  // get the name of the file.
        System.out.println("parent: " + file3.getParent());  // get the parent of the file.
        System.out.println("path: " + file3.getPath());  // get the path of the file.
        System.out.println("length: " + file3.length());  // get the length of the file.
        System.out.println("last modified: " + file3.lastModified());  // get the last modified date of the file.
        System.out.println("is directory: " + file3.isDirectory());  // check if the file is a directory.
        System.out.println("is file: " + file3.isFile());  // check if the file is a file.
        System.out.println("is hidden: " + file3.isHidden());  // check if the file is hidden.
        System.out.println("can read: " + file3.canRead());  // check if the file can be read.
        System.out.println("can write: " + file3.canWrite());  // check if the file can be written.
        System.out.println("can execute: " + file3.canExecute());  // check if the file can be executed.
        System.out.println("is absolute: " + file3.isAbsolute());  // check if the file is absolute.
        System.out.println("is absolute: " + file3.isAbsolute());  // check if the file is absolute.
        System.out.println("list: " + file3.list());  // list the files in the directory.
        System.out.println("list files: " + file3.listFiles());  // list the files in the directory as an array of files.
        System.out.println("mkdir: " + file3.mkdir());  // create a directory.
        System.out.println("mkdirs: " + file3.mkdirs());  // create a directory and all its parents.
        System.out.println("delete: " + file3.delete());  // delete the file.
        System.out.println("set executable: " + file3.setExecutable(true));  // set the file executable.
        System.out.println("set readable: " + file3.setReadable(true));  // set the file readable.
        System.out.println("set writable: " + file3.setWritable(true));  // set the file writable.
        System.out.println("set last modified: " + file3.setLastModified(1000));  // set the last modified date of the file.
        System.out.println("set read only: " + file3.setReadOnly());  // set the file read only.


        FileWriter file4 = new FileWriter("files/output_file.txt");  // create a file writer object.
        file4.write("Hello World!");  // write to the file.
        file4.flush();  // flush the file.




    }
}
