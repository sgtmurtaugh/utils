package de.ckraus.commons.pdf.pdfbox3.modifier;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.*;

@Getter
@Setter
public abstract class PdfModifierBase extends de.ckraus.commons.pdf.PdfModifierBase<PDDocument> implements PdfModifer {

    private char[] password;
    private InputStream keyStore;
    private MemoryUsageSetting memoryUsageSetting;
    private String alias;

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

}
