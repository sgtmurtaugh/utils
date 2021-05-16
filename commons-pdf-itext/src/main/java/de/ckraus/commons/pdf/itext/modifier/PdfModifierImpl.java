package de.ckraus.commons.pdf.itext.modifier;

import com.itextpdf.kernel.pdf.*;
import com.itextpdf.kernel.pdf.PdfWriter;
import de.ckraus.commons.pdf.PdfModifierBase;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.*;

@Getter
@Setter
public class PdfModifierImpl extends PdfModifierBase<PdfDocument> implements PdfModifer {

    private PdfReader pdfReader;
    private PdfWriter pdfWriter;

    private ReaderProperties readerProperties;
    private WriterProperties writerProperties;

    /**
     * Constructor
     * @param is
     * @param os
     */
    protected PdfModifierImpl(InputStream is, OutputStream os) {
        super(is, os);
    }

    /**
     * Constructor
     * @param in
     * @param out
     */
    protected PdfModifierImpl(@NonNull File in, @NonNull File out) throws FileNotFoundException {
        super(in, out);
    }

    /**
     * Constructor
     * @param src
     * @param dest
     */
    protected PdfModifierImpl(String src, String dest) throws FileNotFoundException {
        super(src, dest);
    }

    @Override
    public Boolean modify(PdfDocument document) {
        return null;
    }
}
