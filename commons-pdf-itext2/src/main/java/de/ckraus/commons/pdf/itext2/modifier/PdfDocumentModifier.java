package de.ckraus.commons.pdf.itext2.modifier;

/**
 * <p>All modify Methods <strong>must</strong> return three different modification states for consistent handling:
 * <ul>
 *     <li>true - succeeded</li>
 *     <li>false - failed</li>
 *     <li>null - omitted</li>
 * </ul>
 */
public interface PdfDocumentModifier extends PdfModifer {

}
