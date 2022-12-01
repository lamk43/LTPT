/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai20_Folder_File;

import java.io.File;

/**
 *
 * @author lam
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FileAndDirectoryOperations
        FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
//        File[] content = fo.getDirectoryContent("D:\\Education\\JavaCoBan");
//        System.out.println(fo.displayContent(content));
//        File[] thuMuc = fo.getSubDirectories(content);
//        System.out.println("Danh sách các thư mục con là : ");
//        System.out.println(fo.displayContent(thuMuc));
//        File[] tapTin = fo.getFiles(content);
//        System.out.println("Danh sách các tập tin : ");
//        System.out.println(fo.displayContent(tapTin));
        fo.getContentRecursively("D:\\JavaCoBan\\git");

        

    }
    
}
