package de.ckraus.commons.pdf.itext2.modifier;

import com.lowagie.text.pdf.PdfDocument;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfWriter;

import java.io.IOException;

/**
 * <p>All modify Methods <strong>must</strong> return three different modification states for consistent handling:
 * <ul>
 *     <li>true - succeeded</li>
 *     <li>false - failed</li>
 *     <li>null - omitted</li>
 * </ul>
 */
@SuppressWarnings( { "javadoc", "unused" } )
public interface PdfModifer extends de.ckraus.commons.pdf.PdfModifer<PdfDocument> {

    /**
     * Getter for the PdfWriter
     * @return
     */
    PdfReader getPdfReader();

    /**
     * Setter for the PdfWriter
     * @param pdfReader
     */
    void setPdfReader( PdfReader pdfReader );

    /**
     * Getter for the PdfWriter
     * @return
     */
    PdfWriter getPdfWriter();

    /**
     * Setter for the PdfWriter
     * @param
     */
    void setPdfWriter( PdfWriter pdfWriter );

    @Override
    default void initializePdfDocument() throws IOException {
        try (
                var pdfReader = new PdfReader( this.getInputStream() );
                var pdfWriter = new PdfWriter( this.getOutputStream() )
        ) {
            this.setPdfReader( pdfReader );
            this.setPdfWriter( pdfWriter );
            this.setPdfDocument( new PdfDocument(pdfReader, pdfWriter) );
        }
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
    default Boolean modify( PdfDocument pdfDocument ) {
        return null;
    }

}
