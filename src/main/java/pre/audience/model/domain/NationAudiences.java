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
@Document(collection="nationaudiences")
public class NationAudiences {
	
	@Id
	private int id;
	
	private int films;
	private int filmsCat;
	private int filmsEs;
	private int filmsUe;
	private int filmsUs;
	private int filmsRest;
	
	private int sessions;
	private int sessionsCat;
	private int sessionsEs;
	private int sessionsUe;
	private int sessionsUs;
	private int sessionsRest;
	
	private int viewers;
	private int viewersCat;
	private int viewersEs;
	private int viewersUe;
	private int viewersUs;
	private int viewersRest;
	
	private double income;
	private double incomeCat;
	private double incomeEs;
	private double incomeUe;
	private double incomeUs;
	private double incomeRest;
}
