package de.ckraus.commons.pdf;

import de.ckraus.commons.beans.BeanBase;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.*;

@Getter
@Setter
public abstract class PdfModifierBase<D> extends BeanBase implements PdfModifer<D> {

    private InputStream inputStream;
    private OutputStream outputStream;

    private D pdfDocument;

    /**
     * Constructor
     * @param is
     * @param os
     */
    protected PdfModifierBase(InputStream is, OutputStream os) {
        super();
        this.setInputStream( is );
        this.setOutputStream( os );
    }

    /**
     * Constructor
     * @param in
     * @param out
     */
    protected PdfModifierBase(@NonNull File in, @NonNull File out) throws FileNotFoundException {
        super();
        this.setInputStream( new FileInputStream( in ) );
        this.setOutputStream( new FileOutputStream( out ) );
    }

    /**
     * Constructor
     * @param src
     * @param dest
     */
    protected PdfModifierBase(String src, String dest) throws FileNotFoundException {
        super();
        this.setInputStream( new FileInputStream( src ) );
        this.setOutputStream( new FileOutputStream( dest ) );
    }

}
