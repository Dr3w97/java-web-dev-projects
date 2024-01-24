package org.launchode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/")
public class SkillsController {

    @GetMapping
    public String renderHomePage() {
        return  "<h1>" +
                "Skills Tracker" +
                "<h1>" +
                "<h2>" +
                "We have a few skills we would like to learn. Here is the list!" +
                "<h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<ol>";
    }
    @GetMapping("/form")
    public String skillsForm() {
        String newline = "<br>";

        String formSkill = "<form method = 'post'>" +
                "Name: " + newline + "<input type = 'text' name= 'name'/>" + newline +
                "My favorite language:" + newline +
                "<select name = 'skill1'>" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<option value = 'python'>Python</option>" +
                "</select>" + newline +
                "My second language:" + newline +
                "<select name = 'skill2'>" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<option value = 'python'>Python</option>" +
                "</select>" + newline +
                "My third language:" + newline +
                "<select name = 'skill3'>" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<option value = 'python'>Python</option>" +
                "</select>" + newline +
                "<button value = 'submit'>submit</button>";

        return formSkill;
    }
    @PostMapping("/form")
    public String renderFormPage(@RequestParam String name, String skill1, String skill2, String skill3) {
        return "<hmtl>" +
                "<body>" +
                "<h1>" +
                name +
                "</h1>" +
                "<table>  \n" +
                "        <tr>\n" +
                "            <th style = 'margin: 0px 25px 0px'>First Language &nbsp;</th>\n" + " " +
                "            <th style = 'margin: 0px 25px 0px'>Second Language &nbsp;</th>\n" +
                "            <th style = 'margin: 0px 25px 0px'>Third Language</th>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td style = 'margin: 25px'>" + skill1 + "</td>\n" +
                "            <td style = 'margin: 25px'>" + skill2 + "</td>\n" +
                "            <td style = 'margin: 25px'>" + skill3 + "</td>\n" +
                "        </tr>\n" +
                "    </table>" +
                "</body>" +
                "</html>";
    }





}
