package tr.com.kare.servicecommon.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification implements Serializable {

    private String destination;
    private String message;

    @Override
    public String toString() {
        return "Notification [destination=" + this.destination + ", message=" + this.message + "]";
    }


}
