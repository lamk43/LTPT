/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_string;

/**
 *
 * @author lam
 */
public class test_string {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ToDo code application logic here
        String content = "Than em vua trang lai vua tron \n Bay noi ba chim voi nuoc non";
        System.out.println(content);  
        //Thao tac 1: tim vi tri cua 1 ky tu
        System.out.println("Vi tri cua ky tu a trong chuoi la: " + content.indexOf('a'));
        System.out.println("Vi tri cua tu nuoc trong chuoi la: " + content.indexOf("nuoc") );
        //Thao tac 2: kiem tra khoi dau va ket thuc
        System.out.println("Chuoi mo dau bang cum tu Than: " + content.startsWith("Than"));
        System.out.println("Chuoi ket thuc bang cum tu troi: " + content.endsWith("tron"));
        //Thao tac 3: cat chuoi theo vi tri
        String temp = content.substring(10, 20);
        System.out.println("Chuoi con la: " + temp );
        //Thao tac 4: phan tach chuoi 
        String[] result = content.split("\n");
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
        //Thao tac 5: loai bo khoang trang dau -cuoi chuoi
        for (int i = 0; i <result.length; i++){
            System.out.println(result[i].trim());
        }
        //Thao tac 6: thay the ki tu
        temp = content.replace('a', 'z');
        System.out.println(temp);
        
        //Thao tac 7: Banh troi nuoc
        temp = content.toUpperCase();
        System.out.println(temp);
        temp = content.toLowerCase();
        System.out.println(temp);
        //Thao tac 8: so sanh chuoi
        temp = "Nguyen";
        if(temp.compareTo("Nguyen") == 0){
            System.out.println("2 chuoi bang nhau");
        }else{
            System.out.println("2 chuoi khong bang nhau");
        }
        //Thao tac 9: noi chuoi
        temp = temp.concat(" Van A");
        System.out.println(temp);
        
        //Thao tac 10: truy suat bang chi so
        for(int i = 0; i < temp.length(); i++){
            System.out.println(temp.charAt(i));
        }
        System.out.println();
        
        //Thao tac 10: Banh troi nuoc
        temp = "155";
        int n = Integer.parseInt(temp);
        System.out.println("n = " + n);
        //Thao tac 11: Su dung StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Than em vua trang lai vua tron\n");
        sb.append("Bay noi ba chim voi nuoc non");
        temp = sb.toString();
        System.out.println(sb);
    }
}
