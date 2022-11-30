package chapter4.documanaging.importfile;

import chapter4.documanaging.Document;
import java.io.*;

public interface Importer {

    Document importFile (String string);
}
