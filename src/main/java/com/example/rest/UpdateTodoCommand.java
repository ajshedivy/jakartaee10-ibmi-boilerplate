package com.example.rest;

import jakarta.validation.constraints.NotBlank;

// public record UpdateTodoCommand(
//         @NotBlank
//         String title
// ) {
// }
public class UpdateTodoCommand {
    @NotBlank
    private String title;

    public UpdateTodoCommand(String title) {
        this.title = title;
    }

    public String title() {
        return this.title;
    }
}
