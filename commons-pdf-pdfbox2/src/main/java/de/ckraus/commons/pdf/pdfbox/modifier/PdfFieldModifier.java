package de.ckraus.commons.pdf.pdfbox.modifier;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

import java.util.List;

/**
 * <p>All modify Methods <strong>must</strong> return three different modification states for consistent handling:
 * <ul>
 *     <li>true - succeeded</li>
 *     <li>false - failed</li>
 *     <li>null - omitted</li>
 * </ul>
 */
@SuppressWarnings( { "javadoc", "unused" } )
public interface PdfFieldModifier extends PdfModifer {

    /**
     * TODO
     *
     * @param pdfDocument
     *
     * @return
     */
    default PDAcroForm getPdfAcroForm( PDDocument pdfDocument ) {
        PDAcroForm pdfAcroForm = null;

        if ( null != pdfDocument ) {
            PDDocumentCatalog docCatalog = pdfDocument.getDocumentCatalog();
            if ( null != docCatalog ) {
                pdfAcroForm = docCatalog.getAcroForm();
            }
        }
        return pdfAcroForm;
    }

    /**
     * <p>Determines the {@link PDAcroForm} with the given {@link PDDocument} and delegates to {@link #modify(PDAcroForm)}</p>
     *
     * @param pdfDocument
     *
     * @return
     */
    default Boolean modify( PDDocument pdfDocument ) {
        Boolean bModify = null;
        if ( null != pdfDocument ) {
            bModify = this.modify( this.getPdfAcroForm( pdfDocument ) );
        }
        return bModify;
    }

    /**
     * <p>This method must be implemented individually.</p>
     *
     * @param pdAcroForm
     *
     * @return
     */
    Boolean modify( PDAcroForm pdAcroForm );

    /**
     * <p>This method must be implemented individually.</p>
     *
     * @param lstPDFields
     *
     * @return
     */
    Boolean modifyFields( List<PDField> lstPDFields );

}
