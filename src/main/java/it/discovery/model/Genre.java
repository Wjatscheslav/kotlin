package it.discovery.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "name")
@AllArgsConstructor
public class Genre {

    private String name;

    private LocalDateTime created;
}
