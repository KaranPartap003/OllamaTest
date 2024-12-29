package com.example.OllamaTest.Model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LLMResponse {
    private String reply;

    public LLMResponse(String reply) {
        this.reply = reply;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}
