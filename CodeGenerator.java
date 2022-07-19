import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CodeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String folderName = sc.nextLine();
        String pathDesktop = System.getProperty("user.home") + "\\Desktop";
        new File(pathDesktop + "\\" + folderName).mkdir();
        FileWriter fw = null;

        try {
            File html = new File(pathDesktop + "\\" + folderName + "\\" + "index.html");
            File css = new File(pathDesktop + "\\" + folderName + "\\" + "style.css");
            File script = new File(pathDesktop + "\\" + folderName + "\\" + "script.js");
            html.createNewFile();
            css.createNewFile();
            script.createNewFile();
            fw = new FileWriter(html);
            String data = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n    <link rel=\"stylesheet\" href=\"style.css\">\n    <title>Document</title>\n</head>\n<body>\n    \n    <script src=\"script.js\"></script>\n</body>\n</html>";
            fw.write(data);
            fw.close();
            fw = new FileWriter(css);
            data = "*{\n    margin: 0;\n    padding: 0;\n    box-sizing: border-box;\n}\nhtml,body{\n    width: 100%;\n    height: 100%;\n}";
            fw.write(data);
            fw.close();
            System.out.println("Project " + folderName + " created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
