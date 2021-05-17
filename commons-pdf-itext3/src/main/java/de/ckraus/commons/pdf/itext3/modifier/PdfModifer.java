package de.ckraus.commons.pdf.itext2.modifier;


import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.ReaderProperties;

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
     * Getter for the ReaderProperties
     * @return
     */
    ReaderProperties getReaderProperties();

    /**
     * Getter for the WriterProperties
     * @return
     */
    WriterProperties getWriterProperties();

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
                var pdfReader = new PdfReader( this.getInputStream(), ( null != this.getReaderProperties()
                        ? this.getReaderProperties()
                        : new ReaderProperties() ) );
                var pdfWriter = new PdfWriter( this.getOutputStream(), ( null != this.getWriterProperties()
                     ? this.getWriterProperties()
                     : new WriterProperties() ) )
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
