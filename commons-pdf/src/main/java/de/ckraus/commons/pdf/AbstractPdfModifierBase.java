package de.ckraus.commons.pdf;

import de.ckraus.commons.beans.AbstractBeanBase;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.*;

@Getter
@Setter
public abstract class AbstractPdfModifierBase<D> extends AbstractBeanBase implements PdfModifer<D> {

    private InputStream inputStream;
    private OutputStream outputStream;

    private D pdfDocument;

    /**
     * Constructor
     * @param is
     * @param os
     */
    protected AbstractPdfModifierBase(InputStream is, OutputStream os) {
        super();
        this.setInputStream( is );
        this.setOutputStream( os );
    }

    /**
     * Constructor
     * @param in
     * @param out
     */
    protected AbstractPdfModifierBase(@NonNull File in, @NonNull File out) throws FileNotFoundException {
        super();
        this.setInputStream( new FileInputStream( in ) );
        this.setOutputStream( new FileOutputStream( out ) );
    }

    /**
     * Constructor
     * @param src
     * @param dest
     */
    protected AbstractPdfModifierBase(String src, String dest) throws FileNotFoundException {
        super();
        this.setInputStream( new FileInputStream( src ) );
        this.setOutputStream( new FileOutputStream( dest ) );
    }

}
