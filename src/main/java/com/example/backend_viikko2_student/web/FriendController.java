package com.example.backend_viikko2_student.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
/*
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.backend_viikko2_student.domain.Friend;
*/


@Controller
public class FriendController {
	//ilman java-luokkaa, toimii
	private ArrayList<String> friends = new ArrayList<>();
	
	@GetMapping("/friend")
	public String listaaYstavat(@RequestParam(name="nimi", required =false) String nimi, Model model) {
		if(nimi!= null) {
			friends.add(nimi);
		}
		model.addAttribute("ystavat", friends);
		return "friends";
	}
	
	//en saa toimimaan, yritetty yhdistää java-luokkaa, mutta herjaa There was an unexpected error (type=Internal Server Error, status=500).
	//An error happened during template parsing (template: "class path resource [templates/friendList.html]")
	/*private ArrayList<Friend> friendList = new ArrayList<>();
	
	@GetMapping("/index")
	public String listMyFriends(Model model) {
		model.addAttribute("friendList", friendList);
		model.addAttribute("index", new Friend());
		return "friendList";
	}
	@PostMapping("/index")
	public String addFriend(@ModelAttribute Friend ystava) {
		friendList.add(ystava);
		return "redirect:/index";
	}
 */
}
