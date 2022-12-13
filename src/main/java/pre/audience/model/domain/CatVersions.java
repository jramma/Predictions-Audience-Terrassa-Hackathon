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
@Document(collection="catversions")
public class CatVersions {
	
	@Id
	private int id;
	
	private int films;
	private int filmsCatVO;
	private int filmsCatDubbed;
	private int filmsCatSubtitled;
	private int sessions;
	private int sessionsCatVO;
	private int sessionsCatDubbed;
	private int sessionsCatSubtitled;
	private int viewers;
	private int viewersCatVO;
	private int viewersCatDubbed;
	private int viewersCatSubtitled;
	private double income;
	private double incomeCatVO;
	private double incomeCatDubbed;
	private double incomeCatSubtitled;
}
