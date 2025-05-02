package it.epicode.test_gitflow.prenotazioni;

import it.epicode.test_gitflow.dipendenti.Dipendente;
import it.epicode.test_gitflow.viaggi.Viaggio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prenotazione {

    private Long id;
    private Long numeroPrenotazione;
    private Dipendente dipendente;
    private Viaggio viaggio;

}
