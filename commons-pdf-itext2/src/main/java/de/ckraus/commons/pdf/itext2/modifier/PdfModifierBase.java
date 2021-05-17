package de.ckraus.commons.pdf.itext2.modifier;

import com.itextpdf.kernel.pdf.*;
import com.itextpdf.kernel.pdf.PdfWriter;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.*;

@Getter
@Setter
public abstract class PdfModifierBase extends de.ckraus.commons.pdf.PdfModifierBase<PdfDocument> implements PdfModifer {

    private PdfReader pdfReader;
    private PdfWriter pdfWriter;

    private ReaderProperties readerProperties;
    private WriterProperties writerProperties;

    /**
     * Constructor
     * @param is
     * @param os
     */
    protected PdfModifierBase(InputStream is, OutputStream os) {
        super(is, os);
    }

    /**
     * Constructor
     * @param in
     * @param out
     */
    protected PdfModifierBase(@NonNull File in, @NonNull File out) throws FileNotFoundException {
        super(in, out);
    }

    /**
     * Constructor
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
