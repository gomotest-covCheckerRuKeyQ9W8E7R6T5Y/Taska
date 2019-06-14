package Task4;



    import java.io.*;

    public class Table1 {
        public static void main(String[] args) {

            String html = "<!DOCTYPE html>" +
                    "<html>"+
                    "<head></head>"+
                    "<body><table border=\"1\" cellspacing=\"0\" cellpadding=\"12\">" +
                    "<tr><th>ИМЯ</th><th>ТИП</th><th>ДАТА СОЗДАНИЯ</th><th>РАЗМЕР</th></tr>" +
                    "<tr><td>Dir1/td><td>DIR</td><td>01.02.2005</td><td>235235</td></tr>" +
                    "<tr><td>Dir2</td><td>DIR</td><td>02.03.2006</td><td>45254353</td></tr>" +
                    "<tr><td>file1.ext</td><td>FILE</td><td>01.01.2001</td><td>23</td></tr>" +
                    "<tr><td>file2.ext</td><td>FILE</td><td>02.02.2002</td><td>234</td></tr>" +
                    "</table> "+
                    "</body>"+
                    "</html>";


            File f = new File("E:\\Table.html");
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                bw.write(html);
                bw.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }


