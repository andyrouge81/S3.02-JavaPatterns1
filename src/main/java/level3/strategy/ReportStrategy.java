package level3.strategy;

import java.io.File;
import java.io.FileWriter;

import java.io.IOException;

public interface ReportStrategy {
    String generateReport(File fileName);

    static ReportStrategy generateHTML() {

        return file -> {
            try (FileWriter writer = new FileWriter("src/main/resources/" + file + ".html")) {

            } catch (IOException e) {
                e.printStackTrace();
            }

            return file.getAbsolutePath();
        };
    }

    static ReportStrategy generateJson() {

        return file -> {
            try (FileWriter writer = new FileWriter("src/main/resources/" + file + ".json")) {

            } catch (IOException e) {
                e.printStackTrace();
            }
            return file.getAbsolutePath();
        };

    }

    static ReportStrategy generateXLM(){
        return file -> {
            try(FileWriter writer = new FileWriter("src/main/resources/" + file + ".xml")){

            }catch (IOException e){
                e.printStackTrace();
            }
            return file.getAbsolutePath();
        };
    }

    static ReportStrategy generatedPDF(){
        return file ->{
            try(FileWriter writer = new FileWriter("src/main/resources/"+ file+".pdf" )){

            }catch (IOException e){
                e.printStackTrace();
            }
            return file.getAbsolutePath();
        };

    }

    static ReportStrategy generatedExcel(){
        return file ->{
            try(FileWriter writer = new FileWriter("src/main/resources/"+file+".xlsm")){

            }catch (IOException e){
                e.printStackTrace();
            }
            return file.getAbsolutePath();
        };
    }

    static ReportStrategy generatedCSV(){
        return file -> {
            try(FileWriter writer = new FileWriter("src/main/resources/"+file+".csv")){

            }catch (IOException e){
                e.printStackTrace();
            }
            return file.getAbsolutePath();
        };
    }

    static ReportStrategy generatedWord(){
        return file -> {
            try(FileWriter writer = new FileWriter("src/main/resources/"+file+".doc")){

            }catch (IOException e){
                e.printStackTrace();
            }
            return file.getAbsolutePath();
        };
    }

}

