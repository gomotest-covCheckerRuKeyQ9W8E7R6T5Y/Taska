package Task4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Table {
    static String filePath = System.getProperty("user.dir") + "\\src\\HTML_Task1.html";

    public static void main(String[] args) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write("<!DOCTYPE HTML>\n" +
                    "<html>"+
                    "<head>"+
                    "<meta charset=\"utf-8\">"+
                    "<title>Directory content</title>"+
                    "</head>"+
                    "<body>"+
                    "<h1>Содержимое текущего католога</h1><br>" +
                    "<table border=\"1\" cellpadding=\"5\">" +
                    "<tbody>" +
                    "<tr>" +
                    "<th>ИМЯ</th>" +
                    "<th>ТИП</th>"+
                    "<th>ДАТА СОЗДАНИЯ</th>" +
                    "<th>РАЗМЕР (bytes)</th>" +
                    "</tr>"+
                    "</tbody>"+
                    "</body>"+
                    "</html>"
            );
        }
        catch (IOException e) {
            e.printStackTrace();
        }


} }