package com.example.rest;

import jakarta.validation.constraints.NotBlank;

// public record CreateTodoCommand(
//         @NotBlank
//         String title
// ) {
//         public static CreateTodoCommand of(String _title) {
//                 return new CreateTodoCommand(_title);
//         }
// }

public class CreateTodoCommand {
    @NotBlank
    private String title;

    public CreateTodoCommand(String title) {
        this.title = title;
    }

    public String title() {
        return this.title;
    }

    public static CreateTodoCommand of(String _title) {
        return new CreateTodoCommand(_title);
    }
}
