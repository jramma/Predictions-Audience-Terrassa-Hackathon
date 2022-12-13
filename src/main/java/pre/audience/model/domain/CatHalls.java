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
@Document(collection="cathalls")
public class CatHalls {
	
	@Id
	private String id;
	
	private int filmHalls;
	private int screens;
	private int capacity;
}
