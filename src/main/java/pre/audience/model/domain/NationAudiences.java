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
@Document(collection = "nationaudiences")
public class NationAudiences {

	private String year;
	private String films;
	private String filmsCat;
	private String filmsEs;
	private String filmsUe;
	private String filmsUs;
	private String filmsRest;

	private String sessions;
	private String sessionsCat;
	private String sessionsEs;
	private String sessionsUe;
	private String sessionsUs;
	private String sessionsRest;

	private String viewers;
	private String viewersCat;
	private String viewersEs;
	private String viewersUe;
	private String viewersUs;
	private String viewersRest;

	private String income;
	private String incomeCat;
	private String incomeEs;
	private String incomeUe;
	private String incomeUs;
	private String incomeRest;
}
