package de.ckraus.commons.pdf.pdfbox.modifier;

import de.ckraus.commons.pdf.AbstractPdfModifierBase;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

@Getter
@Setter
public abstract class AbstractPdfModifier extends AbstractPdfModifierBase<PDDocument> implements PdfModifer {

    private char[] password;
    private InputStream keyStore;
    private MemoryUsageSetting memoryUsageSetting;
    private String alias;

    /**
     * Constructor
     * @param is
     * @param os
     */
    protected AbstractPdfModifier(InputStream is, OutputStream os) {
        super(is, os);
    }

    /**
     * Constructor
     * @param in
     * @param out
     */
    protected AbstractPdfModifier(@NonNull File in, @NonNull File out) throws FileNotFoundException {
        super(in, out);
    }

    /**
     * Constructor
     * @param src
     * @param dest
     */
    protected AbstractPdfModifier(String src, String dest) throws FileNotFoundException {
        super(src, dest);
    }

}
