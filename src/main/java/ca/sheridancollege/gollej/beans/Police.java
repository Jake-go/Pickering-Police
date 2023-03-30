package ca.sheridancollege.gollej.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Author: Jacob Golle
//Student Number: 991 429 916
//Date: Tue, March 28, 2023

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Police {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
