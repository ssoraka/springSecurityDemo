package net.proselyte.springsecuritydemo.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Developer {
    private Long id;
    private String firstName;
    private String lastName;
}
