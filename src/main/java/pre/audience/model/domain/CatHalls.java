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
@Document(collection="cathalls")
public class CatHalls {
	
	private String region;
	private int filmHalls;
	private int screens;
	private int capacity;
}
