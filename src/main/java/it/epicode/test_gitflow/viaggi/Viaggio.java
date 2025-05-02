package it.epicode.test_gitflow.viaggi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Viaggio {

    private LocalDate dataPartenza;
    private LocalDate dataRitorno;
    private String destinazione;
    private String descrizione;
}
