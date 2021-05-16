package de.ckraus.commons.pdf.itext7.modifier;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.pdf.PdfDocument;

import java.util.Map;

/**
 * <p>All modify Methods <strong>must</strong> return three different modification states for consistent handling:
 * <ul>
 *     <li>true - succeeded</li>
 *     <li>false - failed</li>
 *     <li>null - omitted</li>
 * </ul>
 */
@SuppressWarnings( { "javadoc", "unused" } )
public interface PdfFieldModifier extends de.ckraus.commons.pdf.PdfFieldModifier<PdfDocument, PdfAcroForm, PdfFormField> {

    Boolean DEFAULT_CREATE_PDF_ACRO_FORM_IF_NOT_EXISTS = Boolean.TRUE;


    /**
     * isCreatePdfAcroFormIfNotExists
     *
     * @return
     */
    default boolean isCreatePdfAcroFormIfNotExists() {
        return DEFAULT_CREATE_PDF_ACRO_FORM_IF_NOT_EXISTS;
    }

    /**
     * getPdfAcroForm
     *
     * @param pdfDocument
     *
     * @return <p>Delegates to {@link #getPdfAcroForm(PdfDocument, boolean)} and uses {@link
     *         #isCreatePdfAcroFormIfNotExists()}
     *         for the boolean param.</p>
     */
    default PdfAcroForm getPdfAcroForm( PdfDocument pdfDocument ) {
        return this.getPdfAcroForm( pdfDocument, this.isCreatePdfAcroFormIfNotExists() );
    }

    /**
     * getPdfAcroForm
     *
     * @param pdfDocument
     * @param bCreateIfNotExists
     *
     * @return <p>Delegates to {@link PdfAcroForm#getAcroForm(PdfDocument, boolean)} to get PdfAcroForm instance.</p>
     */
    default PdfAcroForm getPdfAcroForm( PdfDocument pdfDocument, boolean bCreateIfNotExists ) {
        PdfAcroForm pdfAcroForm = null;

        if ( pdfDocument != null ) {
            pdfAcroForm = PdfAcroForm.getAcroForm( pdfDocument, bCreateIfNotExists );
        }
        return pdfAcroForm;
    }

    /**
     * modify
     *
     * @param pdfDocument
     *
     * @return <p>Determines the {@link PdfAcroForm} with the given {@link PdfDocument} and delegates to
     *         {@link #modify(PdfAcroForm)}</p>
     */
    default Boolean modify( PdfDocument pdfDocument ) {
        return this.modify( pdfDocument, this.isCreatePdfAcroFormIfNotExists() );
    }

    /**
     * modify
     *
     * @param pdfDocument
     * @param bCreateIfNotExists
     *
     * @return <p>Similar to {@link #modify(PdfAcroForm)} it determines the {@link PdfAcroForm} with the given
     *         {@link PdfDocument} but delegates to {@link #modify(PdfDocument, boolean)}</p>
     */
    default Boolean modify( PdfDocument pdfDocument, boolean bCreateIfNotExists ) {
        Boolean bSuccess = null;
        if ( null != pdfDocument ) {
            PdfAcroForm pdfAcroForm = PdfAcroForm.getAcroForm( pdfDocument, bCreateIfNotExists );
            bSuccess = this.modify( pdfAcroForm );
        }
        return bSuccess;
    }

    /**
     * <p>This method must be implemented individually.</p>
     *
     * @param pdfAcroForm
     *
     * @return
     */
    default Boolean modify( PdfAcroForm pdfAcroForm ) {
        Boolean bSuccess = null;
        if ( null != pdfAcroForm ) {
            Map<String, PdfFormField> lstPdfFormFields = pdfAcroForm.getFormFields();
            bSuccess = this.modifyFields( lstPdfFormFields );;
        }
        return bSuccess;
    }

    /**
     * <p>TODO:This method must be implemented individually.</p>
     *
     * @param lstPdfFormFields
     *
     * @return
     */
    Boolean modifyFields( Map<String, PdfFormField> lstPdfFormFields );

}
