/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai20_Folder_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lam
 */
public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    
    // Thao tác liệt kê tất cả các thư mục và tập tin trong thư mục hiện tại
    public File[] getDirectoryContent(String folder) {
        File directory = new File(folder);
        if(directory.isFile()) return null;
        File[] result = directory.listFiles();
        return result;
    }
    
    // Thao tác 2 : Xuất kết quả
    public String displayContent(File[] content) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< content.length; i++) {
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    
    // Thao tác 3 : Lọc ra các thư mục
    public File[] getSubDirectories(File[] content) {
        ArrayList<File> result = new ArrayList<>();
        for(int i=0; i<content.length; i++) {
            if(content[i].isDirectory()) {
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    // Thao tác 4 : Lọc ra tất cả các tập tin
    public File[] getFiles(File[] content) {
        ArrayList<File> result = new ArrayList<>();
        for(int i=0; i<content.length; i++) {
            if(content[i].isFile()) {
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    // Thao tác 5 : Duyệt đệ qui xuất tất cả các tập tin và thư mục
    public void getContentRecursively(String folder) {
        File content = new File(folder);
        // Điều kiện dừng
        if(content.isFile()) {
            System.out.println(content.getPath() + File.separator + content.getName());
            return;
        }
        // Câu gọi đệ qui trong stack
        System.out.println("Thư mục : " + folder);
        File[] sub = content.listFiles();
        for(int i=0; i<sub.length; i++) {
            getContentRecursively(folder + File.separator + sub[i].getName());
        }
    }

    // Thao tác 6 : Đọc file văn bản
    public String readTextFile(String fileName) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        
        try {
            // Mở file
            FileReader fr = new FileReader(fileName);
            // Dùng bộ đệm
            BufferedReader br = new BufferedReader(fr);

            String line = null;
            while((line = br.readLine()) != null) {
                content.append(line);
                content.append("\n");
            }
            
            // Đóng file
            br.close();
            fr.close();
            
        } catch(FileNotFoundException ex) {
            return "Không tìm thấy file " + fileName;
        } catch(IOException ex) {
            return "Không thể đọc file " + fileName;
        }
        
        return content.toString();
    }
    
    // Thao tác 7 : Lưu tập tin văn bản
    public boolean writeTextFile(String fileName, String content) throws IOException {
        boolean flag = true;    // Lưu thành công
        try {
            // Mở file
            FileWriter fw = new FileWriter(fileName);
            // Sử dụng buffer
            BufferedWriter bw = new BufferedWriter(fw);
            // Ghi ra file
            bw.write(content);
            // Đóng file
            bw.flush();
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            return false;
        }
        return flag;
    }

}