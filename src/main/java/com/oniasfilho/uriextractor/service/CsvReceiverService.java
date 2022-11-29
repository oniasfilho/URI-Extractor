package com.oniasfilho.uriextractor.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvReceiverService {

    public void extractData(MultipartFile csv){
        List<String> result = new ArrayList<>();
        BufferedReader br;
        try{
            String line;
            InputStream is = csv.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
