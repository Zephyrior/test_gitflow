package it.epicode.test_gitflow.dipendenti;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dipendente {
    private String nome;
    private String cognome;
    private String ruolo;
    private String mail;
}
