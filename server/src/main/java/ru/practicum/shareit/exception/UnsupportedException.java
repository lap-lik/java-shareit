package ru.practicum.shareit.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UnsupportedException extends RuntimeException {

    private final String message;
}
