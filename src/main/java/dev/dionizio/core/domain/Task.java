package dev.dionizio.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Task {
    private String title;
    private String description;
    private TaskStatus status;
}
