package tr.com.kare.servicecommon.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SistemParametreDto implements Serializable {
	private Long id;
	private String kodu;
	private String name;
	private String value;
}
