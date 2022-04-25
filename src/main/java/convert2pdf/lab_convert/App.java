package convert2pdf.lab_convert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String filein = "/mnt/dados/clientes/eb/pts/EBDCT32017-7900 - Proposta Técnica.docx";
        String fileout = "/mnt/dados/clientes/eb/pts/EBDCT32017-7900 - Proposta Técnica.pdf";
        Docx2PdfConversion.convert(filein, fileout);
    }
}
