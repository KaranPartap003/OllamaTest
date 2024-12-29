package com.example.OllamaTest.Model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class LLMrequest {
    private String query;

    public String getQuery() {
        return query;
    }
}
