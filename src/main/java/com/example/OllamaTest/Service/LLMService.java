package com.example.OllamaTest.Service;

import lombok.Data;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class LLMService {

    @Autowired
    public OllamaChatModel chatModel;

    public String chat(String query){
        return chatModel.call(query);
    }
}
