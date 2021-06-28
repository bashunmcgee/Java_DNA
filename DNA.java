/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apthelpertwo.js;

/**
 *
 * @author dujuanny
 */
public class DNA {
    public static void main(String[] args) {
	String dna1 = "ATGCGATACGCTTGA";
	String dna2 = "ATGCGATACGTGA";
	String dna3 = "ATTAATATGTACTGA";

	String dna = dna1;

	dna.length();

	int ATG = dna.indexOf("ATG");
	int TGA = dna.indexOf("TGA");

	int sequenceDifference = ATG - TGA;

	if (dna.contains("ATG") && dna.contains("TGA") && (sequenceDifference % 3) == 0) {
		System.out.println("Does contain protein!");
	} else {
		System.out.println("Does not contain protein!");
	}
}

}
