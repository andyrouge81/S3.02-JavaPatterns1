package level3;


import level3.context.Context;
import level3.strategy.ReportStrategy;
import org.junit.jupiter.api.Test;

import java.io.File;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReportTest {

    private Context context;




    @Test
    void testGenerateHTMLReport() {
        String fileName = "testHtml";

        context= new Context(ReportStrategy.generateHTML());
        context.executeReport(fileName);

        File htmlGenerated = new File("src/main/resources/" + fileName + ".html");
        assertTrue(htmlGenerated.exists());
    }


    @Test
    void testGenerateJsonReport() {
        String fileName = "testJson";

        context= new Context(ReportStrategy.generateJson());
        context.executeReport(fileName);

        File jsonGenerated = new File("src/main/resources/" + fileName + ".json");
        assertTrue(jsonGenerated.exists());
    }


    @Test
    void testGenerateXMLReport() {
        String fileName = "testXml";

        context = new Context(ReportStrategy.generateXLM());
        context.executeReport(fileName);

        File xmlGenerated = new File("src/main/resources/" + fileName + ".xml");

        assertTrue(xmlGenerated.exists());
    }


    @Test
    void testGeneratePDFReport() {
        String fileName = "testPDF";

        context = new Context(ReportStrategy.generatedPDF());
        context.executeReport(fileName);

        File pdfGenerated = new File("src/main/resources/" + fileName + ".pdf");

        assertTrue(pdfGenerated.exists());
    }


    @Test
    void testGenerateExcelReport() {
        String fileName = "testExcel";
        context = new Context(ReportStrategy.generatedExcel());
        context.executeReport(fileName);

        File excelGenerated = new File("src/main/resources/" + fileName + ".xlsm");
        assertTrue(excelGenerated.exists());
    }


    @Test
    void testGenerateCSVReport() {

        String fileName = "testCSV";
        context = new Context(ReportStrategy.generatedCSV());
        context.executeReport(fileName);

        File csvGenerated = new File("src/main/resources/" + fileName + ".csv");
        assertTrue(csvGenerated.exists());
    }


    @Test
    void testGenerateWordReport() {
        String fileName = "testWord";

        context = new Context(ReportStrategy.generatedWord());
        context.executeReport(fileName);

        File wordGenerated = new File("src/main/resources/" + fileName + ".doc");
        assertTrue(wordGenerated.exists());
    }




}



