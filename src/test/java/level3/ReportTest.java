package level3;


import level3.context.Context;
import level3.strategy.ReportStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReportTest {

    private Context context;


    @BeforeEach
    void setup() {

        context = new Context();

    }


    @Test
    void testGenerateHTMLReport() {
        String fileName = "testHtml";

        context.setStrategy(ReportStrategy.generateHTML());
        context.executeReport(fileName);

        File htmlGenerated = new File("src/main/resources/" + fileName + ".html");
        assertTrue(htmlGenerated.exists());
    }


    @Test
    void testGenerateJsonReport() {
        String fileName = "testJson";

        context.setStrategy(ReportStrategy.generateJson());
        context.executeReport(fileName);

        File jsonGenerated = new File("src/main/resources/" + fileName + ".json");
        assertTrue(jsonGenerated.exists());
    }


    @Test
    void testGenerateXMLReport() {
        String fileName = "testXml";

        context.setStrategy(ReportStrategy.generateXLM());
        context.executeReport(fileName);

        File xmlGenerated = new File("src/main/resources/" + fileName + ".xml");

        assertTrue(xmlGenerated.exists());
    }


    @Test
    void testGeneratePDFReport() {
        String fileName = "testPDF";

        context.setStrategy(ReportStrategy.generatedPDF());
        context.executeReport(fileName);

        File pdfGenerated = new File("src/main/resources/" + fileName + ".pdf");

        assertTrue(pdfGenerated.exists());
    }


    @Test
    void testGenerateExcelReport() {
        String fileName = "testExcel";
        context.setStrategy(ReportStrategy.generatedExcel());
        context.executeReport(fileName);

        File excelGenerated = new File("src/main/resources/" + fileName + ".xlsm");
        assertTrue(excelGenerated.exists());
    }


    @Test
    void testGenerateCSVReport() {

        String fileName = "testCSV";
        context.setStrategy(ReportStrategy.generatedCSV());
        context.executeReport(fileName);

        File csvGenerated = new File("src/main/resources/" + fileName + ".csv");
        assertTrue(csvGenerated.exists());
    }


    @Test
    void testGenerateWordReport() {
        String fileName = "testWord";
        context.setStrategy(ReportStrategy.generatedWord());
        context.executeReport(fileName);

        File wordGenerated = new File("src/main/resources/" + fileName + ".doc");
        assertTrue(wordGenerated.exists());
    }




}



