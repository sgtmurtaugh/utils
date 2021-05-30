package de.ckraus.commons.pdf;

import java.util.List;

/**
 * <p>All modify Methods <strong>must</strong> return three different modification states for consistent handling:
 * <ul>
 *     <li>true - succeeded</li>
 *     <li>false - failed</li>
 *     <li>null - omitted</li>
 * </ul>
 */
@SuppressWarnings({ "javadoc", "unused" })
public interface PdfFieldModifier<D, A, F> extends PdfModifer<D> {

    /**
     * TODO
     *
     * @param document
     *
     * @return
     */
    A getPdfAcroForm(D document);

    /**
     * TODO
     *
     * @param pdfDocument
     *
     * @return
     */
    Boolean modifyDocument(D pdfDocument);

    /**
     * <p>TODO This method must be implemented individually.</p>
     *
     * @param pdfAcroForm
     *
     * @return
     */
    Boolean modifyAcroForm(A pdfAcroForm);

    /**
     * <p>TODO This method must be implemented individually.</p>
     *
     * @param pdfFormFields
     *
     * @return
     */
    Boolean modifyFields(List<F> pdfFormFields);

}
