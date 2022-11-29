package com.oniasfilho.uriextractor.controller;

import com.oniasfilho.uriextractor.service.CsvReceiverService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/csv")
public class CsvReceiverController {

    CsvReceiverService service;

    public CsvReceiverController(CsvReceiverService service) {
        this.service = service;
    }

    @PostMapping
    public void getCSV (@RequestParam MultipartFile csv){
        service.extractData(csv);
        System.out.println("deu bom");
    }
}
