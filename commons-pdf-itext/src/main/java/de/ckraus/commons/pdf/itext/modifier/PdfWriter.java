package de.ckraus.commons.pdf.itext.modifier;

import com.itextpdf.kernel.pdf.WriterProperties;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

@SuppressWarnings( { "unused", "javadoc" } )
public interface PdfWriter {

    /**
     * getPdfWriter
     *
     * @param file
     *
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    default com.itextpdf.kernel.pdf.PdfWriter getPdfWriter( File file ) throws FileNotFoundException, IOException {
        com.itextpdf.kernel.pdf.PdfWriter writer = null;
        if ( null != file ) {
            writer = new com.itextpdf.kernel.pdf.PdfWriter( file );
        }
        return writer;
    }

    /**
     * getPdfWriter
     *
     * @param os
     *
     * @return
     * @throws IOException
     */
    default com.itextpdf.kernel.pdf.PdfWriter getPdfWriter( OutputStream os ) {
        com.itextpdf.kernel.pdf.PdfWriter writer = null;
        if ( null != os ) {
            writer = new com.itextpdf.kernel.pdf.PdfWriter( os );
        }
        return writer;
    }

    /**
     * getPdfWriter
     *
     * @param os
     * @param writerProperties
     *
     * @return
     * @throws IOException
     */
    default com.itextpdf.kernel.pdf.PdfWriter getPdfWriter( OutputStream os, WriterProperties writerProperties ) {
        com.itextpdf.kernel.pdf.PdfWriter writer = null;
        if ( null != os ) {
            writer = new com.itextpdf.kernel.pdf.PdfWriter( os, writerProperties );
        }
        return writer;
    }

    /**
     * getPdfWriter
     *
     * @param filename
     *
     * @return
     * @throws IOException
     */
    default com.itextpdf.kernel.pdf.PdfWriter getPdfWriter( String filename ) throws FileNotFoundException {
        com.itextpdf.kernel.pdf.PdfWriter writer = null;
        if ( StringUtils.isNotEmpty( filename ) ) {
            writer = new com.itextpdf.kernel.pdf.PdfWriter( filename );
        }
        return writer;
    }

    /**
     * getPdfWriter
     *
     * @param filename
     * @param writerProperties
     *
     * @return
     * @throws IOException
     */
    default com.itextpdf.kernel.pdf.PdfWriter getPdfWriter( String filename, WriterProperties writerProperties ) throws FileNotFoundException {
        com.itextpdf.kernel.pdf.PdfWriter writer = null;
        if ( StringUtils.isNotEmpty( filename ) ) {
            writer = new com.itextpdf.kernel.pdf.PdfWriter( filename, writerProperties );
        }
        return writer;
    }

}
