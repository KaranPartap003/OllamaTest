package com.example.OllamaTest.Controller;


import com.example.OllamaTest.Model.LLMResponse;
import com.example.OllamaTest.Model.LLMrequest;
import com.example.OllamaTest.Service.LLMService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/LLM")
public class LLMcontroller {

    @Autowired
    private LLMService service;
    @PostMapping("/chat")
    public ResponseEntity<LLMResponse> getMessage(@RequestBody LLMrequest llMrequest){
        String response = service.chat(llMrequest.getQuery());
        LLMResponse llmResponse = new LLMResponse(response);
        return ResponseEntity.ok(llmResponse);
    }
}
