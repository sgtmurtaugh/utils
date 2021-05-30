package de.ckraus.commons.pdf.itext4.modifier;

import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

@Getter
@Setter
public abstract class PdfModifierBase extends de.ckraus.commons.pdf.PdfModifierBase<PdfDocument> implements PdfModifer {

    private PdfReader pdfReader;
    private PdfWriter pdfWriter;

    /**
     * Constructor
     *
     * @param is
     * @param os
     */
    protected PdfModifierBase(InputStream is, OutputStream os) {
        super(is, os);
    }

    /**
     * Constructor
     *
     * @param in
     * @param out
     */
    protected PdfModifierBase(@NonNull File in, @NonNull File out) throws FileNotFoundException {
        super(in, out);
    }

    /**
     * Constructor
     *
     * @param src
     * @param dest
     */
    protected PdfModifierBase(String src, String dest) throws FileNotFoundException {
        super(src, dest);
    }

    @Override
    public Boolean modify(PdfDocument document) {
        return null;
    }

}
