package pre.audience.model.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="cataudiences")
public class CatAudiences {
	private String provincia;
	private String sesiones;
	private String viewers;
	private String income;
}
