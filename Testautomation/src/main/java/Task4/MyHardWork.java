package Task4;

import java.io.*;

public class MyHardWork {


    public static void main (String[] args) {
        File dir =new File//(System.getProperty("user.home"));
                (".\\src\\main\\java\\Task4") ;   //ОТНОСИТЕЛЬНЫЙ ПУТЬ К ПАПКЕ С ПРОГРАММОЙ
                //("E:\\Фильмы");

        File[] listOfFiles = dir.listFiles();                //ПОЛУЧАЕМ МАССИВ ЭЛЕМЕНТОВ ВЫБРАННОЙ ПАПКИ


        String[] name = new String[4];             //  ПОЛУЧАЕМ ИМЕНА ЭЛЕМЕНТОВ
        for(int i =0;i<4;i++) {
            if (listOfFiles[i].exists())        //!!!!!!!!!!!!!!! НЕ УДАЕТСЯ ИЗБЕЖАТЬ СИТУАЦИИ С ПУСТЫМИ ПАПКАМИ,
                name[i]= listOfFiles[i].getName();      ////ПРИ ПОПЫТКЕ ПРОВЕРИТЬ listOfFiles[i]  ПАДАЕТ ОШБКА, НЕ НАШЕЛ
            else name[i] = "";                            ////КАК ИСПРАВИТЬ
            

}

        String[] type= new String[4];                        //ПОЛУЧАЕМ ТИП ЭЛЕМЕНТОВ
        for(int i =0;i<4;i++){
            type[i]=  fileOrDirectory(listOfFiles[i]);

        }



        long[] Byte = new long[4];                                  //ПОЛУЧАЕМ РАЗМЕР ЭЛЕМЕНТОВ
        for(int i =0;i<4;i++){
          Byte[i]=(listOfFiles[i].length()/1024);

        }

        long[] data = new long[4];           //ЭТО ВОВСЕ НЕ ТО ЧТО НУЖНО, НО НИЧЕГО ПОДХОДЯЩГО НЕ НАШЕЛ
        for(int i =0;i<4;i++){
            data[i]=listOfFiles[i].lastModified();
        }



        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "\t<meta charset=\"UTF-8\">\n" +
                "\t<title>Document</title>\n" +
                "\t<link rel=\"stylesheet\" href =\"table.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<table border=\"5\" align=\"center\" width=\"80%\" cellspacing=\"0\"  bgcolor=\"white\" >\n" +
                "<tr>   <th>ИМЯ</th>  <th>ТИП</th>   <th>ДАТА СОЗДАНИЯ</th>    <th>РАЗМЕР ( в kb)</th>   \n" +
                "<tr>\n" +
                "<td>"+name[0]+"</td>\n" +
                "<td>"+type[0]+"</td>\n" +
                "<td>"+data[0]+"</td>\n" +
                "<td>"+Byte[0]+"</td>\n" +
                "<tr>\n" +
                "<td>"+name[1]+"</td>\n" +
                "<td>"+type[1]+"</td>\n" +
                "<td>"+data[1]+"</td>\n" +
                "<td>"+Byte[1]+"</td>\n" +
                "<tr>\n" +
                "<td>"+name[2]+"</td>\n" +
                "<td>"+type[2]+"</td>\n" +
                "<td>"+data[2]+"</td>\n" +
                "<td>"+Byte[2]+"</td>\n" +
                "<tr>\n" +
                "<td>"+name[3]+"</td>\n" +
                "<td>"+type[3]+"</td>\n" +
                "<td>"+data[3]+"</td>\n" +
                "<td>"+Byte[3]+"</td>\n" +
                "</tr>\n" +
                "\n" +
                "\n" +
                "</table>\n" +
                "\n" +
                "\t\n" +
                "</body>\n" +
                "</html>";

        String filePath1 = System.getProperty("user.dir") + "\\TableOfDir.html";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath1));
            bw.write(html);
            bw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
   static String fileOrDirectory (File file){           //МЕТОД ДЛЯ ПРОВЕРКИ ТИПА ЭЛЕМЕНТА
        if (file.isFile()) {
            return "FILE";
        } else if (file.isDirectory()) {
           return "DIR";
        }
        return "";
    }

}
