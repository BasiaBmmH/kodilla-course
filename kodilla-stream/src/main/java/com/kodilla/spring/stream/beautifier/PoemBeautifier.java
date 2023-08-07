package com.kodilla.spring.stream.beautifier;

public class PoemBeautifier {



    public void beautify(String text1, String text2, PoemDecorator poemDecorator) {
           /*
        jako parametry będzie można przekazać
        tekst do upiększenia oraz
        wyrażenie lambda upiększające tekst.
         */
        String result = poemDecorator.decorate(text1,text2);
        System.out.println("Result equals: " + result);
    }

}
