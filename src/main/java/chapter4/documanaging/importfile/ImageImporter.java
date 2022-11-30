package chapter4.documanaging.importfile;

import chapter4.documanaging.Document;

import java.util.HashMap;

public class ImageImporter implements Importer {
    @Override
    public Document importFile(String string) {
        return new Document(new HashMap<>());
    }
}
