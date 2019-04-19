package com.test.jpa;

import com.test.jpa.domain.Academy;
import com.test.jpa.domain.AcademyRepository;
import com.test.jpa.domain.Subject;
import com.test.jpa.service.AcademyService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebserviceApplicationTests {

	@Autowired
	private AcademyRepository academyRepository;

	@Autowired
	private AcademyService academyService;

	@Before
	public void setup() {
		academyRepository.deleteAll();
		List<Academy> academies = new ArrayList<>();

		for(int i=0;i<10;i++){
			Academy academy = Academy.builder()
					.name("강남스쿨"+i)
					.build();

			academy.addSubject(Subject.builder().name("자바웹개발" + i).build());
			academies.add(academy);

			academyRepository.save(academy);
		}
	}

	@Test
	public void Academy여러개를_조회시_Subject가_N1_쿼리가발생한다() throws Exception {
		//given
		List<String> subjectNames = academyService.findAllSubjectNames();

		//then
		assertThat(subjectNames.size(), is(10));
	}

}
