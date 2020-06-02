/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.intro.linecounter;

/**
 *
 * @author dnielben
 */
public class PhysicalLinesCounter implements LineCounter{
    
    private Integer lineCount=0;

    @Override
    public void count(String line) {
        lineCount++;
    }

    @Override
    public Integer getLineCount() {
        return lineCount;
    }
    
}
