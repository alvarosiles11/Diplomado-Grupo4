package Event;

import util.DomainEvent;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class CheckInCreado extends DomainEvent {

    public UUID Key;
    public String CodigoSeguridad;

    public CheckInCreado(UUID key, String codigoSeguridad) {
        super(LocalDateTime.now());
        Key = key;
        CodigoSeguridad = codigoSeguridad;
    }
}
