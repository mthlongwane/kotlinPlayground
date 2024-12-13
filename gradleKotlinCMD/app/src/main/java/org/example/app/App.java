/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example.app;

import org.example.list.LinkedList;

import static org.example.app.KotlinTestKt.banter;
import static org.example.utilities.StringUtils.join;
import static org.example.utilities.StringUtils.split;
import static org.example.app.MessageUtils.getMessage;


import java.util.logging.Logger;

import org.apache.commons.text.WordUtils;

public class App {


    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Main ");

        logger.info(banter());

        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);

        logger.info(WordUtils.capitalize(result));

    }
}
