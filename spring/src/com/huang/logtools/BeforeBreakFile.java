package com.huang.logtools;

import java.io.*;

/**
 * @Author Huang Guojun
 * @Date 2018/11/9
 * @Discription
 */
public class BeforeBreakFile {
    public static void main(String args[]) {

        try {

            FileReader read = new FileReader("C:\\Users\\magic-h\\Desktop\\beforesplit\\logback.2018-11-08.23.log");

            BufferedReader br = new BufferedReader(read);

            String row;


            int rownum = 1;


            int fileNo = 1;

            FileWriter fw = new FileWriter("C:\\Users\\magic-h\\Desktop\\aftersplit\\" + fileNo + ".txt");

            while ((row = br.readLine()) != null) {

                rownum ++;

                fw.append(row + "\r\n");


                if((rownum / 14063) > (fileNo - 1)){

                    fw.close();

                    fileNo ++ ;

                    fw = new FileWriter("C:\\Users\\magic-h\\Desktop\\aftersplit\\" + fileNo + ".txt");

                }

            }

            fw.close();

            System.out.println("rownum="+rownum+";fileNo="+fileNo);

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}


