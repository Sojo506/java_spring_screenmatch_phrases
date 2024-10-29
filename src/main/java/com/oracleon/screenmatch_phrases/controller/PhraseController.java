package com.oracleon.screenmatch_phrases.controller;

import com.oracleon.screenmatch_phrases.dto.PhraseDTO;
import com.oracleon.screenmatch_phrases.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class PhraseController {

    @Autowired
    public PhraseService service;

    @GetMapping("/phrases")
    public PhraseDTO getRandomPhrase(){
        return service.getRandomPhrase();
    }

}
