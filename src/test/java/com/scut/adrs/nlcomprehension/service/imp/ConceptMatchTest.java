package com.scut.adrs.nlcomprehension.service.imp;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scut.adrs.domain.Resource;
import com.scut.adrs.nlcomprehension.service.Match;

public class ConceptMatchTest {

	ApplicationContext ctx;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("spring/spring*.xml");
	}

	@Test
	public void test() {
		Match match=ctx.getBean(ConceptMatch.class);
		AnsjDescriptionParser parser=ctx.getBean(AnsjDescriptionParser.class);
		String str="黑色的大便";
		ArrayList<Resource> list=match.approximateMatch(str,parser.parse(str));
		for(Resource re:list){
			System.out.println(re.getLocalName());
		}
	}

}
