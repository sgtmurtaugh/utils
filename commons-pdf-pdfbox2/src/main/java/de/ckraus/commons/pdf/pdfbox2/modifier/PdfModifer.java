package de.ckraus.commons.pdf.pdfbox2.modifier;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.pdmodel.PDDocument;

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

    @Override
    default void initializePdfDocument() throws IOException {
        this.setPdfDocument(
                PDDocument.load(
                        this.getInputStream(), (
                                ArrayUtils.isNotEmpty( this.getPassword() )
                                        ? new String( this.getPassword() )
                                        : StringUtils.EMPTY
                        ), this.getKeyStore(), this.getAlias(), this.getMemoryUsageSetting()
                )
        );
    }

    /**
     * Getter for the Password
     * @return
     */
    char[] getPassword();

    /**
     * Getter for the KeyStore
     * @return
     */
    InputStream getKeyStore();

    /**
     * Getter for the Alias
     * @return
     */
    String getAlias();

    /**
     * Getter for the MemoryUsageSetting
     * @return
     */
    MemoryUsageSetting getMemoryUsageSetting();

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
    default Boolean modify( PDDocument pdfDocument ) {
        return null;
    }

}
