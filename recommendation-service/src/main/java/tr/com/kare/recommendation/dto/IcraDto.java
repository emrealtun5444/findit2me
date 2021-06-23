package tr.com.kare.recommendation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class IcraDto implements Serializable {
    private Long id;
    private String dosyaNo;
    private String icraDairesi;

}
