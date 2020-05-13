package com.spring.poesub.system;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.poesub.data.Gem_YoutubeLink;
import com.spring.poesub.model.ApiDaotest;
import com.spring.poesub.model.Gem;
import com.spring.poesub.model.PREAscendancy_Gem;
import com.spring.poesub.model.Total;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.context.LazyContextVariable;

@Controller

public class mainpageController {

	private String[] classes = {
			"Ascendant",
			"Assasin",
			"Berserker",
			"Champion",
			"Chieftain",
			"Deadeye",
			"Elementalist",
			"Gladiator",
			"Guardian",
			"Hierophant",
			"Inquisitor",
			"Juggernaut",
			"Necromancer",
			"Occultist",
			"Pathfinder",
			"Raider",
			"Saboteur",
			"Slayer",
			"Trickster",
	};
	
		@Autowired
		private ApiDaotest apidao;
		// MAIN PAGE ///////////////////////////////////////////////////////////////////////////////////
		@RequestMapping(value = "/",method = RequestMethod.GET)
	    public String poesub() {
	        return "Poesub";
		}
		////////TODAYPREVIEW/////////////////////////////////////////////////////////////////////////////
		@RequestMapping(value = "/todaypreview",method = RequestMethod.GET)
	    public ModelAndView todaypreview() {
			ModelAndView mav = new ModelAndView();
			
			
			mav.setViewName("todaypreview");
			mav.addObject("asc",apidao.selectpreviewasc());
			mav.addObject("ass",apidao.selectpreviewass());
			mav.addObject("ber",apidao.selectpreviewber());
			mav.addObject("cha",apidao.selectpreviewcha());
			mav.addObject("chi",apidao.selectpreviewchi());
			mav.addObject("dea",apidao.selectpreviewdea());
			mav.addObject("ele",apidao.selectpreviewele());
			mav.addObject("gla",apidao.selectpreviewgla());
			mav.addObject("gua",apidao.selectpreviewgua());
			mav.addObject("hie",apidao.selectpreviewhie());
			mav.addObject("inq",apidao.selectpreviewinq());
			mav.addObject("jug",apidao.selectpreviewjug());
			mav.addObject("nec",apidao.selectpreviewnec());
			mav.addObject("occ",apidao.selectpreviewocc());
			mav.addObject("pat",apidao.selectpreviewpat());
			mav.addObject("rai",apidao.selectpreviewrai());
			mav.addObject("sab",apidao.selectpreviewsab());
			mav.addObject("sla",apidao.selectpreviewsla());
			mav.addObject("tri",apidao.selectpreviewtri());
	        return mav;
		}
		////ASCENDANCY////////////////////////////////////////////////////////////////////////////////////////////////////
		@RequestMapping(value = "/ascendancy",method = RequestMethod.GET)
	    public ModelAndView ascendancy() {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("ascendancy");
			mav.addObject("classes",this.classes);
	        return mav;
		}
		
		@RequestMapping(value = "ascendancy/Ascendant",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Ascendant(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Ascendant");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectasc());		
	        return mav;
		}
		
		@RequestMapping(value = "ascendancy/Berserker",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Berserker(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Berserker");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectber());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Champion",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Champion(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Champion");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectcha());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Chieftain",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Chieftain(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Chieftain");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectchi());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Deadeye",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Deadeye(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Deadeye");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectdea());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Elementalist",method = RequestMethod.GET)
	    public ModelAndView ascendancy_getElementalist(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Elementalist");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectele());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Gladiator",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Gladiator(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Gladiator");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectgla());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Guardian",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Guardian(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Guardian");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectgua());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Hierophant",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Hierophant(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Hierophant");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselecthie());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Inquisitor",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Inquisitor(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Inquisitor");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectinq());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Juggernaut",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Juggernaut(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Juggernaut");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectjug());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Necromancer",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Necromancer(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Necromancer");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectnec());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Occultist",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Occultist(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Occultist");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectocc());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Pathfinder",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Pathfinder(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Pathfinder");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectpat());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Raider",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Raider(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Raider");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectrai());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Saboteur",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Saboteur(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Saboteur");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectsab());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Slayer",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Slayer(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Slayer");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectsla());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Trickster",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Trickster(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Trickster");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselecttri());		
	        return mav;
		}
		@RequestMapping(value = "ascendancy/Assasin",method = RequestMethod.GET)
	    public ModelAndView ascendancy_Assasin(Model model) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("low_ascendancy/Assasin");
			mav.addObject("classes",this.classes);
			mav.addObject("asc", apidao.ascselectass());		
	        return mav;
		}
		
		/*
		
		
		new LazyContextVariable<List<User>>() {
        @Override
        protected List<User> loadValue() {
            return userService.getUsers();
        }
    }
	@RequestMapping(value = "/movepage")
	public String Login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
		System.out.println("movepage");
		final String redirectUrl = "redirect:http://www.naver.com";
		return redirectUrl;
	}	
		*/
		//@RequestParam String gemname
		@RequestMapping(value = "record",method = RequestMethod.GET)
	    public String record() {
	        return "redirect:https://youtu.be/cJqv73Qrs_o";
		}
		@RequestMapping(value = "ascendancy/youtuberedirect",method = RequestMethod.GET)
	    public String ascendancy_youtuberedirect(@RequestParam String gemname,@RequestParam String ascendancyname ) {
			Gem_YoutubeLink link= new Gem_YoutubeLink();
			String youtubelink =link.array.get(gemname+"1");
			if(youtubelink ==null)
			{
				return "redirect:https://www.youtube.com/results?search_query="+ascendancyname+"+"+gemname;
			}
	        return "redirect:"+youtubelink;
		}
		@RequestMapping(value = "ascendancy/youtuberedirect1",method = RequestMethod.GET)
	    public String ascendancy_youtuberedirect1(@RequestParam String gemname,@RequestParam String ascendancyname ) {
			Gem_YoutubeLink link= new Gem_YoutubeLink();
			String youtubelink =link.array.get(gemname+"2");
			if(youtubelink ==null)
			{
				return "redirect:https://www.youtube.com/results?search_query="+ascendancyname+"+"+gemname;
			}
	        return "redirect:"+youtubelink;
		}
		@RequestMapping(value = "ascendancy/youtubesearchredirect",method = RequestMethod.GET)
	    public String ascendancy_youtubesearchredirect(@RequestParam String gemname, @RequestParam String ascendancyname ) {
			String link = "redirect:https://www.youtube.com/results?search_query="+ascendancyname+"+"+gemname;
	        return link;
		}
		@RequestMapping(value = "ascendancy/ninjaredirect",method = RequestMethod.GET)
	    public String ascendancy_ninjaredirect(@RequestParam String gemname, @RequestParam String ascendancyname ) {
			gemname = gemname.replaceAll(" ", "-");
	        return "redirect:https://poe.ninja/challenge/builds?class="+ascendancyname+"&skill="+gemname;
		}
		
		

		// CHART PAGE//////////////////////////////////////////////////////////////////////////////////
		@RequestMapping(value = "/chart",method = RequestMethod.GET)
	    public ModelAndView chart() {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("chart");
			List<Total> list1 = apidao.selectlabyrinthladderdata();
			
			int[] total = new int[list1.size()];
			String[] labyrinthladderdate = new String[list1.size()];
			int[] asc = new int[list1.size()];
			int[] ass = new int[list1.size()];
			int[] ber = new int[list1.size()];
			int[] cha = new int[list1.size()];
			int[] chi = new int[list1.size()];
			int[] dea = new int[list1.size()];
			int[] ele = new int[list1.size()];
			int[] gla = new int[list1.size()];
			int[] gua = new int[list1.size()];
			int[] hie = new int[list1.size()];
			int[] inq = new int[list1.size()];
			int[] jug = new int[list1.size()];
			int[] nec = new int[list1.size()];
			int[] occ = new int[list1.size()];
			int[] pat = new int[list1.size()];
			int[] rai = new int[list1.size()];
			int[] sab = new int[list1.size()];
			int[] sla = new int[list1.size()];
			int[] tri = new int[list1.size()];
			int size =0;
			for(Total temp: list1)
			{
				
				labyrinthladderdate[13-size]=temp.getLabyrinthladderdate();
				total[13-size]=temp.getTotal();
				asc[13-size]=temp.getAscendant();
				ass[13-size]=temp.getAssasin();
				ber[13-size]=temp.getBerserker();
				cha[13-size]=temp.getChampion();
				chi[13-size]=temp.getChieftain();
				dea[13-size]=temp.getDeadeye();
				ele[13-size]=temp.getElementalist();
				gla[13-size]=temp.getGladiator();
				gua[13-size]=temp.getGuardian();
				hie[13-size]=temp.getHierophant();
				inq[13-size]=temp.getInquisitor();
				jug[13-size]=temp.getJuggernaut();
				nec[13-size]=temp.getNecromancer();
				occ[13-size]=temp.getOccultist();
				pat[13-size]=temp.getPathfinder();
				rai[13-size]=temp.getRaider();
				sab[13-size]=temp.getSaboteur();
				sla[13-size]=temp.getSlayer();
				tri[13-size]=temp.getTrickster();
				
				size++;
				
			}
			mav.addObject("total",total );
			mav.addObject("date",labyrinthladderdate);
			mav.addObject("asc",asc );
			mav.addObject("ass",ass );
			mav.addObject("ber",ber );
			mav.addObject("cha",cha );
			mav.addObject("chi",chi );
			mav.addObject("dea",dea );
			mav.addObject("ele",ele );
			mav.addObject("gla",gla );
			mav.addObject("gua",gua );
			mav.addObject("hie",hie );
			mav.addObject("inq",inq );
			mav.addObject("jug",jug );
			mav.addObject("nec",nec );
			mav.addObject("occ",occ );
			mav.addObject("pat",pat );
			mav.addObject("rai",rai );
			mav.addObject("sab",sab );
			mav.addObject("sla",sla );
			mav.addObject("tri",tri );
	        return mav;
		}
		
		
}


