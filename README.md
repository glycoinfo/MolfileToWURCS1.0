/*
 * Web3 Unique Representation Carbohydrate Structure (WURCS)
 * Version 2
 * Software version 2.0.20161213-2.0.17829
 * Sep 12, 2017
 * Originally developed by Japanese Glycoinformatics Group.
 * Modifications and additions by The Noguchi Institue.
 *
 * The WURCS programs are free software developed under the auspices of the JST/NBDC;
 * you can redistribute this software and/or modify it under the terms of
 * the GNU Lesser General Public License as published by the Free Software
 * Foundation:
 * http://www.opensource.org/licenses/lgpl-2.1.php
 */
 
 
Usage: java (this program).jar [OPTION]... [FILE]... 

where OPTION include:
	-ID <tag ID in sd file>	to select the tag ID in sd file
	-dir <directory path>	to read files in the directory
	-sdf		output sd file with WURCS information to stdout
	-end		to ignore arguments after this option
	-v		to print this Version
	-help		to print this help message
  
Please input following:
$ java -jar mol2wurcs2.jar -help

Contact: yamadaissaku@gmail.com
