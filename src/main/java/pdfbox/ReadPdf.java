package pdfbox;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class ReadPdf {

    public static void main(String[] args) throws IOException {

    	createEmptyDocument();
        

    }
    private static void createEmptyDocument()
    {
    	final PDPage singlePage = new PDPage();
    	   final PDFont courierBoldFont = PDType1Font.COURIER_BOLD;
    	   final int fontSize = 12;
    	   try (final PDDocument document = new PDDocument())
    	   {
    	      document.addPage(singlePage);
    	      final PDPageContentStream contentStream = new PDPageContentStream(document, singlePage);
    	      contentStream.beginText();
    	      contentStream.setFont(courierBoldFont, fontSize);
    	      contentStream.newLineAtOffset(150, 750);
    	      contentStream.showText("Hello PDFBox");
    	      contentStream.endText();
    	      contentStream.close();  // Stream must be closed before saving document.
    	      document.save("HelloPDFBox.pdf");
    	   }
    	   catch (IOException ioEx)
    	   {
    	      System.err.println(
    	         "Exception while trying to create simple document - " + ioEx);
    	   }
    }
}