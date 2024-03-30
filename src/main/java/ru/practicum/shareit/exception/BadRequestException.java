package ru.practicum.shareit.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BadRequestException extends RuntimeException {

    private final String message;
}
