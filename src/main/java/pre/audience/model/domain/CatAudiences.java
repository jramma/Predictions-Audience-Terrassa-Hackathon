package pre.audience.model.domain;

import org.springframework.data.annotation.Id;
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
	
	@Id
	private String id;
	
	private int sessions;
	private int viewers;
	private double income;
}
