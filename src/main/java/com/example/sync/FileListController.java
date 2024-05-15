package com.example.sync;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileListController {

    protected List<String> outListFiles(String path) throws IOException {
        List<String> pathList = Files.walk(Paths.get(path)).map(v -> v.toAbsolutePath().toString()).collect(Collectors.toList());
        return pathList;
    }


}
