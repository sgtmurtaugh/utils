package de.ckraus.commons.pdf.itext;

import com.itextpdf.io.source.IRandomAccessSource;
import com.itextpdf.kernel.pdf.ReaderProperties;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@SuppressWarnings( { "javadoc", "unused" } )
public interface PdfReader {

    /**
     * getPdfReader
     *
     * @param file
     *
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    default com.itextpdf.kernel.pdf.PdfReader getPdfReader( File file ) throws FileNotFoundException, IOException {
        com.itextpdf.kernel.pdf.PdfReader reader = null;
        if ( null != file ) {
            reader = new com.itextpdf.kernel.pdf.PdfReader( file );
        }
        return reader;
    }

    /**
     * getPdfReader
     *
     * @param is
     *
     * @return
     * @throws IOException
     */
    default com.itextpdf.kernel.pdf.PdfReader getPdfReader( InputStream is ) throws IOException {
        com.itextpdf.kernel.pdf.PdfReader reader = null;
        if ( null != is ) {
            reader = new com.itextpdf.kernel.pdf.PdfReader( is );
        }
        return reader;
    }

    /**
     * getPdfReader
     *
     * @param is
     * @param readerProperties
     *
     * @return
     * @throws IOException
     */
    default com.itextpdf.kernel.pdf.PdfReader getPdfReader( InputStream is, ReaderProperties readerProperties ) throws IOException {
        com.itextpdf.kernel.pdf.PdfReader reader = null;
        if ( null != is ) {
            reader = new com.itextpdf.kernel.pdf.PdfReader( is, readerProperties );
        }
        return reader;
    }

    /**
     * getPdfReader
     *
     * @param randomAccessSource
     * @param readerProperties
     *
     * @return
     * @throws IOException
     */
    default com.itextpdf.kernel.pdf.PdfReader getPdfReader( IRandomAccessSource randomAccessSource, ReaderProperties readerProperties )
            throws IOException {
        com.itextpdf.kernel.pdf.PdfReader reader = null;
        if ( null != randomAccessSource ) {
            reader = new com.itextpdf.kernel.pdf.PdfReader( randomAccessSource, readerProperties );
        }
        return reader;
    }

    /**
     * getPdfReader
     *
     * @param filename
     *
     * @return
     * @throws IOException
     */
    default com.itextpdf.kernel.pdf.PdfReader getPdfReader( String filename ) throws IOException {
        com.itextpdf.kernel.pdf.PdfReader reader = null;
        if ( StringUtils.isNotEmpty( filename ) ) {
            reader = new com.itextpdf.kernel.pdf.PdfReader( filename );
        }
        return reader;
    }

    /**
     * getPdfReader
     *
     * @param filename
     * @param readerProperties
     *
     * @return
     * @throws IOException
     */
    default com.itextpdf.kernel.pdf.PdfReader getPdfReader( String filename, ReaderProperties readerProperties ) throws IOException {
        com.itextpdf.kernel.pdf.PdfReader reader = null;
        if ( StringUtils.isNotEmpty( filename ) ) {
            reader = new com.itextpdf.kernel.pdf.PdfReader( filename, readerProperties );
        }
        return reader;
    }

}
