package de.ckraus.commons.pdf;

import de.ckraus.commons.beans.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * <p>All modify Methods <strong>must</strong> return three different modification states for consistent handling:
 * <ul>
 *     <li>true - succeeded</li>
 *     <li>false - failed</li>
 *     <li>null - omitted</li>
 * </ul>
 */
@SuppressWarnings( { "javadoc", "unused" } )
public interface PdfModifer<D> extends Bean {

    /**
     * Initializes the PdfDocument
     * @return
     */
    boolean initializePdfDocument() throws IOException;

    @Override
    default boolean initialize( boolean bReinitialization ) {
        if ( Bean.super.initialize( bReinitialization ) ) {
            this.initializePdfDocument();
        }
        return bReinitialization;
    }

    /**
     * Getter for the PdfDocument InputStream
     * @return
     */
    InputStream getInputStream();

    /**
     * Getter for the PdfDocument OutputStream
     * @return
     */
    OutputStream getOutputStream();

    /**
     * Getter for the PdfDocument
     *
     * @return
     */
    D getPdfDocument() throws IOException;

    /**
     * Setter for the PdfDocument
     *
     * @return
     */
    void setPdfDocument( D pdfDocument );

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
    Boolean modify( D document );

}
