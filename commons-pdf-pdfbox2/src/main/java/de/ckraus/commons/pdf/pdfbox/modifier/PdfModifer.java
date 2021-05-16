package de.ckraus.commons.pdf.pdfbox.modifier;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * <p>All modify Methods <strong>must</strong> return three different modification states for consistent handling:
 * <ul>
 *     <li>true - succeeded</li>
 *     <li>false - failed</li>
 *     <li>null - omitted</li>
 * </ul>
 */
@SuppressWarnings( { "javadoc", "unused" } )
public interface PdfModifer extends de.ckraus.commons.pdf.PdfModifer<PDDocument> {

    /**
     * getPdfDocument
     *
     * @param is
     *
     * @return
     * @throws IOException
     */
    default PDDocument getPdfDocument( InputStream is ) throws IOException {
        PDDocument pdfDocument = null;
        if ( null != is ) {
            pdfDocument = PDDocument.load( is );
        }
        return pdfDocument;
    }

    /**
     * getPdfDocument
     *
     * @param file
     *
     * @return
     * @throws IOException
     */
    default PDDocument getPdfDocument( File file ) throws IOException {
        PDDocument pdfDocument = null;
        if ( null != file ) {
            pdfDocument = PDDocument.load( file );
        }
        return pdfDocument;
    }

    /**
     * modify
     *
     * @param pdfDocument
     *
     * @return <p>Returns three different modification states:
     *         <ul>
     *             <li>true - succeeded</li>
     *             <li>false - failed</li>
     *             <li>null - omitted</li>
     *         </ul>
     */
    Boolean modify( PDDocument pdfDocument );

}
