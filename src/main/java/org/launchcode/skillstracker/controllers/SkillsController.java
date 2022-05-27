package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping("/")
    @ResponseBody

    public String createHomepage() {
        return "<html><body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Java Script</li>" +
                "<li>Ruby</li>" +
                "</ol>" +
                "</body></html>";
    }

    @GetMapping("/form")
    @ResponseBody

    public String createForm() {
        return "<html><body>" +
                "<form>" +
                "<label>Name<input type='text' name='name' /></label><br /><br />" +
                "<label>My favorite language</label><br />" +
                "<select name=\"firstLang\" id=\"firstLang\">" +
                    "<option value=\"java\">Java</option>" +
                    "<option value=\"javascript\">JavaScript</option>" +
                    "<option value=\"ruby\">Ruby</option>" +
                "</select></label><br /><br />" +


                "<label>My second favorite language</label><br /><br />" +
                "<select name=\"secondLang\" id=\"secondLang\">" +
                "<option value=\"java\">Java</option>" +
                "<option value=\"javascript\">JavaScript</option>" +
                "<option value=\"ruby\">Ruby</option>" +
                "</select></label><br /><br />" +



                "<label>My third favorite language</label><br />" +
                "<select name=\"thirdLang\" id=\"thirdLang\">" +
                "<option value=\"java\">Java</option>" +
                "<option value=\"javascript\">JavaScript</option>" +
                "<option value=\"ruby\">Ruby</option>" +
                "</select></label><br /><br />" +
                "<input type=\"submit\" value=\"Submit!\" />" +



                "</body></html>";
    }

    @PostMapping("/form")
    @ResponseBody

    public String respondToFormSubmission(@RequestParam String name,
                                          @RequestParam String firstLang,
                                          @RequestParam String secondLang,
                                          @RequestParam String thirdLang) {

        return "<html><body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstLang + "</li>" +
                "<li>" + secondLang +"</li>" +
                "<li>" + thirdLang + "</li>" +
                "</ol>" +
                "</body></html>";


    }
}
