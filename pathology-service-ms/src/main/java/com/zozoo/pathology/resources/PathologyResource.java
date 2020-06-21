package com.zozoo.pathology.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zozoo.pathology.models.Disease;
import com.zozoo.pathology.models.DiseasesList;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {

	List<Disease> diseases = Arrays.asList(new Disease("D1", "Ashma", "Warm water bath"),
			new Disease("D1", "Thyphold", "Anacine 200"), new Disease("D1", "Corona", "warm water gargling"),
			new Disease("D1", "Flu", "Warm Milk with Turmaric 1 glass"), new Disease("D1", "BP", "take rest"));

	@RequestMapping("/diseases")
	public DiseasesList getDiseases() {

		DiseasesList diseasesList = new DiseasesList();
		diseasesList.setDiseasesList(diseases);
		return diseasesList;
	}

	@RequestMapping("/diseases/{Id}")
	public Disease getDiseaseById(@PathVariable("Id") String id) {

		return diseases.stream().filter(disease -> disease.getId().equals(id)).findAny().orElse(null);

	}

}
