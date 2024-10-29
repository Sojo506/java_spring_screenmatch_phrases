package com.oracleon.screenmatch_phrases.service;

import com.oracleon.screenmatch_phrases.dto.PhraseDTO;
import com.oracleon.screenmatch_phrases.model.Phrase;
import com.oracleon.screenmatch_phrases.repository.IPhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {
    @Autowired
    private IPhraseRepository repository;

    public PhraseDTO getRandomPhrase() {
        Phrase phrase = repository.getRandomPhrase();
        return new PhraseDTO(
                phrase.getTitle(),
                phrase.getPhrase(),
                phrase.getCharacter(),
                phrase.getPoster()
        );
    }

}
