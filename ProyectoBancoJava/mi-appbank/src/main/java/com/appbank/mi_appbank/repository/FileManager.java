package com.appbank.mi_appbank.repository;
import java.io.File;
import java.io.IOException;
import java.util.List;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class FileManager<T> {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final File file;
    private final TypeReference<List<T>>typeReference;


    public FileManager(String filePath, TypeReference<List<T>> typeReference){

        this.file = new File(filePath);
        this.typeReference = typeReference;
    }

    public List<T> read(){
        try {
            if (!file.exists()) {
                return List.of();
            }
            return objectMapper.readValue(file, typeReference);
        } catch (IOException e) {
            throw new RuntimeException("Error al intentar leer el archivo JSON" + file.getName(),e);
        }
    }

    public void write(List<T>data){
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, data);
        } catch (IOException e) {
          throw new RuntimeException("Error al intentar escribir el archivo json" + file.getName(),e);
        }
    }

}
