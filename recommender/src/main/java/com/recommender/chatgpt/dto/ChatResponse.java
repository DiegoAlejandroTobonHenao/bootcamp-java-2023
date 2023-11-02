package com.recommender.chatgpt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
public class ChatResponse {
    private List<Choice> choices;

    public static class Choice {
        private int index;
        private Message message;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Message getMessage() {
            return message;
        }

        public void setMessage(Message message) {
            this.message = message;
        }
    }

    public List<Choice> getChoices() {
        return choices;
    }
}
